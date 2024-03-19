import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();

        // Citirea liniilor din fișier utilizând Scanner
        try {
            Scanner scanner = new Scanner(new File("lab4.txt"));
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Fișierul nu a fost găsit.");
            return;
        }

        // Afișarea conținutului fișierului
        System.out.println("Conținutul fișierului:");
        for (String line : lines) {
            System.out.println(line);
        }

        // Delimitator
        System.out.println("------------------------");

        // Sortarea liniilor
        Collections.sort(lines);

        // Afișarea liniilor sortate
        System.out.println("Conținutul fișierului sortat:");
        for (String line : lines) {
            System.out.println(line);
        }

        // Cautarea cuvantului "mere"
        boolean found = false;
        for (String line : lines) {
            if (line.toLowerCase().contains("mere")) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Fișierul conține cuvântul 'mere'.");
        } else {
            System.out.println("Fișierul nu conține cuvântul 'mere'.");
        }
    }
}
