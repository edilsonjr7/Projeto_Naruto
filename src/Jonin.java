public class Jonin extends Ninja {

    private String especialidade;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void usarEspecialidade(){
        System.out.format("Executando meus estilo em %s ", getEspecialidade());
    }

    @Override
    public void usarJutsu(){
        System.out.println("Jutsu manipulação de sangue");
    }

    
}
