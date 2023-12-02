package com.commanderbattlebook.service;

import java.util.List;

import com.commanderbattlebook.dao.CoBaBoDao;
import com.commanderbattlebook.dao.CoBaBoDaoImpl;
import com.commanderbattlebook.model.CoBaBo;

public class CoBaBoService {
	private CoBaBoDao coBaBoDao = new CoBaBoDaoImpl();
	
	public List<CoBaBo> getGames() {
			return coBaBoDao.getGames();
	}

	public CoBaBo createGame(CoBaBo newGame) {
		return coBaBoDao.createGame(newGame);
	}

//	public CoBaBo createGame2(CoBaBo newGame2) {
//		return coBaBoDao.createGame2(newGame2);
//	}
//	
//	public CoBaBo createGame3(CoBaBo newGame3) {
//		return coBaBoDao.createGame3(newGame3);
//	}
//	
//	public CoBaBo createGame4(CoBaBo newGame4) {
//		return coBaBoDao.createGame4(newGame4);
//	}
//	
	public List<CoBaBo> getGameById(Integer id) {
		return coBaBoDao.getGameById(id);
	}

	public List<CoBaBo> getGameByDeckName(String name) {
		return coBaBoDao.getDeckByName(name);
	}

	public List <CoBaBo> updatePlayer(List <CoBaBo> updateGame) {
		return coBaBoDao.updatePlayer(updateGame);
	}
	
	public CoBaBo deleteGameByID(Integer id) {
		return coBaBoDao.deleteGameById(id);
	}

	public List<CoBaBo> getGameWinner(boolean gameWinner) {
		return coBaBoDao.getGameWinner(gameWinner);
	}

	public List<CoBaBo> getPlayerById(Integer id) {
		return coBaBoDao.getPlayerById(id);
	}

}
