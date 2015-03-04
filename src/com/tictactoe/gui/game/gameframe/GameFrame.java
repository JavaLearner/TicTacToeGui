package com.tictactoe.gui.game.gameframe;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

//    private JLabel ;
//    private JButton ;
//    private JButton ;
//    public GameFrame(String MainTitle) {
//        super(MainTitle);
//        init();
//        setSize(SizeX, SizeY);
//        setVisible(true);
//        setResizable(false); //disable resizing
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//       // JOptionPane.showMessageDialog(this, "Draw!"); //message dialog:)
//    }
public class GameFrame extends JFrame {

    public static void initFrame() {

        JFrame frame = new JFrame("Tic Tac Toe v1.0");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 14);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("Menu");
        fileMenu.setFont(font);

        JMenu newMenu = new JMenu("New Game");
        newMenu.setFont(font);
        fileMenu.add(newMenu);

        JMenu fileMenu1 = new JMenu("About");
        fileMenu1.setFont(font);



        JMenuItem txtFileItem = new JMenuItem("Human-Computer");
        txtFileItem.setFont(font);
        newMenu.add(txtFileItem);

        JMenuItem txtFileItem1 = new JMenuItem("Human-Human");
        txtFileItem1.setFont(font);
        newMenu.add(txtFileItem1);

        JMenu changeSymbol = new JMenu("Change symbol");
        changeSymbol.setFont(font);
        fileMenu.add(changeSymbol);

        JMenuItem txtFileItem2 = new JMenuItem("X");
        txtFileItem2.setFont(font);
        changeSymbol.add(txtFileItem2);

                fileMenu.addSeparator();

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setFont(font);
        fileMenu.add(exitItem);

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuBar.add(fileMenu);
        menuBar.add(fileMenu1);

        frame.setJMenuBar(menuBar);
        //frame.setJMenuBar(menuBar);

        frame.setPreferredSize(new Dimension(400, 400));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}