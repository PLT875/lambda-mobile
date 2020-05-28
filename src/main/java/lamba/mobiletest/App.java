package lamba.mobiletest;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
//import com.google.i18n.phonenumbers.NumberParseException;
//import com.google.i18n.phonenumbers.PhoneNumberUtil;
//import com.google.i18n.phonenumbers.Phonenumber;
import com.google.i18n.phonenumbers.Random;
import org.apache.commons.validator.routines.EmailValidator;

/*
 * Runs with error:
 * Error loading class lamba.mobiletest.App: com/google/i18n/phonenumbers/NumberParseException: java.lang.NoClassDefFoundError
 * java.lang.NoClassDefFoundError: com/google/i18n/phonenumbers/NumberParseException
 */
public class App implements RequestHandler<Object, Object> {

    @Override
    public Object handleRequest(Object input, Context context) {
        System.out.println("Hello World!");

        // test if no issue with import any external lib
        boolean validEmail = EmailValidator.getInstance().isValid("peter.tran@sainsburys.co.uk");
        System.out.println(validEmail);

        Random random = new Random("test with same package name com.google.i18n.phonenumbers");
        System.out.println(random.getRandom());

        // seems to cause issue?
//        PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();
//        try {
//            Phonenumber.PhoneNumber no = phoneNumberUtil.parse("07384432179", "GB");
//            System.out.println(no.getNationalNumber());
//        } catch (NumberParseException e) {
//            System.out.print(e);
//        }
        return null;
    }
}
