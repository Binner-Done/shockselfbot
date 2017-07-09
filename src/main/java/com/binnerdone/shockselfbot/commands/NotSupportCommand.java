package com.binnerdone.shockselfbot.commands;

import com.walshydev.jba.commands.Command;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;

/**
 * Created by jack on 09/07/17.
 */
public class NotSupportCommand implements Command {
    @Override
    public void onCommand(User user, MessageChannel messageChannel, Message message, String[] strings, Member member) {
        message.editMessage("This server is not designed to be used for support and isn't one of our official support options. If you need assistance, please contact us at: https://shockbyte.com/billing/submitticket.php").queue();
    }

    @Override
    public String getCommand() { return "notsupport"; }

    @Override
    public String getDescription() {
        return null;
    }
}
