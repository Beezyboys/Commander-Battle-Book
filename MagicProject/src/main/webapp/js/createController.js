/**
 * 
 */
(function() {
	var magicapp = angular.module('magicapp');

	magicapp.controller('createController', function($scope, $http) {			
		
		$scope.colors = ['W', 'U', 'B', 'R', 'G', 'WU', 'WB', 'WR', 'WG', 'UB', 'UR', 'UG', 'BR', 'BG', 'RG', 'WUB', 'WUR', 'WUG', 'WBR', 'WBG', 'WRG', 'UBR', 'UBG', 'URG', 'BRG', 'WUBR', 'WUBG', 'WURG', 'WBRG', 'UBRG', 'WUBRG', 'Colorless'];
		$scope.winner = ['true','false']
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
			$scope.goToPlayView = function(gameId) {

				console.log('go to play view');
				console.log('gameId: ' + gameId);
				$location.path('/create/' + gameId);
			}
		}
		
		$scope.clear = function() {
			$scope.CoBaBo.deckName = '';
			$scope.CoBaBo.color = '';
			$scope.CoBaBo.winner = '';
			$scope.disableCreate = false;
		}
		
	});
	
})()