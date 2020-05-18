package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unboque.model.Gamer;
import co.edu.unboque.view.View;
import co.edu.unbosque.model.persistence.GamerDTO;

public class controller implements ActionListener{
	
	Gamer gamer;
	View gui; 
	
	public controller(){
		gui = new View();
		gamer = new Gamer(); 

		gui.getPanel().getBoton_cargar_datos().addActionListener(this);
		gui.getPanel().getBoton_mostrar_graficos().addActionListener(this);
		gui.getPanel().getBoton_mostrar_datos().addActionListener(this);
		gui.getPanel().getBoton_agreagar_gamer().addActionListener(this);
		gui.getPanel().getBoton_eliminar_gamer().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals(gui.getPanel().MOSTRAR_GAMERS)) {
	
			gui.getPanel().mostrarResultado(gamer.getGamerDAO().ListaGamers());
			gamer.getBaseDatosFile().leerArchivo(gamer.getGamerDAO().getGamers()).forEach(System.out::println);
			gamer.getGamerDAO().ordenamientoBurbuja();
		}
		if (e.getActionCommand().equals(gui.getPanel().OBTENER_GAMER)) {
			
			gui.getPanel().mostrarResultado(gamer.getGamerDAO().obtenerGamerPorNicknameString(gui.cargarString("Introduzca nickname")));
			
		}
		if (e.getActionCommand().equals(gui.getPanel().ACTUALIZAR_DATOS)) {
			
			GamerDTO gamer3= gamer.getGamerDAO().obtenerGamer(gui.cargarString("Escriba el nickname del gamer a actualizar: "));
			gamer3.setNombre(gui.cargarString("Nombre nuevo: "));
			gamer3.setNickname(gui.cargarString("nickname nuevo:"));
			gamer3.setJuego(gui.cargarString("Juego nuevo:"));
			gamer3.setPuntaje(gui.cargarDouble());
			gamer.getGamerDAO().modificarGamer(gamer3);
			gui.getPanel().mostrarResultado(gamer3.getNombre() +" "+ gamer3.getNickname()+" " + gamer3.getJuego()+" " + gamer3.getPuntaje());
			
		}
		
		if (e.getActionCommand().equals(gui.getPanel().AGREGAR_GAMER)) {
			
			gui.getPanel().mostrarResultado(gamer.getGamerDAO().agregarGamer(gui.cargarString("Ingrese nombre: "), gui.cargarString("Ingrese nickname: "), 
					gui.cargarString("Ingrese juego: "), gui.cargarDouble()));
			
		}
		
		if (e.getActionCommand().equals(gui.getPanel().ELIMINAR_GAMER)) {
			
		gui.getPanel().mostrarResultado(gamer.getGamerDAO().eliminarGamer
		(gui.cargarString("Ingrese el nickname de gamer a eliminar: ")));
		
		}
	}
	

}
