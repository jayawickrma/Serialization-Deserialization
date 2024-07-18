package lk.Ijse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

    public static void main(String[] args) {
        Studnt studnt =null;
        try(ObjectInputStream objectInputStream =new ObjectInputStream(new FileInputStream("nisha"))){
            studnt =(Studnt)objectInputStream.readObject();
            System.out.println("deserialization "+studnt);

        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
