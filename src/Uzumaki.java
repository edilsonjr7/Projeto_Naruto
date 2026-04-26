public class Uzumaki extends Ninja{

  private boolean modoSenninAtivo;



    public Uzumaki(String nome, String aldeia, int chakra, int vida){
        super(nome, aldeia, chakra, vida);
    }


    
    
    public boolean isModoSenninAtivo() { 

        return modoSenninAtivo;

     }


 
    public void ativarModoSennin() {
        int custo = 30;
        if (getChakra() < custo) {
            System.out.printf("%s não tem chakra para ativar o Modo Sennin!%n", getNome());
            return;
        }
        setChakra(getChakra() - custo);
        modoSenninAtivo = true;
        System.out.printf(" %s ativou o Modo Sennin! Próximos ataques serão muito mais fortes.%n", getNome());
    }


    

      @Override
    public void usarJutsu(Ninja alvo) {
        int custo = 25;
        int dano; 

        if (modoSenninAtivo) {
            dano=80;     
        } else{
            dano=45;
        }

 
        if (getChakra() < custo) {
            System.out.printf("%s não tem chakra para o Rasengan!%n", getNome());
            return;
        }
 
        setChakra(getChakra() - custo);
        alvo.receberDano(dano);
 
        if (modoSenninAtivo) {
            System.out.printf(" %s usou Rasenshuriken em %s — Dano: %d | Chakra: %d%n",
                    getNome(), alvo.getNome(), dano, getChakra());
        } else {
            System.out.printf(" %s usou Rasengan em %s — Dano: %d | Chakra: %d%n",
                    getNome(), alvo.getNome(), dano, getChakra());
        }
    }



}