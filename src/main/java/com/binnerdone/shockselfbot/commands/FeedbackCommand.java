package com.binnerdone.shockselfbot.commands;

import com.walshydev.jba.commands.Command;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;

/**
 * Created by jack on 09/07/17.
 */
public class FeedbackCommand implements Command {
    @Override
    public void onCommand(User user, MessageChannel messageChannel, Message message, String[] strings, Member member) {
        message.editMessage("Glad your issue was fixed!\nTo help improve further, please let us know if this response was helpful. Just react to the message. Feel free to let us know why it wasn't helpful, if it wasn't!").queue();
        message.addReaction("✔").queue();
        message.addReaction("❌").queue();
    }

    @Override
    public String getCommand() {
        return "feedback";
    }

    @Override
    public String getDescription() {
        return null;
    }
}
