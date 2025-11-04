import java.util.Scanner;

public class TestUKLS12 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Masukkan bilangan");
        int bilangan = input.nextInt();

        //menentukan apakah bilangan ganjik atau genap
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangana genap.");
        } else {
            System.out.println(bilangan + " adalah");
        }
    }
}
