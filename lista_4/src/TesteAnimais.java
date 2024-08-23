public class TesteAnimais {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Heitor", 3, "Residencial", 0.5, 20);
        dog.moverse(100);

        Elefante elef = new Elefante("Pedro", 10, "Savanas", 3.0, 5000);
        elef.moverse(50);

        Gato cat = new Gato("Denis", 2, "Residencial", 0.25, 4.5);
        cat.moverse(100);

        Leao lion = new Leao("Diego", 5, "Savanas", 1.2, 190);
        lion.moverse(500);

        Peixe fish = new Peixe("Nemo", 1, "Aquário", 0.1, 0.05, 0.02);
        fish.moverse(300);

        Pombo pigeon = new Pombo("Pix", 2, "Urbano", 0.3, 0.3, 0.7);
        pigeon.moverse(1900);
    }
}
