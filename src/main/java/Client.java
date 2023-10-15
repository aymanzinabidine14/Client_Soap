import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class Client {
    public static void main(String [] args) {

        BanqueService stub = new BanqueWS().getBanqueServicePort();
        System.out.println(stub.convert(10));
        Compte cp=stub.getCompte(1);
        cp.getCode();

    }
}
