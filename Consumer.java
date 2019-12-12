package Middleware.SetupTabelas;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
// @DiscriminatorValue("CLI")
@Table(name = "consumers")
public class Consumer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "consumerdevice_id", unique = true)
	private ConsumerDevice consumerdevice;

	@OneToOne(mappedBy = "consumer")
	private User user;

	private int numTrans;

	@Column(precision = 11, scale = 2)
	private Double somaTrans;

	@Column(precision = 11, scale = 2)
	private Double saldoInicial;

	@Column(precision = 11, scale = 2)
	private Double saldoAtual; // Saldo Inicial atualizado pelos processamentos pelo Middleware

	@Column(length = 16)
	private String bindingHash; // Calculado a partir de ConsumerId, DeviceId e nº do Telefone

	public Consumer() {
		// TODO Auto-generated constructor stub
	}

	public Consumer(int numTrans, Double somaTrans, Double saldoInicial, Double saldoAtual, String bindingHash) {
		super();

		this.numTrans = numTrans;
		this.somaTrans = somaTrans;
		this.saldoInicial = saldoInicial;
		this.saldoAtual = saldoAtual;
		this.bindingHash = bindingHash;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ConsumerDevice getConsumerdevice() {
		return consumerdevice;
	}

	public void setConsumerdevice(ConsumerDevice consumerdevice) {
		this.consumerdevice = consumerdevice;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getNumTrans() {
		return numTrans;
	}

	public void setNumTrans(int numTrans) {
		this.numTrans = numTrans;
	}

	public Double getSomaTrans() {
		return somaTrans;
	}

	public void setSomaTrans(Double somaTrans) {
		this.somaTrans = somaTrans;
	}

	public Double getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(Double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public Double getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(Double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}

	public String getBindingHash() {
		return bindingHash;
	}

	public void setBindingHash(String bindingHash) {
		this.bindingHash = bindingHash;
	}

}
