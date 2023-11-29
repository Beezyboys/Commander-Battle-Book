/**
 * 
 */
(function() {
	var magicapp = angular.module('magicapp');

	magicapp.controller('searchController', function($scope, $http, $location) {

		$scope.showSpinner=true;
		
		$scope.getAllPlayers = function() {
			$scope.showSpinner=true;
			$http.get("/magicproject/webapi/CommanderBattleBook/")
				.then(function(response) {
					$scope.players = response.data;
					console.log('number of games: ' + $scope.players.length/4);
					$scope.showSpinner=false;
				}, function(response) {
					console.log('error http GET games: ' + response.status);
				});
			$scope.goToUpdateView = function(gameId) {

				console.log('go to update view');
				console.log('gameId: ' + gameId);
				$location.path('/update/' + gameId);
			}
		}
		$scope.getAllPlayers();
		
		$scope.orderBtColumn = function(column) {
			$scope.orderByValue = column;
			if($scope.reverse) {
				$scope.reverse = false;
			} else {
				$scope.reverse = true;
			}
		}
		
		$scope.reverse = false;
		
	})
})()