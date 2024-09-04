package com.zero.version.example;

import lombok.Data;

@Data
public sealed class Animal permits Animal.Dog, Animal.Cat {

    private String name;
    private int age;

    public void say() {
        System.out.println("Animal:\t" + getName() + "\t" + getAge());
    }

    public static final class Dog extends Animal {
        @Override
        public void say() {
            System.out.println("Dog:\t" + getName() + "\t" + getAge());
        }
    }

    public static final class Cat extends Animal {
        @Override
        public void say() {
            System.out.println("Cat:\t" + getName() + "\t" + getAge());
        }

    }

}
