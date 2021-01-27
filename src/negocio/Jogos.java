package negocio;

public class Jogos {
    
    protected String nomeJogo;
    protected int id;
    protected double preco;

    public Jogos(String nomeJogo, int id, double preco) {
        this.nomeJogo = nomeJogo;
        this.id = id;
        this.preco = preco;
    }

    public String getNomeJogo() {
        return nomeJogo;
    }

    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }        

    @Override
    public String toString() {
        return nomeJogo + ", ID = " + id + ", preço = " + preco + '}';
    }
        
}
