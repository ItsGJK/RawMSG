/*
 * Copyright 2017 Gabriel Keller
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package itsgjk.rawmsg.commands;

import itsgjk.rawmsg.RawMSG;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class RawMSGCommand implements CommandBase {
    @Override
    public boolean onCommand(RawMSG m, Player p, String[] args) {
        return false;
    }

    @Override
    public boolean onConsoleCommand(RawMSG m, String[] args) {
        return false;
    }

    @Override
    public String syntax() {
        return null;
    }

    @Override
    public String command() {
        return null;
    }
}
