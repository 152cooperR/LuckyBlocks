package me.NathanSDK.LuckyBlocks;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.TreeType;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by Nathan on 3/14/15.
 */
public class Main  extends JavaPlugin implements Listener {

    public final Logger logger = Logger.getLogger("Mineraft");

    public void onEnable() {

        PluginDescriptionFile pdf = getDescription();

        logger.info(pdf.getName() + " has been enabled!");

        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(this, this);

    }


    @EventHandler
    public void onBlockBreak(BlockBreakEvent e){

        Player p = e.getPlayer();


        boolean isSpecialBlock = false;

        if(e.getBlock().getType() == Material.STONE){



           Random r = new Random();

            int random = r.nextInt(1) + 2;

            if(random == 1){

                isSpecialBlock = true;

            }

            if(isSpecialBlock == true){

                Random random1 = new Random();

                int random2 = random1.nextInt(10)  +1;

                if(random2 == 1){

                    /*
                    Gold
                    */

                    ItemStack item1 = new ItemStack(Material.GOLD_INGOT , 8);

                    p.getWorld().dropItemNaturally(e.getBlock().getLocation(), item1);

                    p.getWorld().playSound(p.getLocation(), Sound.LEVEL_UP, 1,1);

                }else if(random2 == 2){

                    /*
                    Diamond 3
                     */

                    ItemStack item1 = new ItemStack(Material.DIAMOND , 3);

                    p.getWorld().dropItemNaturally(e.getBlock().getLocation(), item1);
                    p.getWorld().playSound(p.getLocation(), Sound.LEVEL_UP, 1,1);



                }else if(random2 == 3){

                    /*
                    Tree
                     */

                    p.getWorld().generateTree(e.getBlock().getLocation(), TreeType.TREE);
                    p.getWorld().playSound(p.getLocation(), Sound.LEVEL_UP, 1,1);



                }else if(random2 == 4){


                    /*
                    Diamond 1
                     */

                    ItemStack item1 = new ItemStack(Material.DIAMOND , 1);

                    p.getWorld().dropItemNaturally(e.getBlock().getLocation(), item1);
                    p.getWorld().playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);


                }else if(random2 == 5){

                     /*
                    Coal
                     */

                    ItemStack item1 = new ItemStack(Material.COAL , 16);

                    p.getWorld().dropItemNaturally(e.getBlock().getLocation(), item1);
                    p.getWorld().playSound(p.getLocation(), Sound.LEVEL_UP, 1,1);



                }else if(random2 == 6){

                    /*
                    Lightning
                     */

                    e.getBlock().getWorld().strikeLightning(p.getLocation());
                    p.getWorld().playSound(p.getLocation(), Sound.LEVEL_UP, 1,1);



                }else if(random2 == 7){

                    /*
                    Explosion
                     */

                    p.getWorld().createExplosion(p.getLocation(),1,true);

                }else if(random2 == 8){

                    /*
                    Anvil
                     */

                    p.getWorld().spawnFallingBlock(p.getLocation().add(0,5,0), Material.ANVIL, (byte)1);
                    p.getWorld().playSound(p.getLocation(), Sound.LEVEL_UP, 1,1);


                }else if(random2 == 9){


                    /*
                    Creepers
                     */
                    p.getWorld().playSound(p.getLocation(), Sound.LEVEL_UP, 1,1);

                    for(int i = 0; i < 10; i++){

                        p.getWorld().spawnEntity(p.getLocation(), EntityType.CREEPER);


                    }


                }else if(random2 == 10){

                    /*
                    Squids
                     */
                    p.getWorld().playSound(p.getLocation(), Sound.LEVEL_UP, 1,1);

                    for(int i = 0; i < 10; i++){

                        p.getWorld().spawnEntity(p.getLocation(), EntityType.SQUID);

                    }

                }
            }

        }

    }


}
