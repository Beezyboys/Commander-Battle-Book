package com.commanderbattlebook.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.commanderbattlebook.model.CoBaBo;
import com.commanderbattlebook.model.Colors;


public class CoBaBoDaoImpl implements CoBaBoDao{

	
	
	private static String selectAllGames = "SELECT playerid, deckName, color, winner, updateDateTime, gameId, createDateTime\r\n" +
			"FROM player\r\n";
	
	private static String selectGamesByGameId = "SELECT playerId, deckName, color, winner, gameId, updateDateTime, createDateTime\r\n" +
			"FROM player\r\n" +
			"WHERE gameId = ?;";
				
	private static String selectCoBaBoByDeckName = "SELECT playerId, deckName, color, winner, gameId, updateDateTime, createDateTime\r\n"
			+ "FROM player\r\n" + 
			"WHERE deckName LIKE ? ";

	private static String selectGameWinners = "SELECT playerId, deckName, color, winner, gameId, updateDateTime, createDateTime\r\n"
			+ "FROM player\r\n" + "WHERE winner = ? \r\n";
	
	private static String createGame = "CALL InsertPlayerData( ?, ?, ?);\r\n"
			+ "CALL InsertPlayerData( ?, ?, ?);\r\n"
			+ "CALL InsertPlayerData( ?, ?, ?);\r\n"
			+ "CALL InsertPlayerData( ?, ?, ?);";

	@Override
	public List<CoBaBo> getGames() {
		List<CoBaBo> myCoBaBo = new ArrayList<CoBaBo>();
		ResultSet result = null;
		Statement statement = null;
		
		Connection connection = MariaDbUtil.getConnection();
		
		try {
			statement = connection.createStatement();
			result = statement.executeQuery(selectAllGames);
			myCoBaBo = makeGame(result);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return myCoBaBo;
	}


	private List<CoBaBo> makeGame(ResultSet result) throws SQLException {
		List<CoBaBo> myCoBaBo = new ArrayList<CoBaBo>();
		while (result.next()) {

			CoBaBo coBaBo = new CoBaBo();
			coBaBo.setPlayerId (result.getInt("playerId"));
			coBaBo.setDeckName(result.getString("deckName"));
			String colorString = result.getString("color");
			Colors color = Colors.convertStringToColor(colorString);
			coBaBo.setColor(color);
			coBaBo.setWinner(result.getBoolean("winner"));
			coBaBo.setGameId(result.getInt("gameId"));
			
			coBaBo.setPlayerId (result.getInt("playerId"));
			coBaBo.setDeckName(result.getString("deckName"));
			colorString = result.getString("color");
			color = Colors.convertStringToColor(colorString);
			coBaBo.setColor(color);
			coBaBo.setWinner(result.getBoolean("winner"));
			coBaBo.setGameId(result.getInt("gameId"));
			
			coBaBo.setPlayerId (result.getInt("playerId"));
			coBaBo.setDeckName(result.getString("deckName"));
			colorString = result.getString("color");
			color = Colors.convertStringToColor(colorString);
			coBaBo.setColor(color);
			coBaBo.setWinner(result.getBoolean("winner"));
			coBaBo.setGameId(result.getInt("gameId"));
			
			coBaBo.setPlayerId (result.getInt("playerId"));
			coBaBo.setDeckName(result.getString("deckName"));
			colorString = result.getString("color");
			color = Colors.convertStringToColor(colorString);
			coBaBo.setColor(color);
			coBaBo.setWinner(result.getBoolean("winner"));
			coBaBo.setGameId(result.getInt("gameId"));

			myCoBaBo.add(coBaBo);
		}
		return myCoBaBo;
	}


	@Override
	public List<CoBaBo> getCoBaBoByGameId(Integer gameId) {
		List<CoBaBo> myCobabo = new ArrayList<CoBaBo>();
		ResultSet result = null;
		PreparedStatement statement = null;

		Connection connection = MariaDbUtil.getConnection();
		try {
			statement = connection.prepareStatement(selectGamesByGameId);
			statement.setInt(1, gameId);

			result = statement.executeQuery();
			myCobabo = makeGame(result);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return myCobabo;
	}


	@Override
	public List<CoBaBo> getCoBaBoByDeckName(String name) {
		List<CoBaBo> myCobabo = new ArrayList<CoBaBo>();
		ResultSet result = null;
		PreparedStatement statement = null;

		Connection connection = MariaDbUtil.getConnection();
		try {
			statement = connection.prepareStatement(selectCoBaBoByDeckName);
			statement.setString(1, "%" + name + "%");

			result = statement.executeQuery();
			myCobabo = makeGame(result);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return myCobabo;
	}


	@Override
	public CoBaBo createGame(CoBaBo newGame) {
		PreparedStatement ps = null;
		
		Connection connection = MariaDbUtil.getConnection();
		try {
			ps = connection.prepareStatement(createGame);
			ps.setString(1, newGame.getDeckName());
			ps.setString(2, newGame.getColor().toString());
			ps.setBoolean(3, newGame.isWinner());
			
			ps.setString(4, newGame.getDeckName());
			ps.setString(5, newGame.getColor().toString());
			ps.setBoolean(6, newGame.isWinner());
			
			ps.setString(7, newGame.getDeckName());
			ps.setString(8, newGame.getColor().toString());
			ps.setBoolean(9, newGame.isWinner());
			
			ps.setString(10, newGame.getDeckName());
			ps.setString(11, newGame.getColor().toString());
			ps.setBoolean(12, newGame.isWinner());

			int rowCount = ps.executeUpdate();
			System.out.println("Rows inserted: " + rowCount);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return newGame;
	}


	@Override
	public CoBaBo updateGame(CoBaBo updateGame) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public CoBaBo deleteGameById(Integer gameId) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<CoBaBo> getGameWinner(Boolean gameWinner) {
		List<CoBaBo> myCobabo = new ArrayList<CoBaBo>();
		ResultSet result = null;
		PreparedStatement statement = null;

		Connection connection = MariaDbUtil.getConnection();
		try {
			statement = connection.prepareStatement(selectGameWinners);
			statement.setBoolean(1, gameWinner);

			result = statement.executeQuery();
			myCobabo = makeGame(result);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return myCobabo;
	}



	
}
