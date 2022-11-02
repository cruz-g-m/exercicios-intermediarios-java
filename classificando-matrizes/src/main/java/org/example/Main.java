package org.example;

/*
Desafio
Dado um array inteiro nums, mova todos os inteiros pares no início do array seguido por
todos os inteiros ímpares.

Retorne um array que satisfaça essa condição.

Entrada
A primeira linha da entrada deverá conter um inteiro que corresponda ao tamanho do array.
As linhas seguintes deverão conter os valores que esse array receberá.

Saída
A saída deverá retornar todos os valores pares para o começo do array, seguido pelos ímpares,
 */

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] nums = new int[N];
        for (int j = 0; j < nums.length; j++) {
            nums[j] = input.nextInt();
        }
        for (int j = 0, p = 0; j < nums.length; j++) {
            if (nums[j] % 2 == 0) {
                int temp = nums[j];
                nums[j] = nums[p];
                nums[p++] = temp;
            }
        }
        for (int j = 0; j < nums.length; System.out.println(nums[j++])) ;
    }
}