package com.projeto.demo.repositorios;
import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.demo.modelos.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long>{
//para consultar e alterar o banco de dados
}
