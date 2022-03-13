package Simulacoes;

import java.util.ArrayList;
import java.util.List;

public class GerarNumeros {

    public List<Integer> sortearNumeros(int dezenas) {
        List<Integer> numerosSorteados = new ArrayList<Integer>();
        numerosSorteados.addAll(gerarSeisNumeros(dezenas, 1, 60));

        return numerosSorteados;

    }

    public List<Integer> gerarSeisNumeros(int dezenas, int min, int max) {

        List<Integer> numerosGerados = new ArrayList<Integer>();

        while (numerosGerados.size() < dezenas) {

            int numeroSorteado = gerarNumero(min, max);
            if(!numerosGerados.contains(numeroSorteado)){
             numerosGerados.add(numeroSorteado);
            }
        }

        return numerosGerados;
    }

    public int gerarNumero(int min, int max) {

        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }
}
