package model.exceptions;

public class DomainException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    //Permite que instenciamos uma versão passando uma msg
    public DomainException(String msg){
        super(msg);
    }
    
}
