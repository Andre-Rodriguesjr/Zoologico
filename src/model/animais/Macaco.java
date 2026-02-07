package model.animais;

public class Macaco extends Animal{

    private int nivelEscalada;

    @Override
    public void emitirSom() {
        System.out.println("Gritos");
    }

    @Override
    public void mover() {
        System.out.println("Pulando nas árvores");
    }

    @Override
    public void comer() {
        System.out.println("Comendo");
    }

    public int getNivelEscalada() {
        return nivelEscalada;
    }

    public void setNivelEscalada(int nivelEscalada) {
        this.nivelEscalada = nivelEscalada;
    }
}
