package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Read a file with names and grades,
 * wites the valid data to a file and
 * non-valid to another.
 */
public class studentsGrades {
    static File dir = new File("C:/tmp");

    public static void main(String[] args) {
        String line = "";
        String filename = "C:/tmp/grades.txt";
        String[] parts;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            while ((line = br.readLine()) != null) {
                parts = line.split(" +");

                if (parts.length >= 4) {
                    String name = parts[0] + " " + parts[1];
                    int grade1 = Integer.parseInt(parts[2]);
                    int grade2 = Integer.parseInt(parts[3]);

                    if (gradesValidator(grade1,grade2)) {
                        writeDataToErrorFile(name, grade1, grade2);
                    } else {
                        writeDataToFile(name, grade1, grade2);
                    }

                } else {
                    System.out.println("Invalid data format: " + line);
                }
            }

        } catch (IOException e) {
            System.err.println("File not found!");
        }
    }

    /**
     * @param grade1    First grade
     * @param grade2    Second grade
     * @return          Average of the grades
     */
    public static int getAvg(int grade1, int grade2) {
        return (grade1 + grade2) / 2;
    }

    /**
     *
     * @param name      Srudent name
     * @param grade1    First grade
     * @param grade2    Second grade
     */
    public static void writeDataToFile(String name, int grade1, int grade2) {
        File primOut = new File(dir + "/" + "primOut.txt");
        try (PrintStream ps = new PrintStream(new FileOutputStream(primOut, true), true, StandardCharsets.UTF_8)) {
            ps.print(name + " ");
            ps.println(getAvg(grade1, grade2));
        } catch (IOException e) {
            System.out.println("Fail to write data...");
        }

    }

    /**
     *
     * @param name      Srudent name
     * @param grade1    First grade
     * @param grade2    Second grade
     */
    public static void writeDataToErrorFile(String name, int grade1, int grade2) {
        File log = new File(dir + "/" + "log.txt");
        try (PrintStream ps = new PrintStream(new FileOutputStream(log, true), true, StandardCharsets.UTF_8)) {
            ps.print(name + " ");
            ps.print(grade1 + " ");
            ps.print(grade2);
        } catch (IOException e) {
            System.out.println("Fail to write data...");
        }
    }

    /**
     *
     * @param grade1    First grade
     * @param grade2    Second grade
     * @return          True if the grades are valid
     *                  and false if they are not.
     */
    public static boolean gradesValidator(int grade1, int grade2) {
        return !(grade1 >= 0 && grade1 <= 10 && grade2 >= 0 && grade2 <= 10);
    }
}
