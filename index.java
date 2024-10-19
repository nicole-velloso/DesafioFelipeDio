import java.util.Scanner;

public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
String nome;
int xp;
String nivel="";
    System.out.println("Digite seu nome");
    nome = entrada.nextLine();

    System.out.println("Digite seu XP");
    xp= entrada.nextInt();

    if(xp <= 1000){
     nivel="Ferro";
    }else if(xp >= 1001 && xp <= 2000){
        nivel="Bronze";
    }else if(xp >= 2001 && xp <= 5000){
        nivel="Prata";
    } else if(xp >= 5001 && xp <= 7000){
        nivel="Ouro";
    } else if(xp >= 7001 && xp <= 8000){
        nivel="Platina";
    } else if(xp >= 8001 && xp <= 9000){
        nivel="Ascendente";
    } else if(xp >= 9001 && xp <= 10000){
        nivel="Imortal";
    } else if(xp >= 10001){
        nivel="Radiante";
    }

    System.out.println("O heroi de nome: "+nome+" ,está no nivel de: " + nivel);
    
}