package digital.innovation.one.jesse.operacao.interno;

import digital.innovation.one.jesse.operacao.Operacao;

public class DivHelper implements Operacao {
    @Override
    public int execute(int a, int b) {
        return a / b;
    }
}
