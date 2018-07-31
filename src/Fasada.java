public class Fasada {

    //klasa supernadrzędna

    Konsola konsola = new Konsola();
    LampaPrzyTelewizorze lampaPrzyTelewizorze = new LampaPrzyTelewizorze();
    LampaSufitowa lampaSufitowa = new LampaSufitowa();
    LampkaNocna lampkaNocna = new LampkaNocna();
    Radio radio = new Radio();
    TV tv = new TV();



    void oglądanieFilmu(String tytul){

        zerujUstawieniaSwiatla();
        System.out.println("TRYB OGLĄDANIE FILMU");
        tv.wlaczNetflixa();
        tv.wybierzFilm(tytul);
        lampaPrzyTelewizorze.swiec(6, "różowy");
        lampkaNocna.swiec(6, "pomarańczowy");
    }

    void zakonczOgladanie(){

        System.out.println("ZAKOŃCZENIE OGLĄDANIA");
        tv.wylaczTV();
        wejscieDoDomu();
    }

    void porannaRutyna(){
        System.out.println("TRYB PORANEK");
        lampkaNocna.swiec(10, "biały");
        radio.wlaczRadio();
        radio.ustawStacje("Antyradio");
        radio.ustawGlosnosc(7);
    }

    void opuszczamDom(){
        System.out.println("TRYB WYJSCIE Z DOMU");
        zerujUstawieniaSwiatla();
        radio.wylaczRadio();
        konsola.wylacz();
        tv.wylaczTV();

    }

    void graNaKonsoli(String tytulGry){
        System.out.println("TRYB GRA");
        zerujUstawieniaSwiatla();
        konsola.wlacz();
        konsola.wybierzGre(tytulGry);

    }

    void zakonczGre(){
        System.out.println("KONIEC GRY");
        zerujUstawieniaSwiatla();
        wejscieDoDomu();
        konsola.wylacz();

    }

    void sen(){
        System.out.println("TRYB SEN");
        zerujUstawieniaSwiatla();
        radio.wlaczRadio();
        radio.ustawGlosnosc(4);
        radio.ustawStacje("trójka");
        lampaPrzyTelewizorze.swiec(3,"pomaranczowy");

    }


    void wejscieDoDomu(){
        System.out.println("TRYB WEJŚCIE");
        zerujUstawieniaSwiatla();
        lampaSufitowa.swiec(7, "ciepły żółty");

    }

    void zerujUstawieniaSwiatla(){
        lampaSufitowa.nieSwiec();
        lampkaNocna.nieSwiec();
        lampaPrzyTelewizorze.nieSwiec();
    }
}
