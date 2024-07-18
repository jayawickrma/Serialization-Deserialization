package lk.Ijse;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) {
        Studnt studnt = new Studnt("1", "Nishan", "kalutara");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("student"))) {
            objectOutputStream.writeObject(studnt);
            System.out.println("serialization "+studnt);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
