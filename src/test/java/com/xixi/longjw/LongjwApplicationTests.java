package com.xixi.longjw;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Date;

@SuppressWarnings("ALL")
@RunWith(SpringRunner.class)
@SpringBootTest
public class LongjwApplicationTests {

    @Autowired
    private PersonDao person_Dao;

    @Test
    public void testInsert() {
        Person person = new Person();
        person.setAge(26);
        person.setUserName("龙静文");
        person.setBirthday(new Date());
        int result = person_Dao.addPerson(person);
        System.out.println(result);
    }

    @Test
    public void testSelectTest() {
        Person result = person_Dao.findPersonById(1);
        System.out.println(result.getUserName());
    }

}
