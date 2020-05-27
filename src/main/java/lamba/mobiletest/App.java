package lamba.mobiletest;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import org.apache.commons.validator.routines.EmailValidator;

public class App implements RequestHandler<Object, Object> {

    @Override
    public Object handleRequest(Object input, Context context) {
        System.out.println("Hello World!");

        boolean validEmail = EmailValidator.getInstance().isValid("peter.tran@sainsburys.co.uk");
        System.out.println(validEmail);

        PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();
        try {
            Phonenumber.PhoneNumber no = phoneNumberUtil.parse("07471149533", "GB");
            System.out.println(no.getNationalNumber());
        } catch (NumberParseException e) {
            System.out.print(e);
        }
        return null;
    }
}
