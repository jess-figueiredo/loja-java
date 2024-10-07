package com.projeto.demo.repositorios;
import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.demo.modelos.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long>{
//para consultar e alterar o banco de dados
}
