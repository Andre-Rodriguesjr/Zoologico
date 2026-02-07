package zoologico;

import model.animais.Animal;
import model.funcionario.Veterinario;

import java.util.ArrayList;

public class Zoologico {
    private ArrayList<Animal> animais = new ArrayList<>();
    private ArrayList<Veterinario> funcionarios = new ArrayList<>();

    public Zoologico(ArrayList<Animal> animais) {
        this.animais = animais;
    }

    public Zoologico() {

    }

    // 🐾 adicionar animal
    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
        System.out.println("Animal adicionado da especie de:  "+animal.getClass().getSimpleName()+". O nome dele é: " + animal.getNome());
    }

    // 📋 listar model.animais
    public void listarAnimais() {
        System.out.println("Animais no zoológico:");

        for (Animal a : animais) {
            System.out.println("- " + a.getNome() + " É um: " + a.getClass().getSimpleName());
        }
    }

    // 🍖 alimentar todos (polimorfismo)
    public void alimentarTodos() {
        System.out.println("Alimentando model.animais...");

        for (Animal a : animais) {
            System.out.println("O " + a.getNome() + " Está comendo: " ); a.comer(); // cada animal executa seu próprio comportamento
        }
    }

}
