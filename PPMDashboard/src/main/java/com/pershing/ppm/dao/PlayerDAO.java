package com.pershing.ppm.dao;

import java.util.List;

import com.pershing.ppm.model.Player;

public interface PlayerDAO {

	public Player getPlayer(int playerId);
	public String insertNewPlayer(Player player);
	public List<Player> getAllPlayer();
}