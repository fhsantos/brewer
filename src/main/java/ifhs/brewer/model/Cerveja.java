package ifhs.brewer.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Cerveja {

	@NotBlank(message = "SKU é obrigatório")
	@Size(max = 6, message = "SKU: Tamanho máximo de 6 caracteres.")
	private String sku;
	
	@Size(max = 60, message = "Nome: Tamanho máximo de 60 caracteres.")
	@NotBlank(message = "Nome é obrigatório")
	private String nome;
	
	@Size(max = 60, message = "Descrição: Tamanho máximo de 60 caracteres.")
	@NotBlank(message = "Descrição é obrigatória")
	private String descricao;
	
	public String getSku() {
		return sku;
	}
	
	public void setSku(String sku) {
		this.sku = sku;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
