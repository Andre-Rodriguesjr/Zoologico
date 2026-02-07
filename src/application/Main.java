package application;

import model.animais.Elefante;
import model.animais.Leao;
import model.animais.Macaco;
import model.funcionario.Veterinario;
import zoologico.Zoologico;

public class Main {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();
        Leao l = new Leao();
        Elefante e = new Elefante();
        Macaco m = new Macaco();

        l.setNome("Simba");
        l.setIdade(10);
        l.setPeso(200);
        l.setForcaModida("650 PSI");
        l.emitirSom();
        l.mover();
        l.comer();
        System.out.println("");

        zoo.adicionarAnimal(l);

        e.setNome("Théo");
        e.setIdade(60);
        e.setPeso(4000);
        e.setTamanhoTromba("200 metros");
        e.emitirSom();
        e.mover();
        e.comer();
        System.out.println("");

        zoo.adicionarAnimal(e);

        m.setNome("César");
        m.setIdade(40);
        m.setPeso(200);
        m.setNivelEscalada(10);
        m.emitirSom();
        m.mover();
        m.comer();
        System.out.println("");

        zoo.adicionarAnimal(m);

        zoo.listarAnimais();
        zoo.alimentarTodos();

        Veterinario v = new Veterinario("André");
        v.tratar();
    }
}