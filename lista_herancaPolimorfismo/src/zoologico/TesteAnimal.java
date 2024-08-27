package zoologico;

public class TesteAnimal {

  public static void main(String[] args) {
    Veterinario veterinario = new Veterinario();

    Cachorro cachorro1 = new Cachorro("Pastor Alemão", 4, true);
    veterinario.examinar(cachorro1);
    Cachorro cachorro2 = new Cachorro("Golden Retriever", 5, true);
    veterinario.examinar(cachorro2);
    Cavalo cavalo1 = new Cavalo("Mustang", 3, true);
    veterinario.examinar(cavalo1);
    Cavalo cavalo2 = new Cavalo("Quarto de Milha", 4, true);
    veterinario.examinar(cavalo2);
    Preguica preguica1 = new Preguica("Preguiça Real", 6, true);
    veterinario.examinar(preguica1);
    Preguica preguica2 = new Preguica("Preguiça de Coleira", 3, true);
    veterinario.examinar(preguica2);
    Cachorro cachorro3 = new Cachorro("Beagle", 2, false);
    veterinario.examinar(cachorro3);
    Cavalo cavalo3 = new Cavalo("Árabe", 5, false);
    veterinario.examinar(cavalo3);
    Preguica preguica3 = new Preguica("Preguiça de Bradipo", 4, true);
    veterinario.examinar(preguica3);
    Cachorro cachorro4 = new Cachorro("Bulldog", 3, true);
    veterinario.examinar(cachorro4);

    Zoologico zoologico = new Zoologico();
    zoologico.adicionarJaulas(cachorro1);
    zoologico.adicionarJaulas(cachorro2);
    zoologico.adicionarJaulas(cavalo1);
    zoologico.adicionarJaulas(cavalo2);
    zoologico.adicionarJaulas(preguica1);
    zoologico.adicionarJaulas(preguica2);
    zoologico.adicionarJaulas(cachorro3);
    zoologico.adicionarJaulas(cavalo3);
    zoologico.adicionarJaulas(preguica3);
    zoologico.adicionarJaulas(cachorro4);

    zoologico.percorrer();
  }
}
