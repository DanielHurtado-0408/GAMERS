package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class GamerDTO implements Serializable{
	
	private String nombre;
	private String nickname;
	private String Juego;
	private double puntaje;	
	
	public GamerDTO(String nombre, String nickname, String juego, double puntaje) {
		this.nombre = nombre;
		this.nickname = nickname;
		this.Juego = juego;
		this.puntaje = puntaje;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getJuego() {
		return Juego;
	}

	public void setJuego(String juego) {
		Juego = juego;
	}

	public double getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(double puntaje) {
		this.puntaje = puntaje;
	}

	@Override
	public String toString() {
		return "nombre: " + nombre + " nickname: " + nickname + " Juego: " + Juego + " puntaje: " + puntaje;
	}
	
	
	

}
