package nossagrana.emprestimo.entity;

import java.time.ZonedDateTime;

public class Emprestimo {
    private double montante;
    private ZonedDateTime dataVencimento;
    private ZonedDateTime dataBase;
    private double taxaJuros;
    private double taxaCET;

    public Emprestimo(double montante, ZonedDateTime dataVencimento, ZonedDateTime dataBase, double taxaJuros, double taxaCET) {
        this.montante = montante;
        this.dataVencimento = dataVencimento;
        this.dataBase = dataBase;
        this.taxaJuros = taxaJuros;
        this.taxaCET = taxaCET;
    }

    public double getMontante() {
        return montante;
    }

    public void setMontante(double montante) {
        this.montante = montante;
    }

    public ZonedDateTime getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(ZonedDateTime dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public ZonedDateTime getDataBase() {
        return dataBase;
    }

    public void setDataBase(ZonedDateTime dataBase) {
        this.dataBase = dataBase;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaCET() {
        return taxaCET;
    }

    public void setTaxaCET(double taxaCET) {
        this.taxaCET = taxaCET;
    }
}
