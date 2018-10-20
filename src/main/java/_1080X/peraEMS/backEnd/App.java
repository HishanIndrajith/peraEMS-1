package _1080X.peraEMS.backEnd;
import _1080X.peraEMS.frontEnd.loginPanel;

import javax.swing.*;

public class App {



    public static void main(String[] args) {

        loginPanel login = new loginPanel();
        login.loginPanel.setSize(600,600);

        JFrame loginFrame = new JFrame("PeraEms");
        loginFrame.setContentPane(login.loginPanel);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(600,600);
        //loginFrame.pack();
        loginFrame.setVisible(true);
    }

}
