package com.binnerdone.shockselfbot.commands;

import com.walshydev.jba.commands.Command;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;

/**
 * Created by jack on 09/07/17.
 */
public class ResetMulticraftCommand implements Command {
    @Override
    public void onCommand(User user, MessageChannel messageChannel, Message message, String[] strings, Member member) {
        message.editMessage("You can reset your **Multicraft** password in the client area by navigating to Services > My Services > Select a service > Change Password (under \"Actions\"). You can get to your multicraft panel here: https://mc.shockbyte.com").queue();
    }

    @Override
    public String getCommand() {
        return "multipass";
    }

    @Override
    public String getDescription() {
        return null;
    }
}
