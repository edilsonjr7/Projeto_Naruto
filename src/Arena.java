public class Arena {

    private Ninja ninja1;
    private Ninja ninja2;
    private int rodada;

    public Arena(Ninja ninja1, Ninja ninja2) {
        this.ninja1 = ninja1;
        this.ninja2 = ninja2;
        this.rodada = 1;
    }

    public void iniciarBatalha() {
        System.out.println("\n╔══════════════════════════════════════╗");
        System.out.println("║         BATALHA NINJA INICIADA        ║");
        System.out.println("╚══════════════════════════════════════╝");
        System.out.printf("   %s  VS  %s%n%n", ninja1.getNome(), ninja2.getNome());

        ninja1.exibirStatus();
        ninja2.exibirStatus();
    }

    // Simula uma rodada: cada ninja ataca com jutsu
    public void simularRodada() {
        System.out.println("\n─────────── Rodada " + rodada + " ───────────");

        if (ninja1.estaVivo()) {
            ninja1.usarJutsu(ninja2);
        }

        if (ninja2.estaVivo()) {
            ninja2.usarJutsu(ninja1);
        }

        rodada++;
    }

    // Roda a batalha completa automaticamente
    public void batalhaCompleta() {
        iniciarBatalha();

        while (ninja1.estaVivo() && ninja2.estaVivo()) {
            simularRodada();
        }

        anunciarVencedor();
    }

    public void anunciarVencedor() {
        System.out.println("\n╔══════════════════════════════════════╗");
        System.out.println("║             FIM DE BATALHA          ║");
        System.out.println("╚══════════════════════════════════════╝");

        if (ninja1.estaVivo() && !ninja2.estaVivo()) {
            System.out.printf("  Vencedor: %s!%n", ninja1.getNome());
        } else if (ninja2.estaVivo() && !ninja1.estaVivo()) {
            System.out.printf("  Vencedor: %s!%n", ninja2.getNome());
        } else {
            System.out.println("  Empate! Ambos os ninjas caíram.");
        }

        System.out.println();
        ninja1.exibirStatus();
        ninja2.exibirStatus();
    }

    // Permite que um ninja descanse e recupere chakra entre rodadas
    public void descansarNinja(Ninja ninja, int quantidade) {
        System.out.printf("\n %s descansa e recupera chakra...%n", ninja.getNome());
        ninja.recuperarChakra(quantidade);
    }
}