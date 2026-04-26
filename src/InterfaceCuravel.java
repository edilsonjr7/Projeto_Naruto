public interface InterfaceCuravel {

        int cura_chakra_cura = 20;
        int bonus_vida_cura=30;


        void curarNinja();

        default  void curarAliado(Ninja alvo){
                System.out.println("Esse ninja não cura aliados");
        }
        


}