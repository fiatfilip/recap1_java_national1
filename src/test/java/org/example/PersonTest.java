package org.example;

import org.junit.Assert;
import org.junit.Test;

/*
0-6 saru'mana
7-14 buna ziua
15-25 ciao
26- 40 servus
41 - 65 buna
> 65 sanatace
 */

public class PersonTest {
    @Test(expected = Exception.class)
    public void invalidAge() throws Exception{
        PersonInterface person = new Person(-6);
        person.sayHello();
    }

    @Test
    public void testChildSayHi() throws Exception{
        PersonInterface person = new Person(6);
        Assert.assertEquals("saru'mana", person.sayHello());
    }

    @Test
    public void testYoung1SayHi() throws Exception{
        PersonInterface person = new Person(8);
        Assert.assertEquals("buna ziua", person.sayHello());
    }

    @Test
    public void testYoung2SayHi() throws Exception{
        PersonInterface person = new Person(22);
        Assert.assertEquals("ciao", person.sayHello());
    }

    @Test
    public void testAdult1SayHi() throws Exception{
        PersonInterface person = new Person(35);
        Assert.assertEquals("servus", person.sayHello());
    }

    @Test
    public void testAdult2SayHi() throws Exception{
        PersonInterface person = new Person(45);
        Assert.assertEquals("buna", person.sayHello());
    }

    @Test
    public void testElderSayHi() throws Exception{
        PersonInterface person = new Person(75);
        Assert.assertEquals("sanatace", person.sayHello());
    }
}
