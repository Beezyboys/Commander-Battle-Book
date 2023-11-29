/**
 * 
 */
(function() {
	var magicapp = angular.module('magicapp');



		magicapp.controller('updateController', function($scope, $http, $routeParams, $location) {
		$scope.winner = [true, false];
		$scope.colors = ['W', 'U', 'B', 'R', 'G', 'WU', 'WB', 'WR', 'WG', 'UB', 'UR', 'UG', 'BR', 'BG', 'RG', 'WUB', 'WUR', 'WUG', 'WBR', 'WBG', 'WRG', 'UBR', 'UBG', 'URG', 'BRG', 'WUBR', 'WUBG', 'WURG', 'WBRG', 'UBRG', 'WUBRG', 'Colorless'];
		$scope.updatePlayer = function() {
			$http.put("/magicproject/webapi/CommanderBattleBook/", $scope.player)
				.then(function(response) {
					$scope.updateStatus = 'update successful';
				}, function(response) {
					$scope.updateStatus = 'error trying to update game';
					console.log('error http PUT player: ' + response.status);
				});
		}
		$scope.getGameById = function() {
			$http.get("/magicproject/webapi/CommanderBattleBook/game/" + $routeParams.gameId)
				.then(function(response) {
					var players = response.data;
						$scope.player1 = players[0];
						$scope.player2 = players[1];
						$scope.player3 = players[2];
						$scope.player4 = players[3];
				}, function(response) {
					console.log('error http GET game by id: ' + response.status);

				});
		}
		$scope.deleteGameById = function() {
			$http.delete("/magicproject/webapi/CommanderBattleBook/game/" + $routeParams.gameId)
				 .then(function(response) {
					$scope.updateStatus = 'delete successful';
					$scope.disableUpdate = true;
				}, function(response) {
					$scope.updateStatus = 'error trying to delete game';
					console.log('error http DELETE game: ' + response.status);
				});
				}
		$scope.goToSearchView = function() {
			$location.path('/search');
		}
		
		$scope.goToPlayView = function() {
			$location.path('/playGame');
		}

		$scope.getGameById();

	});
})()