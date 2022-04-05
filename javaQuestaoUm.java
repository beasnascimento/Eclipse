package generation;

import java.util.Scanner;

public class javaQuestaoUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, i;
		Scanner leia = new Scanner (System.in);
		
System.out.println("Entre com um número: ");
numero = leia.nextInt();

for (i=1000; i < 2000; i++){
    if (i%11==5) {
        System.out.println(i);
    }
}
	}

}
