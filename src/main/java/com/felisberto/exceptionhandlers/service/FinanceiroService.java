package com.felisberto.exceptionhandlers.service;

import com.felisberto.exceptionhandlers.dto.FinanceiroDTO;
import com.felisberto.exceptionhandlers.exception.ValorNullException;
import com.felisberto.exceptionhandlers.exception.ValorZeroException;
import org.springframework.stereotype.Service;

@Service
public class FinanceiroService {
    public FinanceiroDTO salvar(FinanceiroDTO financeiroDTO) {
        validarValores(financeiroDTO);
        return financeiroDTO;
    }

    private void validarValores(FinanceiroDTO financeiroDTO) {
        if(financeiroDTO.valor() == null) {
            throw new ValorNullException("O valor do lançamento não pode ser nulo.", financeiroDTO.lancamento());
        }
        if(financeiroDTO.valor().doubleValue() == 0) {
            throw new ValorZeroException("O valor do lançamento não pode ser igual a Zero.", financeiroDTO.lancamento());
        }
    }
}
