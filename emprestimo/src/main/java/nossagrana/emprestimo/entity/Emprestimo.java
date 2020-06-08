package nossagrana.emprestimo.entity;

import nossagrana.emprestimo.dto.SolicitarEmprestimoDTO;

import java.time.ZonedDateTime;

public class Emprestimo {
    private double montante;
    private ZonedDateTime dataVencimento;
    private ZonedDateTime dataBase;
    private double taxaJuros;

    public Emprestimo() {}

    public Emprestimo(double montante, ZonedDateTime dataVencimento, ZonedDateTime dataBase, double taxaJuros) {
        this.montante = montante;
        this.dataVencimento = dataVencimento;
        this.dataBase = dataBase;
        this.taxaJuros = taxaJuros;
    }

    public Emprestimo(SolicitarEmprestimoDTO solicitarEmprestimoDTO) {
        this.montante = solicitarEmprestimoDTO.getMontante();
        this.dataVencimento = solicitarEmprestimoDTO.getDataVencimento();
        this.dataBase = ZonedDateTime.now();
        this.taxaJuros = 0.40;
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
        return taxaJuros + 0.4;
    }
}
