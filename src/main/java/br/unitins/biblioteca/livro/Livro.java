package br.unitins.biblioteca.livro;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Livro {
    @Id
    Long idlivro;
    String titulo;
    String autor;
    String editora;
    int qtdPaginas;
}
