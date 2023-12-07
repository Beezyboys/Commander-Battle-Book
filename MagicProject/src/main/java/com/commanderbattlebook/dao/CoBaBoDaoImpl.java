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
import com.commanderbattlebook.model.Color;

public class CoBaBoDaoImpl implements CoBaBoDao {

	private static String selectAllGames = "SELECT playerid, deckName, color, winner, updateDateTime, gameId, createDateTime\r\n"
			+ "FROM player\r\n";

	private static String selectGamesByGameId = "SELECT playerId, deckName, color, winner, gameId, updateDateTime, createDateTime\r\n"
			+ "FROM player\r\n" + "WHERE gameId = ?;";

	private static String selectCoBaBoByDeckName = "SELECT playerId, deckName, color, winner, gameId, updateDateTime, createDateTime\r\n"
			+ "FROM player\r\n" + "WHERE deckName LIKE ? ";

	private static String selectPlayerById = "SELECT playerId, deckName, color, winner, gameId, updateDateTime, createDateTime\r\n"
			+ "FROM player\r\n" + "WHERE playerId = ? ";

	private static String selectGameWinners = "SELECT playerId, deckName, color, winner, gameId, updateDateTime, createDateTime\r\n"
			+ "FROM player\r\n" + "WHERE winner = ? \r\n";

	private static String createGame1 = "CALL InsertPlayerData(?, ?, ?);\r\n";

//	private static String createGame2 = "CALL InsertPlayerData(?, ?, ?);\r\n";
//	
//	private static String createGame3 = "CALL InsertPlayerData(?, ?, ?);\r\n";
//	
//	private static String createGame4 = "CALL InsertPlayerData(?, ?, ?);\r\n";
//	

	private static String deleteGameById = "DELETE FROM player\r\n" + "WHERE gameId = ?;";

//	private static String deletePlayerById = "DELETE FROM player\r\n"+ 
//			"WHERE playerId = ?;";

	private static String updatePlayerById = "UPDATE player " + "SET deckName = ?, " + "color = ?, " + "winner = ? "
			+ "WHERE playerId = ?";

	private static String updatePlayerByIdWinner = "UPDATE player " + "SET winner = ? " + "WHERE playerId = ?";

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
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return myCoBaBo;
	}

	private List<CoBaBo> makeGame(ResultSet result) throws SQLException {
		List<CoBaBo> myCoBaBo = new ArrayList<CoBaBo>();
		while (result.next()) {

			CoBaBo coBaBo = new CoBaBo();
			coBaBo.setPlayerId(result.getInt("playerId"));
			coBaBo.setDeckName(result.getString("deckName"));
			String colorString = result.getString("color");
			Color color = Color.convertStringToColor(colorString);
			coBaBo.setColor(color);
			coBaBo.setWinner(result.getBoolean("winner"));
			coBaBo.setGameId(result.getInt("gameId"));
			coBaBo.setCreateDateTime(result.getObject("createDateTime", LocalDateTime.class));
			coBaBo.setUpdateDateTime(result.getObject("updateDateTime", LocalDateTime.class));
			/*
			 * coBaBo.setPlayerId (result.getInt("playerId"));
			 * coBaBo.setDeckName(result.getString("deckName")); colorString =
			 * result.getString("color"); color = Colors.convertStringToColor(colorString);
			 * coBaBo.setColor(color); coBaBo.setWinner(result.getBoolean("winner"));
			 * coBaBo.setGameId(result.getInt("gameId"));
			 * 
			 * coBaBo.setPlayerId (result.getInt("playerId"));
			 * coBaBo.setDeckName(result.getString("deckName")); colorString =
			 * result.getString("color"); color = Colors.convertStringToColor(colorString);
			 * coBaBo.setColor(color); coBaBo.setWinner(result.getBoolean("winner"));
			 * coBaBo.setGameId(result.getInt("gameId"));
			 * 
			 * coBaBo.setPlayerId (result.getInt("playerId"));
			 * coBaBo.setDeckName(result.getString("deckName")); colorString =
			 * result.getString("color"); color = Colors.convertStringToColor(colorString);
			 * coBaBo.setColor(color); coBaBo.setWinner(result.getBoolean("winner"));
			 * coBaBo.setGameId(result.getInt("gameId"));
			 */
			myCoBaBo.add(coBaBo);
		}
		return myCoBaBo;
	}

	@Override
	public List<CoBaBo> getGameById(Integer gameId) {
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
	public List<CoBaBo> getDeckByName(String name) {
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

			ps = connection.prepareStatement(createGame1);
			ps.setString(1, newGame.getDeckName());
			ps.setString(2, newGame.getColor().toString());
			ps.setBoolean(3, newGame.isWinner());

//			ps = connection.prepareStatement(createGame);
//			ps.setString(4, newGame.getDeckName());
//			ps.setString(5, newGame.getColor().toString());
//			ps.setBoolean(6, newGame.isWinner());
//			
//			ps = connection.prepareStatement(createGame);
//			ps.setString(7, newGame.getDeckName());
//			ps.setString(8, newGame.getColor().toString());
//			ps.setBoolean(9, newGame.isWinner());
//			
//			ps = connection.prepareStatement(createGame);
//			ps.setString(10, newGame.getDeckName());
//			ps.setString(11, newGame.getColor().toString());
//			ps.setBoolean(12, newGame.isWinner());

			int rowCount = ps.executeUpdate();
			System.out.println("Rows inserted: " + rowCount);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return newGame;
	}

//	@Override
//	public CoBaBo createGame2(CoBaBo newGame2) {
//		PreparedStatement ps = null;
//		
//		Connection connection = MariaDbUtil.getConnection();
//		try {
//	
//			ps = connection.prepareStatement(createGame1);
//			ps.setString(1, newGame2.getDeckName());
//			ps.setString(2, newGame2.getColor().toString());
//			ps.setBoolean(3, newGame2.isWinner());
//			
//			int rowCount = ps.executeUpdate();
//			System.out.println("Rows inserted: " + rowCount);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//		return newGame2;
//	}
//
//	@Override
//	public CoBaBo createGame3(CoBaBo newGame3) {
//		PreparedStatement ps = null;
//		
//		Connection connection = MariaDbUtil.getConnection();
//		try {
//	
//			ps = connection.prepareStatement(createGame3);
//			ps.setString(1, newGame3.getDeckName());
//			ps.setString(2, newGame3.getColor().toString());
//			ps.setBoolean(3, newGame3.isWinner());
//
//			int rowCount = ps.executeUpdate();
//			System.out.println("Rows inserted: " + rowCount);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//		return newGame3;
//	}
//
//	@Override
//	public CoBaBo createGame4(CoBaBo newGame4) {
//		PreparedStatement ps = null;
//		
//		Connection connection = MariaDbUtil.getConnection();
//		try {
//	
//			ps = connection.prepareStatement(createGame4);
//			ps.setString(1, newGame4.getDeckName());
//			ps.setString(2, newGame4.getColor().toString());
//			ps.setBoolean(3, newGame4.isWinner());
//
//			int rowCount = ps.executeUpdate();
//			System.out.println("Rows inserted: " + rowCount);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//		return newGame4;
//	}

	@Override
	public List<CoBaBo> updatePlayer(List<CoBaBo> players) {
		PreparedStatement ps = null;

		Connection connection = MariaDbUtil.getConnection();
		for (CoBaBo player : players) {
			try {
				ps = connection.prepareStatement(updatePlayerById);
				ps.setString(1, player.getDeckName());
				ps.setString(2, player.getColor().toString());
				ps.setBoolean(3, player.isWinner());
				ps.setInt(4, player.getPlayerId());
				int rowCount = ps.executeUpdate();
				System.out.println("Rows inserted: " + rowCount);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return players;
	}

	@Override
	public CoBaBo deleteGameById(Integer gameId) {
		List<CoBaBo> coBaBo = getGameById(gameId);
		CoBaBo coBaBoToDelete = null;

		if (coBaBo.size() > 0) {
			coBaBoToDelete = coBaBo.get(0);
			int updateRowCount = 0;
			PreparedStatement ps = null;

			Connection conn = MariaDbUtil.getConnection();
			try {
				ps = conn.prepareStatement(deleteGameById);
				ps.setInt(1, gameId);
				updateRowCount = ps.executeUpdate();
				System.out.println("Rows deleted: " + updateRowCount);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return coBaBoToDelete;
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

	@Override
	public List<CoBaBo> getPlayerById(Integer playerId) {
		List<CoBaBo> myCobabo = new ArrayList<CoBaBo>();
		ResultSet result = null;
		PreparedStatement statement = null;

		Connection connection = MariaDbUtil.getConnection();
		try {
			statement = connection.prepareStatement(selectPlayerById);
			statement.setInt(1, playerId);

			result = statement.executeQuery();
			myCobabo = makeGame(result);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return myCobabo;
	}

	@Override
	public CoBaBo deletePlayerById(CoBaBo playerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
