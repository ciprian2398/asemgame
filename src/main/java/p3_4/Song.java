package p3_4;

public class Song {
    private String denumire;
    private String gen;
    private String interpret;
    private double durata;
    private String autorVersuri;
    private String autorMuzica;
    private int an;
    private double pretItuneUSD;

    public Song() {
    }

    public Song(String denumire, String gen, String interpret) {
        this.denumire = denumire;
        this.gen = gen;
        this.interpret = interpret;
        this.durata = 0.0;
        this.autorVersuri = "No Author";
        this.autorMuzica = "No Author";
        this.an = 2000;
        this.pretItuneUSD = 0.0;
    }

    public Song(String denumire, String gen, String interpret, double durata, String autorVersuri, String autorMuzica, int an, double pretItuneUSD) {
        this.denumire = denumire;
        this.gen = gen;
        this.interpret = interpret;
        this.durata = durata;
        this.autorVersuri = autorVersuri;
        this.autorMuzica = autorMuzica;
        this.an = an;
        this.pretItuneUSD = pretItuneUSD;
    }

    public String getDenumireUpper() {
        return denumire.toUpperCase();
    }

    public double calcPretItuneLei(){
        return pretItuneUSD * 17.13;
    }

    public double calcRaportDurataPretUSD(){
        return durata / getPretItuneUSD();
    }

    public double calcRaportDurataPretLei(){
        return durata / calcPretItuneLei();
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getInterpret() {
        return interpret;
    }

    public void setInterpret(String interpret) {
        this.interpret = interpret;
    }

    public double getDurata() {
        return durata;
    }

    public void setDurata(double durata) {
        this.durata = durata;
    }

    public String getAutorVersuri() {
        return autorVersuri;
    }

    public void setAutorVersuri(String autorVersuri) {
        this.autorVersuri = autorVersuri;
    }

    public String getAutorMuzica() {
        return autorMuzica;
    }

    public void setAutorMuzica(String autorMuzica) {
        this.autorMuzica = autorMuzica;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public double getPretItuneUSD() {
        return pretItuneUSD;
    }

    public void setPretItuneUSD(double pretItuneUSD) {
        this.pretItuneUSD = pretItuneUSD;
    }

    @Override
    public String toString() {
        return "Song{" +
                "denumire='" + denumire + '\'' +
                ", gen='" + gen + '\'' +
                ", interpret='" + interpret + '\'' +
                ", durata=" + durata +
                ", autorVersuri='" + autorVersuri + '\'' +
                ", autorMuzica='" + autorMuzica + '\'' +
                ", an=" + an +
                ", pretItuneUSD=" + pretItuneUSD +
                '}';
    }
}