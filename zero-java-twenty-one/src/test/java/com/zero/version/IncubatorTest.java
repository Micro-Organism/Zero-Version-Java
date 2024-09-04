package com.zero.version;

import jdk.incubator.vector.FloatVector;
import jdk.incubator.vector.VectorSpecies;
import org.junit.jupiter.api.Test;

public class IncubatorTest {

    @Test
    public void test() {
        VectorSpecies<Float> species = FloatVector.SPECIES_256;
        float[] a = new float[species.length()];
        float[] b = new float[species.length()];

        // 初始化数组
        for (int i = 0; i < species.length(); i++) {
            a[i] = i;
            b[i] = i * 2;
        }

        // 使用向量化操作进行数组加法
        FloatVector va = FloatVector.fromArray(species, a, 0);
        FloatVector vb = FloatVector.fromArray(species, b, 0);
        FloatVector result = va.add(vb);

        // 将结果写回数组
        result.intoArray(a, 0);

        // 打印结果数组
        for (float f : a) {
            System.out.println(f);
        }
    }

}
