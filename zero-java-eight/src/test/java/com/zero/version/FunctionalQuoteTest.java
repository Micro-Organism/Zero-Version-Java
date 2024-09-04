package com.zero.version;

import com.zero.version.example.Car;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * 方法引用通过方法的名字来指向一个方法
 * 方法引用可以使语言的构造更紧凑简洁，减少冗余代码
 * 方法引用使用一对冒号 ::
 */
public class FunctionalQuoteTest {

    /**
     * 构造函数引用
     */
    @Test
    public void test() {
        final Car car = createCar();
        final List<Car> cars = Arrays.asList(car);
        cars.forEach(t -> System.out.println(t.toString()));
    }

    /**
     * 静态方法引用
     */
    @Test
    public void testStatic() {
        final Car car = createCar();
        final List<Car> cars = Arrays.asList(car);
        cars.forEach(Car::collide);
    }

    /**
     * 特定类的任意对象的方法引用
     */
    @Test
    public void testClass() {
        final Car car = createCar();
        final List<Car> cars = Arrays.asList(car);
        //类方法引用
        cars.forEach(Car::repair);
    }

    /**
     * 特定对象的实例方法引用
     */
    @Test
    public void testObject() {
        final Car car = createCar();
        final List<Car> cars = Arrays.asList(car);
        cars.forEach(car::follow);
    }

    /**
     * 实例方法引用
     */
    @Test
    public void testFunction() {
        final Car car = createCar();
        final List<Car> cars = Arrays.asList(car);
        cars.forEach(System.out::println);
    }

    public Car createCar() {
        final Car car = Car.create(Car::new);
        car.setName("BMW");
        car.setColor("red");
        car.setPrice(10000);
        car.setSpeed(200);
        car.setWeight(1000);
        return car;
    }
}
