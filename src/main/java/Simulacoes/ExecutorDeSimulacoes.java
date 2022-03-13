package Simulacoes;

import java.util.ArrayList;
import java.util.List;

public class ExecutorDeSimulacoes {

    GerarNumeros gerarNumeros = new GerarNumeros();

    public List<Integer> sorteios(List<Integer> numerosEscolhidos) {

        int acertoDezenas = 0;

        List<Integer> numerosSorteados;
        List<Integer> dezenasAcertadas = new ArrayList<Integer>();

        while (acertoDezenas < 6) {

            acertoDezenas = 0;
            numerosSorteados = gerarNumeros.sortearNumeros(6);

            for (int i = 0; i < numerosSorteados.size(); i++) {
                if (numerosEscolhidos.contains(numerosSorteados.get(i))) {
                    acertoDezenas = acertoDezenas + 1;
                }
            }
            dezenasAcertadas.add(acertoDezenas);
        }

        return dezenasAcertadas;
    }
}
