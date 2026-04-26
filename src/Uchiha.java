public class Uchiha extends Ninja {

    private boolean sharinganAtivo;
    private  boolean ativSusanoo=true;

    public Uchiha(String nome, String aldeia, int vida, int chakra) {
        super(nome, aldeia, vida, chakra);
        this.sharinganAtivo = false;
    }

    public boolean isSharinganAtivo() { 
        return sharinganAtivo;
     }


    public void ativarSharingan() {
        sharinganAtivo = true;
        System.out.printf(" %s ativou o Sharingan! Próximo ataque será amplificado.%n", getNome());
    }

   
    @Override
    public void usarJutsu(Ninja alvo) {
        int custo = 30;
        int dano;  

        
        if(sharinganAtivo){
            dano=55;
        } else{
            dano=45;
        }


        if (getChakra() < custo) {
            System.out.printf(" %s não tem chakra para usar Amaterasu!%n", getNome());
            return;
        }

        setChakra(getChakra() - custo);
        alvo.receberDano(dano);

        if (sharinganAtivo) {
            System.out.printf(" %s usou Amaterasu com Sharingan em %s — Dano: %d | Chakra: %d%n",
                    getNome(), alvo.getNome(), dano, getChakra());
            sharinganAtivo = false; // aqui o sharingan se desativa após o uso
        } else {
            System.out.printf(" %s usou Amaterasu em %s — Dano: %d | Chakra: %d%n",
                    getNome(), alvo.getNome(), dano, getChakra());
        }
    }



    public void ativarSusanoo(Ninja alvo){
        int custo = 20;
        int dano;

         
        if(ativSusanoo==true){
            dano=65;
        } else{
            dano=7;
        }
        
        
        
        if (getChakra() < custo) {
            System.out.printf(" %s não  possui mais chakra para ativar o Susanoo!%n", getNome());
            return;
        }

        setChakra(getChakra() - custo);
        alvo.receberDano(dano);

        if (ativSusanoo==true) {
            System.out.printf(" %s ativou o Susanno e atacou o %s — Dano: %d | Chakra: %d%n",
                    getNome(), alvo.getNome(), dano, getChakra());

        } else{
            System.out.println(" Você precisa ativar o Susanoo para usa ");
        }

    }

    
    // Jutsu de ilusão
    public void tsukuyomi(Ninja alvo) {
        int custo = 40;
        int dano = 45;
        if (getChakra() < custo) {
            System.out.printf(" %s não tem chakra para Tsukuyomi!%n", getNome());
            return;
        }
        setChakra(getChakra() - custo);
        alvo.receberDano(dano);
        System.out.printf(" %s prendeu %s em uma ilusão tsukuyomi — Dano: %d%n",
                getNome(), alvo.getNome(), dano);
    }

}