package logger;

// @author Denis Valente

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Logger {

    public static void main(String[] args) {

        FileWriter out;
        String s;

        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int second = cal.get(Calendar.SECOND);
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);

        Scanner lettore = new Scanner(System.in);
        System.out.print("Inserisci la frase da traferire: ");
        s = lettore.nextLine();

        try {
            out = new FileWriter("data/log.txt");
            out.write("[" + day + "/" + (month + 1) + "/" + year + "  " + hour + ":" + minute + ":" + second + "]: ");
            out.write(s);
            out.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Errore: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Errore: " + ex.getMessage());
        }
    }
}

