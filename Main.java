import java.util.Scanner;

public class Main {
    //  1.  1-1000 qədər ədədlərin içərisindən ələ ədədləri çap et ki:
    //    rəqəmləri cəmi 3-ə bölünsün və sonuncu rəqəm 3 olmasın.
    static void myFunc1() {
        for (int i = 0; i < 1000; i++) {
            int cem = 0;
            int lessNumber = i;
            while (lessNumber > 0) {
                cem += lessNumber % 10;
                lessNumber /= 10;
            }
            if (cem % 3 == 0 && (i % 10 != 3)) {
                System.out.println(i);
            }
        }
    }

    //  2.   arrayin reqemlerinin en kiciyini tapmaq
    static int myFunc2() {
        int[] myArray = {10, 20, 30, 40, 5};
        int min = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }
        return min;
    }
    // 3.     1-1000 qədər ədədlərin içərisindən ələ ədədləri çap et ki:
    //      həm rəqəmləri cəmi 5-ə bölünsün, həm də özü 5-ə bölünsün

    static void myFunc3() {
        for (int i = 0; i < 1000; i++) {
            int num = i;
            int cem = 0;
            while (num > 0) {
                cem += num % 10;
                num /= 10;
            }
            if (cem == 5 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    // 4.       Hər hansı bir ədəd daxil et,Bu ədədin ilk reqemini ədədin sonuna yazdır.
    static void myFunc4() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println(reverse);
    }


    public static void main(String[] args) {
        myFunc1();
        myFunc2();
        myFunc3();
        myFunc4();
    }
}
