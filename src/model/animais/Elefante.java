package model.animais;

public class Elefante extends Animal{

    private String tamanhoTromba;

    @Override
    public void emitirSom() {
        System.out.println("Barrito");
    }

    @Override
    public void mover() {
        System.out.println("Andando pesado");
    }

    @Override
    public void comer() {
        System.out.println("Comendo");
    }

    public String getTamanhoTromba() {
        return tamanhoTromba;
    }

    public void setTamanhoTromba(String tamanhoTromba) {
        this.tamanhoTromba = tamanhoTromba;
    }
}
