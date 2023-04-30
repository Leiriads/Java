package Fila;

import Model.User;

public class Fila {
    User[] vetor;
    User[] vetoraux; 
    User topo;
    User retorno, aux;
    public Fila(int tamanho) {
        vetor = new User[tamanho];
        vetoraux=new User[tamanho];
    }
    
   
    
    
    
    
    public void inserir(int id, String nome,String cpf,String tipousuario) {
        User user = new User();
        user.setId(id);
        user.setNome(nome);
        user.setCpf(cpf);
        user.setTipousuario(tipousuario);
        for (int i = 0; i <= vetor.length; i++) {
            if (vetor[i] == null) {
                vetor[i] = user;
                vetoraux[i] = user;
                break;
            }
        }
    }
    public User chamar() {
        if (vetor[0] != null) {
            User pessoaAtual= vetor[0];
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
                            if (vetor[i].getId() >= vetor[j].getId()) {
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
    public User [] retornavetor(){
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