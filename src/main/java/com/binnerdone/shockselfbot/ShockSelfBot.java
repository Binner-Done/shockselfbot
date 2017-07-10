package com.binnerdone.shockselfbot;

import com.binnerdone.shockselfbot.commands.FeedbackCommand;
import com.walshydev.jba.Config;
import com.walshydev.jba.JBA;
import net.dv8tion.jda.core.AccountType;

/**
 * Created by jack on 09/07/17.
 */
public class ShockSelfBot extends JBA {

    private void init() {
        Config config = new Config("config");
        super.init(AccountType.CLIENT, config.getString("token"), config.getString("prefix"));
    }

    public static void main(String[] args) {
        new ShockSelfBot().init();
    }

    @Override
    public void run() {
        registerEditCommand("log", "Please post your `latest.log` to https://hastebin.com so we can see the problem :)");
        registerEditCommand("multipass", "You can reset your **Multicraft** password in the client area by navigating to Services > My Services > Select a service > Change Password (under \"Actions\"). You can get to your multicraft panel here: https://mc.shockbyte.com");
        registerEditCommand("ticket", "Please create a ticket, this enables us to help you further. You can login to the client area at: https://shockbyte.com/billing/clientarea.php and can then open a ticket at: https://shockbyte.com/billing/submitticket.php");
        registerEditCommand("notsupport", "This server is not designed to be used for support and isn't one of our official support options. If you need assistance, please contact us at: https://shockbyte.com/billing/submitticket.php");
        registerEditCommand("ticketsoon", "Please be patient while we get around to your ticket, we get a lot of tickets daily, don't worry, we will get around to it!");
        registerEditCommand("refund", "Simply open a support ticket (https://shockbyte.com/billing/submitticket.php) asking for a refund, please make sure you are with in the 24 hour refund period, otherwise you might not be eligible for a refund. ");
        registerCommand(new FeedbackCommand());
        registerEditCommand("tospriv", "Shockbyte Terms of Service: https://shockbyte.com/terms-of-service\nShockbyte Privacy Policy: https://shockbyte.com/privacy-policy");
        registerEditCommand("dedi", "A dedicated IP is an IP that is reserved for only one server and isn't shared with others. This means is that you can use the default Minecraft port of 25565, which will allow you to only enter the IP without the trailing :port number to connect to your server. If you have a URL redirect (DNS Record), it also means you won't have to append the port after the URL to join your server. This allows your server to appear more professional and is easier to memorize and join.");
        LOGGER.info("Bot Startup Successfully!");
    }

    private void registerEditCommand(String command, String message) {
        registerCommand(new EditCommand(command, message));
    }
}
