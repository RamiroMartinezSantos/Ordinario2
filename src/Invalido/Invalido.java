package Invalido;

import Secretaria.Secretaria;

import javax.swing.*;
import java.awt.*;

public class Invalido extends JFrame{
    private JPanel panel1;
    private JButton aceptarButton;

    public Invalido(){
        setupFrame();
        query();
    }
    private void setupFrame(){
        setTitle("Campos invalidos");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(300, 100);
        add(panel1);
    }
    private void query(){
        aceptarButton.addActionListener(e -> {
            Secretaria secretaria = new Secretaria();
            secretaria.setVisible(true);
            this.setVisible(false);
        });
    }
}
