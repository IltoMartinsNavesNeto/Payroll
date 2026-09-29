package br.com.payroll.model;

import br.com.payroll.model.enums.Status;
import br.com.payroll.model.enums.TipoDeColaborador;

import java.math.BigDecimal;
import java.util.Date;

public class Colaborador {

    private Long matricula;
    private String nome;
    private Salario salario;
    private Date DataDeAdmissao; // Data de inicio do colaborador
    private Cargo cargo;
    private Status status;
    private TipoDeColaborador tipoDeColaborador;
    private Empresa empresa;
}
