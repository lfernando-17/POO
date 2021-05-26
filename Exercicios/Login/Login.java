import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener {
    private JFrame janela;
    private JPanel painel;
 
     private JLabel user;
     private JLabel senha;
 
     private JTextField txtnum1;
     private JTextField txtnum2;
 
     private JButton btnSomar;
    

     public Login(){
         janela = new JFrame();
         painel = new JPanel();
 
         user = new JLabel("Usuario : ");
         painel.add(user);
         txtnum2 = new JTextField(" ");
         painel.add(txtnum2);
 
         painel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10,30));
         painel.setLayout(new GridLayout(0,1));
 
 
         senha = new JLabel("Senha : ");
         painel.add(senha);
         txtnum1 = new JTextField(" ");
         painel.add(txtnum1);
       
         btnSomar = new JButton("Entrar");
         btnSomar.addActionListener(this);
         
         painel.add(btnSomar);
 
 
         janela.add(painel, BorderLayout.CENTER);
         janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         janela.setTitle("Tela de Login");
         janela.setSize(300,300);
         janela.setLocation(840, 420);
         janela.setVisible(true);
    }

    public static void main(String[] args) {
            new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new Welcome();
        
    }

    
}

