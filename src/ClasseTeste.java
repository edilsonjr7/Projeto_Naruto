public class ClasseTeste {
    public static void main(String[] args) {

        // ─ Criando ninjas 
        Uchiha madarUchiha    = new Uchiha("Madara",    "Clã Uchiha",   100, 100);
        Uzumaki naruto   = new Uzumaki("Naruto",   "Clã Uzumaki",  150, 120);
        Nara shikamaru   = new Nara("Shikamaru",   "Clã Nara",     90,  80);
        Yuga kiba      = new Yuga("Kiba",      "Clã Hyuga",    "Leão Branco");
        Kage minato     = new Kage("Minato",     "Konoha",       200, 180);

        
        // Primeira batalha
        System.out.println("========================================");
        System.out.println("                 BATALHA 1              ");
        System.out.println("========================================");

        Arena batalha1 = new Arena(madarUchiha, naruto);
        batalha1.iniciarBatalha();

        madarUchiha.ativarSharingan();
        batalha1.simularRodada();

        batalha1.descansarNinja(naruto, 30);
        batalha1.simularRodada();

        madarUchiha.tsukuyomi(naruto);
        madarUchiha.ativarSusanoo(naruto);

        batalha1.anunciarVencedor();




        
        // segunda batalha
        System.out.println("\n========================================");
        System.out.println("              BATALHA 2                  ");
        System.out.println("========================================");

        Arena batalha2 = new Arena(shikamaru, kiba);
        batalha2.iniciarBatalha();

        shikamaru.ativarSombra();
        batalha2.simularRodada();

        kiba.atacarComAnimais(shikamaru);
        kiba.farejarInimigo(shikamaru);

        batalha2.anunciarVencedor();




        // Kage enfrenta todos os outros ninjas
        System.out.println("\n========================================");
        System.out.println("           Kage enfrenta todos             ");
        System.out.println("========================================");

        Ninja[] todos = { madarUchiha, naruto, shikamaru, kiba };
        for (Ninja ninja : todos) {
            if (ninja.estaVivo()) {
                minato.usarJutsu(ninja);
            }
        }

       
        System.out.println("\n========================================");
        System.out.println( "  InterfaceCuravel -   Kage se cura     ");
        System.out.println("========================================");
        System.out.printf("Vida antes: %d%n", minato.getVida());
        minato.curarNinja();
        System.out.printf("Vida depois: %d%n", minato.getVida());

        minato.jutsuProibido(madarUchiha);
    }
}