// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

/*
Desafio
Dada uma string com apenas os seguintes caracteres '(', ')', '{', '}', '[', ']'
determine se uma determinada string é válida.

Entrada
Uma string é considerada válida se:
Caracteres de abertura devem ser fechadas pelo mesmo tipo.
Abertura devem ser fechados com uma chave correspondente. Uma string vazia é considerada válida.

Saída
A saída corresponde a um valor Booleano como no exemplo abaixo:
 */

package org.example;

import java.util.*;

public class ValidacaoParenteses {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
      return ((s.startsWith("(") && s.endsWith(")")) || (s.startsWith("{") && s.endsWith("}") || (s.startsWith("[") && (s.endsWith("]")))));
        }
}


