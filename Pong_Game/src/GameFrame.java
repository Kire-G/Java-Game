import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    GamePanel panel;
    GameFrame(){
        panel = new GamePanel();
        this.setTitle("Pong Game!");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);//започва в средата на екрана програмата
        this.setVisible(true);
    }
}
