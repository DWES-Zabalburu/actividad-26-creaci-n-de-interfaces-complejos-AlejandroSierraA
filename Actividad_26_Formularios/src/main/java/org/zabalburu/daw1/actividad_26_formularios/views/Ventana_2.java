/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad_26_formularios.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

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
    
    private JButton btnRegistrar = new JButton("Registrarse");
    
    private JButton btnCancelar = new JButton("Cancelar");
    
    private JPanel pnlBotones = new JPanel();
    
    private Color COLOR_TEXTO = new Color(0, 255, 171);
    
    private Color Fondo_Titulo = new Color(49, 50, 70);
    
    private Color Fondo_Texto = new Color(25, 25, 35);
    
    private final Font FUENTE = new Font("Calibri",Font.PLAIN,16);
    
    public Ventana_2(){
        this.setSize(500, 500);
        this.setTitle("GameZone - Registro");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        lblTitulo.setFont(new Font("Calibri",Font.BOLD,30));
        lblTitulo.setHorizontalAlignment(JLabel.CENTER);
        lblTitulo.setForeground(COLOR_TEXTO);
        lblTitulo.setBackground(Fondo_Titulo);
        lblTitulo.setOpaque(true);
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        lblTitulo.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, COLOR_TEXTO));
        this.add(lblTitulo,BorderLayout.NORTH);
        
        txtGamerTag.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, COLOR_TEXTO));
        txtEmail.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, COLOR_TEXTO));
        pwdPassword.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, COLOR_TEXTO));
        txtGamerTag.setBackground(Fondo_Titulo);
        txtEmail.setBackground(Fondo_Titulo);
        pwdPassword.setBackground(Fondo_Titulo);
        pnlDatos.setFont(new Font("Calibri",Font.PLAIN,16));
        lblGamerTag.setForeground(COLOR_TEXTO);
        lblEmail.setForeground(COLOR_TEXTO);
        lblPassword.setForeground(COLOR_TEXTO);
        pnlDatos.setBackground(Fondo_Texto);
        this.add(pnlDatos,BorderLayout.CENTER);
        pnlDatos.add(lblGamerTag);
        pnlDatos.add(txtGamerTag);
        pnlDatos.add(lblEmail);
        pnlDatos.add(txtEmail);
        pnlDatos.add(lblPassword);
        pnlDatos.add(pwdPassword);
        pnlDatos.setBorder(new EmptyBorder(0,40,0,40));
        
        
        
        this.add(pnlBotones,BorderLayout.SOUTH);
        btnCancelar.setFont(new Font("Calibri", Font.BOLD, 16));
        btnRegistrar.setFont(new Font("Calibri", Font.BOLD, 16));
        pnlBotones.setBackground(Fondo_Texto);
        btnCancelar.setForeground(Color.BLACK);
        btnRegistrar.setForeground(Color.BLACK);
        btnRegistrar.setBackground(COLOR_TEXTO);
        btnCancelar.setBackground(new Color(255, 50, 80));
        pnlBotones.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        pnlBotones.add(btnRegistrar);
        pnlBotones.add(btnCancelar);
        btnRegistrar.setPreferredSize(new Dimension(140, 40));
        btnCancelar.setPreferredSize(new Dimension(100, 40));
    }
    
    public static void main(String[] args) {
        new Ventana_2().setVisible(true);
    }
}
