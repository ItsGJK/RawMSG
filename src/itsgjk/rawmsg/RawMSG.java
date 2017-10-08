/*
 * Copyright 2017 Gabriel Keller
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package itsgjk.rawmsg;

import itsgjk.rawmsg.config.ConfigManager;
import org.bukkit.plugin.java.JavaPlugin;

public class RawMSG extends JavaPlugin {

    public ConfigManager cm;

    @Override
    public void onEnable(){
        //Initialization
        cm = new ConfigManager(this);


    }

}
