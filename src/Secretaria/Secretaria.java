package Secretaria;

import Invalido.Invalido;
import Usuarios.Usuarios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Secretaria extends JFrame{
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton regresarButton;
    private JButton ingresarButton;

    public Secretaria(){
        setupFrame();
        query2();
    }
    private void setupFrame(){
        setTitle("Menu principal");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(400, 300);
        add(panel1);
        addActionListeners();
    }
    private void addActionListeners(){
        ingresarButton.addActionListener(new EventClick());
    }
    public class EventClick implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton boton = (JButton) e.getSource();
            String opcion = boton.getText();
            if (opcion.equals("Ingresar")) {
                String usuar = textField1.getText();
                String contra = textField2.getText();
                if(Objects.equals(usuar, "admin") && Objects.equals(contra, "admin")){
                    MenuSecretaria menuSecretaria = new MenuSecretaria();
                    menuSecretaria.setVisible(true);
                }else{
                    Invalido invalido = new Invalido();
                    invalido.setVisible(true);
                }
                textField1.setText(" ");
                textField2.setText(" ");
            }
        }
    }
    private void query2(){
        regresarButton.addActionListener(e -> {
            Usuarios usuarios = new Usuarios();
            usuarios.setVisible(true);
            this.setVisible(false);
        });
    }
}
