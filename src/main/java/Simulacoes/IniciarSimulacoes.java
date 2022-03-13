package Simulacoes;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class IniciarSimulacoes {

    @Test
    public void IniciaSimulacoes() {

        GerarNumeros gerarNumeros = new GerarNumeros();

        List<Integer> numerosEscolhidos = gerarNumeros.sortearNumeros(6);
        List<Integer> resultadoSorteios;

        Locale localeBR = new Locale("pt","BR");
        NumberFormat formatarInteiro = NumberFormat.getNumberInstance(localeBR);
        NumberFormat percentual = NumberFormat.getPercentInstance(localeBR);



        ExecutorDeSimulacoes simular = new ExecutorDeSimulacoes();

        System.out.println("Números escolhidos: " + Arrays.toString(numerosEscolhidos.stream().sorted().toArray()));

        resultadoSorteios = simular.sorteios(numerosEscolhidos);

        int acertos0 = Collections.frequency(resultadoSorteios, 0);
        int acertos1 = Collections.frequency(resultadoSorteios, 1);
        int acertos2 = Collections.frequency(resultadoSorteios, 2);
        int acertos3 = Collections.frequency(resultadoSorteios, 3);
        int acertos4 = Collections.frequency(resultadoSorteios, 4);
        int acertos5 = Collections.frequency(resultadoSorteios, 5);
        int totalSorteios = resultadoSorteios.size();

        System.out.printf("Voce simulou %s sorteios!%n%n", formatarInteiro.format(totalSorteios));

        System.out.printf("Você não acertou nenhuma dezena em %s sorteios! %.3f%% dos sorteios!%n", formatarInteiro.format(acertos0), (float) acertos0*100 / totalSorteios);
        System.out.printf("Você acertou apenas 1 dezena em %s sorteios! %.3f%% dos sorteios!%n", formatarInteiro.format(acertos1), (float) acertos1*100 / totalSorteios);
        System.out.printf("Você acertou apenas 2 dezenas em %s sorteios! %.3f%% dos sorteios!%n", formatarInteiro.format(acertos2), (float) acertos2*100 / totalSorteios);
        System.out.printf("Você acertou o terno em %s sorteios! %.3f%% dos sorteios!%n", formatarInteiro.format(acertos3), (float) acertos3*100 / totalSorteios);
        System.out.printf("Você acertou a quadra em %s sorteios! %.4f%% dos sorteios!%n", formatarInteiro.format(acertos4), (float) acertos4*100 / totalSorteios);
        System.out.printf("Você acertou a quina em %s sorteios! %.5f%% dos sorteios!%n", formatarInteiro.format(acertos5), (float) acertos5*100 / totalSorteios);
        System.out.printf("Você acertou a mega-sena no sorteio numero %s! %.10f%% dos sorteios!", formatarInteiro.format(totalSorteios), (float) 100 / totalSorteios);
    }
}
