/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuLieu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author trung
 */
public class Regex {

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX
            = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    public static final Pattern VALID_PHONE_NUMBER_RREGEX = Pattern.compile("(\\d{10,11})");
    public static final Pattern VALID_DATE_RREGEX = Pattern.compile("^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$",Pattern.CASE_INSENSITIVE);
    
    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }
    public static boolean checkphone(String phone){
        Matcher matcher=VALID_PHONE_NUMBER_RREGEX.matcher(phone);
        return matcher.find();
    }
    public static boolean checkdate(String date){
        Matcher matcher=VALID_DATE_RREGEX.matcher(date);
        return matcher.find();
    }
    public static void main(String[] args) {
        System.out.println(checkdate("2016-02-03"));
    }
}
