package services;

import interfaces.IServiceCalculadora;
import model.valoresCalc;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class service_Calculadora extends UnicastRemoteObject implements IServiceCalculadora{

    public service_Calculadora() throws RemoteException{

    }

    @Override
    public double calculasoma(valoresCalc valorcalc) throws RemoteException {
        Calculadora calc = new Calculadora();

        return calc.soma(valorcalc);
    }

    @Override
    public double calculasub(valoresCalc valorcalc) throws RemoteException {
        Calculadora calc = new Calculadora();

        return calc.subt(valorcalc);
    }

    @Override
    public double calculamult(valoresCalc valorcalc) throws RemoteException {
        Calculadora calc = new Calculadora();

        return calc.multi(valorcalc);
    }

    @Override
    public double calculadiv(valoresCalc valorcalc) throws RemoteException {
        Calculadora calc = new Calculadora();

        return calc.div(valorcalc);
    }

    @Override
    public double calculaquadrado(valoresCalc valorcalc) throws RemoteException {
        Calculadora calc = new Calculadora();

        return calc.quadrado(valorcalc);
    }

    @Override
    public double calcularaizquadrada(valoresCalc valorcalc) throws RemoteException {
        Calculadora calc = new Calculadora();

        return calc.raizquadrada(valorcalc);
    }
}
