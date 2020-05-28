package lamba.mobiletest;

//import com.google.i18n.phonenumbers.NumberParseException;
//import com.google.i18n.phonenumbers.PhoneNumberUtil;
//import com.google.i18n.phonenumbers.Phonenumber;
import com.google.i18n.phonenumbers.Random;
import org.apache.commons.validator.routines.EmailValidator;

/**
 * java -cp build/libs/lamba-mobiletest.jar lamba.mobiletest.NormalApp
 *
 * This runs with no issues
 */
public class NormalApp {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        boolean validEmail = EmailValidator.getInstance().isValid("peter.tran@sainsburys.co.uk");
        System.out.println(validEmail);
        Random random = new Random("test with same package name com.google.i18n.phonenumbers");
        System.out.println(random.getRandom());

//        PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();
//        Random random = new Random("test with similar package name");
//        System.out.println(random.getRandom());
//        try {
//            Phonenumber.PhoneNumber no = phoneNumberUtil.parse("07384432179", "GB");
//            System.out.println(no.getNationalNumber());
//        } catch (NumberParseException e) {
//            System.out.print(e);
//        }

    }
}
