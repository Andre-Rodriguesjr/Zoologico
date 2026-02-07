package model.animais;

public abstract class Animal {
    private String nome;
    private int idade;
    private double peso;

    public abstract void emitirSom();

    public abstract void mover();

    public void comer(){}

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
