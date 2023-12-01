package com.commanderbattlebook.dao;

import java.util.List;

import com.commanderbattlebook.model.CoBaBo;

public interface CoBaBoDao {

	public List<CoBaBo> getGames();
	
	List<CoBaBo> getGameById(Integer gameId);
	
	List<CoBaBo> getDeckByName(String name);
	
	List<CoBaBo> getPlayerById(Integer playerId);
	
	public CoBaBo createGame(CoBaBo newGame);
//	
//	public CoBaBo createGame2(CoBaBo newGame2);
//	
//	public CoBaBo createGame3(CoBaBo newGame3);
//	
//	public CoBaBo createGame4(CoBaBo newGame4);
//	
	public CoBaBo deleteGameById(Integer gameId);
	
	public List<CoBaBo> getGameWinner(Boolean gameWinner);

	public List<CoBaBo> updatePlayer(List<CoBaBo> updateGame);

	public CoBaBo deletePlayerById(CoBaBo playerId);
	
}
