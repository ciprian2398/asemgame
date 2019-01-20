package p3_4;

public class Rap extends Rating {
    private int numarDescarcari;

    public Rap() {
    }

    public Rap(int numarDescarcari) {
        this.numarDescarcari = numarDescarcari;
    }

    public Rap(double popularitateInterpret, int numarDescarcari) {
        super(popularitateInterpret);
        this.numarDescarcari = numarDescarcari;
    }

    public Rap(String denumire, String gen, String interpret, double popularitateInterpret, int numarDescarcari) {
        super(denumire, gen, interpret, popularitateInterpret);
        this.numarDescarcari = numarDescarcari;
    }

    public Rap(String denumire, String gen, String interpret, double durata, String autorVersuri, String autorMuzica, int an, double pretItuneUSD, double popularitateInterpret, int numarDescarcari) {
        super(denumire, gen, interpret, durata, autorVersuri, autorMuzica, an, pretItuneUSD, popularitateInterpret);
        this.numarDescarcari = numarDescarcari;
    }

    @Override
    public String toString() {
        return "Rap{" +
                "numarDescarcari=" + numarDescarcari +
                "} " + super.toString();
    }
}