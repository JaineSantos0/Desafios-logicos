package services;

import java.util.Map;

public class ResistorService {

    public void converteValorDoResistor(String valorEmOhms) {
        String valorSemOhms = extraiPrimeiroValor(valorEmOhms);

        Integer[] numeros = new Integer[3];
        if (valorSemOhms.endsWith("k")) {
            numeros = calculaValorEmKiloOhms(valorSemOhms);
        } else if (valorSemOhms.endsWith("M")) {
            numeros = calculaValorEmMegaOhms(valorSemOhms);
        }
        else {
            if (Integer.parseInt(valorSemOhms) < 100) {
                numeros = calculaValorMenorQueCemOhms(valorSemOhms);
            } else if (Integer.parseInt(valorSemOhms) > 100) {
                numeros = calculaValorMaiorQueCem(valorSemOhms);
            }
        }

        imprimeCoresDoResistor(numeros);
    }


    private String extraiPrimeiroValor(String valorEmOhms) {
        return valorEmOhms.split(" ")[0];
    }

    private Integer[] calculaValorEmKiloOhms(String valorEmOhms) {
        double valorConvertido = Double.parseDouble(valorEmOhms.replace("k", ""));

        Integer[] numeros = new Integer[3];
        numeros[0] = (int) (valorConvertido);
        numeros[1] = ((int) (valorConvertido * 10)) % 10;
        numeros[2] = 2;

        return numeros;
    }

    private Integer[] calculaValorEmMegaOhms(String valorEmOhms) {
        double valorConvertido = Double.parseDouble(valorEmOhms.replace("M", ""));

        Integer[] numeros = new Integer[3];
        numeros[0] = (int) (valorConvertido);
        numeros[1] = ((int) (valorConvertido * 10)) % 10;
        numeros[2] = 5;

        return numeros;
    }

    private Integer[] calculaValorMaiorQueCem(String valorEmOhms) {
        int valorConvertido = Integer.parseInt(valorEmOhms);

        Integer[] numeros = new Integer[3];
        numeros[0] = valorConvertido / 100;
        numeros[1] = (valorConvertido / 10) % 10;
        numeros[2] = 1;

        return numeros;
    }

    private Integer[] calculaValorMenorQueCemOhms(String valorEmOhms) {
        int valorConvertido = Integer.parseInt(valorEmOhms);

        Integer[] numeros = new Integer[3];
        numeros[0] = valorConvertido / 10;
        numeros[1] = valorConvertido % 10;
        numeros[2] = 0;

        return numeros;
    }

    private void imprimeCoresDoResistor(Integer[] valorResistor) {

        Map<Integer, String> codigoDeCoresMap = Map.of(
                0, "preto",
                1, "marrom",
                2, "vermelho",
                3, "laranja",
                4, "amarelo",
                5, "verde",
                6, "azul",
                7, "violeta",
                8, "cinza",
                9, "branco"
        );

        System.out.println(String.format(
                "%s %s %s dourado",
                codigoDeCoresMap.get(valorResistor[0]),
                codigoDeCoresMap.get(valorResistor[1]),
                codigoDeCoresMap.get(valorResistor[2])
        ));
    }
}
