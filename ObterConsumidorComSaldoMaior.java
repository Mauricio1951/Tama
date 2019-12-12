package Middleware.Queries;

import java.util.List;

import Middleware.SetupTabelas.Consumer;
import infra.DAO;

public class ObterConsumidorComSaldoMaior {

	public static void main(String[] args) {
		
		DAO<Consumer> dao = new DAO<>(Consumer.class);
		List<Consumer> consumers = dao.consultar(
				"obterConsumidorComSaldoMaiorQue", "saldo", 1000.00);
		
		for(Consumer c: consumers) {
			System.out.println(c.getUser() 
					+ " => " + c.getSaldoAtual());
			
			}
		}
	}
