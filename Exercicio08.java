/*
Escreva um programa que, dada uma variável x com algum valor inteiro, (por exemplo 13), temos um novo x de acordo com a seguinte regra:
se x é par, x = x / 2
se x é ímpar, x = 3 * x + 1
imprime x
o programa deve parar quando x == 1
*/

public static void main(String[] args) {
        int x = 13;
        System.out.println("Iniciando " + x + "\n");
        while (x != 1) {
            System.out.print(x + " > ");
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x =( 3 * x + 1);
            }
        }
        System.out.print(x);
    }
}