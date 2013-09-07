package com.oresomecraft.BattleMaps.maps.fng;

import org.bukkit.*;
import org.bukkit.event.*;
import org.bukkit.inventory.*;

import com.oresomecraft.BattleMaps.*;
import com.oresomecraft.OresomeBattles.api.*;

public class SnakeRun extends FNGMap implements IBattleMap, Listener {

    public SnakeRun() {
        super.initiate(this, name, fullName, creators, modes);
    }

    // Map details
    String name = "snake_run";
    String fullName = "Snake Run";
    String creators = "Yuzko ";
    Gamemode[] modes = {Gamemode.LMS};

    public void readyTDMSpawns() {

        redSpawns.add(new Location(w, 0, 99, 27, 2, 0));
        redSpawns.add(new Location(w, -9, 110, -20, 0, 0));
        redSpawns.add(new Location(w, 21, 105, -13, 0, 0));
        redSpawns.add(new Location(w, 4, 106, -41, 0, 0));

        blueSpawns.add(new Location(w, -9, 110, -20, 0, 0));
        blueSpawns.add(new Location(w, 0, 99, 27, 0, 0));
        blueSpawns.add(new Location(w, -16, 108, -3, 0, 0));
        blueSpawns.add(new Location(w, -30, 108, -3, 0, 0));
    }

    public void readyFFASpawns() {
        FFASpawns.add(new Location(w, 0, 99, 27, 2, 0));
    }

    public void applyInventory(final BattlePlayer p) {
        Inventory i = p.getInventory();
        // FISTS!
    }

    // Region. (Top corner block and bottom corner block.
    // Top left corner.
    public int x1 = 131;
    public int y1 = 180;
    public int z1 = 110;

    //Bottom right corner.
    public int x2 = -19;
    public int y2 = 14;
    public int z2 = -145;

}