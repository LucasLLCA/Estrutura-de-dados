import java.util.Stack;

class Caminhao {
    // Propriedades da classe Caminhão
}

class Entrega {
    /**
     *
     */
    private int nivelCriticidade;
    

    public Entrega(int nivelCriticidade) {
        this.nivelCriticidade = nivelCriticidade;
        this.nivelCriticidade = nivelCriticidade;
    }

    public int getNivelCriticidade() {
        return nivelCriticidade;
    }

    public void setNivelCriticidade(int nivelCriticidade) {
        this.nivelCriticidade = nivelCriticidade;
    }

    // Outras propriedades e métodos da classe Entrega
}

public class Logistica {
    private Stack<Caminhao> pilhaCaminhoes;
    private Stack<Entrega> pilhaEntregas;

    public Logistica() {
        this.pilhaCaminhoes = new Stack<Caminhao>();
        this.pilhaEntregas = new Stack<Entrega>();
    }

    public void inserirCaminhao(Caminhao caminhao) {
        this.pilhaCaminhoes.push(caminhao);
    }

    public Caminhao removerCaminhao() {
        return this.pilhaCaminhoes.pop();
    }

    public void inserirEntrega(Entrega entrega) {
        this.pilhaEntregas.push(entrega);
    }

    public Entrega removerEntrega() {
        return this.pilhaEntregas.pop();
    }

    public void priorizarEntregas() {
        // Ordena as entregas por nível de criticidade, da mais crítica para a menos crítica
        this.pilhaEntregas.sort((e1, e2) -> e2.getNivelCriticidade() - e1.getNivelCriticidade());
    }
}
