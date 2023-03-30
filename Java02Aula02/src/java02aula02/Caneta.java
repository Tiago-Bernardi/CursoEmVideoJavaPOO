package java02aula02;       //pacote que contem as classes Aula02 e Caneta
public class Caneta {       //classe        (modelo/molde/forma/formato)
    String modelo;          //atributos     (características/propriedades)
    String cor;             //atributos     (características/propriedades)
    float ponta;            //atributos     (características/propriedades)
    int carga;              //atributos     (características/propriedades)
    boolean tampada;        //atributos     (características/propriedades)
    
    void status () {        //metodos       (comportamento/procedimento)
        System.out.println("Modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    
    void rabiscar () {      //metodos       (comportamento/procedimento)
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Estou Rabicando");
        }
    }
    
    void tampar () {        //metodos       (comportamento/procedimento)
        this.tampada = true;
    }
    
    void destampar () {     //metodos       (comportamento/procedimento)
        this.tampada = false;
    }
}