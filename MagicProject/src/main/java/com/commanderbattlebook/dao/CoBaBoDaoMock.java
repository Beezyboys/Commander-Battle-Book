//package com.commanderbattlebook.dao;

//import java.util.ArrayList;
//import java.util.List;
//
//import com.commanderbattlebook.model.CoBaBo;

//public class CoBaBoDaoMock implements CoBaBoDao {
//
//	private static List<CoBaBo> coBaBo = new ArrayList<CoBaBo>();
//
//	private static Integer lastGameId = 0;
//
//	private static Integer getNextGameId() {
//		return ++lastGameId;
//	}

//	static {
//		CoBaBo testGame1 = new CoBaBo();
//		testGame1.setGameId(getNextGameId());
//		testGame1.setDeckNameP1("Chishiro, the Shattered Blade");
//		testGame1.setDeckNameP2("Sidar Jabari of Zhalfir");
//		testGame1.setDeckNameP3("Kyler, Sigardian Emissary");
//		testGame1.setDeckNameP4("Saruman, the White Hand");
//		testGame1.setWinner(testGame1.getDeckNameP2());
//
//		CoBaBo testGame2 = new CoBaBo();
//		testGame2.setGameId(getNextGameId());
//		testGame2.setDeckNameP1("Zur The Enchanter");
//		testGame2.setDeckNameP2("Captain N'Gathrod");
//		testGame2.setDeckNameP3("Commodore Guff");
//		testGame2.setDeckNameP4("Faldorn, Dread Wolf Herald");
//		testGame2.setWinner(testGame2.getDeckNameP1());
//		
//		CoBaBo testGame3 = new CoBaBo();
//		testGame3.setGameId(getNextGameId());
//		testGame3.setDeckNameP1("Commodore Guff");
//		testGame3.setDeckNameP2("Captain N'Gathrod");
//		testGame3.setDeckNameP3("Faldorn, Dread Wolf Herald");
//		testGame3.setDeckNameP4("Zur The Enchanter");
//		testGame3.setWinner(testGame3.getDeckNameP1());
//		
//		CoBaBo testGame4 = new CoBaBo();
//		testGame4.setGameId(getNextGameId());
//		testGame4.setDeckNameP1("Saruman, the White Hand");
//		testGame4.setDeckNameP2("Faldorn, Dread Wolf Herald");
//		testGame4.setDeckNameP3("Zur The Enchanter");
//		testGame4.setDeckNameP4("Sidar Jabari of Zhalfir");
//		testGame4.setWinner(testGame4.getDeckNameP3());
//
//		coBaBo.add(testGame1);
//		coBaBo.add(testGame2);
//		coBaBo.add(testGame3);
//		coBaBo.add(testGame4);
//	}

//	public List<CoBaBo> getGames() {
//		List<CoBaBo> myCoBaBo = new ArrayList<CoBaBo>();
//		myCoBaBo.addAll(coBaBo);
//		return myCoBaBo;
//	}
//
//	@Override
//	public List<CoBaBo> getCoBaBoByGameId(Integer gameId) {
//		List<CoBaBo> myGame = new ArrayList<CoBaBo>();
//		for (CoBaBo game : coBaBo) {
//			if (game.getGameId().intValue() == gameId.intValue()) {
//				myGame.add(game);
//				break;
//			}
//		}
//		return myGame;
//	}
//
//	@Override
//	public List<CoBaBo> getCoBaBoByDeckName(String name) {
//		List<CoBaBo> myCoBaBo = new ArrayList<CoBaBo>();
//		for (CoBaBo names : coBaBo) {
//			if (names.getDeckNameP1().toLowerCase().contains(name.toLowerCase())) {
//				myCoBaBo.add(names);			
//			}
//			if (names.getDeckNameP2().toLowerCase().contains(name.toLowerCase())) {
//				myCoBaBo.add(names);			
//			}
//			if (names.getDeckNameP3().toLowerCase().contains(name.toLowerCase())) {
//				myCoBaBo.add(names);
//			}
//			if (names.getDeckNameP4().toLowerCase().contains(name.toLowerCase())) {
//				myCoBaBo.add(names);			
//			}
//		}
//		return myCoBaBo;
//	}
//
//	@Override
//	public CoBaBo deleteGameById(Integer gameId) {
//		List <CoBaBo> games = this.getCoBaBoByGameId(gameId);
//		CoBaBo game = null;
//		
//		if(games.size() > 0) {
//			game = games.get(0);
//			CoBaBoDaoMock.coBaBo.remove(game);
//		}
//		
//		return game;
//	}
//
//	@Override
//	public CoBaBo createGame(CoBaBo newGame) {
//		newGame.setGameId(getNextGameId());
//		coBaBo.add(newGame);
//		return newGame;
//	}
//
//	@Override
//	public CoBaBo updateGame(CoBaBo updateGame) {
//		for (CoBaBo names : coBaBo) {
//			if (names.getGameId().intValue() == updateGame.getGameId()) {
//				names.setDeckNameP1(updateGame.getDeckNameP1());
//				names.setDeckNameP2(updateGame.getDeckNameP2());
//				names.setDeckNameP3(updateGame.getDeckNameP3());
//				names.setDeckNameP4(updateGame.getDeckNameP4());
//				names.setWinner(updateGame.getWinner());
//				break;
//			}
//
//		}
//		return updateGame;
//	}
//
//	@Override
//	public List<CoBaBo> getGameWinner(String gameWinner) {
//		List<CoBaBo> myCoBaBo = new ArrayList<CoBaBo>();
//		for (CoBaBo names : coBaBo) {
//			if (names.getWinner().toLowerCase().contains(gameWinner.toLowerCase())){
//				myCoBaBo.add(names);
//			}
//		}
//		return myCoBaBo;
//	}
//
//}
