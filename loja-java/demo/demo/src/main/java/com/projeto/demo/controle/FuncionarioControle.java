package com.projeto.demo.controle;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.projeto.demo.modelos.Funcionario;
import com.projeto.demo.repositorios.FuncionarioRepositorio;
import com.projeto.demo.repositorios.CidadeRepositorio;

@Controller
public class FuncionarioControle {
	
	@Autowired 
	private FuncionarioRepositorio funcionarioRepositorio;
	@Autowired 
	private CidadeRepositorio cidadeRepositorio;
	
	@GetMapping("/cadastroFuncionario")
	public ModelAndView cadastrar(Funcionario funcionario) {
		ModelAndView mv = new ModelAndView("administrativo/funcionarios/cadastros");
		mv.addObject("funcionario", funcionario);
		mv.addObject("listaCidades", cidadeRepositorio.findAll());
		return mv;
	}
	
	@GetMapping("/listarFuncionario")
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("administrativo/funcionarios/lista");
		mv.addObject("listaFuncionarios", funcionarioRepositorio.findAll());
		return mv;
	}
	
	@GetMapping("/editarFuncionario/{id}")
	public ModelAndView editar(@PathVariable("id") Long id) {
		Optional<Funcionario> funcionario = funcionarioRepositorio.findById(id);
		return cadastrar(funcionario.get());
	}
	
	@GetMapping("/removerFuncionario/{id}")
	public ModelAndView remover(@PathVariable("id") Long id) {
		Optional<Funcionario> funcionario = funcionarioRepositorio.findById(id);
		funcionarioRepositorio.delete(funcionario.get());
		return listar();
	}
	
	@PostMapping("/salvarFuncionario")
	public ModelAndView salvar(Funcionario funcionario, BindingResult result) {
		if(result.hasErrors()) {
			return cadastrar(funcionario);
		}
		funcionarioRepositorio.saveAndFlush(funcionario);
		return cadastrar(new Funcionario());
	}

	public CidadeRepositorio getCidadeRepositorio() {
		return cidadeRepositorio;
	}

	public void setCidadeRepositorio(CidadeRepositorio cidadeRepositorio) {
		this.cidadeRepositorio = cidadeRepositorio;
	}
}
