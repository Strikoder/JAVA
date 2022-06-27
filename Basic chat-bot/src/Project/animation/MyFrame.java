package Project.animation;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {
    private MyPanel panel;

    public MyFrame()
    {
        panel=new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyChar())
        {
            case'w':panel.y-=20;
                break;
            case'a':panel.x-=20;
                break;
            case's':panel.y+=20;
                break;
            case'd':panel.x+=20;
                break;
            case 'q':panel.y-=20;panel.x-=20;
                break;
            case'e':panel.y-=20;panel.x+=20;
                break;
            case'z':panel.y+=20;panel.x-=20;
                break;
            case'c':panel.y+=20;panel.x+=20;
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyReleased(KeyEvent e) {

    }

}
