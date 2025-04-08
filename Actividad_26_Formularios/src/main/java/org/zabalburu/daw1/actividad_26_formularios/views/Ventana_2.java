/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad_26_formularios.views;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author DAW1
 */
public class Ventana_2 extends JFrame{
    
    private JLabel lblTitulo = new JLabel("GAME ZONE");
    
    private JLabel lblGamerTag = new JLabel("GAMERTAG");
    
    private JTextField txtGamerTag = new JTextField();
    
    private JLabel lblEmail = new JLabel("EMAIL");
    
    private JTextField txtEmail = new JTextField();
    
    private JLabel lblPassword = new JLabel("Contraseña");
    
    private JPasswordField pwdPassword = new JPasswordField();
    
    private JPanel pnlDatos = new JPanel(new GridLayout(6, 0));
    
    private JPanel pnlBotones = new JPanel(new FlowLayout(FlowLayout.CENTER));
    
    public static void main(String[] args) {
        new Ventana_2().setVisible(true);
    }
}
