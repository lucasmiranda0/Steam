package dados;

import negocio.Jogos;
import negocio.Usuario;

/*  Fachada --> controladorGeral --> repositórioGeral
    Dentro de fachada: ControladorGeral
    Dentro de controladorGeral: repositórioGeral
    Dentro de repositórioGeral: todos os outros repositórios
 */
public class RepositorioGeral {

    private RepositorioUsuario repU;
    private RepositorioJogos repJ;
    private RepositorioCarrinho repC;

    public void addU(Usuario u) {
        this.repU.addUsuario(u);
    }

    public void addJ(Jogos j) {
        this.repJ.addJ(j);
    }

    public void exibirTodosJogos() {
        this.repJ.exibirTodosJogos();
    }

    public void exibirCarrinho() {
        this.repC.exibirCarrinho();
    }

    public void addCarrinho(Jogos j) {
        if (repJ.procurarJogos(j.getId()) != -1) {
            this.repC.carrinho[repC.qtdItens] = repJ.procurarIdJogo(j.getId());
            this.repC.qtdItens++;
            this.repC.total = this.repC.total + this.repC.carrinho[this.repC.qtdItens - 1].getPreco();
            
        } else {
            System.out.println("Não é possível adicionar jogo ao carrinho");
            
        }
    }

    public void depositar(Usuario u, double v) {
        this.repU.depositar(u.getIdPlayer(), v);
    }

    public void pagar(Usuario u) {
        if (this.repU.procurarUsuario(u.getIdPlayer()) == -1 || this.repU.procurarIdUsuario(u.getIdPlayer()) == null) {
            System.out.println("Usuário não existente");
        } else {
            if (this.repU.procurarIdUsuario(u.getIdPlayer()).getSaldo() >= this.repC.getTotal()) {
                this.repU.procurarIdUsuario(u.getIdPlayer()).setSaldo(this.repU.procurarIdUsuario(u.getIdPlayer()).getSaldo() - this.repC.total);
                for (int i = 0; i < this.repC.qtdItens; i++) {
                    this.repU.procurarIdUsuario(u.getIdPlayer()).addJogoConta(this.repC.carrinho[i]);
                }
                System.out.println("Compra efetuada com sucesso");
                repC.zerar();
            } else {
                System.out.println("Não há saldo");
            }
        }
    }
    
    public void depositar(int idPlayer, double valor) {
        if (this.repU.procurarIdUsuario(idPlayer) == null) {
            System.out.println("usuario inexistente");
        } else {
            this.repU.procurarIdUsuario(idPlayer).setSaldo(this.repU.procurarIdUsuario(idPlayer).getSaldo() + valor);
            System.out.println("Valor depositado com sucesso");
        }
    }

}
