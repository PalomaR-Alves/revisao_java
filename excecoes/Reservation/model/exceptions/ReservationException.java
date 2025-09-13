package model.exceptions;

public class ReservationException extends Exception {
    // permite instanciar uma exceção personalizada passando uma mensagem para ela
    public ReservationException(String message) {
        super(message);
    }

}

/*
Exceções que herdam de Exception obrigam o bloco de código que possui operações passíveis
de levantar exceções a tratá-las, ou seja, obrigatoriamente o bloco deve estar dentro de
uma estrutura try-catch
*/