package com.binnerdone.shockselfbot;

import com.binnerdone.shockselfbot.commands.*;
import com.walshydev.jba.Config;
import com.walshydev.jba.JBA;
import net.dv8tion.jda.core.AccountType;

/**
 * Created by jack on 09/07/17.
 */
public class ShockSelfBot extends JBA {
    public void init(){
        Config config = new Config("config");
        super.init(AccountType.BOT, config.getString("token"), config.getString("prefix"));

    }
    public static void main(String[] args){
        new ShockSelfBot().init();
    }

    @Override
    public void run() {
        registerCommand(new LogCommand());
        registerCommand(new ResetMulticraftCommand());
        registerCommand(new CreateTicket());
        registerCommand(new NotSupportCommand());
        registerCommand(new TicketSoonCommand());
        registerCommand(new RefundCommand());
        registerCommand(new FeedbackCommand());
        registerCommand(new ToSAndPrivacyCommand());
        registerCommand(new DediIp());
        LOGGER.info("Bot Startup Successfully!");
    }
}
