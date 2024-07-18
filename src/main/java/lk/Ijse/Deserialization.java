package lk.Ijse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        try(ObjectInputStream objectInputStream =new ObjectInputStream(new FileInputStream("nishan"))){
            Studnt desirialization =(Studnt)objectInputStream.readObject();
            System.out.println("deserialization "+desirialization);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
