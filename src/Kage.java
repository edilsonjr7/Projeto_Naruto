public final class Kage extends Ninja implements InterfaceCuravel{

    private String vila;
     private int nivelPoder;

     public Kage(String nome, String aldeia, int chakra, int vida){
        super(nome,  aldeia,  chakra,  vida);
     }



     public String getVila() {
         return vila;
     }

     public void setVila(String vila) {
         this.vila = vila;
     }

     public int getNivelPoder() {
         return nivelPoder;
     }

     public void setNivelPoder(int nivelPoder) {
         this.nivelPoder = nivelPoder;
     }


     
    @Override
    public void usarJutsu(Ninja alvo) {
        int custo = 50;
        int dano = 70;
 
        if (getChakra() < custo) {
            System.out.printf("%s não tem chakra para ativar Modo Sennin!%n", getNome());
            return;
        }
 
        setChakra(getChakra() - custo);
        alvo.receberDano(dano);
        System.out.printf(" %s ativou o 'Modo Sennin' e atacou %s — Dano: %d | Chakra restante: %d%n",
                getNome(), alvo.getNome(), dano, getChakra());
    }

   
   
   //aqui so o KAGE pode usar
    public void jutsuProibido(Ninja alvo) {
        int custo = 80;
        int dano = 100;
 
        if (getChakra() < custo) {
            System.out.printf("%s não tem chakra para o Jutsu Proibido!%n", getNome());
            return;
        }
 
        setChakra(getChakra() - custo);
        alvo.receberDano(dano);
        System.out.printf(" [JUTSU PROIBIDO] %s destruiu %s com poder máximo — Dano: %d!%n",
                getNome(), alvo.getNome(), dano);
    }




    // ── InterfaceCuravel ─────────────────────────────────────────────────
 
    @Override
    public void curarNinja() {
        int curaKage = cura_chakra_cura * 2; 
        if (getChakra() < bonus_vida_cura) {
            System.out.printf("%s não tem chakra para se curar!%n", getNome());
            return;
        }

        setChakra(getChakra() - cura_chakra_cura);
        setVida(getVida() + curaKage);

        System.out.printf(" %s (Kage) se curou com poder superior! Vida: %d%n",
                getNome(), getVida());

    
}

}