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


    //       5. Verilmiş ədədin neçə mərtəbəli olduğunu təyin edin. Məs: İnput: 23456  Output: 5
    static void myFunc5(int number) {
        int a = number;
        int count = 0;
        do {
            count++; //4
            a = a / 10; //5

        } while (a % 10 != 0);
        System.out.println(count);
    }

    //            6. 1-den 100-e qeder sade ededleri cap edin.
    //            Verlmiş ədədin sadə rəqəmlərinin cəmini tapın. Məs: İnput: 123456  Output: 11

    static void myFunc6() {
        int i = 0;
        int num = 0;
        String primeNumbers = "";
        for (i = 1; i <= 100; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);
    }

    //       7. İnteger massivində verilmiş ədədlərin ən böyüyünü tapın. Məs: İnput: [10,23,2,45,7]  Output: 45
    static void myFunc7() {
        int[] myarr = new int[]{10, 23, 2, 45, 7};
        int element = myarr[0];
        for (int i = 0; i < myarr.length; i++) {
            if (element < myarr[i]) {
                element = myarr[i];
            }
        }
        System.out.println(element);

    }

    //            8. Verlmiş ədədin palindrome olub-olmamasını yoxlayın. Məs: İnput: 123321 Output: true
    static boolean myFunc8(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }

    //            9.  Verilmiş ədədin rəqəmlərinin unikal(təkrarlanmayan) olub-olmamasını yoxlayın.
//    Məs: İnput: 53213 Output: false(3 ədədi təkrarlanır)
    static boolean myFunc9() {
        int number = 3321;
        while (number > 0) {
            int currentDigit = number % 10;//3
            int remainingDigits = number / 10;//12

            while (remainingDigits > 0) {//12
                int nextDigit = remainingDigits % 10; //2
                if (currentDigit == nextDigit) {//3==2
                    return false;
                }
                remainingDigits /= 10;//1
            }

            number /= 10;
        }

        return true;
    }
   // Task 10:
   // Metod yazin ki daxil sozde axtarilan elementin nece defe oldugunu tapsin
    static void myFunc10(char search){
        String str="salam";
        int count=0;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)==search){
                count++;
            }

        }
        System.out.println(count);

    }
    public static void main(String[] args) {
//        myFunc1();
//        myFunc2();
//        myFunc3();
//        myFunc4();
//        myFunc5(54321);
//        myFunc6();
//        myFunc7();
//        System.out.println( myFunc8(12332));
//        System.out.println(myFunc9());
        myFunc10('a');
    }
}
