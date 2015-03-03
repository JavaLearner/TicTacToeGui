package com.tictactoe.gui.game.gameframe;

import javax.swing.*;

/**
 * Created by JavaLearner on 02-Mar-15.
 */
public class GameFrame extends JFrame{
    private int Score = 0;
    private static int SizeX = 500;
    private static int SizeY = 500;
//    private JLabel ;
//    private JButton ;
//    private JButton ;
    public GameFrame(String MainTitle){
        super(MainTitle);
        setSize(SizeX,SizeY);
        setVisible(true);
        setResizable(false); //disable resizing
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
