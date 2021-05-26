import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Welcome {
    private JFrame janela;
    private JPanel painel;
 
     private JLabel lblNum1;

    public Welcome(){
        janela = new JFrame();
        painel = new JPanel();

        lblNum1 = new JLabel("Bem vindo");
        painel.add(lblNum1);

        painel.setBorder(BorderFactory.createEmptyBorder(10, 112, 10,100));
        painel.setLayout(new GridLayout(0,1));

        janela.add(painel, BorderLayout.CENTER);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setTitle("Welcome");
        janela.setSize(300,300);
        janela.setLocation(840, 420);
        janela.setVisible(true);
   }

}
