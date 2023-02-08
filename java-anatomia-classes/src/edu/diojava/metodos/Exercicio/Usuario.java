package edu.diojava.metodos.Exercicio;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.estaLigada);
        System.out.println("Canal Atual: " + smartTv.canalAtual);
        System.out.println("Volume atual: " + smartTv.volumeAtual);
        System.out.println("-----------------");

        smartTv.ligarTv();
        smartTv.aumentarVolume();
        smartTv.definirCanal(43);
        
        System.out.println("TV Ligada? " + smartTv.estaLigada);
        System.out.println("Canal Atual: " + smartTv.canalAtual);
        System.out.println("Volume atual: " + smartTv.volumeAtual);
    }
    
}
