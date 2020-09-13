package com;

import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;

public class Toggle extends Command {

    public static boolean allowed = true;
    public Toggle(String name, String description, String usageMessage) {
        super(name, description, usageMessage);
    }

    @Override
    public boolean execute(CommandSender commandSender, String s, String[] strings) {

        if(commandSender.isOp()){
            allowed = !allowed;
        }
        return false;
    }
}
