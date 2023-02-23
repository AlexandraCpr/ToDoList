package classes;

import javafx.scene.layout.Border;

import javax.swing.*;
import java.awt.*;

public class TitleBar extends JPanel {

    TitleBar(){
        this.setPreferredSize(new Dimension(400, 80));
        this.setBackground(new Color(237, 234, 128));

        JLabel titleText = new JLabel("TO DO LIST");
        titleText.setPreferredSize(new Dimension(400, 80));
        titleText.setFont(new Font("Sans-serif", Font.BOLD, 20));
        titleText.setHorizontalAlignment(JLabel.CENTER);

        this.add(titleText);

    }

}
