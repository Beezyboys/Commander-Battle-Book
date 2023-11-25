/**
 * 
 */
(function() {
	var magicapp = angular.module('magicapp');



		magicapp.controller('updateController', function($scope, $http, $routeParams, $location) {
		$scope.winner = ['True', 'False'];
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
		$scope.getPlayerById = function() {
			$http.get("/magicproject/webapi/CommanderBattleBook/" + $routeParams.playerId)
				.then(function(response) {
					var players = response.data;
					if (players.length == 1) {
						$scope.player = players[0];
					} else {
						//TODO error message
					}
				}, function(response) {
					console.log('error http GET player by id: ' + response.status);

				});
		}
		$scope.goToSearchView = function() {
			$location.path('/search');
		}

		$scope.getPlayerById();

	});
})()