package dev.norska.rc;

import org.bukkit.plugin.java.JavaPlugin;

public class RedeemableCodes extends JavaPlugin {

	private static RedeemableCodes instance;
	public RedeemableCodes() { instance = this; }
	public static RedeemableCodes getInstance() { return instance; }

}
