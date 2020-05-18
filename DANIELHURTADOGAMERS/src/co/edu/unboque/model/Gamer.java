package co.edu.unboque.model;

import co.edu.unbosque.model.persistence.BaseDatosFile;
import co.edu.unbosque.model.persistence.GamerDAO;

public class Gamer {
	
	GamerDAO gamerDAO;
	BaseDatosFile f;
	
	public Gamer(){
		gamerDAO = new GamerDAO();
		f = new BaseDatosFile();
	}

	public GamerDAO getGamerDAO() {
		return gamerDAO;
	}

	public void setGamerDAO(GamerDAO gamerDAO) {
		this.gamerDAO = gamerDAO;
	}

	public BaseDatosFile getBaseDatosFile() {
		return f;
	}

	public void setBaseDatosFile(BaseDatosFile binariosFile) {
		this.f = binariosFile;
	}
	
	

}
