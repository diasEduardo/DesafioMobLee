package br.com.timeba.eduardo.desafiomoblee;

import java.util.List;

/**
 * Created by EDUARDO on 13/03/2016.
 */
public class Questao {
    final String title,score;
  final Criador owner;

    Questao(String titulo,Criador criador,String votos){
        this.title=titulo;
       owner=criador;
        this.score=votos;
    };


}
