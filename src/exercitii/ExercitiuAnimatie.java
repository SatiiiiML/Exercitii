package exercitii;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExercitiuAnimatie {
    private JButton play;
    private JFrame window;
    private DrawPanel panel;

    public static void main(String[] args) {
        new ExercitiuAnimatie().run();
    }

    protected void run() {

        window = new JFrame();
        panel = new DrawPanel();
        play = new JButton( "Play" );
        play.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.getMinimumSize( 0, 0 );
            }
        } );

        window.getContentPane().add( BorderLayout.SOUTH, play );
        window.getContentPane().add( BorderLayout.CENTER, panel );
        window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        window.setSize( 800, 500 );
        window.setVisible( true );

    }


}