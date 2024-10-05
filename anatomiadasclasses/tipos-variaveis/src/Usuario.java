public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Estado da TV: " +smartTv.ligada);
        System.out.println("Canal definido: " +smartTv.canal);
        System.out.println("Volume definido: " +smartTv.volume);

        smartTv.ligar ();

        System.out.println("Novo estado: " +smartTv.ligada);

        smartTv.escolherCanal(15);

        System.out.println("Canal definido: " +smartTv.canal);
    }
}
