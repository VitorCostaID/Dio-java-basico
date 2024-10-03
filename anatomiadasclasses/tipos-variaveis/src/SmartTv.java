public class SmartTv{
    boolean ligada = false;
    int canal = 11;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentar(){
        volume++;
    }

    public void diminuir(){
        volume--;
    }

    public void aumentarC(){
        canal++;
    }

    public void diminuirC(){
        canal--;
    }

}