package br.com.ifpe.oxefoodfelipe.modelo.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ifpe.oxefoodfelipe.modelo.produto.CategoriaProduto;
import br.com.ifpe.oxefoodfelipe.util.entity.GenericService;

@Service
public class ClienteService extends GenericService{
	
	@Autowired
    private ClienteRepository repository;
	
	@Transactional
    public Cliente save(Cliente cliente) {
		super.preencherCamposAuditoria(cliente);
		return repository.save(cliente);
    }

}
