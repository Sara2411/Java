public class ContaVocali {

    public int contaVocali(String testo, char a, char e, char i, char o, char u) {
    int contA = 0;
    int contE = 0;
    int contI = 0;
    int contO = 0;
    int contU = 0;

    for (int k=0; k<testo.length(); k++) {
        if (testo[k].equals(a)) contA++;

    return contA;
    }

    for (int k=0; k<testo.length(); k++) {
        if (testo[k].equals(e)) contE++;

    return contE;
    }

    for (int k=0; k<testo.length(); k++) {
        if (testo[k].equals(i)) contI++;

    return contI;
    }

    for (int k=0; k<testo.length(); k++) {
        if (testo[k].equals(o)) contO++;

    return contO;
    }

    for (int k=0; k<testo.length(); k++) {
        if (testo[k].equals(u)) contU++;

    return contU;
    }

    }

}
