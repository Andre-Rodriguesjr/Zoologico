package model.animais;

public class Leao extends Animal{
    private String forcaModida;

    @Override
    public void emitirSom() {
        System.out.println("Rugido");
    }

    @Override
    public void mover() {
        System.out.println("Correndo");
    }

    @Override
    public void comer() {
        System.out.println("Comendo");
    }

    public String getForcaModida() {
        return forcaModida;
    }

    public void setForcaModida(String forcaModida) {
        this.forcaModida = forcaModida;
    }
}
