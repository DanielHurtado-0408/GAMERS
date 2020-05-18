package co.edu.unboque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.TextField;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import org.w3c.dom.Text;

import co.edu.unbosque.model.persistence.GamerDTO;

public class Panel extends JPanel{
	
	private JLabel etiqueta;
	private JButton boton_obtener_gamer;
	private JButton boton_cargar_datos;
	private JButton boton_mostrar_gamers;  
	private JButton boton_agreagar_gamer;  
	private JButton boton_eliminar_gamer;;  

	public static final String OBTENER_GAMER = "obtener gamer";
	public static final String MOSTRAR_GAMERS = "Mostrar gamers";
	public static final String ACTUALIZAR_DATOS = "Cargar datos";
	public static final String ELIMINAR_GAMER = "Eliminar gamer";
	public static final String AGREGAR_GAMER = "Agregar gamer";
	
	private JTextArea resultado;
	


	public Panel() {
	
	setLayout(null);
	inicializarComponentes();
	setVisible(true);//esta mierda es obligatoria
	}
	
	public void inicializarComponentes() {
		
		setBorder( new CompoundBorder( new EmptyBorder( 0, 0, 5, 0 ), new TitledBorder( "REGISTRO GAMERS" ) ) );
		setBackground(Color.BLACK);//color del panel
		etiqueta = new JLabel("Datos: ");
		etiqueta.setBounds(50,25,400,25); // coordenadas, primero x luego y luego ancho y luego alto
		etiqueta.setForeground(Color.WHITE);// darle color a la etiqueta
		etiqueta.setFont(new java.awt.Font("Pacifico",1,15));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(etiqueta);//esta mierda siempre va de ultimas
		
		boton_obtener_gamer = new JButton("Obtener gamer");
		boton_obtener_gamer.setBounds(50,50,200,20);
		boton_obtener_gamer.setFont(new java.awt.Font("Pacifico",1,15));
	    boton_obtener_gamer.setBackground(Color.red.darker());//color boton
		boton_obtener_gamer.setForeground(Color.BLACK);//darle color a la letra del boton
		boton_obtener_gamer.setActionCommand(OBTENER_GAMER);
	    add(boton_obtener_gamer);
	    
		boton_cargar_datos = new JButton("Modificar gamer");
		boton_cargar_datos.setBounds(50,100,200,20);
		boton_cargar_datos.setFont(new java.awt.Font("Pacifico",1,15));
		boton_cargar_datos.setBackground(Color.red.darker());//color boton
		boton_cargar_datos.setForeground(Color.BLACK);//darle color a la letra del boton
		boton_cargar_datos.setActionCommand(ACTUALIZAR_DATOS);
	    add(boton_cargar_datos);
	    
		boton_mostrar_gamers = new JButton("Mostrar Gamers");
		boton_mostrar_gamers.setBounds(50,150,200,20);
		boton_mostrar_gamers.setFont(new java.awt.Font("Pacifico",1,15));
	    boton_mostrar_gamers.setBackground(Color.red.darker());//color boton
		boton_mostrar_gamers.setForeground(Color.BLACK);//darle color a la letra del boton
		boton_mostrar_gamers.setActionCommand(MOSTRAR_GAMERS);
	    add(boton_mostrar_gamers);

		boton_agreagar_gamer = new JButton("Agregar gamer");
		boton_agreagar_gamer.setBounds(50, 200,200,20);
		boton_agreagar_gamer.setFont(new java.awt.Font("Pacifico",1,15));
	    boton_agreagar_gamer.setBackground(Color.red.darker());//color boton
		boton_agreagar_gamer.setForeground(Color.BLACK);//darle color a la letra del boton
		boton_agreagar_gamer.setActionCommand(AGREGAR_GAMER);
	    add(boton_agreagar_gamer);
	    
		boton_eliminar_gamer = new JButton("Eliminar gamer");
		boton_eliminar_gamer.setBounds(50,250,200,20);
		boton_eliminar_gamer.setFont(new java.awt.Font("Pacifico",1,15));
	    boton_eliminar_gamer.setBackground(Color.red.darker());//color boton
		boton_eliminar_gamer.setForeground(Color.BLACK);//darle color a la letra del boton
		boton_eliminar_gamer.setActionCommand(ELIMINAR_GAMER);
	    add(boton_eliminar_gamer);
	    
	    resultado = new JTextArea("");//se puede meter dos numeros (1: filas y 2:columnas) y si pongo un texto entre comillas es un texto predeterminado
	    resultado.setBounds(300,50,400,200);
	    resultado.setBackground(Color.white);
	    resultado.setForeground(Color.red.brighter());
		resultado.setFont(new java.awt.Font("Pacifico",1,10));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(resultado);
	    
	}



	public JLabel getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(JLabel etiqueta) {
		this.etiqueta = etiqueta;
	}

	public JButton getBoton_mostrar() {
		return boton_obtener_gamer;
	}

	public void setBoton_mostrar(JButton boton_mostrar) {
		this.boton_obtener_gamer = boton_mostrar;
	}

	public JTextArea getResultado(Object object) {
		return resultado;
	}

	public void setResultado(JTextArea resultado) {
		this.resultado = resultado;
	}


	

	public JButton getBoton_mostrar_graficos() {
		return boton_obtener_gamer;
	}

	public void setBoton_mostrar_graficos(JButton boton_mostrar_graficos) {
		this.boton_obtener_gamer = boton_mostrar_graficos;
	}

	public JButton getBoton_cargar_datos() {
		return boton_cargar_datos;
	}

	public void setBoton_cargar_datos(JButton boton_cargar_datos) {
		this.boton_cargar_datos = boton_cargar_datos;
	}

	public JButton getBoton_mostrar_datos() {
		return boton_mostrar_gamers;
	}

	public void setBoton_mostrar_datos(JButton boton_mostrar_datos) {
		this.boton_mostrar_gamers = boton_mostrar_datos;
	}
	
	


	public JButton getBoton_obtener_gamer() {
		return boton_obtener_gamer;
	}

	public void setBoton_obtener_gamer(JButton boton_obtener_gamer) {
		this.boton_obtener_gamer = boton_obtener_gamer;
	}

	public JButton getBoton_mostrar_gamers() {
		return boton_mostrar_gamers;
	}

	public void setBoton_mostrar_gamers(JButton boton_mostrar_gamers) {
		this.boton_mostrar_gamers = boton_mostrar_gamers;
	}

	public JButton getBoton_agreagar_gamer() {
		return boton_agreagar_gamer;
	}

	public void setBoton_agreagar_gamer(JButton boton_agreagar_gamer) {
		this.boton_agreagar_gamer = boton_agreagar_gamer;
	}

	public JButton getBoton_eliminar_gamer() {
		return boton_eliminar_gamer;
	}

	public void setBoton_eliminar_gamer(JButton boton_eliminar_gamer) {
		this.boton_eliminar_gamer = boton_eliminar_gamer;
	}

	public JTextArea getResultado() {
		return resultado;
	}

	public String  mostrarResultado(String texto) {
		resultado.setText(texto);
		return texto;
	}
	
	public String  mostrarResultado2(String texto) {
		resultado.setText(texto);
		return texto;
	}


}
