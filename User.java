package Middleware.SetupTabelas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 2, nullable = false)
	private String type;
	
	@Column(length = 16, nullable = false, unique = true)
	private String fiscalid;

	@Column(length = 45, nullable = false, unique = true)
	private String login;
	
	@Column(length = 16, nullable = false)
	private String  hashSenha;
	
	@Column(length = 1, nullable = false)
	private Boolean blackListed;
	
	@OneToOne(fetch = FetchType.EAGER, optional = true)
	private Merchant merchant;

	@OneToOne(fetch = FetchType.EAGER, optional = true)
	private Consumer consumer;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String type, String fiscalid, String login, String hashSenha, Boolean blackListed) {
		super();
		this.type = type;
		this.fiscalid = fiscalid;
		this.login = login;
		this.hashSenha = hashSenha;
		this.blackListed = blackListed;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFiscalid() {
		return fiscalid;
	}

	public void setFiscalid(String fiscalid) {
		this.fiscalid = fiscalid;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getHashSenha() {
		return hashSenha;
	}

	public void setHashSenha(String hashSenha) {
		this.hashSenha = hashSenha;
	}

	public Boolean getBlackListed() {
		return blackListed;
	}

	public void setBlackListed(Boolean blackListed) {
		this.blackListed = blackListed;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

	public Consumer getConsumer() {
		return consumer;
	}

	public void setConsumer(Consumer consumer) {
		this.consumer = consumer;
	}

	
	
}
