package com.strive.GoldMiner;

import javax.swing.*;
import java.awt.*;

public class GameWin extends JFrame {

    //Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/strive/GoldMiner/gold.png"));

    void launch() {
        this.setVisible(true);
        this.setSize(1200, 800);
        this.setLocationRelativeTo(null);
        this.setTitle("MY GAME");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        //g.drawImage(image, 0, 0, null);
    }

    public static void main(String[] args) {
        GameWin gw = new GameWin();
        gw.launch();
    }
}
