package lesson_7;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AppData {
    private String[] header;

    private int[][] data;
}
