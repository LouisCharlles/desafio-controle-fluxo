import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o primeiro número?: ");
        int numeroUm = scanner.nextInt();
        System.out.println("Qual o segundo número?: ");
        int numeroDois = scanner.nextInt();

        try {
            contar(numeroUm, numeroDois);
        } 
        
        catch (ParametrosInvalidosException pr) {
            pr.printStackTrace();
        }

        scanner.close();
    }

    static void contar(int parametroUm,int parametroDois) throws ParametrosInvalidosException{
        if(parametroDois<=parametroUm){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }
        int contador = 1;
        for(int x = parametroUm;x<parametroDois+1;x++){
            System.out.println(contador);
            contador+=1;
        }
    }
}
