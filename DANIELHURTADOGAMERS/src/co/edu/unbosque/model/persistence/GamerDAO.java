package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import java.util.List;

public class GamerDAO {
	
	  List<GamerDTO> Gamers;
	  BaseDatosFile archivos;
	
	public GamerDAO() {
		archivos = new BaseDatosFile();
		Gamers = new ArrayList<>();
		GamerDTO gamer1 = new GamerDTO("Daniel", "CAPO", "COD", 150);
		GamerDTO gamer2 = new GamerDTO("Camilo", "JC", "COD", 145);
		Gamers.add(gamer1);
		Gamers.add(gamer2);
		archivos.escribirArchivo(Gamers);
	}
	
	public String eliminarGamer(String nickname) {
		String mensaje = null;
		for(int i = 0; i<Gamers.size(); i++) {
			if(Gamers.get(i).getNickname().equals(nickname)) {
				Gamers.remove(Gamers.get(i));
				mensaje = ("Gamer " + nickname + " fue eliminado exitosamente");
			}
		}
		archivos.escribirArchivo(Gamers);
        return mensaje;
	}
	
	public String ListaGamers(){
		String mensaje = "";
		
		for (int i = 0; i< Gamers.size(); i++) {
				mensaje +=  " nombre: " + Gamers.get(i).getNombre()
						+ " NICKNAME: " + Gamers.get(i).getNickname()
						+ " Juego: " + Gamers.get(i).getJuego()
						+ " puntaje: " + Gamers.get(i).getPuntaje() + "\n";
			}
		
		archivos.escribirArchivo(Gamers);
		return mensaje;

	}
	
	
	public String obtenerGamerPorNicknameString(String nickname) {
		
		String mensaje = null;
		for (int i = 0; i< Gamers.size(); i++) {
			if(Gamers.get(i).getNickname().equals(nickname)) {
				mensaje = nickname  + " encontrado exitosamente "
						+ "\n nombre: " + Gamers.get(i).getNombre()
						+ " Juego: " + Gamers.get(i).getJuego()
						+ " puntaje: " + Gamers.get(i).getPuntaje() + "\n";
			}
		}
		archivos.escribirArchivo(Gamers);
		return mensaje;
	}

	public GamerDTO modificarGamer(GamerDTO gamer) {
		GamerDTO jugador = null;
		for(int i = 0; i<Gamers.size(); i++) {
			if(Gamers.get(i).equals(gamer)) {
			Gamers.get(i).setNombre(gamer.getNombre());
			Gamers.get(i).setNickname(gamer.getNickname());
			Gamers.get(i).setPuntaje(gamer.getPuntaje());
			Gamers.get(i).setJuego(gamer.getJuego());
			jugador = Gamers.get(i);
			}
		}
		archivos.escribirArchivo(Gamers);
		return jugador;
	}
	
	public GamerDTO obtenerGamer(String nickname) {
		
		GamerDTO jugador = null;
		for (int i = 0; i< Gamers.size(); i++) {
			if(Gamers.get(i).getNickname().equals(nickname)) {
				jugador = Gamers.get(i);
			}
		}
		archivos.escribirArchivo(Gamers);
		return jugador;
	}
	
	public  String agregarGamer (String nombre, String nickname, String juego, double puntaje) {
		String mensaje = "";
			GamerDTO Gamer= new GamerDTO(nombre, nickname, juego, puntaje);
			Gamers.add(Gamer);
			mensaje = "El gamer: " + Gamer + "fue agregado";
			archivos.escribirArchivo(Gamers);
			return mensaje;
		}
	
	public void ordenamientoBurbuja() {
		for(int i =0; i<Gamers.size()-1; i++) {
			for(int j = 0; j<Gamers.size();j++) {
				if(Gamers.get(i).getPuntaje()>Gamers.get(j).getPuntaje()) {
					GamerDTO gamer = new GamerDTO(Gamers.get(j).getNombre(), Gamers.get(j).getNickname(),
							Gamers.get(j).getJuego(), Gamers.get(j).getPuntaje());
					Gamers.set(j, Gamers.get(i));
					Gamers.set(i, gamer);
					
				}
			}
		}
		System.out.println(Gamers);
		archivos.escribirArchivo(Gamers);

	}

	public List<GamerDTO> getGamers() {
		return Gamers;
	}

	public void setGamers(List<GamerDTO> gamers) {
		Gamers = gamers;
	}

	public BaseDatosFile getArchivos() {
		return archivos;
	}

	public void setArchivos(BaseDatosFile archivos) {
		this.archivos = archivos;
	}
	
	
	
	}
	
	


	