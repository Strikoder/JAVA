package Project.animation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyPanel extends JPanel implements ActionListener{
    private Image icon;
    private Image backgroundImage;
    private Timer timer;

    private final int PANEL_WIDTH =800;
    private final int PANEL_HEIGHT=800;
    private int xVelocity=3,yVelocity=2;
    public int x=0,y=0,exit=0;

    MyPanel(){
        //Implementing through "this" rather than creating objects
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        icon = new ImageIcon("src/assets/bot.png").getImage();
        backgroundImage=new ImageIcon("src/assets/space.png").getImage();
        //Control the speed of the icon
        timer= new Timer(5, this);
        timer.start();
    }

    public void paint(Graphics g)
    {
        // to paint background
        super.paint(g);
        Graphics2D g2d=(Graphics2D) g;
        g2d.drawImage(backgroundImage,0,0,null);
        g2d.drawImage(icon,x,y,null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(x>=PANEL_WIDTH-icon.getWidth(null)||x<0)
        {
            xVelocity*= -1;
            exit++;
        }
        if(y>=PANEL_WIDTH-icon.getWidth(null)||y<0)
        {
            yVelocity*= -1;
            exit++;
        }
        x+=xVelocity;
        y+=yVelocity;
        repaint();
        if(exit==4)
        {
            System.exit(0);
        }
    }

}