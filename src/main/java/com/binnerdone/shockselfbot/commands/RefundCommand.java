package com.binnerdone.shockselfbot.commands;

import com.walshydev.jba.commands.Command;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;

/**
 * Created by jack on 09/07/17.
 */
public class RefundCommand implements Command {
    @Override
    public void onCommand(User user, MessageChannel messageChannel, Message message, String[] strings, Member member) {
        message.editMessage("Simply open a support ticket (https://shockbyte.com/billing/submitticket.php) asking for a refund, please make sure you are with in the 24 hour refund period, otherwise you might not be eligible for a refund. ").queue();
    }

    @Override
    public String getCommand() {
        return "refund";
    }

    @Override
    public String getDescription() {
        return null;
    }
}
