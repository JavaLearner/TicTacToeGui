package com.tictactoe.gui.game.gameframe;

import javax.swing.*;

/**
 * Created by JavaLearner on 02-Mar-15.
 */
public class GameFrame extends JFrame{
    private int Score = 0;
//    private JLabel ;
//    private JButton ;
//    private JButton ;
    public GameFrame(String MainTitle){
        super(MainTitle);
        setSize(350,350);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
