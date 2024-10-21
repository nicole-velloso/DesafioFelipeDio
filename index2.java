import java.util.Scanner;

public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);

String nivel="";
int vito,derro,result;
System.out.println("Digite o número de vitórias");
vito=entrada.nextInt();

System.out.println("Digite o número de derrotas");
derro=entrada.nextInt();

result=saldoVitoria(vito, derro);

if(vito<=10){
    nivel="Ferro";
}else if(vito>=11 && vito <= 20){
    nivel="Bronze";
}else if(vito >= 21 && vito <= 50){
    nivel="Prata";
}else if(vito >= 51 && vito <=80){
    nivel="Ouro";
}else if(vito >= 81 && vito <= 90){
    nivel="Diamante";
}else if(vito >= 91 && vito <=100){
    nivel="Lendário";
}else if(vito >= 101 && vito <= 101){
    nivel="Imortal";
}

System.out.println("O herói tem saldo de: "+result+" está no nivel de: "+ nivel);

}

public static int saldoVitoria(int vit,int der){
int resultado;
resultado=vit-der;
return resultado;
}