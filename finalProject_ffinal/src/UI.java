
import javax.swing.*;
import java.awt.*;

public class UI {

    private static JFrame frame;
    // private static String title;

    public UI(int width, int height, int gridSize, String title, App game, Handler handler) {
        // UI.title = title;
        frame = new JFrame(title);

        frame.setPreferredSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new Grid(new GridLayout(gridSize, gridSize), handler);
        
        frame.setContentPane(panel);
        frame.pack();

        frame.setVisible(true);
        
    }

    public static void update(int flagged) {
        // frame.setTitle(title + "Mines: " + App.MINECOUNT + " - Flags: " + flagged);
    }
    
}
