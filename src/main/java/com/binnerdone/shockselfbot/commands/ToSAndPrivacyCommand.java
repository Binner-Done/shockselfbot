package com.binnerdone.shockselfbot.commands;

import com.walshydev.jba.commands.Command;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;

/**
 * Created by jack on 09/07/17.
 */
public class ToSAndPrivacyCommand implements Command {
    @Override
    public void onCommand(User user, MessageChannel messageChannel, Message message, String[] strings, Member member) {
        message.editMessage("Shockbyte Terms of Service: https://shockbyte.com/terms-of-service\nShockbyte Privacy Policy: https://shockbyte.com/privacy-policy").queue();
    }

    @Override
    public String getCommand() { return "tospriv"; }

    @Override
    public String getDescription() { return null; }
}
