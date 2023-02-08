package edu.diojava.tiposevariaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333;
        long cpf = 98765432110L; //long precisa da identificação L
        float pi = 3.14F; //float precisa da identificação F
        double salario = 1275.33; 

        System.out.println(idade + ano + cep + cpf + pi + salario);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        System.out.println(numeroCurto2);

        final double VALOR_DE_PI = 3.14;

        System.out.println(VALOR_DE_PI);

        //sendo a variável final, não pode ser alterada
        //VALOR_DE_PI = 10.75;

    }
}
