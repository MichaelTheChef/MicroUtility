package me.mio.microutility.commands

import org.bukkit.GameMode
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class SurvivalCMD : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender !is Player) return false; if(sender.gameMode == GameMode.SURVIVAL) { sender.sendMessage("§3ᴍɪᴄʀᴏ§e ᴜᴛɪʟɪᴛʏ §8• §cYour gamemode is already survival!"); return false }
        sender.gameMode = GameMode.SURVIVAL; sender.sendMessage("§3ᴍɪᴄʀᴏ§e ᴜᴛɪʟɪᴛʏ §8• §eYour gamemode is now §aSurvival")
        return false
    }
}