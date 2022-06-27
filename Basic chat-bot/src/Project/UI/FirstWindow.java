package Project.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstWindow extends JFrame {
    private JFrame frame;
    private JLabel welcome;
    private JButton chat_with_bot;
    private JButton exit;
    private Chatbot chatbot;

    public FirstWindow(String title)
    {
        frame=new JFrame();
        frame.setTitle(title);
        welcome=new JLabel();
        chat_with_bot = new JButton("Start chat");
        exit = new JButton("Exit");
        chatbot = new Chatbot("ChatBot");
    }
    public void start()
    {
        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.cyan); //Tell teacher about this :D доп баллы)
        frame.setVisible(true);
        frame.add(welcome);
        frame.add(chat_with_bot);
        frame.add(exit);

        welcome.setBounds(100,10,250,50);
        welcome.setText("Welcome to our chat-bot program !");
        welcome.setForeground(Color.blue);

        chat_with_bot.setBounds(10,180,100,35);
        chat_with_bot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                chatbot.Start();
            }
        });
        exit.setBounds(260,180,100,35);
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

}

