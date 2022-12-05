import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập vào số điện: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number < 0)
            System.out.println("Vui lòng nhập lại số");
        else if(number >0 && number < 51)
            System.out.println("Tiền điện là: " + z1(number));
        else if(number > 50 && number <101) {
            int price = z1(50) + z2(number - 50);
            System.out.println("Tiền điện là: " + price);
        }else if(number > 100 && number <201) {
            int price = z1(50) + z2( 50) + z3(number - 100);
            System.out.println("Tiền điện là: " + z1(number));
        }else if(number > 200 && number < 301){
            int price = z1(50) + z2( 50) + z3(100) + z4(number - 200);
            System.out.println("Tiền điện là: " + price);
        }
        else if(number > 300 && number < 401){
            int price = z1(50) + z2( 50) + z3(100) + z4(100) + z5(number - 300);
            System.out.println("Tiền điện là: " + price);
        }
        else{
            int price = z1(50) + z2( 50) + z3(100) + z4(100) + z5(100) + z6(number - 400);
            System.out.println("Tiền điện là: " + price);
        }

    }
    public static int z1(int number){
        return number*1678;
    }
    public static int z2(int number){
        return number*1734;
    }
    public static int z3(int number){
        return number*2014;
    }
    public static int z4(int number){
        return number*2536;
    }
    public static int z5(int number){
        return number*2834;
    }
    public static int z6(int number){
        return number*2927;
    }

}