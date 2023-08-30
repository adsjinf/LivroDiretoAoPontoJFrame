package exemplos_capitulo2;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Janela2 extends JFrame {
    private JPanel contentPane;

    public static void main(String[] arqs) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Janela2 frame = new Janela2();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Janela2() {
        super("Minha Janela");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        contentPane.setLayout(new BorderLayout(0,0));
        setContentPane(contentPane);
    }
}
