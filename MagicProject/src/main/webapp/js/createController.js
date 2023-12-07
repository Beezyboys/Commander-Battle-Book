/**
 * 
 */
(function() {
	var magicapp = angular.module('magicapp');

	magicapp.controller('createController', function($scope, $http, $location) {

		$scope.colors = ['W', 'U', 'B', 'R', 'G', 'WU', 'WB', 'WR', 'WG', 'UB', 'UR', 'UG', 'BR', 'BG', 'RG', 'WUB', 'WUR', 'WUG', 'WBR', 'WBG', 'WRG', 'UBR', 'UBG', 'URG', 'BRG', 'WUBR', 'WUBG', 'WURG', 'WBRG', 'UBRG', 'WUBRG', 'Colorless'];
		$scope.winner = [true, false]
		$scope.createGame = function(player) {
			$scope.player = player;
			$http.post("/magicproject/webapi/CommanderBattleBook/", $scope.player)
				.then(function(response) {
					$scope.createStatus = 'create successful';
					$scope.disableCreate = true;
				}, function(response) {
					$scope.createStatus = 'error trying to create game';
					console.log('error http POST game: ' + response.status);
				});
		}

		$scope.clear = function() {
			$scope.player1.deckName = '';
			$scope.player1.color = '';
			$scope.player1.winner = '';
			$scope.player2.deckName = '';
			$scope.player2.color = '';
			$scope.player2.winner = '';
			$scope.player3.deckName = '';
			$scope.player3.color = '';
			$scope.player3.winner = '';
			$scope.player4.deckName = '';
			$scope.player4.color = '';
			$scope.player4.winner = '';
			
			$scope.createForm.$setUntouched();
			$scope.createForm.setPristine();
			
			$scope.disableCreate = false;
		}

	});

})()