//import java.util.Arrays;
//import java.util.List;
//import java.util.function.Consumer;
//
//public class TestaContaLambda {
//    public static void main(String[] args) {
//
//        Cliente cli1 = new Cliente("Giovanni", true, "2507");
//        Cliente cli2 = new Cliente("Mentorama", true, "2547");
//        Cliente cli3 = new Cliente("Fabiano", false, "2fr8");
//        Cliente cli4 = new Cliente("Brasil", false, "avf2");
//
//        cli1.autentica("2507");
//        cli2.autentica("2507");
//
//
//
//        //criando uma classe anonima nao precisamos implementar um novo pacote e sim usa-lo aqui mesmo
//
//        List<Cliente> clientes = Arrays.asList(cli1, cli2, cli3, cli4);
//        Consumer<Cliente> consumer = (Cliente cli) -> {
//            System.out.println(cli.getNome());
//        };
//
//        clientes.forEach(consumer);
//    }
//}
