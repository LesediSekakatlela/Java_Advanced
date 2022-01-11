import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SoccerDemo {
    public static void main(String[] args) {
        // pass the path to the file as a parameter
        File file = new File("C:\\Users\\admin\\Desktop\\java\\Java_Advanced\\SoccerApp\\src\\main\\resources\\results.txt");
        Scanner sc = null;
        String match, team1, team2;
        Integer iscore1, iscore2;

        String[] sides, l1, l2;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
