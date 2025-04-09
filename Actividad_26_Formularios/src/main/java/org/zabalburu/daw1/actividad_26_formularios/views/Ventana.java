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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author DAW1
 */
public class Ventana extends JFrame{
    
    private Dimension dmVentana = new Dimension(600,600);
    
    private JLabel lblTitulo = new JLabel("Actualiza tu perfil");
    
    private JLabel lblNombreCompleto = new JLabel("Nombre Completo");
    
    private JTextField txtNombreCompleto = new JTextField();
    
    private JLabel lblCorreoElectronico = new JLabel("Correo Electronico");
    
    private JTextField txtCorreoElectronico = new JTextField();
    
    private JLabel lblTelefono = new JLabel("Telefono");
    
    private JTextField txtTelefono = new JTextField();
    
    private JLabel lblDireccion = new JLabel("Direccion");
    
    private JTextField txtDireccion = new JTextField();
    
    private JLabel lblSitioWeb = new JLabel("Sitio Web");
    
    private JTextField txtSitioWeb = new JTextField();
    
    private JButton btnGuardar = new JButton("Guardar Cambios");
    
    private JButton btnCancelar = new JButton("Cancelar");
    
    private JPanel pnlBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    
    private JPanel pnlDatos = new JPanel(new GridLayout(10,0));
    
    private Color COLOR_FONDO = new Color(41,128,185,255);
    
    private final Font FUENTE = new Font("Calibri",Font.PLAIN,12);
    
    public Ventana(){
        this.setSize(dmVentana);
        this.setTitle("Mi perfil");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        lblTitulo.setFont(new Font("Calibri",Font.BOLD,24));
        lblTitulo.setHorizontalAlignment(JLabel.LEFT);
        lblTitulo.setForeground(Color.white);
        lblTitulo.setBackground(COLOR_FONDO);
        lblTitulo.setOpaque(true);
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        this.add(lblTitulo,BorderLayout.NORTH);
        
        txtCorreoElectronico.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, COLOR_FONDO));
        txtDireccion.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, COLOR_FONDO));
        txtNombreCompleto.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, COLOR_FONDO));
        txtSitioWeb.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, COLOR_FONDO));
        txtTelefono.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, COLOR_FONDO));
        pnlDatos.setFont(new Font("Calibri",Font.PLAIN,12));
        this.add(pnlDatos,BorderLayout.CENTER);
        pnlDatos.add(lblNombreCompleto);
        pnlDatos.add(txtNombreCompleto);
        pnlDatos.add(lblCorreoElectronico);
        pnlDatos.add(txtCorreoElectronico);
        pnlDatos.add(lblTelefono);
        pnlDatos.add(txtTelefono);
        pnlDatos.add(lblDireccion);
        pnlDatos.add(txtDireccion);
        pnlDatos.add(lblSitioWeb);
        pnlDatos.add(txtSitioWeb);
        pnlDatos.setBorder(new EmptyBorder(0, 20, 0, 20));
        for(int i = 0; i < pnlDatos.getComponentCount();i++){
        Component cmp = pnlDatos.getComponent(i);
        if(cmp instanceof JLabel){
            cmp.setFont(FUENTE);
        }
    }
        
        
        this.add(pnlBotones,BorderLayout.SOUTH);
        btnCancelar.setFont(FUENTE);
        btnGuardar.setFont(FUENTE);
        pnlBotones.add(btnCancelar);
        pnlBotones.add(btnGuardar);
        btnGuardar.setBackground(COLOR_FONDO);
        btnGuardar.setForeground(Color.WHITE);
        btnCancelar.setForeground(Color.WHITE);
        btnCancelar.setHorizontalAlignment(JLabel.CENTER);
        pnlBotones.setBorder(new EmptyBorder(20, 20, 20, 20));
        btnCancelar.setBackground(new Color(189,195,199,255));
        for(Component c : pnlBotones.getComponents()){
            JButton b = (JButton) c;
            b.setPreferredSize(new Dimension(140,40));
        }
    }
}
