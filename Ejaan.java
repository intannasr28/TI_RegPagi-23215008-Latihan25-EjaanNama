package pert6;

import java.util.Scanner;

public class Ejaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama depan Anda untuk dieja: ");
        String nama = input.nextLine();

        System.out.println("\nEjaan untuk nama \"" + nama + "\" adalah:");

        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + nama.charAt(i));
        }
    }
}
