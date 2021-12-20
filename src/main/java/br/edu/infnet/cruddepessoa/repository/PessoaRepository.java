package br.edu.infnet.cruddepessoa.repository;

import br.edu.infnet.cruddepessoa.model.Pessoa;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Component
public class PessoaRepository {

    private static Map<Integer, Pessoa> pessoaMap = new HashMap<>();


    private Integer nextId(){
        Integer max = 0;
        Set<Integer> integers = pessoaMap.keySet();
        if(integers != null){
            for(Integer i : integers){
                if(i > max){
                    max = i;
                }
            }
        }
        return (max + 1);

    }

    public Pessoa procurarPorId(Integer id){
        if (id != null && pessoaMap.containsKey(id)){
            return pessoaMap.get(id);
        }
        return null;
    }

    public List<Pessoa> mostrarTodos(){
        Collection <Pessoa> pessoaCollection = pessoaMap.values();
        List<Pessoa> pessoaList = new ArrayList<>(pessoaCollection);
        return pessoaList;
    }
    public void excluir (Pessoa pessoa){
        if(pessoa != null){
            pessoaMap.remove(pessoa.getId());
        }
    }

    public Pessoa salvar (Pessoa pessoa){
        if (pessoa != null){
            if (pessoa.getId() == null){
                Integer id = nextId();
                pessoa.setId(id);
                pessoaMap.put(id,pessoa);
                return pessoa;
            } else {
                Pessoa p = procurarPorId(pessoa.getId());
                if(p != null){
                    p.copíarValoresDe(pessoa);
                    return p;
                }
            }
        }
        return null;
    }

}
