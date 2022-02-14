
package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Comprobar {
    
        public static boolean esEmail(String email) {

        boolean valido = false;

        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+´)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mEmail = pattern.matcher(email.toLowerCase());
        if (mEmail.matches()) {
            valido = true;
        }
        return valido;
    }

    public static boolean esInt(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean esContra(String contra) {

        boolean mayus = false;
        boolean num = false;
        boolean min = false;
        char c;

        if (contra.length() > 8) {

            for (int i = 0; i < contra.length(); i++) {

                c = contra.charAt(i);

                if (Character.isDigit(c)) {
                    num = true;

                    if (Character.isUpperCase(c)) {
                        mayus = true;

                        if (Character.isLowerCase(c)) {
                            min = true;

                        }
                    }
                }
            }
            if (num && min && mayus) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
}
