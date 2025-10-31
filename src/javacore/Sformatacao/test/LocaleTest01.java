package javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Calendar calendar = Calendar.getInstance();
        DateFormat df1 =  DateFormat.getDateTimeInstance();
        DateFormat df2 = DateFormat.getDateTimeInstance();
        // Era para sair a data da italia e da suiça

        System.out.println(localeItaly.getDisplayCountry(localeIndia));
        System.out.println(localeItaly.getDisplayCountry(localeCH));

    }
}
