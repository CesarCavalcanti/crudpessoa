package br.edu.infnet.cruddepessoa.controller;

import br.edu.infnet.cruddepessoa.model.Pessoa;
import br.edu.infnet.cruddepessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @RequestMapping (method = RequestMethod.GET)
    public List<Pessoa> mostrarTodos(){
        return pessoaRepository.mostrarTodos();
    }

    @RequestMapping (method = RequestMethod.POST)
    public Pessoa salvar (@RequestBody Pessoa pessoa){
        Pessoa p = pessoaRepository.salvar(pessoa);
        return p;
    }

    @RequestMapping (method = RequestMethod.PUT)
    public Pessoa atualizar (@RequestBody Pessoa pessoa){
        Pessoa p = pessoaRepository.salvar(pessoa);
        return p;
    }

    @RequestMapping (method = RequestMethod.DELETE)
    public void deletar (@RequestBody Pessoa pessoa){
        pessoaRepository.excluir(pessoa);
    }

    @GetMapping (value = "/{id}")
    public Pessoa buscarPorId (@PathVariable Integer id){
        return pessoaRepository.procurarPorId(id);
    }
}
