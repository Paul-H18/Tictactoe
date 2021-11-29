package de.paul.tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {

    static int count = 0;

    static String[] team = new String[2];

    static JFrame frame = new JFrame();

    static ArrayList<JButton> buttonList = new ArrayList<>();

    static Font mainFont = new Font("Times New Roman", Font.PLAIN, 14);

    static JLabel teams = new JLabel();

    public static void main(String[] args) {
        setUpWindow();
    }


    public static void setUpWindow() {
        frame.setVisible(true);
        frame.setBounds(0,0,400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);

        for (int i = 0; i < 10; i++) {
            buttonList.add(new JButton());
            buttonList.get(i).setVisible(true);
            buttonList.get(i).setText("");
            buttonList.get(i).setBounds(10,10,30,30);
            buttonList.get(i).setFont(mainFont);
            int finalI = i;
            buttonList.get(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(buttonList.get(finalI).getText() == "X" || buttonList.get(finalI).getText() == "O") {

                    } else {
                        this.
                    }
                }
            });
            frame.add(buttonList.get(i));

        }

        buttonList.get(0).setBounds(10, 10, 30, 30);
        buttonList.get(1).setBounds(50, 10, 30, 30);
        buttonList.get(2).setBounds(90, 10, 30, 30);

        buttonList.get(3).setBounds(10, 50, 30, 30);
        buttonList.get(4).setBounds(50, 50, 30, 30);
        buttonList.get(5).setBounds(90, 50, 30, 30);

        buttonList.get(6).setBounds(10, 90, 30, 30);
        buttonList.get(7).setBounds(50, 90, 30, 30);
        buttonList.get(8).setBounds(90, 90, 30, 30);


        team[0] = "Team A ist an der Reihe";
        team[1] = "Team B ist an der Reihe";

        teams.setBounds(10, 120, 150, 60);
        teams.setVisible(true);
        teams.setText(team[0]);

        frame.add(teams);

    }



    public static boolean isEven(int number) {
        if(number%2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTaken(JButton b1) {
        if(b1.getText() == "X" || b1.getText() == "O") {
            return true;
        } else {
            return false;
        }
    }




}
