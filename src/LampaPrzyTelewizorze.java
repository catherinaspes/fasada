public class LampaPrzyTelewizorze implements Lampa {


    @Override
    public void swiec(int jasnosc, String kolor) {
        System.out.println("LAMPKA PRZY TELEWIZORZE. Jasność: "+jasnosc+", kolor światła: "+kolor);

    }

    @Override
    public void nieSwiec() {
        System.out.println("Lampka przy telewizorze wyłączona");
    }


}
