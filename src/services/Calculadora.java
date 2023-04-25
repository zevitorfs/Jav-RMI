package services;

import model.valoresCalc;


public class Calculadora {


    public Double soma(valoresCalc valorescalc){
        return valorescalc.getA() + valorescalc.getB();
    }

    public Double subt(valoresCalc valorescalc){
        return valorescalc.getA() - valorescalc.getB();
    }

    public Double multi(valoresCalc valorescalc){
        return valorescalc.getA()* valorescalc.getB();
    }

    public Double div(valoresCalc valorescalc){
        return valorescalc.getA()/valorescalc.getB();
    }

    public Integer quadrado(valoresCalc valorescalc){
        return valorescalc.getC()^2;
    }

    public Double raizquadrada(valoresCalc valorescalc){
        return Math.sqrt(valorescalc.getA());
    }


}
