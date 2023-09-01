package exemplos_capitulo2;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Janela6 {
    public static void main(String[] arqs) {
        JFrame janela = new JFrame("Minha janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setResizable(false);
        janela.setBounds(0, 0, 280, 280);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(3, 4, 10, 10));
        painel.add(new JButton("1"));
        painel.add(new JButton("2"));
        painel.add(new JButton("3"));
        painel.add(new JButton("4"));
        painel.add(new JButton("5"));
        painel.add(new JButton("6"));
        painel.add(new JButton("7"));
        janela.add(painel);
        janela.setVisible(true);
    }

}
