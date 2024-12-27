package com.felisberto.exceptionhandlers.exception;

public class ValorNullException extends RuntimeException {
  private final String lancamento;

  public ValorNullException(String message, String lancamento) {
    super(message);
    this.lancamento = lancamento;
  }

  public String getLancamento() {
    return lancamento;
  }
}
