package de.paul.tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//this.setIconImage(Toolkit.getDefaultToolkit().getImage("images\\mylogo.png"));

public class Main {

    static int count = 0;

    static String[] team = new String[3];

    static JFrame frame = new JFrame();

    static ArrayList<JButton> buttonList = new ArrayList<>();

    static Font mainFont = new Font("Arial", Font.PLAIN, 24);

    static JLabel teams = new JLabel();

    public static final int buttonAmount = 9;

    public static void main(String[] args) {
        setUpWindow();
    }


    public static void setUpWindow() {
        frame.setVisible(true);
        frame.setBounds(0,0,400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setBackground(Color.WHITE);
        frame.setTitle("Tic Tac Toe Beta-0.2");

        for (int i = 0; i < buttonAmount; i++) {
            buttonList.add(new JButton());
            buttonList.get(i).setVisible(true);
            buttonList.get(i).setText("");
            buttonList.get(i).setBounds(10,10,60,60);
            buttonList.get(i).setFont(mainFont);
            buttonList.get(i).setBorder(BorderFactory.createLineBorder(Color.BLACK, 4));
            buttonList.get(i).setBackground(Color.WHITE);
            buttonList.get(i).setForeground(Color.BLACK);
            int finalI = i;
            buttonList.get(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(buttonList.get(finalI).getText() == "X" || buttonList.get(finalI).getText() == "O") {

                    } else {
                        if(isEven(count)) {
                            buttonList.get(finalI).setText("X");
                        } else if(!isEven(count)) {
                            buttonList.get(finalI).setText("O");
                        }

                        count++;
                        teams.setText(team[getTeamNumber(count)]);
                    }
                }
            });
            frame.add(buttonList.get(i));

        }

        buttonList.get(0).setBounds(20, 20, 60, 60);
        buttonList.get(1).setBounds(100, 20, 60, 60);
        buttonList.get(2).setBounds(180, 20, 60, 60);

        buttonList.get(3).setBounds(20, 100, 60, 60);
        buttonList.get(4).setBounds(100, 100, 60, 60);
        buttonList.get(5).setBounds(180, 100, 60, 60);

        buttonList.get(6).setBounds(20, 180, 60, 60);
        buttonList.get(7).setBounds(100, 180, 60, 60);
        buttonList.get(8).setBounds(180, 180, 60, 60);


        team[1] = "Team A (X) ist an der Reihe";
        team[2] = "Team B (O) ist an der Reihe";

        teams.setBounds(20, 300, 200, 60);
        teams.setVisible(true);
        teams.setText(team[getTeamNumber(count)]);

        frame.add(teams);

    }



    public static boolean isEven(int number) {
        if(number%2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int getTeamNumber(int number) {
        if(isEven(number + 1)) {
            return 2;
        } else {
            return 1;
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
