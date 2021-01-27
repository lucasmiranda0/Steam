package dados;

import negocio.Jogos;
import negocio.Usuario;

public class RepositorioUsuario {

    protected Usuario[] usuarios;
    protected int qtdU;
    protected Jogos[] meusJogos;
    protected int qtdJogosU;
    protected double saldo;
    
    public RepositorioUsuario() {
        this.usuarios = new Usuario[100];
        this.meusJogos = new Jogos[100];
        this.qtdU = 0;
        this.qtdJogosU = 0;
        this.saldo = 0;
    }
    
    public int procurarUsuario (int idPlayer) {
        for (int i = 0; i < qtdU; i++) {
            if (this.usuarios[i].getIdPlayer() == idPlayer) {
                return i;
            }
        }
        return -1;
    }
    
    public void addUsuario(Usuario u) {
        if (u == null || usuarios.length == qtdU || procurarUsuario(u.getIdPlayer()) != -1) {
            System.out.println("Não foi possível adicionar o usuário");
        } else {
            this.usuarios[qtdU] = u;
            qtdU++;
            System.out.println("Foi adicionado com sucesso");
        }    
    }
    
    public Usuario procurarIdUsuario(int idPlayer) {
        for (int i = 0; i < this.qtdU; i++) {
            if (this.usuarios[i].getIdPlayer() == idPlayer) {
                return this.usuarios[i];
            }
        }
        return null;
    }
    
    public void depositar(int idPlayer, double valor) {
        if (procurarIdUsuario(idPlayer) == null) {
            System.out.println("usuario inexistente");
        } else {
            procurarIdUsuario(idPlayer).setSaldo(procurarIdUsuario(idPlayer).getSaldo() + valor);
            System.out.println("Valor depositado com sucesso");
        }
    }
    
    
}
