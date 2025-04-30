package br.unitins.biblioteca.livro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class LivroController {

    @Autowired
    LivroService livroService;

    @GetMapping("/Livros")
    List<Livro> pegarLivros(){
        return livroService.getLivros();
    }
}
