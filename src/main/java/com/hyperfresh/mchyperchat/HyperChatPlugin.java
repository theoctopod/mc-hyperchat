package com.hyperfresh.mchyperchat;

import java.util.Collection;
import java.util.UUID;

public interface HyperChatPlugin
{
	/**
	 * Gets a Player by their UUID.
	 * <p/>
	 * If this method returns null, then the Player is not online.
	 *
	 * @param id
	 * @return a Player or null if that player is not online
	 */
	public Player getPlayer(UUID id);

	/**
	 * Gets all Players on the server.
	 *
	 * @return a set of Players on the server
	 */
	public Collection<Player> getPlayers();

	/**
	 * Gets the console of the server.
	 *
	 * @return the console
	 */
	public User getConsole();
}
