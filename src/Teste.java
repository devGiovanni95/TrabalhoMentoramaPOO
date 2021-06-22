import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Teste {
    public static void main(String[] args) {

        Cliente cli1 = new Cliente("Giovanni", true, "2507", 10);
        Cliente cli2 = new Cliente("Mentorama", true, "2547", 30);
        Cliente cli3 = new Cliente("Fabiano", false, "2fr8", 50);
        Cliente cli4 = new Cliente("Brasil", false, "avf2", 48);


        List<Cliente> clientes = Arrays.asList(cli1, cli2, cli3, cli4);
//        clientes.forEach( cli -> System.out.println(cli.getCompras()));

        Stream<Cliente> stream = clientes.stream().filter(cliente -> cliente.getCompras() >= 20);

        List<Cliente> selecionados = stream.collect(Collectors.toList());
        selecionados.forEach( c -> System.out.println(c.getCompras()));

    }
}
