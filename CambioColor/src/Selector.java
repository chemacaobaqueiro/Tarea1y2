import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Selector {
    public void menu(){
        JFrame frame = new JFrame("Menu colores");
        String[] items = {"Rojo","Azul","Verde","Amarillo","Rosa"};
        JComboBox<String> comboBox = new JComboBox<>(items);
        comboBox.setBounds(50,50,150,300);
        JPanel panel = new JPanel();
        panel.setSize(3000, 2000);
        panel.setLayout(new FlowLayout());
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selected = (String) comboBox.getSelectedItem();
                if (selected == "Rojo"){
                    panel.setBackground(Color.RED);
                } else if (selected == "Azul") {
                    panel.setBackground(Color.BLUE);
                }else if (selected == "Verde") {
                    panel.setBackground(Color.GREEN);
                }else if (selected == "Amarillo") {
                    panel.setBackground(Color.YELLOW);
                }else if (selected == "Rosa") {
                    panel.setBackground(Color.PINK);
                }
            }
        });
        frame.add(panel);
        frame.add(comboBox);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
