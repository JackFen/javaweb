package json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;
import pojo.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class jsontest {
//1.2.1 javaBean和json的互换
    @Test
    public void test1(){
        Person person=new Person(1,"jack");
        //创建Gson对象实例
        Gson gson=new Gson();
        //toJson方法可以把java对象转换为为json字符串
        String personJsonstring = gson.toJson(person);
        System.out.println(personJsonstring);
        //fromJson把json字符串转换为Java对象
        //第一个参数是json字符串，第二个参数是转换回去的java对象类型
        Person person1 = gson.fromJson(personJsonstring, Person.class);
        System.out.println(person1);
    }
//1.2.2 List和json的互换
    @Test
    public void test2(){
        List<Person>personList=new ArrayList<>();
        personList.add(new Person(1,"jack"));
        personList.add(new Person(2,"danny"));
        Gson gson = new Gson();
        //把list集合转换为json字符串
        String listJsonString = gson.toJson(personList);
        System.out.println(listJsonString);
        List<Person>list=gson.fromJson(listJsonString,new PersonListType().getType());
        System.out.println(list);
    }
//1.2.3 map和json的互换
    @Test
    public void test3(){
        Map<Integer,Person>personMap=new HashMap<>();
        personMap.put(1,new Person(1,"jack"));
        personMap.put(2,new Person(2,"danny"));
        Gson gson=new Gson();
        //把map集合转化为json字符串
        String personMapjsonString =gson.toJson(personMap);
        System.out.println(personMapjsonString);
//        Map<Integer,Person> personMap2 = gson.fromJson(personMapjsonString, new PersonMapType().getType());
        //匿名内部类方法
        Map<Integer,Person> personMap2 = gson.fromJson(personMapjsonString,new TypeToken<HashMap<Integer,Person>>(){}.getType());
        System.out.println(personMap2);
        Person p=personMap2.get(1);
        System.out.println(p);
    }
}
