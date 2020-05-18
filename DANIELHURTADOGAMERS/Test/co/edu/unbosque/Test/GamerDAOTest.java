package co.edu.unbosque.Test;
import co.edu.unboque.model.Gamer;
import co.edu.unbosque.model.persistence.GamerDAO;
import co.edu.unbosque.model.persistence.GamerDTO;
import junit.framework.TestCase;

public class GamerDAOTest extends  TestCase{
	
	private GamerDAO gamerDAO;
	private Gamer mundo;
	protected void setUp() {
		
		 gamerDAO  = new GamerDAO();
	}
	
	public void testEliminarGamer() {
	
	String resultado = gamerDAO.eliminarGamer("CAPO");
	String esperado = "Gamer " + "CAPO" + " fue eliminado exitosamente";
	assertEquals(esperado, resultado);
	}
	
	public void testModificarGamer() {
		
	GamerDTO resultado = gamerDAO.modificarGamer(gamerDAO.obtenerGamer("CAPO"));
	resultado.setNombre("Esteban");
	resultado.setNickname("GOAD");
	resultado.setJuego("FIFA");
	resultado.setPuntaje(150);
	GamerDTO esperado = gamerDAO.getGamers().get(0);
	assertEquals(esperado, resultado);
	}
	
	public void testListaGamers() {
		String esperado = "";
			for (int i = 0; i< gamerDAO.getGamers().size(); i++) {
					 esperado +=  " nombre: " + gamerDAO.getGamers().get(i).getNombre()
							+ " NICKNAME: " + gamerDAO.getGamers().get(i).getNickname()
							+ " Juego: " + gamerDAO.getGamers().get(i).getJuego()
							+ " puntaje: " + gamerDAO.getGamers().get(i).getPuntaje() + "\n";
				}
		
		
	String resultado = gamerDAO.ListaGamers();
	assertEquals(esperado, resultado);
	}
	
	public void testAgreagarGamer() {
		
		String esperado = "El gamer: " +  " nombre: " +"Juan"
				+ " nickname: " + "GOAD"
				+ " Juego: " + "COD"
				+ " puntaje: " + 120.0 + "fue agregado";
		String resultado = gamerDAO.agregarGamer("Juan", "GOAD", "COD", 120);
		assertEquals(esperado, resultado);
		
	}
	
	public void testObtenerGamer() {
		
		GamerDTO esperado = null;
		for (int i = 0; i< gamerDAO.getGamers().size(); i++) {
			esperado = gamerDAO.getGamers().get(0);
		}
		GamerDTO resultado = gamerDAO.obtenerGamer("CAPO");
		assertEquals(esperado, resultado);
		
	}

	/*
	 * public void ordenamientoBurbuja() { for(int i = 0; i<
	 * gamerDAO.getGamers().size()-1; i++) { for(int j = i+1;
	 * j<gamerDAO.getGamers().size(); j++) {
	 * if(gamerDAO.getGamers().get(i).getPuntaje()>gamerDAO.getGamers().get(j).
	 * getPuntaje()) { gamerDAO.getGamers().add(e) aux =
	 * gamerDAO.getGamers().get(i); } } } }
	 */	

}
