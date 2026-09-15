package br.edu.unifio.ecommerce.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.endsWith;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import br.edu.unifio.ecommerce.entidades.Categoria;
import br.edu.unifio.ecommerce.entidades.Produto;

@SpringBootTest
public class ProdutoRepositorioTests {

    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    @Autowired
    private ProdutoRepositorio produtoRepositorio;

    @Test
    public void deveSalvarUmProdutoNovo() {
        var produto = new Produto();
        produto.setNome("Notebook Lenovo Legion 5i");
        produto.setDescricao("Processador i7 13th, Armagenamento SSD 1TB, Memória 16GB");
        produto.setPreco(new BigDecimal(12570.30));
        produto.setEstoque(Short.parseShort("10"));

        // SELECT * FROM categoria WHERE id = 1
        var categoria = categoriaRepositorio.findById(Short.parseShort("1")).orElseThrow();
        produto.setCategoria(categoria);

        System.out.println("ID Antes: " + produto.getId());
        produtoRepositorio.save(produto);
        System.out.println("ID Depois: " + produto.getId());

        assertNotNull(produto.getId());
        assertEquals(6, produto.getId());
    }

    @Test 
    public void deveBuscarUmProdutoPorId () {
        Produto produto = produtoRepositorio.findById(Integer.parseInt("3")).orElseThrow();

        assertNotNull(produto);
        assertEquals("Fone Bluetooth", produto.getNome());
    }

    @Test 
    public void deveBuscarTodosOsProdutos () {
        produtoRepositorio.findAll(Sort);
    }
}
