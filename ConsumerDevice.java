package Middleware.SetupTabelas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "consumerdevices")
public class ConsumerDevice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(mappedBy = "consumerdevice")
	private Consumer consumer;
	
	@Column (length=15,unique=true,nullable=false)
	private String imei; // International Mobile Equipment Identity.
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Modelo modelo;
	
	@Column (length=15,unique=false,nullable=false)
	private String SoftwareHash; // Calculado no momento do Bind do Dispositivo.
	
	@Column (unique=false,nullable=false)
	private Boolean BlackListed;
		
	public ConsumerDevice() {

	}

	public ConsumerDevice(String imei, Modelo modelo, Consumer consumer, String softwareHash, Boolean blackListed) {
		super();
		this.imei = imei;
		this.modelo = modelo;
		this.consumer = consumer;
		SoftwareHash = softwareHash;
		BlackListed = blackListed;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Consumer getConsumer() {
		return consumer;
	}

	public void setConsumer(Consumer consumer) {
		this.consumer = consumer;
	}

	public String getSoftwareHash() {
		return SoftwareHash;
	}

	public void setSoftwareHash(String softwareHash) {
		SoftwareHash = softwareHash;
	}

	public Boolean getBlackListed() {
		return BlackListed;
	}

	public void setBlackListed(Boolean blackListed) {
		BlackListed = blackListed;
	}

	
	}
