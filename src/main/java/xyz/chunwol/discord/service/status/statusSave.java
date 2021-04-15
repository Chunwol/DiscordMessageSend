package xyz.chunwol.discord.service.status;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class statusSave {
    private static String filePath = "status.txt";

    public static void write(String o) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("[ MM/dd kk:mm ]", Locale.getDefault());
        String date = sdf.format(cal.getTime());
        String status = date +"  "+ o;
        try{
            FileOutputStream output=new FileOutputStream(filePath,false);
            OutputStreamWriter writer=new OutputStreamWriter(output,"UTF-8");
            BufferedWriter out=new BufferedWriter(writer);
            out.write(status);
            out.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static String getFilePath() {
        return filePath;
    }

    public static void setFilePath(String filePath) {
        statusSave.filePath = filePath;
    }
}