import java.util.Scanner;

public class tempConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature : ");
        double temp = sc.nextDouble();
        System.out.println("Enter the scale for Fahrenheit : (F), for Celsius : (C) ");
        String scale = sc.next();

//        **************** USING IF-ELSE *********************

        if(scale.equalsIgnoreCase("F")){
            double ans = Math.round((temp - 32) * 5 / 9);
            System.out.println("The temperature in Celsius is " + ans + " degrees.");
        }else if(scale.equalsIgnoreCase("C")){
            double ans = Math.round(temp * 9 / 5 + 32);
            System.out.println("The temperature in Fahrenheit is " + ans + " degrees.");
        }else{
            System.out.println("Invalid scale ): \n Please enter a current scale.");
        }

    }
}
