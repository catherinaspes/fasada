public class LampaSufitowa implements Lampa {

    boolean wlaczona;

    @Override
    public void swiec(int jasnosc, String kolor) {
        wlaczona = true;
        System.out.println("LAMPA SUFITOWA Jasność lampy: "+jasnosc+", kolor światła: "+kolor);
    }

    @Override
    public void nieSwiec() {
        wlaczona = false;
        System.out.println("Wyłączenie lampy sufitowej");
    }

    public boolean isWlaczona() {
        return wlaczona;
    }

    public void setWlaczona(boolean wlaczona) {
        this.wlaczona = wlaczona;
    }
}
