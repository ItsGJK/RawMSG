/*
 * Copyright 2017 Gabriel Keller
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package itsgjk.rawmsg.commands;

import itsgjk.rawmsg.RawMSG;
import org.bukkit.entity.Player;

public abstract interface CommandBase {

    public abstract boolean onCommand(RawMSG m, Player p,  String[] args);
    public abstract boolean onConsoleCommand(RawMSG m, String[] args);
    public abstract String syntax();
    public abstract String command();

}
