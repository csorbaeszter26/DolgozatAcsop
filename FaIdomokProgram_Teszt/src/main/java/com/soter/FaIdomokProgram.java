package com.soter;

import com.soter.idomok.FaIdom;

import java.util.ArrayList;
import java.util.Objects;

public class FaIdomokProgram {

    private ArrayList<FaIdom> lista;



    public void ujIdom(Gomb gomb, Hasab hasab) {
    }

    public void ujIdom(Gomb gomb) {
    }

    public void ujIdom(Hasab hasab) {
    }

    public ArrayList<FaIdom> getLista() {
        return lista;
    }

    public void setLista(ArrayList<FaIdom> lista) {
        this.lista = lista;
    }

    public double osszSuly() {
        return 0;
    }

    public double gombokOsszSuly() {
        return 0;
    }

    public FaIdom minV() {
        return null;
    }

    public FaIdom maxV() {
        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public FaIdomokProgram() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FaIdomokProgram that = (FaIdomokProgram) o;
        return Objects.equals(lista, that.lista);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(lista);
    }
}
