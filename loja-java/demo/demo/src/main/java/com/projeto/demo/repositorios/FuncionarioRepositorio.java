package com.projeto.demo.repositorios;
import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.demo.modelos.Funcionario;

public interface FuncionarioRepositorio extends JpaRepository<Funcionario, Long>{
//para consultar e alterar o banco de dados
}
