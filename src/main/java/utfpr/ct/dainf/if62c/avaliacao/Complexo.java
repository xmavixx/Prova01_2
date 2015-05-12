package utfpr.ct.dainf.if62c.avaliacao;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná DAINF - Departamento
 * Acadêmico de Informática IF62C - Fundamentos de Programação 2
 *
 * Primeira avaliação parcial 2014/2.
 *
 * @author
 */
public class Complexo {

    private double real;
    private double img;

    public Complexo() {
    }

    public Complexo(double real1, double img1) {
        real = real1;
        img = img1;
    }

    public double getReal() {
        return real;
    }

    public double getImg() {
        return img;
    }

    public Complexo soma(Complexo c) {
        return new Complexo(real + c.real, img + c.img);
    }

    public Complexo sub(Complexo c) {
        return new Complexo(real - c.real, img - c.img);
    }

    public Complexo prod(double r) {
        return new Complexo(r * real, r * img);
    }

    public Complexo prod(Complexo c) {
        return new Complexo(real * c.real - img * c.img, real * c.real + img * c.img);
    }

    public Complexo div(Complexo c) {
        return new Complexo(((real * c.real) + (img * c.img) / ((c.img * c.img) + (c.real * c.real))), (((c.real * img) - (real * c.img)) / ((c.img * c.img) + (c.real * c.real))));
    }

    // implementar sqrt()
    public Complexo[] sqrt() {
        Complexo[] raizes = new Complexo[1];

 
        return raizes;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (int) (Double.doubleToLongBits(real)
                ^ (Double.doubleToLongBits(real) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(img)
                ^ (Double.doubleToLongBits(img) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        final Complexo c = (Complexo) obj;
        return obj != null && getClass() == obj.getClass()
                && real == c.real && img == c.img;
    }

    @Override
    public String toString() {
        return String.format("%+f%+fi", real, img);
    }
}
