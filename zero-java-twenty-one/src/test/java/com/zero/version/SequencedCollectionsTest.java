package com.zero.version;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * Sequenced Collections 的引入带来了新的接口和方法来简化集合处理。
 * 此增强功能旨在解决访问 Java 中各种集合类型的第一个和最后一个元素需要非统一且麻烦处理场景。
 * Sequenced Collections 引入了三个新接口：
 * 1. SequencedCollection
 * 2. SequencedMap
 * 3. SequencedSet
 */
public class SequencedCollectionsTest {

    /**
     * SequencedCollection 接口
     */
    @Test
    public void testSequencedCollection() {
        SequencedCollection<Integer> arr = new ArrayList<>();
        arr.addLast(1);
        arr.addLast(2);
        arr.addLast(3);
        arr.addLast(31);
        arr.addFirst(14);
        System.out.println(arr);
    }

    /**
     * SequencedMap 接口
     */
    @Test
    public void testSequencedMap() {
        SequencedMap<String, Integer> map = new LinkedHashMap<>();
        map.putFirst("1", 1);
        map.putLast("2", 2);
        map.putLast("3", 3);
        map.putLast("31", 31);
        map.putFirst("14", 14);
        System.out.println(map);
    }

    /**
     * SequencedSet 接口
     */
    @Test
    public void testSequencedSet() {
        SequencedSet<Integer> set = new LinkedHashSet<>();
        set.addLast(1);
        set.addLast(2);
        set.addLast(3);
        set.addLast(31);
        set.addFirst(14);
        System.out.println(set);
    }
}
