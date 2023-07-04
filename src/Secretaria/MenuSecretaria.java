package Secretaria;

import Usuarios.Usuarios;

import javax.swing.*;
import java.awt.*;

public class MenuSecretaria extends JFrame{
    private JPanel panel1;
    private JButton registrarButton;
    private JButton regresarButton;
    private JButton mostrarTodosButton;

    public MenuSecretaria(){
        setupFrame();
        query();
        query2();
        query3();
    }
    private void setupFrame(){
        setTitle("Menu");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(400, 300);
        add(panel1);
    }
    private void query(){
        regresarButton.addActionListener(e -> {
            Usuarios usuarios = new Usuarios();
            usuarios.setVisible(true);
            this.setVisible(false);
        });
    }
    private void query2(){
        registrarButton.addActionListener(e -> {
            Registrar registrar = new Registrar();
            registrar.setVisible(true);
            this.setVisible(false);
        });
    }
    private void query3(){
        mostrarTodosButton.addActionListener(e -> {
            Mostrar mostrar = new Mostrar();
            mostrar.setVisible(true);
            this.setVisible(false);
        });
    }
}
