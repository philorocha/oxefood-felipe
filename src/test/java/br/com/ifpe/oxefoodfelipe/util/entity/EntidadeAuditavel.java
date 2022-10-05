package br.com.ifpe.oxefoodfelipe.util.entity;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class EntidadeAuditavel extends EntidadeNegocio{

	private static final long serialVersionUID = -2279704269870227120L;
	
	private Long versao;
	private LocalDate dataCriacao;
	private LocalDate dataUltimaModificacao;
	private Long criadoPor; //id do usuario que criou
	private Long ultimaModificacaoPor; //id do usuario que modificou

}
