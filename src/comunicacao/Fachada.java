package comunicacao;

import negocio.Jogos;
import negocio.Usuario;

public interface Fachada {
    
    public void addUsuario(Usuario u);
    
    public void exibirTodosJogos();
    
    public void addCarinho(Jogos j);
    
    public void pagar(Usuario u);
    
    public void addJ(Jogos j);
    
    public void exibirCarrinho();
    
    public void depositar(int idPlayer, double valor);
    
    public void iniciaContador();
    
    public void finalizaContador();        
    
    public int getTempo();
}
