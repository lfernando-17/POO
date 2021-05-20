import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaSwing implements ActionListener  {

   private JFrame janela;
   private JPanel painel;

    private JLabel lblNum1;
    private JLabel lblNum2;

    private JTextField txtnum1;
    private JTextField txtnum2;

    private JButton btnSomar;
    private JLabel lblResultado;
   public JavaSwing(){

        janela = new JFrame();
        painel = new JPanel();

        lblNum1 = new JLabel("Num1: ");
        painel.add(lblNum1);
        txtnum2 = new JTextField("0");
        painel.add(txtnum2);

        painel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10,30));
        painel.setLayout(new GridLayout(0,1));


        lblNum2 = new JLabel("Num2: ");
        painel.add(lblNum2);
        txtnum1 = new JTextField("0");
        painel.add(txtnum1);
      
        btnSomar = new JButton("Somar");
        btnSomar.addActionListener(this);
        
        painel.add(btnSomar);

        lblResultado = new JLabel("Resultado = ");
        lblResultado.setFont(new Font("Verdana",Font.BOLD,18));
        lblResultado.setForeground(Color.RED);
        painel.add(lblResultado);

        janela.add(painel, BorderLayout.CENTER);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setTitle("Calculadora");
        janela.setSize(300,300);
        janela.pack();
        janela.setVisible(true);
   }

    public static void main(String[] args) {
        new JavaSwing();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        Matematica mat = new Matematica();

        Integer num1 = Integer.parseInt(txtnum1.getText());
        Integer num2 = Integer.parseInt(txtnum2.getText());

        lblResultado.setText("Resultado = " + mat.somar(num1,num2));
        
    }
}