public class heroi {
    String nome;
    int idade;
    String tipo;

    public heroi(String nome,int idade,String tipo){
        this.nome=nome;
        this.idade=idade;
        this.tipo=tipo;

    }
    public String atacar(String tipo){
     String ataque ="";
        if(tipo.equalsIgnoreCase("Mago")){
ataque="magia";
        }else if(tipo.equalsIgnoreCase("Guerreiro")){
            ataque="espada";
        }else if(tipo.equalsIgnoreCase("Monge")){
            ataque="artes marciais";
        }else if(tipo.equalsIgnoreCase("Ninja")){
            ataque="shuriken";
        }
      return ataque;
    }
}
