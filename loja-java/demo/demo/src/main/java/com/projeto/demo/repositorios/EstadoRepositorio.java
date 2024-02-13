package com.projeto.demo.repositorios;
import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.demo.modelos.Estado;

public interface EstadoRepositorio extends JpaRepository<Estado, Long>{
//para consultar e alterar o banco de dados
}
