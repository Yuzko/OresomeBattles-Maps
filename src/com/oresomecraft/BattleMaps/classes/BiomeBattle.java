package com.oresomecraft.BattleMaps.maps;

import org.bukkit.*;
import org.bukkit.event.*;
import org.bukkit.inventory.*;

import com.oresomecraft.BattleMaps.*;
import com.oresomecraft.OresomeBattles.api.*;

public class BiomeBattle extends BattleMap implements IBattleMap, Listener {

    public BiomeBattle() {
        super.initiate(this);
        setDetails(name, fullName, creators, modes);
    }

    // Map details
    String name = "biomebattle";
    String fullName = "BiomeBattle";
    String creators = "SuperDuckFace, Evil_Emo and Yuzko";
    Gamemode[] modes = {Gamemode.FFA, Gamemode.KOTH};

    public void readyTDMSpawns() {
        World w = Bukkit.getServer().getWorld(name);

        redSpawns.add(new Location(w, -61, 73, -54));

        blueSpawns.add(new Location(w, 48, 72, 42));

        setRedSpawns(name, redSpawns);
        setBlueSpawns(name, blueSpawns);
    }

    public void readyFFASpawns() {
        World w = Bukkit.getServer().getWorld(name);

        FFASpawns.add(new Location(w, -61, 73, -54));
        FFASpawns.add(new Location(w, 48, 72, 42));
        FFASpawns.add(new Location(w, -69, 72, 63));
        FFASpawns.add(new Location(w, -64, 70, 12));
        FFASpawns.add(new Location(w, -51, 87, 10));
        FFASpawns.add(new Location(w, -47, 80, -41));
        FFASpawns.add(new Location(w, -17, 70, -84));
        FFASpawns.add(new Location(w, 83, 78, -22));
        FFASpawns.add(new Location(w, 13, 69, -3));
        FFASpawns.add(new Location(w, 15, 74, 40));
        FFASpawns.add(new Location(w, -83, 74, -7));


        setFFASpawns(name, FFASpawns);
    }

    public void applyInventory(final BattlePlayer p) {
        Inventory i = p.getInventory();

        ItemStack HEALTH_POTION = new ItemStack(Material.POTION, 1, (short) 16373);
        ItemStack LEATHER_CAP = new ItemStack(Material.LEATHER_HELMET, 1);
        ItemStack IRON_CHESTPLATE = new ItemStack(Material.IRON_CHESTPLATE, 1);
        ItemStack LEATHER_PANTS = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        ItemStack LEATHER_BOOTS = new ItemStack(Material.LEATHER_BOOTS, 1);
        ItemStack IRON_SWORD = new ItemStack(Material.IRON_SWORD, 1);

        InvUtils.colourArmourAccordingToTeam(p, new ItemStack[]{LEATHER_PANTS, LEATHER_CAP, LEATHER_BOOTS});

        p.getInventory().setLeggings(LEATHER_PANTS);
        p.getInventory().setBoots(LEATHER_BOOTS);
        p.getInventory().setChestplate(IRON_CHESTPLATE);
        p.getInventory().setHelmet(LEATHER_CAP);


        i.setItem(3, HEALTH_POTION);

        // setItem() is a BattlePlayer method. Makes giving items a bit quicker.
        p.setItem(0, Material.IRON_SWORD, 1);
        p.setItem(1, Material.BOW, 1);
        p.setItem(2, Material.COOKED_BEEF, 1);
        p.setItem(4, Material.ARROW, 64);
        p.setItem(5, Material.ARROW, 64);

    }

    // Region. (Top corner block and bottom corner block.
    // Top left corner.
    public int x1 = -122;
    public int y1 = 209;
    public int z1 = -125;

    //Bottom right corner.
    public int x2 = 118;
    public int y2 = -38;
    public int z2 = 109;

}
