import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Draw extends JPanel{

    public void drawing(){
        repaint();//repaint calls the paintComponent method
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillOval(0, 0, 30, 30);
    }
}