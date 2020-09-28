package chap01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.GregorianCalendar;

public class Example6 {

    static void writeToFile(Person person, String filePath)
            throws FileNotFoundException, IOException
    {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
            out.writeObject(person);
        }
    }

    static Person readFromFile(String filePath)
            throws FileNotFoundException, IOException, ClassNotFoundException
    {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
            return (Person)in.readObject();
        }
    }

    public static void main(String[] args)
            throws FileNotFoundException, IOException, ClassNotFoundException
    {
        Date birthday = new GregorianCalendar(1998, 8 - 1, 15).getTime();
        Person p1 = new Person(3, "ȫ�浿", birthday);
        writeToFile(p1, "d:/1_university/000 ����/����Ʈ������а�/���ǳ�������/3�г� 2�б�/��Ʈ��ũ���α׷���/�ǽ�/temp/file4.dat");
        Person p2 = readFromFile("d:/1_university/000 ����/����Ʈ������а�/���ǳ�������/3�г� 2�б�/��Ʈ��ũ���α׷���/�ǽ�/temp/file4.dat");
        System.out.println(p1);
        System.out.println(p2);
    }

}

