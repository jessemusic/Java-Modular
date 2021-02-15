package digital.innovation.one.jesse.operacao.interno;

import digital.innovation.one.jesse.operacao.Operacao;

public class MultHelper implements Operacao {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
