package me.mio.microutility.commands

import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class FlyCMD : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender !is Player) return false; if (sender.isFlying) { sender.allowFlight = false; sender.sendMessage("§3ᴍɪᴄʀᴏ§e ᴜᴛɪʟɪᴛʏ §8• §eYour flight has been §cdisabled"); return false }
        sender.allowFlight = true; sender.sendMessage("§3ᴍɪᴄʀᴏ§e ᴜᴛɪʟɪᴛʏ §8• §eYour flight has been §aenabled"); return false
    }
}