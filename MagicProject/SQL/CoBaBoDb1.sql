	CREATE TABLE IF NOT EXISTS game(
	gameId INT NOT NULL PRIMARY KEY
	);
	
DROP TABLE player;	
	
CREATE TABLE IF NOT EXISTS player(
	playerid INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	deckName VARCHAR(100) NOT NULL, 
	color VARCHAR(10) NOT NULL,
	winner BOOLEAN NOT NULL,
		gameId INT NOT NULL,
			updateDateTime DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
			createDateTime DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
		CONSTRAINT gameId_fkey FOREIGN KEY (gameId) REFERENCES game (gameId)
    ) AUTO_INCREMENT = 0;
  
  CALL InsertPlayerData( 'Zur The Enchanter', 'WUB', 1);
CALL InsertPlayerData( 'Captain N-Gathrod', 'UB', 0);
CALL InsertPlayerData( 'Commodore Guff', 'WUR', 0);
CALL InsertPlayerData( 'Faldorn, Dread Wolf Herald', 'RG', 0);
CALL InsertPlayerData('Sidar Jabari of Zhalfir', 'WUB', 1);
CALL InsertPlayerData('Kyler, Sigardian Emissary', 'WG', 0);
CALL InsertPlayerData('Saruman, the White Hand', 'UBR', 0);
CALL InsertPlayerData('Chishiro, the Shattered Blade', 'RG', 0);

  
  
  INSERT INTO player ( deckName, color, winner, gameId)
VALUES
  
INSERT INTO player (playerId, deckName, color, winner, gameId)
VALUES
(0, 'Zur The Enchanter', 'WUB', 1, 0),
( 'Captain N-Gathrod', 'UB', 0, 1),
( 'Commodore Guff', 'WUR', 0, 1),
( 'Faldorn, Dread Wolf Herald', 'RG', 0, 1);


SELECT * FROM player;

SELECT * FROM game;



SELECT * FROM movies;

DROP PROCEDURE InsertPlayerData;

\
DELIMITER $$

CREATE PROCEDURE InsertPlayerData(
    IN p_deckName VARCHAR(100),
    IN p_color VARCHAR(10),
    IN p_winner BOOLEAN
)
BEGIN
    DECLARE new_gameId INT;

    -- Get the current count of rows in the player table
    SELECT COUNT(*) INTO new_gameId FROM player;

    -- Increment gameId every 4 inserts
    SET new_gameId = FLOOR(new_gameId / 4);

    -- Insert data into the player table
    INSERT INTO player (deckName, color, winner, gameId)
    VALUES (p_deckName, p_color, p_winner, new_gameId);
END$$

\
DELIMITER ;
