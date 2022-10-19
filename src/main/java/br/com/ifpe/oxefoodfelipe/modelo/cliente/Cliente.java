package br.com.ifpe.oxefoodfelipe.modelo.cliente;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import br.com.ifpe.oxefoodfelipe.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Cliente")
@Where(clause = "habilitado = true")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente extends EntidadeAuditavel{/**
	 * 
	 */
	private static final long serialVersionUID = -1073125754768164853L;
	
	@Column
	private String chaveEmpresa;
	
	@Column
	private String nome;
	
	@Column
	private String cpf;
	
	@Column
	private String fone;
	
	@Column
	private String foneAlternativo;

}
