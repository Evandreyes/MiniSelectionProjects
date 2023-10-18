import java.util.Scanner;


public class IpAdresses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Please enter the first octet: ");
        int FirstOctet = scan.nextInt();


        System.out.println("Please enter the second octet: ");
        int SecondOctet = scan.nextInt();


        System.out.println("Please enter the third octet: ");
        int ThirdOctet = scan.nextInt();


        System.out.println("Please enter the fourth octet: ");
        int FourthOctet = scan.nextInt();




        if(FirstOctet >= 0 && FirstOctet <= 255 ) {
            System.out.println("");
        }
        else{
            System.out.println("Octet 1 is incorrect");
        }
        if(SecondOctet >= 0 && SecondOctet <= 255 ) {
            System.out.println("");
        }
        else{
            System.out.println("Octet 2 is incorrect");
        }
        if(ThirdOctet >= 0 && ThirdOctet <= 255 ) {
            System.out.println("");
        }
        else{
            System.out.println("Octet 3 is incorrect");
        }
        if(FourthOctet >= 0 && FourthOctet <= 255 ) {
            System.out.println("");
        }
        else{
            System.out.println("Octet 4 is incorrect");
        }


        if( ThirdOctet >= 0 && ThirdOctet <= 255  && SecondOctet >= 0 && SecondOctet <= 255 && FirstOctet >= 0 && FirstOctet <= 255 && FourthOctet >= 0 && FourthOctet <= 255 ) {
            System.out.println("IP Address: " + FirstOctet + "." + SecondOctet + "." + ThirdOctet + "." + FourthOctet);
        }
    }
}

