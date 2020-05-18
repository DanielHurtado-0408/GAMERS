package co.edu.unboque.view;

import java.awt.Color;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class View extends JFrame{
	
	private Panel panel;
	
	public View () {
		
		setTitle("ESTADISTICAS COVID_19");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 400);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.white);
		
	inicializarComponentes();
		
		setResizable( true );
        setLocationRelativeTo( null );
        setVisible(true);
	}
	private void inicializarComponentes() {
		panel = new Panel();
		panel.setBounds(25, 25, 750, 300);
		getContentPane().add(panel);
		


	}
	

	public Panel getPanel() {
		return panel;
	}
	public void setPanel(Panel panel) {
		this.panel = panel;
	}
	
	public String cargarString(String mensaje) {
		
		String m = JOptionPane.showInputDialog(mensaje);
		return m;
	}
	
	public double cargarDouble() {
		
		String m = JOptionPane.showInputDialog("introduzca puntaje: ");
		double numero = Double.parseDouble(m);
		return numero;
	}


	
}
