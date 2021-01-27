package ui;

import comunicacao.Controlador;
import comunicacao.Contador;
import comunicacao.Fachada;
import negocio.Jogos;
import negocio.Usuario;

public class FachadaUI implements Fachada{

    private Controlador c;
    private Contador c1;
    
    public FachadaUI() {
        this.c = new Controlador();
    }
    
    @Override
    public void addUsuario(Usuario u) {
        this.c.addUsuario(u);
    }

    @Override
    public void exibirTodosJogos() {
        this.c.exibirTodosJogos();
    }

    @Override
    public void addCarinho(Jogos j) {
        this.c.addCarinho(j);
    }

    @Override
    public void pagar(Usuario u) {
        this.c.pagar(u);
    }

    @Override
    public void addJ(Jogos j) {
        this.c.addJ(j);
    }

    @Override
    public void exibirCarrinho() {
        this.c.exibirCarrinho();
    }

    @Override
    public void depositar(int idPlayer, double valor) {
        this.c.depositar(idPlayer, valor);
    }    
    
    @Override
    public void iniciaContador(){
        this.c1.start();
    }
    
    @Override 
    public void finalizaContador(){
        this.c1.stop();
    }
    
    @Override
    public int getTempo(){
       return this.c1.getTempo();
    }
}
