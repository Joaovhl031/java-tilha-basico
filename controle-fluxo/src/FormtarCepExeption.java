public class FormtarCepExeption{
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("32342240");
            System.out.println(cepFormatado);
        } catch (CepInvalidationException e) {
            e.printStackTrace();
        }
    }

    static String formatarCep(String cep) throws CepInvalidationException {
        if (cep.length() != 8)
            throw new CepInvalidationException();

        return "32342-240";
    }
}