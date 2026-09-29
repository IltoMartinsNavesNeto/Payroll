package br.com.payroll.model;

import br.com.payroll.model.enums.Status;

public class Cargo {

    private Long codCargo; // PK
    private String nomeCargo;
    private Status status;
    private Departamento departamento;
    private boolean comissionado; // Cargo comissionado?

    public Long getCodCargo() {
        return codCargo;
    }

    public void setCodCargo(Long codCargo) {
        this.codCargo = codCargo;
    }

    public String getNomeCargo() {
        return nomeCargo;
    }

    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public boolean isComissionado() {
        return comissionado;
    }

    public void setComissionado(boolean comissionado) {
        this.comissionado = comissionado;
    }
}
