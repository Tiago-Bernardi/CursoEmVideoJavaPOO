package java02aula02;           //pacote que contem as classes Aula02 e Caneta

public class Aula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();   //instânciar o objeto 
        c1.cor = "Azul";            //atributos 
        c1.ponta = 0.5f;            //atributos 
        c1.tampar();                //metodo
        
        c1.status();                //metodo
        c1.rabiscar();              //metodo
        
        
        Caneta c2 = new Caneta();   //instânciar o objeto
        c2.modelo = "Hostnet";      //atributos
        c2.cor = "Preta";           //atributos
        c2.destampar();             //metodo
        
        c2.status();                //metodo
        c2.rabiscar();              //metodo
    }
    
}
