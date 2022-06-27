package Project.UI;

import Project.animation.Emoji;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Locale;

public class Chatbot extends JFrame implements KeyListener {
    private JFrame frame;
    private JTextArea textArea;
    private JTextField textField;
    private JButton button;
    private JLabel label;
    private JButton animationWindow;

    public Chatbot(String title)
    {
        frame=new JFrame();
        textArea=new JTextArea();
        textField=new JTextField();
        button=new JButton();
        label=new JLabel("Send");
        frame.setTitle(title);
        //Creating the text without a label
        animationWindow= new JButton("Animation window");
    }

    public void Start()
    {
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(800,600);
        frame.getContentPane().setBackground(Color.cyan);

        frame.add(textArea);
        frame.add(textField);
        frame.add(button);
        frame.add(label);
        frame.add(animationWindow);

        textArea.setSize(760,300);
        textArea.setForeground(Color.GREEN);
        textArea.setLocation(10,20);
        textArea.setBackground(Color.black);

        textField.setSize(400,20);
        textField.setLocation(200,350);
        textField.requestFocusInWindow();
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e)
            {
                if(e.getKeyCode() == KeyEvent.VK_ENTER)
                    BotReplies();
            }
        });

        button.add(label);
        button.setSize(65,40);
        button.setLocation(350,400);
        button.setBackground(Color.lightGray);
        button.setHorizontalAlignment(SwingConstants.LEFT);
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource()==button)
                    BotReplies();
            }
        });


        animationWindow.setSize(140,40);
        animationWindow.setLocation(310,450);
        animationWindow.setBackground(Color.lightGray);
        animationWindow.setHorizontalAlignment(SwingConstants.LEFT);
        animationWindow.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource()==animationWindow)

                    new Emoji();
                    frame.setVisible(false);
            }
        });
    }

    public void BotReplies()
    {
        String text=textField.getText().toLowerCase(Locale.ROOT);
        textArea.append("You--> "+text+"\n");
        textField.setText("");
        if(text.contains("hi")||text.contains("مرحبا")||text.contains("guten tag")||text.contains("hello"))
            textArea.append("chatBot--> "+text+", how you are you?"+"\n");
        else if(text.contains("how are you")||text.contains("what about you")||text.contains("i'm fine")||text.contains("wie"))
            textArea.append("chatBot--> "+"i'm fine, tnx!"+"\n");
        else if(text.contains("баллы"))
            textArea.append("chatBot--> "+"Да, пожалуйста, поставьте мне доп баллы :("+"\n");
        else
            textArea.append("chatBot--> "+"I didn't understand :("+ "\n");

    }
    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyPressed(KeyEvent e) {
    }
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
