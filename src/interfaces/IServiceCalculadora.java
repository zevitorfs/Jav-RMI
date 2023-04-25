package interfaces;

import model.valoresCalc;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IServiceCalculadora extends Remote {
    public double calculasoma(valoresCalc valorcalc) throws RemoteException;
    public double calculasub(valoresCalc valorcalc) throws RemoteException;
    public double calculamult(valoresCalc valorcalc) throws RemoteException;
    public double calculadiv(valoresCalc valorcalc) throws RemoteException;
    public double calculaquadrado(valoresCalc valorcalc) throws RemoteException;
    public double calcularaizquadrada(valoresCalc valorcalc) throws RemoteException;

}
