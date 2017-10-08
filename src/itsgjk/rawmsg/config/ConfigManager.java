/*
 * Copyright 2017 Gabriel Keller
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package itsgjk.rawmsg.config;

import itsgjk.rawmsg.RawMSG;
import itsgjk.rawmsg.util.Logger;

public class ConfigManager {

    RawMSG m;

    public String prefix;
    public String syntax;
    public String error;


    public ConfigManager(RawMSG m){
        this.m=m;

        m.getConfig().options().copyDefaults(true);
        s();

        initiateConfig();
        Logger.d("Loaded ConfigManager");

    }

    public void s(){
        m.saveConfig();
    }

    public void initiateConfig(){

    }


}
