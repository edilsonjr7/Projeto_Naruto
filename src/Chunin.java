public class Chunin extends Ninja {

   private String animal;

    public String getAnimal() {
    return animal;
}

   public void setAnimal(String animal) {
    this.animal = animal;
   }


    @Override
    public void usarJutsu(){
        System.out.println("Invocação de Animais");
    }

    public void atacarComAnimais() {
    System.out.format("Ataque combinado com o %s !", getAnimal());
}

public void farejarInimigo() {
    System.out.println("Rastreando inimigo pelo cheiro!");
}
    
}
