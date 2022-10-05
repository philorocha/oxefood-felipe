package br.com.ifpe.oxefoodfelipe.modelo.produto;

import br.com.ifpe.oxefoodfelipe.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaProduto extends EntidadeAuditavel{
	
	private String chaveEmpresa;
	private String descricao;

}
