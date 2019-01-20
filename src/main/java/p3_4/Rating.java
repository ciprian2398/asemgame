package p3_4;

public class Rating extends Song {
    private double popularitateInterpret;

    public Rating() {
    }

    public Rating(double popularitateInterpret) {
        this.popularitateInterpret = popularitateInterpret;
    }

    public Rating(String denumire, String gen, String interpret, double popularitateInterpret) {
        super(denumire, gen, interpret);
        this.popularitateInterpret = popularitateInterpret;
    }

    public Rating(String denumire, String gen, String interpret, double durata, String autorVersuri, String autorMuzica, int an, double pretItuneUSD, double popularitateInterpret) {
        super(denumire, gen, interpret, durata, autorVersuri, autorMuzica, an, pretItuneUSD);
        this.popularitateInterpret = popularitateInterpret;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "popularitateInterpret=" + popularitateInterpret +
                "} " + super.toString();
    }

}