@FunctionalInterface
public interface Autenticador {

    public  abstract  boolean autentica(String senha);
}
//    default boolean autentica(String senha){
//        if (this.senha != senha){
//            System.out.println("Não autenticado !");
//            return false;
//        }else {
//            System.out.println("Autenticado !");
//            return true;
//        }
//    }