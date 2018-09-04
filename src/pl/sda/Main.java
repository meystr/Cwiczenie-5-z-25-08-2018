//5. W tablicy liczb (wpisanej przez Ciebie na sztywno) wyświetl element maksymalny
package pl.sda;

public class Main {

    public static void main(String[] args) {
        int tablica[] = {-1,-432,-2345,-2,1};
        int wynik = 0;

        if (tablica[0] < wynik) {
            wynik = tablica[0];
        }
        for (int i = 0; i < tablica.length; i++) {

            if ( tablica[i] > wynik)
            {
                wynik = tablica[i];
            }
        }
        System.out.print(wynik);
    }
}
