package br.edu.unifio.ecommerce.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecommerce.entidades.ItemPedido;
import br.edu.unifio.ecommerce.entidades.Pedido;
import br.edu.unifio.ecommerce.entidades.Produto;

@SpringBootTest
public class ItemPedidoRepositorioTests {

    @Autowired
    private PedidoRepositorio pedidoRepositorio;

    @Autowired
    private ProdutoRepositorio produtoRepositorio;

    @Autowired
    private ItemPedidoRepositorio itemPedidoRepositorio;

    @Test
    public void deveSalvarUmItemPedidoNovo() {

        var itemPedido = new ItemPedido();

        itemPedido.setQuantidade(5);
        itemPedido.setValorUnitario(new BigDecimal("500.00"));

        var pedido = pedidoRepositorio.findById(1).orElseThrow();
        itemPedido.setPedido(pedido);

        var produto = produtoRepositorio.findById(1).orElseThrow();
        itemPedido.setProduto(produto);

        System.out.println("ID Antes: " + itemPedido.getId());

        itemPedidoRepositorio.save(itemPedido);

        System.out.println("ID Depois: " + itemPedido.getId());

        assertNotNull(itemPedido.getId());
        assertEquals(6, itemPedido.getId());
    }
}