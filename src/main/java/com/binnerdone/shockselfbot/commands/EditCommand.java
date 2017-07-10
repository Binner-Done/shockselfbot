package com.binnerdone.shockselfbot.commands;

import com.walshydev.jba.commands.Command;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;

/**
 * Created by William on 10/07/2017.
 * Project ShockSelfBot
 */
public class EditCommand implements Command {

    private String command;
    private String message;

    EditCommand(String command, String message) {
        this.command = command;
        this.message = message;
    }

    @Override
    public void onCommand(User user, MessageChannel messageChannel, Message message, String[] strings, Member member) {
        message.editMessage(this.message).queue();
    }

    @Override
    public String getCommand() {
        return command;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
