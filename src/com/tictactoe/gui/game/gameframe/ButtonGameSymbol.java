package com.tictactoe.gui.game.gameframe;

import javax.swing.*;
import java.awt.*;

public class ButtonGameSymbol {
    private JButton button;
    private Font myFont = new Font("bold", 1, 15);// set font

    public JButton buttonDefinition(String nameButton, int setColor) {
        button = new JButton(nameButton);
        button.setFont(myFont);// set button font
        switch (setColor) {
            case 1:
                button.setForeground(Color.blue);
                break;
            case 2:
                button.setForeground(Color.red);
                break;
            default:
                button.setForeground(Color.black);
                break;

        }
        return button;
    }
}
