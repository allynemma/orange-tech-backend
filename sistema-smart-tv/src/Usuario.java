/**
 * 
 * @author Allyne Alves
 * @version 1.0
 * @since 16/01/2023
*/
public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: "+ smartTv.canal);
        System.out.println("Volume atual:" +smartTv.volume);
    }
}
