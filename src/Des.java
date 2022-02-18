import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public class Des extends Encrypt{
    Cipher myCipher;
    public static SecretKey getKey() throws Exception{
        KeyGenerator Mygenerator = KeyGenerator.getInstance("DES");

        SecretKey myDesKey = Mygenerator.generateKey();
return myDesKey;
    }
    {

        try {
            myCipher = Cipher.getInstance("DES");
                  } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String encrypt(String msg, String key){
        String encrypteddata="";
        try {
        String message = msg;
        byte[] myMessage = message.getBytes(); //string to byte array as DES works on bytes

        myCipher.init(Cipher.ENCRYPT_MODE, getKey());
        byte[] myEncryptedBytes = myCipher.doFinal(myMessage);


        //myCipher.init(Cipher.DECRYPT_MODE, getKey());
        //byte[] myDecryptedBytes = myCipher.doFinal(myEncryptedBytes);


        encrypteddata = new String(myEncryptedBytes);
        //String decrypteddata = new String(myDecryptedBytes);

        //System.out.println("Message : " + message);
        System.out.println("Encrypted - " + encrypteddata);
       // System.out.println("Decrypted Message - " + decrypteddata);
    }
    catch (Exception e){

    }

    return encrypteddata;
}
    public String decrypt(String cipher, String key){
        byte[] myEncryptedBytes = cipher.getBytes(); //string to byte array as DES works on bytes
        String decrypteddata="";
        try{
        myCipher.init(Cipher.DECRYPT_MODE, getKey());
        byte[] myDecryptedBytes = myCipher.doFinal(myEncryptedBytes);


        String encrypteddata = new String(myEncryptedBytes);
        decrypteddata = new String(myDecryptedBytes);

        //System.out.println("Message : " + message);
        //System.out.println("Encrypted - " + encrypteddata);
        System.out.println("Decrypted Message - " + decrypteddata);}
    catch (Exception e){

    }
    return decrypteddata;
    }
}
