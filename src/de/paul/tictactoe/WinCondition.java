package de.paul.tictactoe;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class WinCondition {

    ArrayList<JButton> buttonList;
    private final int amount;
    String[][] field = new String[3][3];

    public WinCondition(ArrayList<JButton> listWithButtons, final int amount) {
        this.buttonList = listWithButtons;
        this.amount = amount;

        for(int i = 0; i < 9; i++) {
            if(i < 3) {
                this.field[0][i] = buttonList.get(i).getText();
            } else if(i < 6 && i > 3) {
                this.field[1][i%3] = buttonList.get(i).getText();
            } else if(i > 6) {
                this.field[2][i%3] = buttonList.get(i).getText();
            }
        }
    }

    public boolean isTrue() {


        return false;
    }

    public int getAmount() {
        return this.amount;
    }


}
