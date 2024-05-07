package util;

import java.security.MessageDigest;
import org.apache.commons.codec.binary.Base64;

public class Encode {
    public static String toSHAI(String str) {

        String slat = "kbafafbafkabfkafka";
        String result = null;
        str = str + slat;

        try {
            byte[] dataBytes = str.getBytes("UTF-8");
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            result = Base64.encodeBase64String(md.digest(dataBytes));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

    }
}
