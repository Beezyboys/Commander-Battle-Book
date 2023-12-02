/**
 * 
 */
(function() {
	var magicapp = angular.module('magicapp');



	magicapp.controller('playController', function($scope, $http, $routeParams, $location) {
		$scope.winner = [true, false];
		$scope.colors = ['W', 'U', 'B', 'R', 'G', 'WU', 'WB', 'WR', 'WG', 'UB', 'UR', 'UG', 'BR', 'BG', 'RG', 'WUB', 'WUR', 'WUG', 'WBR', 'WBG', 'WRG', 'UBR', 'UBG', 'URG', 'BRG', 'WUBR', 'WUBG', 'WURG', 'WBRG', 'UBRG', 'WUBRG', 'Colorless'];
		$scope.getGameById = function() {
			$http.get("/magicproject/webapi/CommanderBattleBook/game/" + $routeParams.gameId)
				.then(function(response) {
					var players = response.data;
					$scope.player1 = players[0];
					$scope.player2 = players[1];
					$scope.player3 = players[2];
					$scope.player4 = players[3];
					$scope.player1.lifeTotal = 40;
					$scope.player2.lifeTotal = 40;
					$scope.player3.lifeTotal = 40;
					$scope.player4.lifeTotal = 40;
					$scope.player1.commandDamageFromPlayer2 = 0;
					$scope.player1.commandDamageFromPlayer3 = 0;
					$scope.player1.commandDamageFromPlayer4 = 0;
					$scope.player1.poisonCounter = 0;
					$scope.player2.commandDamageFromPlayer1 = 0;
					$scope.player2.commandDamageFromPlayer3 = 0;
					$scope.player2.commandDamageFromPlayer4 = 0;
					$scope.player2.poisonCounter = 0;
					$scope.player3.commandDamageFromPlayer1 = 0;
					$scope.player3.commandDamageFromPlayer2 = 0;
					$scope.player3.commandDamageFromPlayer4 = 0;
					$scope.player3.poisonCounter = 0;
					$scope.player4.commandDamageFromPlayer1 = 0;
					$scope.player4.commandDamageFromPlayer2 = 0;
					$scope.player4.commandDamageFromPlayer3 = 0;
					$scope.player4.poisonCounter = 0;
					$scope.players = [$scope.player1.deckName, $scope.player2.deckName, $scope.player3.deckName, $scope.player4.deckName];
				}, function(response) {
					console.log('error http GET game by id: ' + response.status);

				});
		}

		$scope.updateWinner = function(winner) {
			$scope.player1.winner = false;
			$scope.player2.winner = false;
			$scope.player3.winner = false;
			$scope.player4.winner = false;
			if ($scope.player1.deckName == winner) {
				$scope.player1.winner = true;
			} else if ($scope.player2.deckName == winner) {
				$scope.player2.winner = true;
			} else if ($scope.player3.deckName == winner) {
				$scope.player3.winner = true;
			} else {
				$scope.player4.winner = true;
			}
			var players = [$scope.player1, $scope.player2, $scope.player3, $scope.player4];
			$http.put("/magicproject/webapi/CommanderBattleBook/", players)
				.then(function(response) {
					$scope.updateStatus = 'update successful';
				}, function(response) {
					$scope.updateStatus = 'error trying to update game';
					console.log('error http PUT game: ' + response.status);
				});
		}

		$scope.goToSearchView = function() {
			$location.path('/search');
		}

		$scope.getGameById();

	});
})()