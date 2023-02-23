package classes;

import javax.swing.*;
import java.awt.*;

public class Task extends JPanel {

    private JLabel index;
    private JTextField taskName;
    private JButton done;

    private boolean checked;

    Task()
    {
        this.setPreferredSize(new Dimension(40, 20));
        this.setBackground(new Color(237, 237, 166));

        this.setLayout(new BorderLayout());

        checked = false;

        index = new JLabel("");
        index.setPreferredSize(new Dimension(20, 20));
        index.setHorizontalAlignment(JLabel.CENTER);

        this.add(index, BorderLayout.WEST);

        taskName = new JTextField("Your task here");
        taskName.setBorder(BorderFactory.createEmptyBorder());
        taskName.setBackground(new Color(237, 237, 166));

        this.add(taskName, BorderLayout.CENTER);

        done = new JButton("done");
        done.setPreferredSize(new Dimension(40, 20));
        done.setBorder(BorderFactory.createEmptyBorder());
        done.setBackground(new Color(180, 215, 224));

        this.add(done, BorderLayout.EAST);
    }

    public JButton getDone() {
        return done;
    }

    public void changeIndex(int num) {
        this.index.setText(num + "");
        this.revalidate();
    }

    public void changeState() {
        this.setBackground(new Color(156, 212, 133));
        taskName.setBackground(new Color(156, 212, 133));
        checked = true;
    }
}
