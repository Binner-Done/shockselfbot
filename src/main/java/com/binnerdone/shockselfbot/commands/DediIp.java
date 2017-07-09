package com.binnerdone.shockselfbot.commands;

import com.walshydev.jba.commands.Command;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;

/**
 * Created by jack on 09/07/17.
 */
public class DediIp implements Command {
    @Override
    public void onCommand(User user, MessageChannel messageChannel, Message message, String[] strings, Member member) {
        message.editMessage("A dedicated IP is an IP that is reserved for only one server and isn't shared with others. This means is that you can use the default Minecraft port of 25565, which will allow you to only enter the IP without the trailing :port number to connect to your server. If you have a URL redirect (DNS Record), it also means you won't have to append the port after the URL to join your server. This allows your server to appear more professional and is easier to memorize and join.").queue();
    }

    @Override
    public String getCommand() {
        return "dedi";
    }

    @Override
    public String getDescription() {
        return null;
    }
}
