package exemplos_capitulo2;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Janela4 {

    public static void main(String[] arqs) {
        JFrame janela = new JFrame("Minha Janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setResizable(false);
        janela.setBounds(0,0,300,300);

        JPanel painel = new JPanel();
        painel.setLayout(new BorderLayout());
        painel.add(new JButton("Norte"), BorderLayout.NORTH); // PAGE_START
        painel.add(new JButton("Sul"), BorderLayout.SOUTH); // PAGE_END
        painel.add(new JButton("Leste"), BorderLayout.EAST); //LINE_END
        painel.add(new JButton("Oeste"), BorderLayout.WEST); // LINE_START
        painel.add(new JButton("Center"), BorderLayout.CENTER); // CENTRO
        janela.add(painel);
        janela.setVisible(true);
    }
}
