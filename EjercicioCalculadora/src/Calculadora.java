import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame {
    private JTextField dato1;
    private JTextField dato2;
    private JButton boton;
    private JTextArea areaTexto;
    private JButton botonMostrar;
    
    public void Calculadora() {
        setLayout(new FlowLayout());

        dato1 = new JTextField(10);
        add(dato1);

        dato2 = new JTextField(10);
        add(dato2);

        boton = new JButton("+");
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = dato1.getText();
                double numero1 = Double.parseDouble(num1);
                String num2 = dato2.getText();
                double numero2 = Double.parseDouble(num2);
                double resultado=numero1+numero2;
                areaTexto.append(numero1+numero2+"\n");
            }
        });
        add(boton);
        boton = new JButton("-");
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = dato1.getText();
                double numero1 = Double.parseDouble(num1);
                String num2 = dato2.getText();
                double numero2 = Double.parseDouble(num2);
                areaTexto.append(numero1-numero2+"\n");
            }
        });
        add(boton);

        areaTexto = new JTextArea(5, 20);
        add(new JScrollPane(areaTexto));

        setSize(260, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}