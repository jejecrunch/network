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
        Person p1 = new Person(3, "홍길동", birthday);
        writeToFile(p1, "d:/1_university/000 전공/소프트웨어공학과/강의내용정리/3학년 2학기/네트워크프로그래밍/실습/temp/file4.dat");
        Person p2 = readFromFile("d:/1_university/000 전공/소프트웨어공학과/강의내용정리/3학년 2학기/네트워크프로그래밍/실습/temp/file4.dat");
        System.out.println(p1);
        System.out.println(p2);
    }

}

