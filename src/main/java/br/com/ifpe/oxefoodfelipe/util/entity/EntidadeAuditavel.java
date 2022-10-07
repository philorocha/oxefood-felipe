package br.com.ifpe.oxefoodfelipe.util.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
public abstract class EntidadeAuditavel extends EntidadeNegocio {

    
    private static final long serialVersionUID = 2670975930781312759L;

    @JsonIgnore
    @Version
	private Long versao;

    @JsonIgnore
    @CreatedDate
    private LocalDate dataCriacao;

    @JsonIgnore
    @LastModifiedDate
    private LocalDate dataUltimaModificacao;

    @JsonIgnore
    @Column
    private Long criadoPor; // Id do usuário que o criou

    @JsonIgnore
    @Column
    private Long ultimaModificacaoPor; // Id do usuário que fez a última alteração

	public Long getVersao() {
		return versao;
	}

	public void setVersao(Long versao) {
		this.versao = versao;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public LocalDate getDataUltimaModificacao() {
		return dataUltimaModificacao;
	}

	public void setDataUltimaModificacao(LocalDate dataUltimaModificacao) {
		this.dataUltimaModificacao = dataUltimaModificacao;
	}

	public Long getCriadoPor() {
		return criadoPor;
	}

	public void setCriadoPor(Long criadoPor) {
		this.criadoPor = criadoPor;
	}

	public Long getUltimaModificacaoPor() {
		return ultimaModificacaoPor;
	}

	public void setUltimaModificacaoPor(Long ultimaModificacaoPor) {
		this.ultimaModificacaoPor = ultimaModificacaoPor;
	}
}

