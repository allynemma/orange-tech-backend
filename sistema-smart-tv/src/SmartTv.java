public class SmartTv {
    boolean ligada = false;
    int canal= 1;
    int volume= 25;

    public void ligar () {
        ligada = true;
    }
    public void desligar () {
        ligada = false;
    }
    public void aumentarCanal () {
        canal++;
    }
    public void diminuirCanal () {
        canal--;
    }
    public void mudarDeCanal (int novoCanal) {
        novoCanal = canal;
    }
    public void mudarParaCanalEspecifico () {

    }
    public void aumentarVolume () {
        volume++;
    }
    public void diminuirVolume () {
        volume--;
    }
}
