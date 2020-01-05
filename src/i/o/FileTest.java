package i.o;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileTest {
    public static void main(String[] args) throws IOException {

        // Create File
        File file = new File("C:\\Users\\Bohdan\\IdeaProjects\\Trainings\\IO.txt");
//        file.createNewFile();

        // #1 method Write to file

//        String s = "Hello from UNIT City :)";
//        try (OutputStream outputStream = new FileOutputStream(file, true)) {
//            outputStream.write(s.getBytes());
//            System.out.println("File is written");

        // #2 method Write to file

//        PrintWriter printWriter = new PrintWriter(file);
////        printWriter.println("good");
////        printWriter.println("day");
////        printWriter.close();
////        System.out.println("File is written");

        // read from file


        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while((st = br.readLine())!= null ){
            System.out.println(st);
        }
        // read file using Scanner
//        Scanner sc = null;
//        try {
//            sc = new Scanner(file);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        while (sc.hasNextLine())
//            System.out.println(sc.nextLine());

//        try (FileWriter f = new FileWriter(file, true)) {
//            String s = "Good EVE";
//            f.write(s);
//        }
//        System.out.println("DONE");

//        try (Stream<String> readFile = Files.lines(Paths.get(String.valueOf(file)))) {
//            readFile.forEach(System.out::println);
        }
    }





