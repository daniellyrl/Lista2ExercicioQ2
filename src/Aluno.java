public class Aluno {
    private double n1;
    private double n2;
    private double n3;
    private double media;

    public void setMedia(double media) {
        this.media = media;
    }

    public double getMedia() {
        return media;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN1() {
        return n1;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN2() {
        return n2;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public double getN3() {
        return n3;
    }

    public void calculo_media() {
        media = (n1 + n2 + n3)/3;
    }
}