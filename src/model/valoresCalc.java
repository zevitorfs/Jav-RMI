package model;

import java.io.Serializable;
public class valoresCalc implements Serializable {
    public double a;
    public double b;

    public Integer c;

    public valoresCalc(Integer c) {
        this.c = c;
    }

    public valoresCalc() {
    }

    public valoresCalc(Double a) {
        this.a = a;
    }

    public valoresCalc(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }
}
