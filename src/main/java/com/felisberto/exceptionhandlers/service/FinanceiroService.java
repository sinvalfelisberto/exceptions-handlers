package com.felisberto.exceptionhandlers.service;

import com.felisberto.exceptionhandlers.dto.FinanceiroDTO;
import com.felisberto.exceptionhandlers.exception.ValorZeroException;
import org.springframework.stereotype.Service;

@Service
public class FinanceiroService {
    public FinanceiroDTO salvar(FinanceiroDTO financeiroDTO) {
        validarValores(financeiroDTO);
        financeiroDTO.setId(1L);
        return financeiroDTO;
    }

    private void validarValores(FinanceiroDTO financeiroDTO) {
        if(financeiroDTO.getValor() == null || financeiroDTO.getValor().doubleValue() == 0) {
            throw new ValorZeroException("O valor do lançamento não pode ser igual a zero.", financeiroDTO.getLancamento());
        }
    }
}
