package Model;

public class Questao {
    private int id;
    private String enunciado;
    private char respostaCorreta;
    private float pesoQuestao;
    private char respostaAluno;

    
    public void setQuestao(int id, String enunciado, char respostaCorreta, float pesoQuestao) {
        this.id = id;
        this.enunciado = enunciado;
        this.respostaCorreta = respostaCorreta;
        this.pesoQuestao = pesoQuestao;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public char getRespostaCorreta() {
        return respostaCorreta;
    }

    public void setRespostaCorreta(char respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }

    public float getPesoQuestao() {
        return pesoQuestao;
    }

    public void setPesoQuestao(float pesoQuestao) {
        this.pesoQuestao = pesoQuestao;
    }

    public char getRespostaAluno() {
        return respostaAluno;
    }

    public void setRespostaAluno(char respostaAluno) {
        this.respostaAluno = respostaAluno;
    }
}
