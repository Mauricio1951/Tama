package Middleware.TesteSetup;

import Middleware.SetupTabelas.*;
import infra.DAO;

public class NovosModelos2 {

	public NovosModelos2() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {	
		
		DAO<Modelo> modDAO = new DAO<>(Modelo.class);
		
		Fabricante fab2 = new Fabricante("Motorola");
			Modelo mod05 = new Modelo("Moto D Plus",fab2,1);	
						
		modDAO.abrirT().incluir(mod05).fecharT();		
	
	}
}
