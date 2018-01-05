import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class kolejkaDodawanie {

    public static void main(String[] args) {

        Queue<Integer> liczby = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int licznik = 1;
        do {
            System.out.print("Podaj liczbę numer " + licznik + ":");
            liczby.offer(scanner.nextInt());
            licznik++;
        } while (licznik <= 10);

        int licznik2 = 1;
        System.out.print("\nSuma: ");
        for (Integer integer : liczby) {
            if (licznik2 < 10)
                System.out.print(integer + "+");
            else
                System.out.print(integer);
            licznik2++;
        }

        int sum = 0;
        while (liczby.peek() != null){
            sum = sum + liczby.poll();
        }
        System.out.println(" wynosi: " + sum);
    }
}
