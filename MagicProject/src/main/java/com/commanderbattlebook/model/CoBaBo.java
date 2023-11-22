package com.commanderbattlebook.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CoBaBo {

	private String gameName;
	private Integer gameId;
	/*
//	private Integer lifeTotalP1;
//	private Integer lifeTotalP2;
//	private Integer lifeTotalP3;
//	private Integer lifeTotalP4;
//	private Integer commanderDamP1FromP2;
//	private Integer commanderDamP1FromP3;
//	private Integer commanderDamP1FromP4;
//	private Integer commanderDamP2FromP1;
//	private Integer commanderDamP2FromP3;
//	private Integer commanderDamP2FromP4;
//	private Integer commanderDamP3FromP1;
//	private Integer commanderDamP3FromP2;
//	private Integer commanderDamP3FromP4;
//	private Integer PoisonCounterP1;
//	private Integer PoisonCounterP2;
//	private Integer PoisonCounterP3;
//	private Integer PoisonCounterP4;
 * 
 */
	private String deckNameP1;
	private String deckNameP2;
	private String deckNameP3;
	private String deckNameP4;
	//private List<Player> players = new ArrayList<Player>();
	private String winner;
	private LocalDateTime updateDateTime;
	private LocalDateTime createDateTime;
	
	public String getGameName() {
		return gameName;
	}
	public Integer getGameId() {
		return gameId;
	}
	public void setGameId(Integer gameId) {
		this.gameId = gameId;
	}
	public void setGameName(String gameId) {
		this.gameName = gameId;
	}
	/*
//	public Integer getLifeTotalP1() {
//		return lifeTotalP1;
//	}
//	public void setLifeTotalP1(Integer lifeTotalP1) {
//		this.lifeTotalP1 = lifeTotalP1;
//	}
//	public Integer getLifeTotalP2() {
//		return lifeTotalP2;
//	}
//	public void setLifeTotalP2(Integer lifeTotalP2) {
//		this.lifeTotalP2 = lifeTotalP2;
//	}
//	public Integer getLifeTotalP3() {
//		return lifeTotalP3;
//	}
//	public void setLifeTotalP3(Integer lifeTotalP3) {
//		this.lifeTotalP3 = lifeTotalP3;
//	}
//	public Integer getLifeTotalP4() {
//		return lifeTotalP4;
//	}
//	public void setLifeTotalP4(Integer lifeTotalP4) {
//		this.lifeTotalP4 = lifeTotalP4;
//	}
//	public Integer getCommanderDamP1FromP2() {
//		return commanderDamP1FromP2;
//	}
//	public void setCommanderDamP1FromP2(Integer commanderDamP1FromP2) {
//		this.commanderDamP1FromP2 = commanderDamP1FromP2;
//	}
//	public Integer getCommanderDamP1FromP3() {
//		return commanderDamP1FromP3;
//	}
//	public void setCommanderDamP1FromP3(Integer commanderDamP1FromP3) {
//		this.commanderDamP1FromP3 = commanderDamP1FromP3;
//	}
//	public Integer getCommanderDamP1FromP4() {
//		return commanderDamP1FromP4;
//	}
//	public void setCommanderDamP1FromP4(Integer commanderDamP1FromP4) {
//		this.commanderDamP1FromP4 = commanderDamP1FromP4;
//	}
//	public Integer getCommanderDamP2FromP1() {
//		return commanderDamP2FromP1;
//	}
//	public void setCommanderDamP2FromP1(Integer commanderDamP2FromP1) {
//		this.commanderDamP2FromP1 = commanderDamP2FromP1;
//	}
//	public Integer getCommanderDamP2FromP3() {
//		return commanderDamP2FromP3;
//	}
//	public void setCommanderDamP2FromP3(Integer commanderDamP2FromP3) {
//		this.commanderDamP2FromP3 = commanderDamP2FromP3;
//	}
//	public Integer getCommanderDamP2FromP4() {
//		return commanderDamP2FromP4;
//	}
//	public void setCommanderDamP2FromP4(Integer commanderDamP2FromP4) {
//		this.commanderDamP2FromP4 = commanderDamP2FromP4;
//	}
//	public Integer getCommanderDamP3FromP1() {
//		return commanderDamP3FromP1;
//	}
//	public void setCommanderDamP3FromP1(Integer commanderDamP3FromP1) {
//		this.commanderDamP3FromP1 = commanderDamP3FromP1;
//	}
//	public Integer getCommanderDamP3FromP2() {
//		return commanderDamP3FromP2;
//	}
//	public void setCommanderDamP3FromP2(Integer commanderDamP3FromP2) {
//		this.commanderDamP3FromP2 = commanderDamP3FromP2;
//	}
//	public Integer getCommanderDamP3FromP4() {
//		return commanderDamP3FromP4;
//	}
//	public void setCommanderDamP3FromP4(Integer commanderDamP3FromP4) {
//		this.commanderDamP3FromP4 = commanderDamP3FromP4;
//	}
//	public Integer getPoisonCounterP1() {
//		return PoisonCounterP1;
//	}
//	public void setPoisonCounterP1(Integer poisonCounterP1) {
//		PoisonCounterP1 = poisonCounterP1;
//	}
//	public Integer getPoisonCounterP2() {
//		return PoisonCounterP2;
//	}
//	public void setPoisonCounterP2(Integer poisonCounterP2) {
//		PoisonCounterP2 = poisonCounterP2;
//	}
//	public Integer getPoisonCounterP3() {
//		return PoisonCounterP3;
//	}
//	public void setPoisonCounterP3(Integer poisonCounterP3) {
//		PoisonCounterP3 = poisonCounterP3;
//	}
//	public Integer getPoisonCounterP4() {
//		return PoisonCounterP4;
//	}
//	public void setPoisonCounterP4(Integer poisonCounterP4) {
//		PoisonCounterP4 = poisonCounterP4;
//	}
//	 */
	public String getDeckNameP1() {
		return deckNameP1;
	}
	public void setDeckNameP1(String deckNameP1) {
		this.deckNameP1 = deckNameP1;
	}
	public String getDeckNameP2() {
		return deckNameP2;
	}
	public void setDeckNameP2(String deckNameP2) {
		this.deckNameP2 = deckNameP2;
	}
	public String getDeckNameP3() {
		return deckNameP3;
	}
	public void setDeckNameP3(String deckNameP3) {
		this.deckNameP3 = deckNameP3;
	}
	public String getDeckNameP4() {
		return deckNameP4;
	}
	public void setDeckNameP4(String deckNameP4) {
		this.deckNameP4 = deckNameP4;
	}
	
	public LocalDateTime getUpdateDateTime() {
		return updateDateTime;
	}
	public void setUpdateDateTime(LocalDateTime updateDateTime) {
		this.updateDateTime = updateDateTime;
	}
	public LocalDateTime getCreateDateTime() {
		return createDateTime;
	}
	public void setCreateDateTime(LocalDateTime createDateTime) {
		this.createDateTime = createDateTime;
	}
	public String getWinner() {
		return winner;
	}
	public void setWinner(String string) {
		this.winner = string;
	}
//	public List<Player> getPlayers() {
//		return players;
//	}
//	public void setPlayers(List<Player> players) {
//		this.players = players;
//	}
}
