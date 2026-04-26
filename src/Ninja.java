public abstract class Ninja {


    private String nome;
    private String aldeia;
    private int chakra; 
    private int vida;

    public Ninja(String nome, String aldeia, int chakra, int vida) {
    this.nome = nome;
    this.aldeia = aldeia;
    this.chakra = chakra;
    this.vida = vida;
    
}
   

    
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getAldeia() {
        return aldeia;
    }


    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }


    public int getChakra() {
        return chakra;
    }


    public void setChakra(int chakra) {
        this.chakra = chakra;
    }


    public int getVida() {
        return vida;
    }


    public void setVida(int vida) {
        this.vida = vida;
    }


    public abstract void usarJutsu(Ninja alvo);

 
    // qualquer ninja pode usar, custa pouco chakra
    public void atacarBasico(Ninja alvo) {
        int custoCkakra = 5;
        int dano = 10;
 
        if (chakra < custoCkakra) {
            System.out.println(nome + " não tem chakra suficiente para atacar!");
            return;
        }
 
        setChakra(chakra - custoCkakra);
        alvo.receberDano(dano);
        System.out.printf("[ATAQUE BÁSICO] %s jogou kunais em %s — Dano: %d%n", nome, alvo.getNome(), dano);
    }




 
    public void receberDano(int dano) {
      setVida(Math.max(0, vida - dano));
        System.out.printf("  %s ficou com %d de vida%n ", getNome(), getVida());
    }

 
 
    
    public void recuperarChakra(int quantidade) {
        int antes = chakra;
        setChakra(chakra + quantidade);
        System.out.printf(" %s recuperou  chakra! (%d → %d)%n",
                nome, antes, chakra);
    }
 
    public boolean estaVivo() {
        return vida > 0;
    }

 
    public void exibirStatus() {
        System.out.println("┌─────────────────────────────┐");
        System.out.printf("│ Ninja  : %-20s│%n", nome);
        System.out.printf("│ Aldeia : %-20s│%n", aldeia);
        System.out.printf("│ Vida   : %3d│%n", vida);
        System.out.printf("│ Chakra : %3d│%n", chakra);
        System.out.println("└─────────────────────────────┘");

  
}

}