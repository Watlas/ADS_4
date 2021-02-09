package com.watlas.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //faz a classe virar webservice
@RequestMapping("/produto") //configura a url do webservice
public class ProdutoRest {

    @Autowired  //injeta uma instacia de produtoDao aqui se nao tiver vira null
    private ProdutoDao produtoDao;

    @GetMapping //expoe o metodo get
    public List<Produto> get(){
        return produtoDao.findAll();
    }

    @PostMapping //expoe o metodo post
    public void post(@RequestBody Produto produto){
        produtoDao.save(produto);
    }
}
