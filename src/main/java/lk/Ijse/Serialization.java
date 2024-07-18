package lk.Ijse;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) {
        Studnt s = new Studnt("1", "nishan", "20");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Nishan");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(s);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println(s);
            System.out.println("Object has been Serialized");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
