package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUIText implements ActionListener{

    private JPanel test;
    private static JFrame jFrame;
    private Player playerX;
    private Player playerO;
    private int currentMove;
    private JLabel moveinto;
    private JButton[] buttons = new JButton[9];
    public static void main(String[] args){
        jFrame = new JFrame("circle,cross");
    }
    private void startGame(){
        playerX = new Player(Sides.X);
        playerO = new Player(Sides.O);
        currentMove = 0;
        for (int i = 0; i< buttons.length; i++){
            buttons[i] = new JButton("" +(i+1));
            buttons[i].addActionListener(this);
        }
        moveinto = new JLabel();
        moveinto.setFont(new Font("Combo-sans", Font.BOLD, 15 ));
        moveinto.setText("Turn X");
        moveinto.setBounds(110, 15, 100, 30);
        JPanel gamePanel = new JPanel(new GridLayout(3, 3, 10, 10));
        for (JButton button:buttons) {
            gamePanel.add(button);
        }
        gamePanel.setBackground(Color.red);
    }
    public

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}