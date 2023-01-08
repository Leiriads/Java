package Fila;

public class Fila {
    Pessoa[] vetor;
    Pessoa[] vetoraux; 
    Pessoa topo;
    Pessoa retorno, aux;
    public Fila(int tamanho) {
        vetor = new Pessoa[tamanho];
        vetoraux=new Pessoa[tamanho];
    }
    public void inserir(String nome, int idade,String hora) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setIdade(idade);
        pessoa.setHora(hora);
        for (int i = 0; i <= vetor.length; i++) {
            if (vetor[i] == null) {
                vetor[i] = pessoa;
                vetoraux[i] = pessoa;
                break;
            }
        }
    }
    public Pessoa chamar() {
        if (vetor[0] != null) {
            Pessoa pessoaAtual= vetor[0];
            topo = pessoaAtual;
            for (int i = 0; i < vetor.length; i++) {
                if (i + 1 < vetor.length) {
                    vetor[i] = vetor[i + 1];
                } 
            }
        } else{
            topo=null;
        }
        return topo;
    }
    public void ordena() {
        if (vetor[0] != null) {
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] != null) {
                    for (int j = 0; j < vetor.length; j++) {
                        if (vetor[j] != null) {
                            if (vetor[i].getIdade() >= vetor[j].getIdade()) {
                                aux = vetor[i];
                                vetor[i] = vetor[j];
                                vetor[j] = aux;
                            }
                        }
                    }
                }
            }

        }

    }
    public Pessoa [] retornavetor(){
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != null) {
                return vetor;
            }else{
                return null;
            }
        }
      return null;
    }
}