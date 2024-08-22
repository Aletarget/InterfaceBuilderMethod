/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Abstraccion.CamionBuilder;
import Concrete_builder.*;
import Productos.camion;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import practica_builder.construir_camion;

public class VentanaInicial extends JFrame {
    private JButton btnTipo1;
    private JButton btnTipo2;
    private JButton btnCrear;
    private JLabel lblInformacion;
    private String tipoCamionSeleccionado;

        public VentanaInicial() {
            setTitle("Seleccionar Tipo de Camión");
            setSize(400, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            // Crear los botones
            btnTipo1 = new JButton("Camión Pequeno");
            btnTipo2 = new JButton("Camión Grande");
            btnCrear = new JButton("Crear Camión");

            // Crear el panel de información
            lblInformacion = new JLabel("Selecciona un tipo de camión", SwingConstants.CENTER);
            lblInformacion.setPreferredSize(new Dimension(300, 50));

            // Panel para los botones de selección de tipo de camión
            JPanel panelSeleccion = new JPanel();
            panelSeleccion.setLayout(new FlowLayout());
            panelSeleccion.add(btnTipo1);
            panelSeleccion.add(btnTipo2);

            // Panel para el botón de crear
            JPanel panelCrear = new JPanel();
            panelCrear.setLayout(new FlowLayout());
            panelCrear.add(btnCrear);

            // Panel central para mostrar la información del camión
            JPanel panelInformacion = new JPanel();
            panelInformacion.setLayout(new BorderLayout());
            panelInformacion.add(lblInformacion, BorderLayout.CENTER);

            // Agregar paneles al marco principal
            setLayout(new BorderLayout());
            add(panelSeleccion, BorderLayout.NORTH);
            add(panelInformacion, BorderLayout.CENTER);
            add(panelCrear, BorderLayout.SOUTH);

            // Añadir ActionListener a los botones
            btnTipo1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tipoCamionSeleccionado = "Grande";
                    lblInformacion.setText("Camión Tipo grande seleccionado");
                }
            });

            btnTipo2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tipoCamionSeleccionado = "Pequeno";
                    lblInformacion.setText("Camión Tipo pequeno seleccionado");
                }
            });

            btnCrear.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (tipoCamionSeleccionado != null) {
                        JOptionPane.showMessageDialog(null, "Creando Camión" + tipoCamionSeleccionado + "\n");
                        // Aquí puedes agregar el código para crear el camión
                        if (tipoCamionSeleccionado == "Grande") {
                            construir_camion obj= new construir_camion();
                            CamionBuilder obj1= new Camion_uno();
                            obj.setcamionBuilder(obj1);
                            obj.fabrica_camion();
                            camion nueva = obj.getcamion();
                            String carroceria = nueva.getCarroceria();
                            String motor = nueva.getMotor();
                            String ruedas= nueva.getRuedas();
                            JOptionPane.showMessageDialog(null,"Tamano de las ruedas : " + ruedas + "\n Tipo de motor: "+ motor +"\n Tipo de carroceria: "+ carroceria);
                        }else{
                            construir_camion obj= new construir_camion();
                            CamionBuilder obj1= new Camion_dos();
                            obj.setcamionBuilder(obj1);
                            obj.fabrica_camion();
                            camion nueva = obj.getcamion();
                            String carroceria = nueva.getCarroceria();
                            String motor = nueva.getMotor();
                            String ruedas= nueva.getRuedas();
                            JOptionPane.showMessageDialog(null,"Tamano de las ruedas : " + ruedas + "\n Tipo de motor: "+ motor +"\n Tipo de carroceria: "+ carroceria);
                        }
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor selecciona un tipo de camión primero");
                    }
                }
            });
    }
}