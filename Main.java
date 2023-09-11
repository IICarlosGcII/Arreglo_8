import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];
        int ultimo;

        System.out.println("Guardando los datos del arreglo...");
        for (int i = 0; i < 10; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite los 10 números del arreglo: "));
        }
        ultimo = arreglo[0]; // Guarda el primer elemento antes de la rotación

        for (int i = 0; i < 9; i++) {
            arreglo[i] = arreglo[i + 1]; // Mueve cada elemento una posición a la izquierda
        }
        arreglo[9] = ultimo; // Coloca el primer elemento al final después de la rotación

        System.out.println("Los datos del arreglo son: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arreglo[i] + " - ");
        }
    }
}