/**
 * 
 */
(function() {
	var magicapp = angular.module('magicapp');



	magicapp.controller('testController', function($scope) {
		$scope.personality = ['Chaotic', 'Lawful', 'Manipulative', 'Individualistic', 'Naturalistic'];
		$scope.playStyles = ['Aggressive', 'Control', 'Creature-heavy', 'Well rounded', 'Power at any cost'];
		$scope.conflicts = ['Direct confrontation and assertiveness', 'Diplomacy and negotiation', 'Mediation and compromise', 'Avoiding conflict and seeking harmony', 'Everyone gives up an equal amount to even the field'];
		$scope.environment = ['A place of action and challenge', 'A library or a place of learning', 'A social gathering or a community event', 'A well-organized and structured space', 'Anywhere that offers change and variety'];
		$scope.powers = ['Infinite knowledge and wisdom', 'The ability to control biological objects and terraforming', 'Immortality and the ability to raise the dead', 'Super strength and speed', 'Regeneration and healing'];
		$scope.figure = ['A conqueror or war hero', 'A revolutionary or rule-breaker', 'A philosopher or thinker', 'A diplomat or peacemaker', 'An environmentalist or conservationist'];
		$scope.weather = ['Calm and clear', 'Misty and mysterious', 'Hot and sunny', 'Rainy and cool', 'Variable with different elements'];
		$scope.vacation = ['A bustling city with entertainment', 'A secluded cabin in the woods', 'A historical and culturally rich location', 'A mysterious and unexplored place', 'A diverse and vibrant destination'];
		$scope.project = ['The wildcard, bringing unexpected elements', 'The team player, contributing ideas', 'The strategist, planning the approach', 'The leader, taking charge', 'The organizer, ensuring everything runs smoothly'];
		$scope.learning = ['Hands-on experience and trial-and-error', 'Studying and reading extensively', 'Learning from different sources and perspectives', 'Engaging in thoughtful discussions and debates', 'Experimenting with unconventional methods'];
		$scope.music = ['Energetic and fast-paced', 'Nature-inspired or acoustic', 'Diverse and eclectic', 'Calming and soothing', 'Experimental or unconventional'];
		$scope.style = ['Edgy and unique', 'Sleek and modern', 'Comfort first', 'Adaptive and ever-changing', 'Bold and attention-grabbing'];


		$scope.answers = {};

		$scope.white = {};
		$scope.blue = {};
		$scope.black = {};
		$scope.red = {};
		$scope.green = {};
		$scope.white.result = 0;
		$scope.blue.result = 0;
		$scope.black.result = 0;
		$scope.red.result = 0;
		$scope.green.result = 0;

		$scope.updateColor = function() {

			$scope.playStyles = {
				'Aggressive': $scope.red,
				'Well rounded': $scope.white,
				'Control': $scope.blue,
				'Power at any cost': $scope.black,
				'Creature-heavy': $scope.green
			};
			var selectedColor1 = $scope.playStyles[$scope.selectedPlayStyles];
			if (selectedColor1) {
				selectedColor1.result++;

				console.log(selectedColor1 + ': ' + selectedColor1.result);

			}

			$scope.personality = {
				'Chaotic': $scope.red,
				'Lawful': $scope.white,
				'Manipulative': $scope.blue,
				'Individualistic': $scope.black,
				'Naturalistic': $scope.green
			};
			var selectedColor2 = $scope.personality[$scope.selectedPersonalities];
			if (selectedColor2) {
				selectedColor2.result++;

				console.log(selectedColor2 + ': ' + selectedColor2.result);

			}

			$scope.conflicts = {
				'Direct confrontation and assertiveness': $scope.red,
				'Diplomacy and negotiation': $scope.white,
				'Avoiding conflict and seeking harmony': $scope.blue,
				'Everyone gives up an equal amount to even the field': $scope.black,
				'Mediation and compromise': $scope.green
			};
			var selectedColor3 = $scope.conflicts[$scope.selectedConflicts];
			if (selectedColor3) {
				selectedColor3.result++;

				console.log(selectedColor3 + ': ' + selectedColor3.result);

			}

			$scope.environment = {
				'A place of action and challenge': $scope.red,
				'A well-organized and structured space': $scope.white,
				'A library or a place of learning': $scope.blue,
				'Anywhere that offers change and variety': $scope.black,
				'A social gathering or a community event': $scope.green
			};
			var selectedColor4 = $scope.environment[$scope.selectedEnvironment];
			if (selectedColor4) {
				selectedColor4.result++;

				console.log(selectedColor4 + ': ' + selectedColor4.result);

			}

			$scope.powers = {
				'Super strength and speed': $scope.red,
				'Regeneration and healing': $scope.white,
				'Infinite knowledge and wisdom': $scope.blue,
				'Immortality and the ability to raise the dead': $scope.black,
				'The ability to control biological objects and terraforming': $scope.green
			};
			var selectedColor5 = $scope.powers[$scope.selectedPower];
			if (selectedColor5) {
				selectedColor5.result++;

				console.log(selectedColor5 + ': ' + selectedColor5.result);

			}

			$scope.figure = {
				'A conqueror or war hero': $scope.red,
				'A diplomat or peacemaker': $scope.white,
				'A philosopher or thinker': $scope.blue,
				'A revolutionary or rule-breaker': $scope.black,
				'An environmentalist or conservationist': $scope.green
			};
			var selectedColor6 = $scope.figure[$scope.selectedFigure];
			if (selectedColor6) {
				selectedColor6.result++;

				console.log(selectedColor6 + ': ' + selectedColor6.result);

			}

			$scope.weather = {
				'Hot and sunny': $scope.red,
				'Calm and clear': $scope.white,
				'Rainy and cool': $scope.blue,
				'Misty and mysterious': $scope.black,
				'Variable with different elements': $scope.green
			};
			var selectedColor7 = $scope.weather[$scope.selectedWeather];
			if (selectedColor7) {
				selectedColor7.result++;

				console.log(selectedColor7 + ': ' + selectedColor7.result);

			}

			$scope.vacation = {
				'A bustling city with entertainment': $scope.red,
				'A diverse and vibrant destination': $scope.white,
				'A historical and culturally rich location': $scope.blue,
				'A mysterious and unexplored place': $scope.black,
				'A secluded cabin in the woods': $scope.green
			};
			var selectedColor8 = $scope.vacation[$scope.selectedVacation];
			if (selectedColor8) {
				selectedColor8.result++;

				console.log(selectedColor8 + ': ' + selectedColor8.result);

			}

			$scope.project = {
				'The leader, taking charge': $scope.red,
				'The organizer, ensuring everything runs smoothly': $scope.white,
				'The strategist, planning the approach': $scope.blue,
				'The wildcard, bringing unexpected elements': $scope.black,
				'The team player, contributing ideas': $scope.green
			};
			var selectedColor9 = $scope.project[$scope.selectedProject];
			if (selectedColor9) {
				selectedColor9.result++;

				console.log(selectedColor9 + ': ' + selectedColor9.result);

			}

			$scope.learning = {
				'Hands-on experience and trial-and-error': $scope.red,
				'Engaging in thoughtful discussions and debates': $scope.white,
				'Studying and reading extensively': $scope.blue,
				'Experimenting with unconventional methods': $scope.black,
				'Learning from different sources and perspectives': $scope.green
			};
			var selectedColor10 = $scope.learning[$scope.selectedLearning];
			if (selectedColor10) {
				selectedColor10.result++;

				console.log(selectedColor10 + ': ' + selectedColor10.result);

			}

			$scope.music = {
				'Energetic and fast-paced': $scope.red,
				'Diverse and eclectic': $scope.white,
				'Calming and soothing': $scope.blue,
				'Experimental or unconventional': $scope.black,
				'Nature-inspired or acoustic': $scope.green
			};
			var selectedColor11 = $scope.music[$scope.selectedMusic];
			if (selectedColor11) {
				selectedColor11.result++;

				console.log(selectedColor11 + ': ' + selectedColor11.result);

			}

			$scope.style = {
				'Bold and attention-grabbing': $scope.red,
				'Adaptive and ever-changing': $scope.white,
				'Sleek and modern': $scope.blue,
				'Edgy and unique': $scope.black,
				'Comfort first': $scope.green
			};
			var selectedColor12 = $scope.style[$scope.selectedStyle];
			if (selectedColor12) {
				selectedColor12.result++;

				console.log(selectedColor12 + ': ' + selectedColor12.result);

			}


			console.log('White: ' + $scope.white.result);
			console.log('Blue: ' + $scope.blue.result);
			console.log('Black: ' + $scope.black.result);
			console.log('Red: ' + $scope.red.result);
			console.log('Green: ' + $scope.green.result);
			$scope.finalColor();
			$scope.resultMessage = "Your Magic: The Gathering color" + $scope.finalColorEnd;
			$scope.personality = ['Chaotic', 'Lawful', 'Manipulative', 'Individualistic', 'Naturalistic'];
			$scope.playStyles = ['Aggressive', 'Control', 'Creature-heavy', 'Well rounded', 'Power at any cost'];
			$scope.conflicts = ['Direct confrontation and assertiveness', 'Diplomacy and negotiation', 'Mediation and compromise', 'Avoiding conflict and seeking harmony', 'Everyone suffers if I do too'];
			$scope.environment = ['A place of action and challenge', 'A library or a place of learning', 'A social gathering or a community event', 'A well-organized and structured space', 'Anywhere that offers change and variety'];
			$scope.powers = ['Infinite knowledge and wisdom', 'The ability to control biological objects and terraforming', 'Immortality and the ability to raise the dead', 'Super strength and speed', 'Regeneration and healing'];
			$scope.figure = ['A conqueror or war hero', 'A revolutionary or rule-breaker', 'A philosopher or thinker', 'A diplomat or peacemaker', 'An environmentalist or conservationist'];
			$scope.weather = ['Calm and clear', 'Misty and mysterious', 'Hot and sunny', 'Rainy and cool', 'Variable with different elements'];
			$scope.vacation = ['A bustling city with entertainment', 'A secluded cabin in the woods', 'A historical and culturally rich location', 'A mysterious and unexplored place', 'A diverse and vibrant destination'];
			$scope.project = ['The wildcard, bringing unexpected elements', 'The team player, contributing ideas', 'The strategist, planning the approach', 'The leader, taking charge', 'The organizer, ensuring everything runs smoothly'];
			$scope.learning = ['Hands-on experience and trial-and-error', 'Studying and reading extensively', 'Learning from different sources and perspectives', 'Engaging in thoughtful discussions and debates', 'Experimenting with unconventional methods'];
			$scope.music = ['Energetic and fast-paced', 'Nature-inspired or acoustic', 'Diverse and eclectic', 'Calming and soothing', 'Experimental or unconventional'];
			$scope.style = ['Edgy and unique', 'Sleek and modern', 'Comfort first', 'Adaptive and ever-changing', 'Bold and attention-grabbing'];
			$scope.white.result = 0;
			$scope.blue.result = 0;
			$scope.black.result = 0;
			$scope.red.result = 0;
			$scope.green.result = 0;

		};


		$scope.finalColor = function() {

			function compareColorResults(a, b) {
				return b.result - a.result;
			}

			var colors = [
				{ name: 'White', result: $scope.white.result },
				{ name: 'Blue', result: $scope.blue.result },
				{ name: 'Black', result: $scope.black.result },
				{ name: 'Red', result: $scope.red.result },
				{ name: 'Green', result: $scope.green.result }
			];

			colors.sort(compareColorResults);

			$scope.finalColorEnd = '';

			if (colors.every(color => color.result === colors[0].result)) {
				$scope.finalColorEnd = "s are, all of them pretty cool!";
			} else if (colors[0].result === colors[1].result && colors[0].result === colors[2].result && colors[0].result === colors[3].result) {
				$scope.finalColorEnd = "s are, " + colors[0].name + ', ' + colors[1].name + ', ' + colors[2].name + ', and ' + colors[3].name;
			} else if (colors[0].result === colors[1].result && colors[0].result === colors[2].result) {
				$scope.finalColorEnd = "s are, " + colors[0].name + ', ' + colors[1].name + ', and ' + colors[2].name;
			} else if (colors[0].result === colors[1].result) {
				$scope.finalColorEnd = "s are, " + colors[0].name + ' and ' + colors[1].name;
			} else if (colors[0].result > colors[1].result) {
				$scope.finalColorEnd = " is, " + colors[0].name;
			} else {
				$scope.finalColorEnd = ".  Idk how you got here but you are what have you done..."
			}
		}

	})
})()