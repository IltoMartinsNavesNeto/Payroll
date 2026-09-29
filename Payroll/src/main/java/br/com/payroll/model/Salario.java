package br.com.payroll.model;

import br.com.payroll.model.enums.MotivoDeSalario;

import java.math.BigDecimal;
import java.util.Date;

// Realizar o histórico de salário
public class Salario {

    private Colaborador matricula; // FK
    private BigDecimal salario; // PK
    private Date dataDeAlteracao; // PK
    private String observacao;
    private MotivoDeSalario motivo;

    public Colaborador getMatricula() {
        return matricula;
    }

    public void setMatricula(Colaborador matricula) {
        this.matricula = matricula;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public Date getDataDeAlteracao() {
        return dataDeAlteracao;
    }

    public void setDataDeAlteracao(Date dataDeAlteracao) {
        this.dataDeAlteracao = dataDeAlteracao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public MotivoDeSalario getMotivo() {
        return motivo;
    }

    public void setMotivo(MotivoDeSalario motivo) {
        this.motivo = motivo;
    }
}
