package exemplos_capitulo2;

import javax.swing.*;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JPanel;

public class Janela7 implements ItemListener {
    private JPanel cards;
    final static String OP1 = "Opção 1";
    final static String OP2 = "Opção 2";

    public void ativaJanela() {
        JPanel painel1 = new JPanel();
        painel1.add(new JButton("1"));
        painel1.add(new JButton("2"));

        JPanel painel2 = new JPanel();
        painel2.add(new JButton("A"));

        cards = new JPanel(new CardLayout());
        cards.add(painel1, OP1);
        cards.add(painel2, OP2);

        String listaItens[] = { OP1, OP2 };
        JComboBox<String> cb = new JComboBox<String>(listaItens);
        cb.addItemListener(this);
        JFrame janela = new JFrame("Minha janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout());
        janela.add(cb);
        janela.add(cards);
        janela.pack();
        janela.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        CardLayout cl = (CardLayout) (cards.getLayout());
        cl.show(cards, (String) e.getItem());
    }

    public static void main(String[] arqs) {
        Janela7 j = new Janela7();
        j.ativaJanela();
    }

}
