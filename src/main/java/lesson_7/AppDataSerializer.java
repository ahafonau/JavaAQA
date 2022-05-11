package lesson_7;

import au.com.bytecode.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class AppDataSerializer {
    public void save(String path, AppData appdata) throws IOException {
        CSVWriter writer = new CSVWriter(new FileWriter(path), ';');
        writer.writeNext(appdata.getHeader());
        for (int i = 0; i < appdata.getData().length; i++) {
            String s = "";
            for (int n = 0; n < appdata.getData()[i].length; n++) {
                s = s + appdata.getData()[i][n] + ";";
            }
            writer.writeNext(s.split(";"));
        }

        writer.close();
    }
}
