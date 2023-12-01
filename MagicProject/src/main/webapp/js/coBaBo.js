/**
 * 
 */
(function(){
var magicapp = angular.module('magicapp',['ngRoute']); 

	magicapp.config(function($routeProvider) {
		  $routeProvider
		  .when("/search", {
		    templateUrl : "search.html",
		    controller: "searchController"
		  })
		  .when("/create", {
		    templateUrl : "create.html",
		    controller: "createController"
		  })
		  .when("/stack", {
		    templateUrl : "stack.html"
		  })
		  .when("/resume", {
		    templateUrl : "resume.html"
		  })
		  .when("/update/:gameId", {
			  templateUrl : "update.html",
			  controller: "updateController"
		  })
		  .when("/play/:gameId", {
			  templateUrl : "play.html",
			  controller: "playController"
		  })
		   .otherwise({
		    templateUrl : "main.html"
		  });
		});

})()