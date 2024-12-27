package com.felisberto.exceptionhandlers.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public record FinanceiroDTO(Long id, String lancamento, BigDecimal valor){
}
