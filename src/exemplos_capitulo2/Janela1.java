package exemplos_capitulo2;

import java.awt.FlowLayout;
import java.io.Serial;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela1 extends JFrame {
    @Serial
    private static final long serialVersionUID = 1L;

    public static void main(String[] arqs) {
        new Janela1();
    }

    public Janela1() {
        super("Minha Janela");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new FlowLayout());
        add(new JButton("01"));
        add(new JButton("02"));
        setBounds(0,0,300,100);
        setVisible(true);
    }

}

