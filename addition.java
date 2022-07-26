import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.*;

public class addition implements ActionListener {

    public static JLabel num1;
    public static JLabel num2;
    public static JLabel result;
    public static JButton add;
    public static JTextField input1;
    public static JTextField input2;


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(420 ,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        num1 = new JLabel("Enter first");
        num1.setBounds(10,20,100,25);
        panel.add(num1);

        num2 = new JLabel("Enter second ");
        num2.setBounds(10,50,100,25);
        panel.add(num2);
       
        input1 = new JTextField(10);
        input1.setBounds(100,20,165,25);
        panel.add(input1);

        input2 = new JTextField(10);
        input2.setBounds(100,50,165,25);
        panel.add(input2);

        add = new JButton("ADD");
        add.setBounds(10,80,80,25);
        add.addActionListener(new addition());
        panel.add(add);

        result = new JLabel();
        result.setBounds(10,110,300,25);
        panel.add(result);

        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String n1 = input1.getText();
        String n2 = input2.getText();

        int a = Integer.parseInt(n1);
        int b = Integer.parseInt(n2);
        int c =0 ;
        if(e.getSource() == add){
            c = a + b;
        result.setText("Your answer is " + " " +c);
        result.setVisible(true);
           
        }

    }
}
