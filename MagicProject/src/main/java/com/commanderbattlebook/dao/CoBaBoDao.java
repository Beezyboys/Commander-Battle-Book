package com.commanderbattlebook.dao;

import java.util.List;

import com.commanderbattlebook.model.CoBaBo;

public interface CoBaBoDao {

	public List<CoBaBo> getCoBaBo();
	
	List<CoBaBo> getCoBaBoByGameId(Integer gameId);
	
	List<CoBaBo> getCoBaBoByDeckName(String name);
	
	public CoBaBo createGame(CoBaBo newGame);
	
	public CoBaBo updateGame(CoBaBo updateGame);
	
	public CoBaBo deleteGameById(Integer gameId);
	
	public List<CoBaBo> getGameWinner(String gameWinner);

	

	
	
	
	
	
}
