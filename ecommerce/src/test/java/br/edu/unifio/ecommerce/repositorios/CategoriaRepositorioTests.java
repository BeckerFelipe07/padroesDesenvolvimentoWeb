package br.edu.unifio.ecommerce.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecommerce.entidades.Categoria;

@SpringBootTest
public class CategoriaRepositorioTests {

    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    @Test
    public void deveSalvarUmaCategoriaNova() {

        var categoria = new Categoria();

        categoria.setNome("Eletrônicos");
        categoria.setDescricao("Produtos eletrônicos em geral");

        System.out.println("ID Antes: " + categoria.getId());

        categoriaRepositorio.save(categoria);

        System.out.println("ID Depois: " + categoria.getId());

        assertNotNull(categoria.getId());
        assertEquals(Short.valueOf((short) 6), categoria.getId());
    }
}