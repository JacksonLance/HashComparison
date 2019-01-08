import javax.xml.bind.DatatypeConverter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HP {
    public HP()
    {

    }

    public static String ToSHA256(byte[] convertSHA) {
        MessageDigest md = null;
        String hashtext = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
            byte[] message = md.digest(convertSHA);
            BigInteger no = new BigInteger(1, message);
            hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return hashtext;
    }
    public static String ToSHA512(byte[] convertSHA) {
        MessageDigest md = null;
        String hashtext = null;
        try {
            md = MessageDigest.getInstance("SHA-512");
            byte[] message = md.digest(convertSHA);
            BigInteger no = new BigInteger(1, message);
            hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return hashtext;
    }
    public static Boolean Compare(String s, String two)
    {
        Boolean b = false;
        if (s.compareTo(two) == 0)
        {
            b = true;
        }
        return b;
    }
    public static Boolean CompareSHA256(String s, String two)
    {
        return Compare(ToSHA256(s.getBytes()),ToSHA256(two.getBytes()));

    }
    public static Boolean CompareSHA512(String s, String two)
    {
        return Compare(ToSHA512(s.getBytes()),ToSHA512(two.getBytes()));

    }
    public static Boolean CompareBooleans(String s, String two)
    {
        return (CompareSHA256(s, two) == CompareSHA512(s,two));
    }


}
