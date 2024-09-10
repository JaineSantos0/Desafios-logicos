package application;

import services.ResistorService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String valorEmOhms = sc.nextLine();

        ResistorService resistorService = new ResistorService();

        resistorService.converteValorDoResistor(valorEmOhms);
    }
}