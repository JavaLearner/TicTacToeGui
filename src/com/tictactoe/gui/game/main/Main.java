package com.tictactoe.gui.game.main;

import com.tictactoe.gui.game.gameframe.GameFrame;

import javax.swing.*;

/**
 * Created by JavaLearner on 02-Mar-15.
 */
public class Main {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                new GameFrame().initFrame();
            }
        });
    }

}
