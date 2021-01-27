package negocio;

public class Usuario {

    protected String nome;
    protected double saldo;
    protected Jogos[] meusJogos;
    protected int idPlayer;
    protected int qtd;

    public Usuario(String nome, int idPlayer) {

        this.nome = nome;
        this.saldo = 0;
        this.idPlayer = idPlayer;
        meusJogos = new Jogos[100];
        this.qtd = 0;
    }
    
    public void addJogoConta(Jogos j) {
        this.meusJogos[qtd] = j;
        this.qtd++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Jogos[] getMeusJogos() {
        return meusJogos;
    }

    public void setMeusJogos(Jogos[] meusJogos) {
        this.meusJogos = meusJogos;
    }

    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}
