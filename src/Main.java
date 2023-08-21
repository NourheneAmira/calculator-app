import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator  implements ActionListener{
    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JButton addButton,subButton,mulButton,divButton;
    JButton decButton,equButton,delButton,clrButton;
    JPanel panel;



      Font  myFront = new Font("Ink Free ", Font.BOLD, 30);

    double num1=0,num2=0,resultat=0;
    char  operators;
    Calculator(){
        frame=new JFrame("calculator" );
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");

// creation d une instance
    Calculator calc= new Calculator();

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}