import proxy.BanqueWs;
import proxy.Banqueservice;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        Banqueservice stub= new BanqueWs().getBanqueservicePort();
        Compte c=stub.getCompte(4);
        System.out.println(stub.conversionEuroToDirham(500));
        System.out.println(c.getCode());
        System.out.println(c.getSolde());

    }
}
