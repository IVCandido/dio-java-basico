package edu.diojava.sintaxejava;
public class MinhaClasse {

    public static void main(String[] args) {
        //Impressão de texto na tela
        System.out.println("Primeira classe criada com método executável");

        //keyword final impede mudança no valor da variável
        final String BR = "Brasil";

        System.out.println(BR);

        String primeiroNome = "Ivis";
        String segundoNome = "Vinícius";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
    
}