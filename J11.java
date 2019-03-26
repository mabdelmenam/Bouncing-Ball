import javax.swing.JFrame;

import java.awt.Graphics;

import javax.swing.JButton;
import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class J11{

    private static int width = 300;
    private static int height = 300;
    public static void main(String args[]){

        JFrame frame = new JFrame("J.11 - Bouncing Ball");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(J11.width, J11.height);
        frame.setVisible(true);

        Draw d = new Draw();
        frame.add(d);

        frame.addMouseListener( new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Clicked");
                Thread t = new Thread(d);
                t.start();
            }
        });
    }
}