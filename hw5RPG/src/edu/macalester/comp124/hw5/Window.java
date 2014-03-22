package edu.macalester.comp124.hw5;

import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.applet.Applet;
import java.awt.Label;

/**
 * Created by Gozong on 3/20/14.
 */
public class Window extends JFrame{

    String text;
    Button click;
    Label result;
    Label message;

    public static void main(String[] args) {

        window();

    }

    public static void window(){
        JLabel label = new JLabel("um yeah?????", JLabel.CENTER);
        //label.setAlignmentX(0);
        //label.setAlignmentY(0);

        JFrame frame = new JFrame("Some Window");

        JPanel coloredPanel = new JPanel();

        frame.add(coloredPanel);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(label);
        label.setVisible(true);

    }

    }
