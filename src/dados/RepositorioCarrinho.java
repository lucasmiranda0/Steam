package dados;

import negocio.Jogos;

public class RepositorioCarrinho {

    protected Jogos[] carrinho;
    protected int qtdItens;
    protected double total;

    public RepositorioCarrinho() {
        carrinho = new Jogos[20];
        qtdItens = 0;
        total = 0;
    }

    public void exibirCarrinho() {
        for (int i = 0; i < this.qtdItens; i++) {
            System.out.println(this.carrinho[i]);
        }
    }

    public double getTotal() {
        return total;
    }

    public void zerar() {
        for (int i = 0; i < qtdItens; i++) {
            this.carrinho[i] = null;
        }
        this.qtdItens = 0;
        this.total = 0;
    }
}
