package com.anastasia.app.practice.learn.text;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by Anastasia on 11.07.2017.
 */
public class IOUtils {

    public static void fileToFile(String sourse, String target){

        try(BufferedReader reader = new BufferedReader(new FileReader(sourse))) {
            try (PrintWriter writer = new PrintWriter(target)) {
                while (true){
                    String tmp = reader.readLine();
                    if(tmp == null) break;
                    writer.println(tmp);
                }

                //reader.lines().forEach(writer::println);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static void fileProcessing(String fileName, Consumer<String> consumer) {
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            reader.lines().forEach(consumer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileToFileWithTransform(String sourse, String target, Function<String, String> transform){

        try(BufferedReader reader = new BufferedReader(new FileReader(sourse))) {
            try (PrintWriter writer = new PrintWriter(target)) {
                while (true){
                    String tmp = reader.readLine();
                    if(tmp == null) break;
                    tmp = transform.apply(tmp);
                    writer.println(tmp);
                }

//                reader.lines().map(transform).forEach(writer::println);
//                reader.lines().forEach(line -> writer.println(transform.apply(line)));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void changeFileLines(String fileName, Function<String, String> transform){
        try {
            Path tmpFile = Files.createTempFile("tmp", "txt");

            IOUtils.fileToFileWithTransform(fileName, tmpFile.toString(), line -> line);
            IOUtils.fileToFileWithTransform(tmpFile.toString(), fileName, transform);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
