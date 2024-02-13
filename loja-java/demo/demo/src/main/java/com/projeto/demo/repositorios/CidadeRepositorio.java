package com.projeto.demo.repositorios;
import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.demo.modelos.Cidade;

public interface CidadeRepositorio extends JpaRepository<Cidade, Long>{
//para consultar e alterar o banco de dados
}
