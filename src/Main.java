import javax.imageio.plugins.tiff.TIFFImageReadParam;
import javax.naming.PartialResultException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] match = new int[5];
        int totalscore = 0;
        System.out.println("Введите голы за матч: ");
        for (int i = 0; i < match.length; i ++) {
            System.out.println("Матч " + (i + 1) + ": ");
            match[i] = scan.nextInt();
            totalscore = totalscore + match[i];
        }
        int max = match[0];
        int min = match[0];
        int last = match[match.length -1];
        for (int i = match.length -1; i > 0; i--) {
            match[i] = match[i - 1];
        }
        System.out.println("После сдвига: ");
        for (int i = 0; i < match.length; i++) {
            System.out.println("Матч " + (i + 1) + ": " + match[i]);
            if (max < match[i]) {
                max = match[i];
            }
            if (min > match[i]) {
                min = match[i];
            }

        }
        System.out.println("Лучший матч: " + max);
        System.out.println("Худчший матч: " + min);
        System.out.println("Обшее количество глов: " + totalscore);


    }

        }

