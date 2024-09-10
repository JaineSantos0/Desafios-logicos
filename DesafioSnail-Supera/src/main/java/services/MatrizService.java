package services;

import java.util.ArrayList;
import java.util.List;

public class MatrizService {

    public void geraMatrizInversa(Integer[][] matriz) {

        List<Integer> listaInteiros = new ArrayList<>();

        if (!retornaMatrizNula(matriz)) {

            int totalLinhas = matriz.length;
            int totalColunas = matriz[0].length;
            int topo = 0;
            int baixo = matriz.length - 1;
            int esquerda = 0;
            int direita = matriz[0].length - 1;

            while (topo <= baixo && esquerda <= direita) {

                for (int i = esquerda; i <= direita; i++) {
                    listaInteiros.add(matriz[topo][i]);
                }
                topo++;

                for (int i = topo; i <= baixo; i++) {
                    listaInteiros.add(matriz[i][direita]);
                }
                direita--;

                if (topo <= baixo) {

                    for (int i = direita; i >= esquerda; i--) {
                        listaInteiros.add(matriz[baixo][i]);
                    }
                    baixo--;
                }

                if (esquerda <= direita) {

                    for (int i = baixo; i >= topo; i--) {
                        listaInteiros.add(matriz[i][esquerda]);
                    }
                    esquerda++;
                }
            }

            Integer[][] matrizInvertida = transformaListaEmMatriz(totalLinhas, totalColunas, listaInteiros);
            imprimiMatriz(matrizInvertida);
        }
        System.out.println(" ");
    }

    private Boolean retornaMatrizNula(Integer[][] matriz) {
        return matriz == null || matriz.length == 0 || matriz[0].length == 0;
    }

    private Integer[][] transformaListaEmMatriz(int totalLinhas,int totalColunas, List<Integer> listaInteiros) {
        Integer[][] matriz = new Integer[totalLinhas][totalColunas];
        int index = 0;

        for(int i = 0; i < totalLinhas; i++) {
            for (int j = 0; j < totalColunas; j++) {
                matriz[i][j] = listaInteiros.get(index++);
            }
        }

        return matriz;
    }

    private void imprimiMatriz(Integer[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("| " + matriz[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
