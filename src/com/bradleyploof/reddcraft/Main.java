package com.bradleyploof.reddcraft;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin{
	public void onEnable(){
		getLogger().info("Enabled!");
		FirstConnect();
	}
	public void onDisable(){
		getLogger().info("Disabled");
		//disconnect from wallet
	}
	public void FirstConnect(){
		//initialize connection to QT client
		//do getinfo to verify that it works
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if (sender instanceof Player)
		{
			if (cmd.getName().equalsIgnoreCase("checkwallet"))
			{
				//get playername
				//if registered
					//send getbalance(username)
				//else
					//ask to register
				return true;
			}
			if (cmd.getName().equalsIgnoreCase("register"))
			{
				//set variable to username
				//check to see if user already exists
				//if not
					//create new wallet address and assign user name
			    	//display Reddcoin Address and username
				//else show already created address
				return true;
			}
			if (cmd.getName().equalsIgnoreCase("send"))
			{
				if (args.length==2)
				{
					String str="Sending "+ args[1] + " RDD to "+ args[0];
					sender.sendMessage(str);
					return true;
					//send user X coins
				}
				if (args.length < 2)
				{
					sender.sendMessage("Not enough information.");
					return false;
				}
			}
			if (cmd.getName().equalsIgnoreCase("haswallet"))
			{
				if (args.length == 1)
				{
					Player player = (Player) sender;
					sender.sendMessage(args[0]);
					//check wallet with getaddressesbyaccount(args[1])
					//if checkwallet == true
						//display "<username> has wallet"
					//else "<username> is not registered on this server"
				}
				return false;
			}
	}
	return false;
	}
}


