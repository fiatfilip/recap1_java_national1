package org.example;

public class Person implements PersonInterface{
    private int age;

    public Person(int age){
        this.age = age;
    }
    /*
0-6 saru'mana
7-14 buna ziua
15-25 ciao
26- 40 servus
41 - 65 buna
> 65 sanatace
 */
    @Override
    public String sayHello() throws Exception{
        if(age <= 0){
            throw new Exception("Invalid age");
        }
        if(age <= 6){
            return "saru'mana";
        }else if(age > 6 && age < 14){
            return "buna ziua";
        }else if(age >=14 && age < 25){
            return "ciao";
        }else if(age >= 25 && age <= 40){
            return "servus";
        }else if(age > 40 && age < 65){
            return "buna";
        } else {
            return "sanatace";
        }
    }
}
