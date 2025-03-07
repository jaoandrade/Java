package Classe; //Topaslx_2024 - Dias até ao Natal - João Andrade
import java.util.Scanner;
public class Classe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        int[] Meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dia, mes, quantosdias = 0;
        dia = scanner.nextInt();
        mes = scanner.nextInt();
        if (dia == 25 && mes == 12) {
            System.out.println(0);
        } else {
            if (mes == 12 && dia > 25) {
                quantosdias = (Meses[11] - dia) + 25;  
                for (int i = 0; i < 12; i++) {
                    quantosdias += Meses[i];
                }
            } else {
                quantosdias = Meses[mes - 1] - dia; 
                for (int i = mes; i < 12; i++) {
                    quantosdias += Meses[i];
                }
                quantosdias += 25;
            }            
            System.out.println(quantosdias);
        }
        scanner.close();
    }
}              