package Middleware.TesteSetup;

import Middleware.SetupTabelas.*;
import infra.DAO;

public class NovosEstabelecimentos {

	public static void main(String[] args) {

		DAO<Merchant> c = new DAO<> (Merchant.class);
		
		Merchant m01 = new Merchant(0,0.00,5500.00, 1500.00, "1234567890123456");		
		Merchant m02 = new Merchant(0,0.00,7000.00, 2000.00, "1234567890123456");
		Merchant m03 = new Merchant(0,0.00,9000.00, 3000.00, "1234567890123456");
					
		c.incluirAtomico(m01).incluirAtomico(m02).incluirAtomico(m03);
							
		c.fechar();
	}
}
