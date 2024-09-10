package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Pedido;
import one.digitalinnovation.gof.repository.PedidoRepository;
import one.digitalinnovation.gof.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public Iterable<Pedido> buscarTodos() {
        return pedidoRepository.findAll();
    }

    @Override
    public Pedido buscarPorId(Long id) {
        Optional<Pedido> pedido = pedidoRepository.findById(id);
        return pedido.orElse(null);
    }

    @Override
    public void inserir(Pedido pedido) {
        pedidoRepository.save(pedido);
    }

    @Override
    public void atualizar(Long id, Pedido pedido) {
        pedidoRepository.save(pedido);
    }

    @Override
    public void deletar(Long id) {
        pedidoRepository.deleteById(id);
    }
}
