package com.projeto.demo.repositorios;
import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.demo.modelos.Fornecedor;

public interface FornecedorRepositorio extends JpaRepository<Fornecedor, Long>{
//para consultar e alterar o banco de dados
}
