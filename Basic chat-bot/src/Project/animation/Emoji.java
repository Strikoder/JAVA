package Project.animation;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Emoji extends JFrame implements MouseListener {

    private JLabel label;
    private  ImageIcon img,img2;
    private ArrayList<ImageIcon> imgs;
    private int next=1;
    public Emoji()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        label= new JLabel();
        label.addMouseListener(this);

        img=new ImageIcon("src/assets/emoji4.png");
        this.add(label);
        label.setIcon(img);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        imgs=new ArrayList<ImageIcon>();
        for(int i=1;i<=4;i++)
        {
            img =new ImageIcon("src/assets/emoji"+i+".png");
            imgs.add(img);
        }
        imgs.add(img);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.setVisible(false);
        new MyFrame();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

        if(next%4==1)
            img2=imgs.get(0);
        else if(next%4==2)
            img2=imgs.get(1);
        else if(next%4==3)
            img2=imgs.get(2);
        else
            img2=imgs.get(3);

        label.setIcon(img2);
        next++;
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    @Override
    public void mouseReleased(MouseEvent e) {
    }
    @Override
    public void mouseClicked(MouseEvent e) {
    }
}

