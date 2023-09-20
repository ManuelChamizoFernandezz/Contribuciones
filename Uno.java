package Uno;
/*Escribe un programa que imprima "Hola, mundo!" en la consola.*/

import java.util.Scanner;

public class Uno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in());
        System.out.println("Introduce num 1: ");
        int uno = sc.nextInt();
        System.out.println("Segundo numero: ");
        int dos = sc.nextInt();
        int suma = (uno + dos);
    }
}
