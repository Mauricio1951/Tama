package Middleware.TesteSetup;

import Middleware.SetupTabelas.*;
import infra.DAO;

public class NovosModelos {

	public NovosModelos() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {	
		
		DAO<Modelo> modDAO = new DAO<>(Modelo.class);
		
		Fabricante fab1 = new Fabricante("Apple");
			Modelo mod01 = new Modelo("IPhone 11",fab1,1);
			Modelo mod02 = new Modelo("IPhone 8",fab1,1);
			Modelo mod03 = new Modelo("IPhone 9",fab1,1);
			Modelo mod04 = new Modelo("IPhone X",fab1,1);
		
		Fabricante fab2 = new Fabricante("Motorola");
			Modelo mod05 = new Modelo("Moto E5 Play",fab2,1);
			Modelo mod06 = new Modelo("Moto E6 Plus",fab2,1);
			Modelo mod07 = new Modelo("Moto G7 Play",fab2,1);
			Modelo mod08 = new Modelo("Moto G7 Power",fab2,1);
			Modelo mod09 = new Modelo("Motorola One",fab2,1);
			
		Fabricante fab3 = new Fabricante("Samsung");
			Modelo mod10 = new Modelo("Galaxi A10",fab3,1);
			Modelo mod11 = new Modelo("Galaxi A20",fab3,1);
			Modelo mod12 = new Modelo("Galaxi A30",fab3,1);
			Modelo mod13 = new Modelo("Galaxi A50",fab3,1);
			Modelo mod14 = new Modelo("Galaxi A70",fab3,1);
			Modelo mod15 = new Modelo("Galaxi A80",fab3,1);
		
		Fabricante fab4 = new Fabricante("Xiaomi");
			Modelo mod16 = new Modelo("Redmi Note 7",fab4,1);
			Modelo mod17 = new Modelo("Redmi Note 8",fab4,1);
			Modelo mod18 = new Modelo("Redmi Note 9",fab4,1);
						
		modDAO.abrirT()
			.incluir(mod01)
			.incluir(mod02)
			.incluir(mod03)
			.incluir(mod04)
			.incluir(mod05)
			.incluir(mod06)
			.incluir(mod07)
			.incluir(mod08)
			.incluir(mod09)
			.incluir(mod10)
			.incluir(mod11)
			.incluir(mod12)
			.incluir(mod13)
			.incluir(mod14)
			.incluir(mod15)
			.incluir(mod16)
			.incluir(mod17)
			.incluir(mod18)
		.fecharT();		
	
	}
}
