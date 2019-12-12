package Middleware.TesteSetup;

import Middleware.SetupTabelas.*;
import infra.DAO;

public class NovosFabricantes {

	public static void main(String[] args) {

		System.out.print(Fabricante.class);
		DAO<Fabricante> fab = new DAO<>(Fabricante.class);

		Fabricante fab1 = new Fabricante("Apple", "Apple Inc.");
		Fabricante fab2 = new Fabricante("Huawei", "Huawei Technolgies Co.");
		Fabricante fab3 = new Fabricante("LG", "LG Electonics");
		Fabricante fab4 = new Fabricante("Motorola", "Motorola Inc.");
		Fabricante fab5 = new Fabricante("Samsung", "Samsung Electronics");
		Fabricante fab6 = new Fabricante("Sony", "Sony Inc.");
		Fabricante fab7 = new Fabricante("Xiaomi", "Xiaomi Inc.");
		Fabricante fab8 = new Fabricante("IBM", "IBM Corporation");
		// Acrescentar novos fabricantes aqui

		fab.abrirT()
			.incluir(fab1)
			.incluir(fab2)
			.incluir(fab3)
			.incluir(fab4)
			.incluir(fab5)
			.incluir(fab6)
			.incluir(fab7)
			.incluir(fab8)
		.fecharT();

		fab.fechar();

	}
}
