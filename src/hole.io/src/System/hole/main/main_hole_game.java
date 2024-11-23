package System.hole.main;

import java.util.Scanner;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class main_hole_game {
    public static void main(String[] args) {
        // makes the game scanner

        System.out.println("welcome to hole.io");

        JFrame FHJ1 = new JFrame("hole.io");
        FHJ1.show();
        JPanel PHJ1 = new JPanel();
        FHJ1.add(PHJ1);
        JButton STBHJ1 = new JButton("start game");
        PHJ1.add(STBHJ1);
        FHJ1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        FHJ1.setSize(300. 200)

    }
}
