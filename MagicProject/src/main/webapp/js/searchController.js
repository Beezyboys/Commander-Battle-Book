/**
 * 
 */
(function() {
	 var magicapp = angular.module('magicapp');
	 
	 magicapp.controller('searchController', function($scope, $http, $location) {
		 
		 $scope.getAllPlayers = function() {
			 $http.get("/magicproject/webapi/CommanderBattleBook/")
			 .then(function(response) {
				 $scope.players = response.data;
				 console.log('number of players: ' + $scope.players.length);
			 }, function(response) {
				 console.log('error http GET players: ' + response.status);
			 });
			 $scope.goToUpdateView= function(playerId){
				 
				 console.log('go to update view');
				 console.log('playerId: ' + playerId);
			 $location.path('/update/' + playerId);
			 }
			 }
		$scope.getAllPlayers();
		 })
 })()