package lesson_7;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] columns = {"v1", "v2", "v3"};
        int[][] values = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        AppData appData = new AppData(columns, values);

        AppDataSerializer appDataSerializer = new AppDataSerializer();
        appDataSerializer.save("data.csv", appData);
    }
}