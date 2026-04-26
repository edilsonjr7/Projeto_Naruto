public class Yuga extends Ninja{

    private String animalInvocado;

    public Yuga(String nome, String aldeia, String animalInvocado) {
    
        super(nome, aldeia, 80, 100);
        this.animalInvocado = animalInvocado;
    }

    public String getAnimalInvocado() {
        return animalInvocado;
    }

    // Jutsu principal — Invocação
    @Override
    public void usarJutsu(Ninja alvo) {
        int custo = 25;
        int dano = 30;

        if (getChakra() < custo) {
            System.out.printf("%s não tem chakra para Invocação de Animais!%n", getNome());
            return;
        }

        setChakra(getChakra() - custo);
        alvo.receberDano(dano);
        System.out.printf(" %s invocou %s contra %s — Dano: %d | Chakra restante: %d%n",
                getNome(), animalInvocado, alvo.getNome(), dano, getChakra());
    }

    public void atacarComAnimais(Ninja alvo) {
        int custo = 20;
        int dano = 25;

        if (getChakra() < custo) {
            System.out.printf("%s não tem chakra para Ataque Combinado!%n", getNome());
            return;
        }

        setChakra(getChakra() - custo);
        alvo.receberDano(dano);
        System.out.printf(" %s e %s atacaram juntos %s — Dano: %d%n",
                getNome(), animalInvocado, alvo.getNome(), dano);
    }

    public void farejarInimigo(Ninja alvo) {
        System.out.printf(" %s está farejeando %s... localização revelada!%n", animalInvocado, alvo.getNome());
    }

    
}