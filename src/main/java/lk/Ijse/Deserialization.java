package lk.Ijse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        Studnt student = null;

        try {
            FileInputStream fileInputStream = new FileInputStream("nishan");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            student = (Studnt) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("Deserialized Student Object: " + student);
        } catch (FileNotFoundException e) {
            System.out.println( e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println( e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
