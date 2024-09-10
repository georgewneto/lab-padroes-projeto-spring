package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Produto;
import one.digitalinnovation.gof.repository.ProdutoRepository;
import one.digitalinnovation.gof.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public Iterable<Produto> buscarTodos() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto buscarPorId(Long id) {
        Optional<Produto> optional = produtoRepository.findById(id);
        return optional.orElse(null);
    }

    @Override
    public void inserir(Produto produto) {
        produtoRepository.save(produto);
    }

    @Override
    public void atualizar(Long id, Produto produto) {
        produtoRepository.save(produto);
    }

    @Override
    public void deletar(Long id) {
        produtoRepository.deleteById(id);
    }
}
