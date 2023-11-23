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

	public List<CoBaBo> getGameById(Integer id) {
		return coBaBoDao.getCoBaBoByGameId(id);
	}

	public List<CoBaBo> getGameByDeckName(String name) {
		return coBaBoDao.getCoBaBoByDeckName(name);
	}

	public CoBaBo updateGame(CoBaBo updateGame) {
		return coBaBoDao.updateGame(updateGame);
	}

	public CoBaBo deleteGameByID(Integer id) {
		return coBaBoDao.deleteGameById(id);
	}

	public List<CoBaBo> getGameWinner(boolean gameWinner) {
		return coBaBoDao.getGameWinner(gameWinner);
	}

}
