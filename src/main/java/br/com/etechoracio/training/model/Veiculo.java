package br.com.etechoracio.training.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "veiculos")
public class Veiculo {
	@Id
	@GeneratedValue
	@Column(name = "placa")
	public String placa;

	@Column(name = "modelo")
	public String modelo;

	@Column(name = "marca")
	public String marca;

	@Column(name = "cor")
	public String cor;

	@Column(name = "preco")
	public String preco;

}
