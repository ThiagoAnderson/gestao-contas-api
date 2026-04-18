package com.thiago.gestao_contas.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Expense {
    private Long id;
    private String descricao;
    private BigDecimal valor;
    private String categoria;
    private LocalDate data;

}
