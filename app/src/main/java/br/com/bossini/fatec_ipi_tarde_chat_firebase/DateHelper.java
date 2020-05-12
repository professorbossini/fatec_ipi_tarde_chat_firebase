package br.com.bossini.fatec_ipi_tarde_chat_firebase;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

    public static String format (Date date){
        return sdf.format(date);
    }
}
