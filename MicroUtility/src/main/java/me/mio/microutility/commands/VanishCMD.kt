package me.mio.microutility.commands

import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

class VanishCMD : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if(sender !is Player) return false; if (args.isEmpty()) { sender.sendMessage("§8[§cPermission Manager§8] §cCorrect usage: /vanish <on • off>"); return false }; if (args[0].isEmpty()) { sender.sendMessage("§8[§cPermission Manager§8] §cCorrect usage: /vanish <on • off>"); return false }
        if(args[0] == "on") { sender.addPotionEffect(PotionEffect(PotionEffectType.INVISIBILITY, Integer.MAX_VALUE, 10, false, false)); sender.allowFlight = true; sender.sendMessage("§3ᴍɪᴄʀᴏ§e ᴜᴛɪʟɪᴛʏ §8• §eYou've been §avanished") }
        if(args[0] == "off") { sender.removePotionEffect(PotionEffectType.INVISIBILITY); sender.sendMessage("§3ᴍɪᴄʀᴏ§e ᴜᴛɪʟɪᴛʏ §8• §eYou've been §cunvanished") }; sender.allowFlight = false; return false
    }
}




