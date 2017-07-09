package com.binnerdone.shockselfbot.commands;

import com.walshydev.jba.commands.Command;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;

/**
 * Created by jack on 09/07/17.
 */
public class CreateTicket implements Command {
    @Override
    public void onCommand(User user, MessageChannel messageChannel, Message message, String[] strings, Member member) {
        message.editMessage("Please create a ticket, this enables us to help you further. You can login to the client area at: https://shockbyte.com/billing/clientarea.php and can then open a ticket at: https://shockbyte.com/billing/submitticket.php").queue();
    }

    @Override
    public String getCommand() {
        return "ticket";
    }

    @Override
    public String getDescription() {
        return null;
    }
}
