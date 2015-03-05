package com.tictactoe.gui.game.gameframe;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

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


    private JButton button1, button2, button3, button4, button5;
    private JButton button6, button7, button8, button9;
    private final int fieldSize = 9;
    private  String letter = new String();

//    public void setJbnButtons(JButton[] jbnButtons) {
//        this.jbnButtons = jbnButtons;
//    }

    //private ButtonDefinition newButton = new ButtonDefinition();
    //private final String leftArrow = new String("\u2190");
    private JButton jbnButtons[] = new JButton[9];
    private Font fl2 = new Font("bold", 2, 30);// set font

    public void initFrame() {

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

        //JOptionPane.showMessageDialog(this, "Draw!"); //message dialog:)


        JMenuItem txtFileItem = new JMenuItem("Human VS Computer");
        txtFileItem.setFont(font);
        newMenu.add(txtFileItem);

        JMenuItem txtFileItem1 = new JMenuItem("Human VS Human");
        txtFileItem1.setFont(font);
        newMenu.add(txtFileItem1);

//        JMenu changeSymbol = new JMenu("Change symbol");
//        changeSymbol.setFont(font);
//        fileMenu.add(changeSymbol);

//        JMenuItem txtFileItem2 = new JMenuItem("X");
//        txtFileItem2.setFont(font);
//        changeSymbol.add(txtFileItem2);
//
//        JMenuItem txtFileItem3 = new JMenuItem("0");
//        txtFileItem3.setFont(font);
//        changeSymbol.add(txtFileItem3);

        fileMenu.addSeparator();

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setFont(font);
        fileMenu.add(exitItem);

        JPanel panelOperation = new JPanel();
        panelOperation.setLayout(new GridLayout(3, 3, 3, 3));
        for (int i = 0; i < fieldSize; i++) {
            createButton(i);
            panelOperation.add(jbnButtons[i]);
        }

        frame.add(panelOperation);

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuBar.add(fileMenu);
        menuBar.add(fileMenu1);

        frame.setJMenuBar(menuBar);

        frame.setPreferredSize(new Dimension(400, 400));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
    }

    private void createButton(int index) {

        class ButtonListener implements ActionListener
        {

            @Override
            public void actionPerformed(ActionEvent ae)
            {
                int turns = 0;
                        turns++;
                if(turns % 2 == 0)
                {
                    letter = "O";
                }
                else {
                    letter = "X";
                }

                JButton pressedButton = (JButton)ae.getSource();
                pressedButton.setText(letter);
                pressedButton.setEnabled(false);
            }

        }

        ActionListener buttonListener = new ButtonListener();

            jbnButtons[index] = new JButton("");
            jbnButtons[index].setFont(new Font(Font.SERIF, 0, 24));
            jbnButtons[index].addActionListener(buttonListener);
            //boardPanel.add(jbnButtons[index]);
        }




}
