import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        final String secretKey = new String(array, Charset.forName("UTF-8"));

        System.out.println("Key "+secretKey);

        Encrypt en=new Aes();

        Scanner sc=new Scanner(System.in);

        String originalString = sc.nextLine();
        sc.close();
        String encryptedString = en.encrypt(originalString, secretKey) ;

        en=new NewEncrypt();

        String newen=en.encrypt(encryptedString,"");

        String newde=en.decrypt(newen,"");
        en= new Aes();
        String decryptedString = en.decrypt(newde, secretKey) ;

        System.out.println(originalString);
        //System.out.println(encryptedString);



        System.out.println(newen);
        //System.out.println(newde);
        System.out.println(decryptedString);
    }
}











/*
import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        final String secretKey = new String(array, Charset.forName("UTF-8"));

        System.out.println("Key "+secretKey);

        Encrypt en=new Aes();

        Scanner sc=new Scanner(System.in);

        String originalString = sc.nextLine();
        sc.close();
        String encryptedString = en.encrypt(originalString, secretKey) ;

        en=new Des();
        String des=en.encrypt(encryptedString,"");
        en=new NewEncrypt();

        String newen=en.encrypt(des,"");

        String newde=en.decrypt(newen,"");

        en=new Des();
        String desde=en.decrypt(newde,"");


        en= new Aes();
        String decryptedString = en.decrypt(desde, secretKey) ;

        System.out.println(originalString);
        //System.out.println(encryptedString);



        System.out.println(newen);
        //System.out.println(newde);
        System.out.println(decryptedString);
    }
}




 */