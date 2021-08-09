package gradleproject4;

public class Main {

    public static void main(String[] args) {
        
        ElencoInter2 e1 = new ElencoInter2();
        
        e1.setNome("Guerrero");
        e1.setIdade(37);
        e1.setCamisa(9);
        e1.setPosicao("Centro-Avante");
        e1.setAltura(1.85);
        e1.setPeso(82f);
        
        e1.jogando(true);
        e1.estadoAtual();
        
        ElencoInter2 e2 = new ElencoInter2();
        
        e2.setNome("Yuri Alberto");
        e2.setIdade(20);
        e2.setCamisa(11);
        e2.setPosicao("Centro-Avante");
        e2.setAltura(1.83);
        e2.setPeso(78f);
        
        e2.jogando(false);
        e2.estadoAtual();
        
    }
    
}