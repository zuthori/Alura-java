# Alura exercícios - *Java*
#### Calculando Média.
***
public class Balancotrimestral {

public static void main(String[] args) {

int gastosJaneiro = 15000;
        
int gastosFevereiro = 23000;
	
int gastosMarco = 17000;
        
int gastosTrimestre = gastosJaneiro + 
gastosFevereiro + gastosMarco;

        int mediaMensal;

	System.out.println("Resultado trimestral: " + gastosTrimestre);	

        mediaMensal = gastosTrimestre / 3;

        System.out.println("Valor da média mensal= " + mediaMensal);   
    }    
}