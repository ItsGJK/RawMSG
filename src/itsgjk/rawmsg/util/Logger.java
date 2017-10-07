/*
 * Copyright 2017 Gabriel Keller
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package itsgjk.rawmsg.util;

import org.bukkit.Bukkit;

public class Logger {

    //Debug
    public static void d(String d){
        Bukkit.getLogger().info(d);
    }

    //Standard console message
    public static void l(String l){
        Bukkit.getLogger().info(l);
    }


}
