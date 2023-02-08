package edu.diojava.metodos.Exercicio;

public class SmartTv {
    boolean estaLigada = false;
    int canalAtual = 1, volumeAtual = 25;

    public void ligarTv(){
        estaLigada = true;
    }

    public void desligarTv(){
        estaLigada = false;
    }

    public void aumentarVolume(){
        volumeAtual++;
    }

    public void diminuirVolume(){
        volumeAtual--;
    }

    public void aumentarCanal(){
        canalAtual++;
    }

    public void diminuirCanal(){
        canalAtual--;
    }

    public void definirCanal(int novoCanal){
        canalAtual = novoCanal;
    }
}
