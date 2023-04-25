import services.service_Calculadora;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       try{
           service_Calculadora service = new service_Calculadora();

           LocateRegistry.createRegistry(1099);

           Naming.rebind("rmi://localhost:1099/CalculadoraService",new service_Calculadora());

           System.out.println("Servidor da calculadora iniciado!");
       } catch (RemoteException | MalformedURLException e){
           e.printStackTrace();
       }

    }
}