import java.io.*;
import java.util.*;


public class Main{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws FileNotExist {
        String[] records;
        File file = new File("E:\\java\\phonebook.txt");
        while (true) {
            try {
                records = report("Введите через пробел: ФИО, дату рождения, номер телефона(10 цифр) и пол (f или m): ");
                Checking.checkAmount(records);
                for (int i = 0; i < records.length; i++) {
                    checkFormat(records, i);
                }
                ArrayList<String> people = new ArrayList<>(Arrays.asList(records));
                recordFile(people, file);
            } catch (RuntimeException e) {
                System.out.println();
            }
        }
    }
    public static String[] report(String msg) {
        System.out.println(msg);
        return scanner.nextLine().split(" ");
    }
    public static void checkFormat(String[] records, int i) {
        switch (i) {
            case 0:
                if (Checking.checkString(records[0]))
                    throw new allException(-1);
            case 1:
                if (Checking.checkString(records[1]))
                    throw new allException(-1);
            case 2:
                if (Checking.checkString(records[2]))
                    throw new allException(-1);
            case 3:
                if (!Checking.checkDate(records[3])) throw new allException(-3);
            case 4:
                if (!Checking.checkString(records[4]) && records[4].length() < 11 && records[4].length() > 0)
                    throw new allException(-2);
            case 5:
                if (!records[5].equals("f") && !records[5].equals("m")) throw new allException(-4);
        }
    }
    public static void recordFile(ArrayList<String> data, File file) {
        try (FileWriter recordsFile = new FileWriter(file, true)) {
            for (String s : data) {
                recordsFile.write("<" + s + ">");
            }
            recordsFile.append('\n');
            recordsFile.flush();
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }
}