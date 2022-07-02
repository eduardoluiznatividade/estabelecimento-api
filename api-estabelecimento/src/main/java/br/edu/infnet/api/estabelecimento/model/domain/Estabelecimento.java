package br.edu.infnet.api.estabelecimento.model.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(
	name = "TEstabelecimento",
	uniqueConstraints = @UniqueConstraint(columnNames={"cnpj"})
)
public class Estabelecimento extends Usuario {

	private String cnpj;
	private String endereco;
	private boolean edTech;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public boolean isEdTech() {
		return edTech;
	}
	public void setEdTech(boolean edTech) {
		this.edTech = edTech;
	}
	
}