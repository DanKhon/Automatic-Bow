package com;

import cn.nukkit.plugin.PluginBase;
import java.io.IOException;

public class Main extends PluginBase {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new Interact(),this);
        super.onEnable();
    }
    @Override
    public void onDisable() {
        super.onDisable();
    }
}
