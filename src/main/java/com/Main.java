package com;

import cn.nukkit.plugin.PluginBase;
import java.io.IOException;

public class Main extends PluginBase {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new Interact(),this);
        getServer().getCommandMap().register("setautomatic",new Toggle("setautomatic","Toggles the automatic bow on and off","/setautomatic"));

        super.onEnable();
    }
    @Override
    public void onDisable() {
        super.onDisable();
    }
}
