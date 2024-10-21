import java.util.Scanner;

public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
String nome,tipo,result; 
int idade;   

    
    System.out.println("Digite o nome do heroi");
nome=entrada.nextLine();

System.out.println("Digite a idade do heroi");
idade=entrada.nextInt();
entrada.nextLine();

System.out.println("Digite o tipo do heroi,podendo ser do tipo:Mago,Guerreiro,Monge ou Ninja");
tipo=entrada.nextLine();

heroi hero1 = new heroi(nome,idade,tipo);

result=hero1.atacar(tipo);

System.out.println("O "+tipo+" atacou usando "+ result);


}