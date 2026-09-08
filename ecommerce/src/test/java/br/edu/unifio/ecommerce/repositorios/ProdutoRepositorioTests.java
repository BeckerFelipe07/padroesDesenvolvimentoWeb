package br.edu.unifio.ecommerce.repositorios;

import java.math.BigDecimal;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
    }
}
