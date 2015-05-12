
import utfpr.ct.dainf.if62c.avaliacao.Complexo;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná DAINF - Departamento
 * Acadêmico de Informática IF62C - Fundamentos de Programação 2
 *
 * Primeira avaliação parcial 2014/2.
 *
 * @author
 */
public class Avaliacao1 {

    public static void main(String[] args) {
        Complexo a1, a2, b1, b2, c1, c2;
        Complexo[] resposta1 = new Complexo[2];
        Complexo[] resposta2 = new Complexo[2];
        a1 = new Complexo(1, 0);
        b1 = new Complexo(5, 0);
        c1 = new Complexo(4, 0);
        a2 = new Complexo(1, 0);
        b2 = new Complexo(2, 0);
        c2 = new Complexo(5, 0);
        resposta1 = raizesEquacao(a1, b1, c1);
        resposta2 = raizesEquacao(a2, b2, c2);
        System.out.println("x1 = " + resposta1[0].toString() + "\n");
        System.out.println("x2 = " + resposta1[1].toString() + "\n");
        System.out.println("y1 = " + resposta2[0].toString() + "\n");
        System.out.println("y2 = " + resposta2[1].toString() + "\n");
    }

    public static Complexo[] raizesEquacao(Complexo a, Complexo b, Complexo c) {
        Complexo[] vetor = new Complexo[2];
        Complexo[] raiz = new Complexo[2];
        Complexo delta = new Complexo();
        delta = b.prod(b).sub(a.prod(c.prod(4)));
        raiz = delta.sqrt();
        vetor[0] = (b.prod(-1).soma(raiz[0])).div(a.prod(2));
        vetor[1] = (b.prod(-1).soma(raiz[1])).div(a.prod(2));
        return vetor;
    }
}
