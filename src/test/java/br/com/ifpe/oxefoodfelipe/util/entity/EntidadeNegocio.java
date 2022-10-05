package br.com.ifpe.oxefoodfelipe.util.entity;
import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@EqualsAndHashCode(of = { "id" })
public abstract class EntidadeNegocio implements Serializable{

	
	private static final long serialVersionUID = -1437491075005101115L;
	
	private Long id;
	private Boolean habilitado;
	
	
}
