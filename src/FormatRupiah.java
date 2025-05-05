package util;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatRupiah {
    public static String format(double nominal) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(
            new Locale("id", "ID"));
        return formatter.format(nominal);
    }
}
