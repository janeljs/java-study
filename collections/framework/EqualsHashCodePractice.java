package collections.framework;

import java.util.HashSet;
import java.util.Objects;

public class EqualsHashCodePractice {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(new Person("Jane", 26));
        set.add(new Person("Jane", 26));
        set.add(new Person("David", 25));

        System.out.println(set);
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ":" + age;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) return false;
        Person p = (Person) obj;
        return name.equals(p.name) && age == p.age;
    }

    public int hashCode() {
        return Objects.hash(name, age);
    }
}
