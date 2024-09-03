package com.zero.version;

import org.junit.Test;

/**
 * 简单说，默认方法就是接口可以有实现方法，而且不需要实现类去实现其方法。
 * 我们只需在方法名前面加个 default 关键字即可实现默认方法。
 */
public class InterfaceDefaultTest {

    public interface Vehicle {
        default void print(){
            System.out.println("我是一辆车!");
        }

        /**
         * Java 8 的另一个特性是接口可以声明（并且可以提供实现）静态方法
         */
        static void blowHorn(){
            System.out.println("按喇叭!!!");
        }
    }

    /**
     * 一个接口有默认方法，考虑这样的情况，一个类实现了多个接口，
     * 且这些接口有相同的默认方法，以下实例说明了这种情况的解决方法：
     */
    public interface FourWheeler {
        default void print(){
            System.out.println("我是一辆四轮车!");
        }
    }

    /**
     * 第一个解决方案是创建自己的默认方法，来覆盖重写接口的默认方法：
     */
    public class Car1 implements Vehicle, FourWheeler {
        @Override
        public void print(){
            System.out.println("我是一辆四轮汽车!");
        }
    }

    /**
     * 第二个解决方案是使用 super 关键字调用指定接口的默认方法：
     */
    public class Car2 implements Vehicle, FourWheeler {
        @Override
        public void print(){
            Vehicle.super.print();
            FourWheeler.super.print();
            Vehicle.blowHorn();
            System.out.println("我是一辆自定义汽车!");
        }
    }

    @Test
    public void test(){
        Vehicle vehicle = new Car2();
        vehicle.print();
    }

}
