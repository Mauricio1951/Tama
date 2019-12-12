package Middleware.TesteSetup;

import Middleware.SetupTabelas.*;
import infra.DAO;

public class NovosUsuarios {

	public static void main(String[] args) {

		System.out.print(User.class);
		DAO<User> u = new DAO<>(User.class);
					    
		User u01 = new User("PF","11200500000161","login1", "hashSenha1", false);
		User u02 = new User("PF","11200500000162","login2", "hashSenha2", false);
		User u03 = new User("PF","11200500000163","login3", "hashSenha3", false);
		User u04 = new User("PF","11200500000164","login4", "hashSenha4", false);
		User u05 = new User("PF","11200500000165","login5", "hashSenha5", false);
		
		u.abrirT()
			.incluir(u01)
			.incluir(u02)
			.incluir(u03)
			.incluir(u04)
			.incluir(u05)
		.fecharT();
		u.fechar();
	}
}
