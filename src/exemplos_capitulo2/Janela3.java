package exemplos_capitulo2;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Janela3 {
    public static void main(String[] arqs){
        int largura = 300;
        int altura = 250;
        JFrame janela = new JFrame("Minha Janela");
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        int centLarg = (d.width - largura)/2;
        int centAlt = (d.height - altura)/2;
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setResizable(false);
        janela.setBounds(centLarg, centAlt, largura, altura);

        JPanel painel = new JPanel();
        painel.setLayout(null);
        JButton bt1 = new JButton("1");
        JButton bt2 = new JButton("2");
        JButton bt3 = new JButton("3");
        painel.add(bt1);
        painel.add(bt2);
        painel.add(bt3);
        bt1.setBounds(15, 15, 50, 20);
        bt2.setBounds(70, 50, 100, 30);
        bt3.setBounds(150, 100, 75, 75);
        janela.add(painel);
        janela.setVisible(true);
    }
}
