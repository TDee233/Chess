import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ColorChanger extends JFrame {
    private JPanel panel;

    public ColorChanger() {
        panel = new JPanel();
        panel.setBackground(randomColor());
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                panel.setBackground(randomColor());
            }
        });

        this.add(panel);
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Click to change color");
        this.setVisible(true);
    }

    private Color randomColor() {
        float r = (float) Math.random();
        float g = (float) Math.random();
        float b = (float) Math.random();
        return new Color(r, g, b);
    }

    public static void main(String[] args) {
        new ColorChanger();
    }
}
