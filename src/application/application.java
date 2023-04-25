package application;

import interfaces.IServiceCalculadora;
import model.valoresCalc;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class application {

    public static void main(String[] args) throws RemoteException {
        try {
            IServiceCalculadora service = (IServiceCalculadora) Naming.lookup("rmi://localhost:1099/CalculadoraService");
            valoresCalc num = new valoresCalc(4.8,5.9);
            double valor = service.calculasoma(num);
            System.out.println("O valor da soma:" +valor);
        } catch (MalformedURLException | RemoteException |NotBoundException e){
                e.printStackTrace();
        }
    }
}
