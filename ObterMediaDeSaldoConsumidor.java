package Middleware.Queries;

import infra.DAO;

public class ObterMediaDeSaldoConsumidor {

	public static void main(String[] args) {
		
		DAO<SaldoConsumidor> dao = new DAO<>(SaldoConsumidor.class);
		SaldoConsumidor saldo = dao.consultarUm("obterMediaGeralDosProdutos");
		
		System.out.println(saldo.getMedia());
		
		dao.fechar();
	}
}
