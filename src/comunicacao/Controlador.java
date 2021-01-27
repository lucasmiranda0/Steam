package comunicacao;

import dados.RepositorioGeral;
import negocio.Jogos;
import negocio.Usuario;

public class Controlador {
    
    public RepositorioGeral rg;
    
    public void addUsuario(Usuario u) {
        this.rg.addU(u);
    }
    
    public void exibirTodosJogos() {
        this.rg.exibirTodosJogos();
    }
    
    public void addCarinho(Jogos j) {
        this.rg.addCarrinho(j);
    }
    
    public void pagar(Usuario u) {
        this.rg.pagar(u);
    }
    
    public void addJ(Jogos j) {
        this.rg.addJ(j);
    }
    
    public void exibirCarrinho() {
        this.rg.exibirCarrinho();
    }
    
    public void depositar(int idPlayer, double valor) {
        this.rg.depositar(idPlayer, valor);
    }
}
