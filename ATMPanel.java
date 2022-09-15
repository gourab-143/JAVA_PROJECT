package project;

import Project.TTTGraphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATMPanel extends JPanel implements ActionListener
{
    JButton quiz = new JButton("Quiz");
    JButton guess = new JButton("Guess");
    JButton TTTGraphics = new JButton("Tic-Tac-Toe");
    JButton puzzle = new JButton("Puzzle");

    public void buttonProperties()
    {

        setLayout(new GridLayout(0, 2, 400, 450));

        add(quiz);
        add(guess);
        add(TTTGraphics);
        add(puzzle);

        quiz.addActionListener(this);
        guess.addActionListener(this);
        TTTGraphics.addActionListener(this);
        puzzle.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent a)
    {
        if (a.getSource() == quiz) {
            new OnlineTest();
        } else if (a.getSource() == guess) {
            new Guess();
        } else if (a.getSource() == puzzle) {
            new Puzzle();
        } else if (a.getSource() == TTTGraphics) {
            new TTTGraphics();
        }
    }
        ATMPanel()
        {
            buttonProperties();
        }

    }

