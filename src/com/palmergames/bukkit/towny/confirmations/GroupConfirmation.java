package com.palmergames.bukkit.towny.confirmations;

import com.palmergames.bukkit.towny.object.PlotObjectGroup;
import com.palmergames.bukkit.towny.object.TownBlockOwnerObject;

import org.bukkit.entity.Player;

import java.util.Objects;

public class GroupConfirmation {
	private PlotObjectGroup group;
	private Player player;
	private String[] args;
	private TownBlockOwnerObject owner;
	
	public GroupConfirmation(PlotObjectGroup group, Player player) {
		this.group = group;
		this.player = player;
	}
	

	public PlotObjectGroup getGroup() {
		return group;
	}

	public Player getPlayer() {
		return player;
	}

	public String[] getArgs() {
		return args;
	}

	public void setArgs(String[] args) {
		this.args = args;
	}
	
	public TownBlockOwnerObject getTownBlockOwner() {
		return owner;
	}

	public void setTownBlockOwner(TownBlockOwnerObject owner) {
		this.owner = owner;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		GroupConfirmation that = (GroupConfirmation) o;
		return group.equals(that.group);
	}

	@Override
	public int hashCode() {
		return Objects.hash(group);
	}
}
