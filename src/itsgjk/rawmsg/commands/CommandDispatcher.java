/*
 * Copyright 2017 Gabriel Keller
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package itsgjk.rawmsg.commands;

import itsgjk.rawmsg.RawMSG;
import itsgjk.rawmsg.config.ConfigManager;
import itsgjk.rawmsg.util.Logger;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class CommandDispatcher implements CommandExecutor {

    ArrayList<CommandBase> cmds = new ArrayList<CommandBase>();
    RawMSG m;

    public CommandDispatcher(RawMSG m){
        this.m = m;

        //Add commands
        cmds.add(new RawMSGCommand());
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {

        if(commandSender instanceof Player){
            for(CommandBase cmd : cmds){
                if(cmd.command().equalsIgnoreCase(label)){
                    Boolean response = cmd.onCommand(m, (Player) commandSender, args);

                    if(!response) commandSender.sendMessage(m.cm.syntax.replace("%syntax%", cmd.syntax()));
                }
            }
        }
        else{
            for(CommandBase cmd : cmds){
                if(cmd.command().equalsIgnoreCase(label)){
                    Boolean response = cmd.onConsoleCommand(m, args);

                    if(!response) Logger.l("That command isn't supported for console use.");
                }
            }
        }

        return true;
    }
}
