/**
 * 
 */
(function() {
	var magicapp = angular.module('magicapp');



	magicapp.controller('playController', function($scope, $http, $routeParams, $location) {
		$scope.winner = [true, false];
		$scope.colors = ['W', 'U', 'B', 'R', 'G', 'WU', 'WB', 'WR', 'WG', 'UB', 'UR', 'UG', 'BR', 'BG', 'RG', 'WUB', 'WUR', 'WUG', 'WBR', 'WBG', 'WRG', 'UBR', 'UBG', 'URG', 'BRG', 'WUBR', 'WUBG', 'WURG', 'WBRG', 'UBRG', 'WUBRG', 'Colorless'];

		$scope.player1 = {
			lifeTotal: 40,
			commandDamageFromPlayer2: 0,
			commandDamageFromPlayer3: 0,
			commandDamageFromPlayer4: 0,
			poisonCounter: 0
		};
		
		$scope.player2 = {
			lifeTotal: 40,
			commandDamageFromPlayer1: 0,
			commandDamageFromPlayer3: 0,
			commandDamageFromPlayer4: 0,
			poisonCounter: 0
		};
		
		$scope.player3 = {
			lifeTotal: 40,
			commandDamageFromPlayer1: 0,
			commandDamageFromPlayer2: 0,
			commandDamageFromPlayer4: 0,
			poisonCounter: 0
		};
		
		$scope.player4 = {
			lifeTotal: 40,
			commandDamageFromPlayer1: 0,
			commandDamageFromPlayer2: 0,
			commandDamageFromPlayer3: 0,
			poisonCounter: 0
		};

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
		$scope.goToSearchView = function() {
			$location.path('/search');
		}

		$scope.getGameById();

	});
})()