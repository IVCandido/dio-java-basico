package edu.diojava.operadores;

public class Operadores {
    public static void main(String[] args) {
        //'=' Possui a função de atribuição de valores inicias ou substituir valores de variáveis
        String nome = "Ivis Vinícius";
        int idade = 25;
        char sexo = 'M';

        //Operadores Aritméticos
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int resto = 18 % 3;
        double resultado = (10 * 7) + (20/4);

        //Concatenação
        String concatenacao = "?";

        concatenacao = 1+1+1+"1"; //31
        concatenacao = 1+"1"+1+1; //1111
        concatenacao = 1+"1"+1+"1"; //1111
        concatenacao = "1"+1+1+1; //1111

        //Operadores unários  
        int numero = 5;
        System.out.println(- numero); //imprime o valor da variável numero multiplicado por -1 sem alterar o valor dentro da variável
        numero = - numero; //altera o valor da variável numero para o valor destam multiplicado por -1

        numero++; //incrementa o valor da variável numero em 1
        System.out.println(numero++); //imprime o valor atual da variável e após isso incrementa em 1 seu valor
        System.out.println(++numero); //incrementa o valor da variável em 1 e após isso imprime seu valor

        boolean variavel = false;

        variavel = !variavel;

        //Operadores ternários
        //Forma resumida para definir uma condição e escolher um entre dois valores
        //<expressão condicional> ? <Caso condição verdadeira> : <Caso condição falsa>
        int a = 6, b = 6;

        String testeLogico = (a==b) ? "verdadeiro" : "falso";
        System.out.println(testeLogico);

        //Operadores relacionais
        int numero1 = 1, numero2 = 2;

        System.out.println((numero1==numero2)?"Iguais":"Diferentes");
        System.out.println((numero1>numero2)?"numero1 maior":"numero2 maior");
        System.out.println((numero1<numero2)?"numero1 menor":"numero2 menor");
        System.out.println((numero1!=numero2)?"Diferentes":"Iguais");

        String nome1 = "Java";
        String nome2 = "JAVA";

        System.out.println(nome1 == nome2); //false

        String nome3 = new String("JAVA");

        System.out.println(nome2 == nome3); //false

        //Função equals avalia o conteúdo das variáveis, funciona de maneira diferente da expressão ==. == é mais recomendado para comparar números, equals é mais recomendado para comparar strings
        System.out.println(nome2.equals(nome3)); //true 

        //Operadores Lógicos
        boolean valorUm = true, valorDois = false;

        System.out.println((valorUm && valorDois));
        System.out.println((valorUm || valorDois));
        
    }
}
