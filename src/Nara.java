public class Nara extends Ninja{
    private boolean jutsuSombraAtivado;

    public Nara(String nome, String aldeia, int vida, int chakra) {
        super(nome, aldeia, vida, chakra);
        this.jutsuSombraAtivado = false;
    }

    public boolean isJutsuSombra() { 
        return jutsuSombraAtivado;
     }


    public void ativarSombra() {
        jutsuSombraAtivado = true;
        System.out.printf("  %s usou um ataque usando sua sombra! Próximo ataque será amplificado.%n", getNome());
    }

   
    @Override
    public void usarJutsu(Ninja alvo) {
        int custo = 30;
        int dano;
        
        if(jutsuSombraAtivado) {
            dano=28;
        }  else{
            dano=18;
        }

        if (getChakra() < custo) {
            System.out.printf("%s não tem chakra para utilizar sua Sombra!%n", getNome());
            return;
        }

        setChakra(getChakra() - custo);
        alvo.receberDano(dano);

        if (jutsuSombraAtivado) {
            System.out.printf("  %s usou manipulação de sombras em %s — Dano: %d | Chakra: %d%n",
                    getNome(), alvo.getNome(), dano, getChakra());
        } else {
            System.out.printf("  %s prendeu %s na sua sombra e o atacou com a kunai — Dano: %d | Chakra: %d%n",
                    getNome(), alvo.getNome(), dano, getChakra());
        }
    }
    

}