public class ParametrosInvalidosException extends Exception{


    public ParametrosInvalidosException(String mensagem){
        super(mensagem);
    }
   
    static void checaParametros(int numeroUm,int numero2) throws ParametrosInvalidosException{
        if(numero2<numeroUm){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }
}
