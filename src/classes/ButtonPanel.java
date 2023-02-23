package classes;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonPanel extends JPanel{

    private JButton addTask;
    private JButton clear;

    Border emptyBorder = BorderFactory.createEmptyBorder();

    ButtonPanel()
    {
        this.setPreferredSize(new Dimension(400, 80));

        addTask = new JButton("Add Task");
        addTask.setBorder(emptyBorder);
        addTask.setBackground(new Color(180, 215, 224));
        addTask.setFont(new Font("Sans-serif", Font.ITALIC, 20));
        addTask.setVerticalTextPosition(JButton.CENTER);

        this.add(addTask);
        this.add(Box.createHorizontalStrut(50));
        this.setBackground(new Color(200, 246, 247));

        clear = new JButton("Clear All Tasks");
        clear.setBorder(emptyBorder);
        clear.setBackground(new Color(180, 215, 224));
        clear.setFont(new Font("Sans-serif", Font.ITALIC, 20));

        this.add(clear);
    }

    public JButton getAddTask()
    {
        return addTask;
    }

    public JButton getClear()
    {
        return clear;
    }
}
