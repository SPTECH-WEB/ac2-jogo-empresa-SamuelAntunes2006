package school.sptech;

import school.sptech.exception.ArgumentoInvalidoException;
import school.sptech.exception.JogoInvalidoException;
import school.sptech.exception.JogoNaoEncontradoException;

import java.time.LocalDate;
import java.util.List;

public class Empresa {
    public String nome;
    List<Jogo> jogos;

    public Empresa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // adicionar

   public void adicionarJogo(Jogo jogo){
        jogos.add(jogo);
   }


    // remover
    public void removerJogoPorCodigo(String codigo){
            if (codigo != null) {
                for (int i = 0; i < jogos.size();i++) {
                    for(int j =0; j < codigo.length();j++) {
                        if(codigo.equals(codigo)){
                            jogos.remove(i);
                        }
                    }
                }
            }
    }


    public List<Jogo> buscarJogoPorPeriodo(LocalDate dataInicio, LocalDate dataFim){
            for(int i =0; i< jogos.size();i++){}
        return List.of();
    }

// buscar
    public String buscarJogoPorCodigo(String codigo) {
        for (int i = 0; i<jogos.size();i++) {
                     return null;
                    }
        return codigo;
    }

    public Jogo buscarJogoComMelhorAvaliacao(){
        return null;
    }
}

