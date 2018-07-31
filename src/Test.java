public class Test {
    public static void main(String[] args) {
        Fasada fasada = new Fasada();

        fasada.wejscieDoDomu();

        System.out.println();
        fasada.oglądanieFilmu("Indiana Jones");
        System.out.println();
        fasada.zakonczOgladanie();
        System.out.println();
        fasada.sen();
    }
}
