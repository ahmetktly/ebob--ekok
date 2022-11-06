import java.util.Scanner;

public class ebobEkok{

    public static void main(String[] args) {
        
        Scanner inp=new Scanner(System.in);

        int ebob=1 ,ekok=1 , i=1 ;

        System.out.println("Birinci sayıyı giriniz");

        int num1=inp.nextInt();

        System.out.println("İkinci sayıyı giriniz");

        int num2=inp.nextInt();

        if(num1 > 0 && num2 > 0){

        if(num1 <= num2){

            while( i <= num1){

                i++;

                if (num1 % i ==0 && num2 % i ==0){

                ebob=i;
                }
            }

            System.out.println("Sayıların Ebob'u= "+ebob);

        }
        else if (num1>num2){

            while( i <= num2){

                i++;

                if (num1 % i ==0 && num2 % i ==0){

                ebob=i;
                }
              
            }

            System.out.println("Sayıların Ebob'u= "+ebob);

        }

        ekok= (num1*num2) / ebob;
        System.out.println("Sayıların ekok'u= "+ekok);
    }
    else{

        System.out.println("Sayılar doğal sayı olmalıdır");
    }   
    }
}