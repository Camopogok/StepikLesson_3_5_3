import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Main {
    public Main() {
        JFrame frame = new JFrame("Пробел");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setLocation(400,300);
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()==KeyEvent.VK_SPACE) {
                    String s = JOptionPane.showInputDialog(null,"Введите имя: ");
                    JOptionPane.showMessageDialog(null, ("                  "+s));
                }
            }
        });
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
