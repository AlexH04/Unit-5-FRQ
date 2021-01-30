import java.util.Random;
import java.lang.Math;

public class PasswordGenerator {
    private String password = null;
    private int passcount = 0;
    private int digits;
    private String prefix;
    public PasswordGenerator(int dig, String pref) {
        if (pref.equals(null)) {
            pref = "A";
        }
        digits = dig;
        prefix = pref;
    }

    public String pwGen() {
        Random randgen = new Random();
        password = prefix;
        password += ".";
        int rand = randgen.nextInt((int)Math.pow(10, digits + 1));
        password += rand;
        passcount++;
        return password;
    }

    public int pwCount() {
        return passcount;
    }

    public static void main(String[] args) {
        PasswordGenerator pass = new PasswordGenerator(4, "abc");
        System.out.println(pass.pwGen());
        System.out.println(pass.pwCount());
    }
}
