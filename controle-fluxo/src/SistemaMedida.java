public class SistemaMedida {
    public static void main(String[] args) {
        String letra = "g";
        switch (letra) {    
            case "p": {
                System.out.println("pequeno");
                break;
            }
            case "m": {
                System.out.println("medio");
                break;
            }
            case "g": {
                System.out.println("grande");
                break;
            }
            default:
            System.out.println("indefinido");
        }
    }
}
