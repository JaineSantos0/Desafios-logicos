package application;

import services.MatrizService;

public class Main {
    public static void main(String[] args) {

        Integer[][] matriz1 = null;

        Integer[][] matriz2 = {};

        Integer[][] matriz3 = new Integer[3][3];
        matriz3[0][0] = 1;
        matriz3[0][1] = 2;
        matriz3[0][2] = 3;
        matriz3[1][0] = 4;
        matriz3[1][1] = 5;
        matriz3[1][2] = 6;
        matriz3[2][0] = 7;
        matriz3[2][1] = 8;
        matriz3[2][2] = 9;

        MatrizService matrizService = new MatrizService();

        matrizService.geraMatrizInversa(matriz3);
    }
}