package com.zero.version;

import com.zero.version.example.Animal;
import org.junit.jupiter.api.Test;

/**
 * Java 17 继续支持 Sealed Classes，这是一种新的类别，它允许您限制类的子类。
 */
public class SealedClassesTest {

    @Test
    public void test() {
        Animal animalDog = new Animal.Dog();
        animalDog.setName("dog");
        animalDog.setAge(3);
        animalDog.say();

        Animal animalCat = new Animal.Cat();
        animalCat.setName("cat");
        animalCat.setAge(2);
        animalCat.say();
    }

}
