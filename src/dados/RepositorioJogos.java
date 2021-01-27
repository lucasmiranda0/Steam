package dados;

import negocio.Jogos;

public class RepositorioJogos {
    
    protected Jogos[] jogos;
    protected int qtdJogos;
    
    public RepositorioJogos() {
        this.jogos = new Jogos[100];
        this.qtdJogos = 0;
    }
    
    public void addJ(Jogos j) {
        if (j == null || jogos.length == qtdJogos || procurarJogos(j.getId()) != -1) {
            System.out.println("Não foi possível adicionar o jogo");
        } else {
            this.jogos[qtdJogos] = j;
            qtdJogos++;
            System.out.println("Foi adicionado com sucesso");
        }    
    }
    
    public int procurarJogos (int id) {
        for (int i = 0; i < qtdJogos; i++) {
            if (this.jogos[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }
    
    public void exibirTodosJogos() {
        for (int i = 0; i < this.qtdJogos; i++) {
            System.out.println(this.jogos[i]);
        }
    }
    
    public Jogos procurarIdJogo(int id) {
        for (int i = 0; i < qtdJogos; i++) {
            if (this.jogos[i].getId() == id) {
                return this.jogos[i];
            }
        }
        return null;
    }
}
