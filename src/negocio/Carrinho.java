package negocio;

public class Carrinho {

    protected Jogos[] carrinho;
    protected int qtdItens;
    protected double total;

    public Carrinho() {
        carrinho = new Jogos[20];
        qtdItens = 0;
        total = 0;
    }

    public Jogos[] getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Jogos[] carrinho) {
        this.carrinho = carrinho;
    }

    public int getQtdItens() {
        return qtdItens;
    }

    public void setQtdItens(int qtdItens) {
        this.qtdItens = qtdItens;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }        
}
