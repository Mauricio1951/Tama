package Middleware.TesteSetup;

import Middleware.SetupTabelas.*;
import infra.DAO;

public class NovosConsumidores {

	public static void main(String[] args) {

		DAO<Consumer> c = new DAO<> (Consumer.class);
		
		Consumer c01 = new Consumer(0,0.00,1000.00, 1000.00, "1234567890123456");		
		Consumer c02 = new Consumer(0,0.00,2000.00, 2000.00, "1234567890123456");
		Consumer c03 = new Consumer(0,0.00,2000.00, 2000.00, "1234567890123456");
					
		c.incluirAtomico(c01).incluirAtomico(c02).incluirAtomico(c03);
			
		c.fechar();
	}
}
