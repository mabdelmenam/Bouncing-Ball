import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Draw extends JPanel implements Runnable{

    private int x = 10;
    private int y = 10;
    private int universalSpeed = 3;
    private int xspeed = 3;
    private int yspeed = 3;
    private int ball = 30;

    public boolean bottom(){
        return ( ( this.y + this.ball ) >= this.getHeight() ); 
    }
    public boolean left()
	{
		return ( this.x <= 0 );
	}

	public boolean right()
	{
		return ( ( this.x + this.ball ) >= this.getWidth() );
	}

	public boolean top()
	{
		return ( this.y <= 0 );
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillOval(x, y, this.ball, this.ball);
    }
    public void run(){
        while(true){
            //repaint();
            try{
                Thread.sleep(100);
            }catch(Exception e){}

            if(this.left()){
                this.xspeed = this.universalSpeed;
            }
            else if(this.right()){
                this.xspeed -= this.universalSpeed;
            }
            
            if(this.top()){
                this.yspeed = this.universalSpeed;
            }
            else if(this.bottom()){
                this.yspeed -= this.universalSpeed;
            }
            System.out.println(this.x + " " + this.y);

            this.y += this.yspeed;
           repaint();

        }
    }
}