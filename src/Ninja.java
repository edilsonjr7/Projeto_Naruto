public abstract class Ninja {


    private String nome;
    private String aldeia;
    private int chakra;
    private int chakraMax;
    private int vida;
    private int vidaMax;




    

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



    // ======================================================================
    // nesse SET o chakra não ultrapassa o máximo dele e não fica negativo
    public void setChakra(int chakra) {
        this.chakra = Math.max(0,Math.min(chakra, chakraMax));
    }
    // ======================================================================

    public int getChakraMax() {
        return chakraMax;
    }


    public void setChakraMax(int chakraMax) {
        this.chakraMax = chakraMax;
    }


    public int getVida() {
        return vida;
    }


    public void setVida(int vida) {
        this.vida = Math.max(0,vida); // aqui a vida não fica negativa
    }


    public int getVidaMax() {
        return vidaMax;
    }



    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }



    public void usarJutsu(){
    System.out.println("Takar kunais com chamas");
    }

  
}
