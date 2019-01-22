import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class X {

    /**
     * Extra over all is just a class to make the everyday coding stuff easier to write.
     * Simples said just a bunch of help methods;
     */

    public X(){

    }

    /**
     * An easier random funktion
     * @param min
     * @param max
     * @return double
     */

    protected static int ran(int min, int max){
        // makes max the max possible
        max = max - min;
        return ((int)(Math.random()*max)+min);
    }

    /**
     *  An easier random help funktion
     * @param max
     * @return
     */

    protected static int ran(int max){
        return ran(0,max);
    }

    /**
     * Console println
     * @param text
     */

    public static void println(String text){
        System.out.println(text);
    }

    /**
     * Console print
     * @param text
     */

    public static void print(String text){
        System.out.print(text);
    }

    /**
     * Reads from file
     * @param filePath
     * @return String
     */

    protected static String readFile(String filePath){
        String text = "";
        File file = new File(filePath);
        try {
            Scanner in = new Scanner(file);
            while (in.hasNextLine()) {
                text = text+in.nextLine()+"\n";
            }
            in.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return text;
    }

    /**
     * Makes a file
     * @param filePath
     * @param textToWrite
     */

    protected static void writeToFile(String filePath, String textToWrite){
        try {
            File file = new File(filePath);
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            boolean fileExists = file.createNewFile();
            if(fileExists){
                writer.append(textToWrite);
            }
            else{
                writer.write(textToWrite);
            }
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    /**
     * Print int arrays
     * @param array
     */

    public static void printIntArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    /**
     * Print char arrays
     * @param array
     */

    public static void printCharArray(char[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    /**
     * Print double arrays
     * @param array
     */

    public static void printDoubleArray(double[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    /**
     * Print String arrays
     * @param array
     */

    public static void printStringArray(String[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    /**
     * Prints arraylist all types
     * @param arraylist
     */

    public static void printArrayList(ArrayList arraylist){
        for(int i = 0; i < arraylist.size(); i++){
            System.out.println(arraylist.get(i));
        }
    }
}