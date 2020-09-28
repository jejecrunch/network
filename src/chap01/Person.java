package chap01;

import java.io.Serializable;
import java.util.Date;

//직렬화와 역직렬화 기능을 사용하기 위해 선언 추가
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    int id;
    String name;
    Date birthday;

    public Person(int id, String name, Date birthday) {
        super();
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return String.format("Person(%d, %s, %tF)", id, name, birthday);
    }

}

