package gradleproject4;

public class ElencoInter2 {
    
    public String nome;
    public int idade;
    public double altura;
    public double peso;
    public String posicao;
    public int camisa;
    public boolean jogando;
    
    public void estadoAtual(){
        System.out.println("-------------------");
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Idade: "+ this.getIdade());
        System.out.println("Camisa: "+ this.getCamisa());
        System.out.println("Posicao: "+ this.getPosicao());
        System.out.println("Altura: "+ this.getAltura());
        System.out.println("Peso: "+ this.getPeso());
        System.out.println("");
        
    }
    
    public void jogando(boolean j){
        this.setJogando(j);
        
        if(j == true){
            System.out.println("O jogador esta atuando");
        } else if (j == false){
            System.out.println("O jogador nao esta atuando");
        }
        
    }
    
    

    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public String getPosicao(){
        return posicao;
    }
    
    public void setPosicao(String posicao){
        this.posicao = posicao;
    }
    
    public int getCamisa(){
        return camisa;
    }
    
    public void setCamisa(int camisa){
        this.camisa = camisa;
    }
    
    public boolean getJogando(){
        return jogando;
    }
    
    public void setJogando(boolean jogando){
        this.jogando = jogando;
    }
}