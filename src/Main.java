import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    File file = new File("yob1880sorted.txt");

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year:");
        File file = new File("/home/compsci/IdeaProjects/sort/src/names/yob" + scan.nextLine() + "sorted.txt");
        System.out.println("Enter Name");
        String name = scan.nextLine().toLowerCase();
        int lincounter = 0;


        Scanner sc = new Scanner(file);



        for (int i = 0; i < Files.lines(Paths.get(String.valueOf(file))).count(); i++) {

            if (sc.hasNext()) {
                lincounter++;
                String test = sc.nextLine();
                String SortName = test.toLowerCase();

                if (SortName.substring(0, SortName.indexOf(",")).equals(name)) {
                    System.out.println(test);
                    System.out.println(lincounter);

                }
            }
        }
    }
}
