package me.mio.microutility

import me.mio.microutility.commands.*
import org.bukkit.plugin.java.JavaPlugin

class MicroUtility : JavaPlugin() {
    override fun onEnable() { registerEverything() }

    private fun registerEverything() { getCommand("vanish")!!.setExecutor(VanishCMD()); getCommand("fly")!!.setExecutor(FlyCMD()); getCommand("creative")!!.setExecutor(CreativeCMD()); getCommand("survival")!!.setExecutor(SurvivalCMD()); getCommand("adventure")!!.setExecutor(AdventureCMD()); getCommand("spectator")!!.setExecutor(SpectatorCMD()) }

    override fun onDisable() {}
}
