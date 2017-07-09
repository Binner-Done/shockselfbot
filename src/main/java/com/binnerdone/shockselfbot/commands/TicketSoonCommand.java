package com.binnerdone.shockselfbot.commands;

import com.walshydev.jba.commands.Command;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;

/**
 * Created by jack on 09/07/17.
 */
public class TicketSoonCommand implements Command {
    @Override
    public void onCommand(User user, MessageChannel messageChannel, Message message, String[] strings, Member member) {
        message.editMessage("Please be patient while we get around to your ticket, we get a lot of tickets daily, don't worry, we will get around to it!").queue();
    }

    @Override
    public String getCommand() {
        return "ticketsoon";
    }

    @Override
    public String getDescription() {
        return null;
    }
}
