package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        System.out.println(FatorialDesajeitado.calcular(n));
    }
}
class FatorialDesajeitado{
    public static int calcular(int N) {
        int resultado = 0, cur = N, j = 0;
        char[] operador = new char[]{'*', '/', '+', '-'};
        for (int i = N - 1; i >= 1; --i) {
            if (operador[j] == '*') {
                cur *= i;
            } else if (operador[j] == '/') {
                cur /= i;
            } else if (operador[j] == '+') {
                resultado += i;
            } else {
                resultado += (i == N - 4) ? cur : -cur;
                cur = i;
            }
            j = (j + 1) % 4;
        }
        return resultado + ((N <= 4) ? cur : -cur);
    }
}