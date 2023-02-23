package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AppFrame extends JFrame {

    private TitleBar title;
    private ButtonPanel buttonPanel;
    private List list;

    private JButton addTask;
    private JButton clear;

    AppFrame()
    {
        this.setSize(600, 900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//frame closes
        this.setVisible(true);// show the frame

        title = new TitleBar();
        list = new List();
        buttonPanel = new ButtonPanel();

        this.add(title, BorderLayout.NORTH);
        this.add(buttonPanel, BorderLayout.SOUTH);
        this.add(list);

        addTask = buttonPanel.getAddTask();
        clear = buttonPanel.getClear();

        addListeners();
    }

    public void addListeners()
    {
        addTask.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e)
            {
                Task task = new Task();
                list.add(task);
                list.updateNumber();

                task.getDone().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                       task.changeState();
                       revalidate();
                    }
                });
                revalidate();
            }
        });

        clear.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Component[] taskList = list.getComponents();;
                for (int i = 0; i < taskList.length; i++) {
                    if(taskList[i] instanceof Task) {
                        list.remove((Task) taskList[i]);
                    }
                }
                revalidate();
                repaint();
            }
        });
    }
}
