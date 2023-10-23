
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebService(name = "Banqueservice", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Banqueservice {


    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod(operationName = "ConversionEuroToDirham")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ConversionEuroToDirham", targetNamespace = "http://ws/", className = "proxy.ConversionEuroToDirham")
    @ResponseWrapper(localName = "ConversionEuroToDirhamResponse", targetNamespace = "http://ws/", className = "proxy.ConversionEuroToDirhamResponse")
    @Action(input = "http://ws/Banqueservice/ConversionEuroToDirhamRequest", output = "http://ws/Banqueservice/ConversionEuroToDirhamResponse")
    public double conversionEuroToDirham(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listeComptes", targetNamespace = "http://ws/", className = "proxy.ListeComptes")
    @ResponseWrapper(localName = "listeComptesResponse", targetNamespace = "http://ws/", className = "proxy.ListeComptesResponse")
    @Action(input = "http://ws/Banqueservice/listeComptesRequest", output = "http://ws/Banqueservice/listeComptesResponse")
    public List<Compte> listeComptes();

    /**
     * 
     * @param code
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://ws/", className = "proxy.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://ws/", className = "proxy.GetCompteResponse")
    @Action(input = "http://ws/Banqueservice/getCompteRequest", output = "http://ws/Banqueservice/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

}
