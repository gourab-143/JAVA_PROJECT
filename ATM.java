package project;

import javax.swing.*;

public class ATM extends JFrame {

    public ATM() {
        super("GAMING PARADISE");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new ATMPanel());
        setVisible(true);
    }

    public static void main(String[] args)
    {
            new ATM();
    }
}
