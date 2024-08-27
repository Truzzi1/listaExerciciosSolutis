package zoologico;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    public List<Animal> jaulas = new ArrayList<>();

    Zoologico() {

    }

    public void percorrer() {
        for (int i = 0; i < jaulas.toArray().length; i++) {
            Animal animal = jaulas.get(i);
            animal.emitirSom();
            if (animal.movimentarse().equals("Correndo")) {
                System.out.println(animal.nome + " está correndo");
            }
        }
    }

    public void adicionarJaulas(Animal animal) {
        jaulas.add(animal);
    }
}
