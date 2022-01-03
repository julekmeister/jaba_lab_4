public class Dom implements Budynek{

    private double pow;
    private String adres;
    private int value;
    private KolorEnum kolor;
    private double gZ;


    @Override
    public double powierzchnia(double pow) {
        this.pow=pow;
        return pow;
    }

    @Override
    public String adresBudynku(String adres) {
        this.adres=adres;
        return adres;
    }

    @Override
    public int liczbaOkien(int value) {
        this.value=value;
        return value;
    }

    @Override
    public void liczbaMieszkancow(int value) {
        this.value=value;

    }

    @Override
    public void kolorDomu(KolorEnum kolor) {
        this.kolor=kolor;

    }

    @Override
    public double gestosctZaludnienia(double pow, int liczbaMieszkancow) {
        this.gZ=liczbaMieszkancow/pow;
        return gZ;
    }

    public double getPow() {
        return pow;
    }

    public void setPow(double pow) {
        this.pow = pow;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }



    @Override
    public String toString() {
        return "Dom{" +
                "powierzchnia=" + pow +
                ", adres='" + adres + '\'' +
                ", liczbaOkien=" + value +
                ", gestosc zaludnienia=" + gZ +
                '}';
    }

    private void errorek(){
        System.out.println("Wystąpił nieoczekiwany błąd systemu grzewczego!");
    }
}
