package br.com.ifpe.oxefoodfelipe.servicos.produto;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpe.oxefoodfelipe.modelo.produto.CategoriaProduto;
import br.com.ifpe.oxefoodfelipe.modelo.produto.CategoriaProdutoService;
import br.com.ifpe.oxefoodfelipe.util.entity.GenericController;

@RestController
@RequestMapping("/api/categoriaproduto")
public class CategoriaProdutoController extends GenericController {

    @Autowired
    private CategoriaProdutoService categoriaProdutoService;

    @PostMapping
    public ResponseEntity<CategoriaProduto> save(@RequestBody @Valid CategoriaProdutoRequest request) {
	
	super.validarPreenchimentoChave(request.getChaveEmpresa());
	CategoriaProduto categoriaProduto = categoriaProdutoService.save(request.buildCategoriaProduto());
	return new ResponseEntity<CategoriaProduto>(categoriaProduto, HttpStatus.CREATED);
    }
    
    @GetMapping("/{id}")
    public CategoriaProduto get(@PathVariable Long id) {
    	return categoriaProdutoService.findById(id);
    }
    
    @GetMapping("/porempresa/{chaveEmpresa}")
    public List<CategoriaProduto> consultarPorChaveEmpresa(@PathVariable String chaveEmpresa) {
    	return categoriaProdutoService.consultarPorChaveEmpresa(chaveEmpresa);
    }

}
