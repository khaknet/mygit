/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package easyvat;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author pc
 */
@WebService(serviceName = "ServiceVat")
public class ServiceVat {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "incom")
    public double incom(@WebParam(name = "invat") double invat) {
        //TODO write your implementation code here:
        double tax=200000;
        double total;
        if (invat<=tax) 
            {
            return total=0;
            }
        else
        {
            total=((invat-tax)*7)/100;
        }
        return total;
    }
}
