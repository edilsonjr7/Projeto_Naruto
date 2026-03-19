import java.util.Scanner;

public class Kage extends Ninja{

    private String vila;
     private int nivelPoder;



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




      public void lerDados() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a vila: ");
        vila = sc.nextLine();

        System.out.print("Digite o nível de poder: ");
        nivelPoder = sc.nextInt();
    }


     @Override
     public void usarJutsu(){
        System.out.println("Ativação do modo sennin");

     }


    
}
