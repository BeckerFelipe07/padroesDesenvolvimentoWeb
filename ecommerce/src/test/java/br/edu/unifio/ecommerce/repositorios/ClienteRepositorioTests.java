package br.edu.unifio.ecommerce.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecommerce.entidades.Cliente;

@SpringBootTest
public class ClienteRepositorioTests {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Test
    public void deveSalvarUmClienteNovo() {

        var cliente = new Cliente();

        cliente.setNome("Felipe Becker");
        cliente.setEmail("felipe@email.com");
        cliente.setTelefone("14999999999");

        System.out.println("ID Antes: " + cliente.getId());

        clienteRepositorio.save(cliente);

        System.out.println("ID Depois: " + cliente.getId());

        assertNotNull(cliente.getId());
        assertEquals(6, cliente.getId());
    }
}