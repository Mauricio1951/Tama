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
//@DiscriminatorValue("MER")
@Table(name = "merchants", schema = "middleware")
public class Merchant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(mappedBy = "merchant")
	@JoinColumn(name = "merchantuser_id", unique = true)
	private User user;

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "merchantdevice_id", unique = true)
	private MerchantDevice merchantdevice;

	private int numTrans;

	@Column(precision = 11, scale = 2)
	private Double somaTrans;

	@Column(precision = 11, scale = 2)
	private Double saldoInicial;

	@Column(precision = 11, scale = 2)
	private Double saldoAtual; // Saldo Inicial atualizado pelos processamentos pelo Middleware

	@Column(length = 16)
	private String bindingHash; // Calculado a partir de ConsumerId, DeviceId e n� do Telefone

	public Merchant() {
		// TODO Auto-generated constructor stub
	}

	public Merchant(int numTrans, Double somaTrans, Double saldoInicial, Double saldoAtual, String bindingHash) {
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public MerchantDevice getMerchantdevice() {
		return merchantdevice;
	}

	public void setMerchantdevice(MerchantDevice merchantdevice) {
		this.merchantdevice = merchantdevice;
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
