public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada ? " +smartTv.ligada);
        
        System.out.println("Volume ? " +smartTv.volume);

        smartTv.ligar();
        System.out.println("Status tv -> tv ligada ? "+smartTv.ligada);
        smartTv.aumentarVolume();
        System.out.println("status volume -> Volume : "+smartTv.volume);
        smartTv.abaixarVolume();    
        System.out.println("status volume -> Volume : "+smartTv.volume);

        System.out.println("Canal Atual ? " +smartTv.canal);
       
        smartTv.mudarCanal(39);

        System.out.println("Canal Atual ? " +smartTv.canal);

        smartTv.decrementarCanal();
        System.out.println("Canal Atual ? " +smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Canal Atual ? " +smartTv.canal);

    }
}
