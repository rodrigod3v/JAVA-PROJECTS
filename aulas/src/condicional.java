public class condicional {
    public static void main(String[] args) {
        int anodelancamento = 1990;
        boolean INP = true;
        double NDF = 8.1;
        String TP = "ClientePlus";

        if (anodelancamento >= 2022){
            System.out.println("Filme Lançamento");
        } else {
            System.out.println("Filme Antigo");
        }

        if (INP == true || TP.equals("plus")){
            System.out.println("LIBERADO");
        } else {
            System.out.println("Pague O PLANO VIP PLUS");
        }
    }
}
