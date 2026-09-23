package org.apache.commons.collections.map;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.map.EqualityUtils.*;
import java.lang.Object;

public class Flat3Map_convertToMap_1229912811189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31126;
     Object term31906;

    public Flat3Map_convertToMap_1229912811189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31126 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term31236 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term31328 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term31420 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term31126, term31126.getClass(), "delegateMap", term31236);
        setIntField(term31126, term31126.getClass(), "size", 3);
        setField(term31126, term31126.getClass(), "key3", term31328);
        setField(term31126, term31126.getClass(), "value3", term31420);
        term31906 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term31907 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term31908 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term31909 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term31910 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term31911 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term31912 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term31913 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term31906, term31906.getClass(), "size", 0);
        setIntField(term31906, term31906.getClass(), "hash1", 0);
        setIntField(term31906, term31906.getClass(), "hash2", 0);
        setIntField(term31906, term31906.getClass(), "hash3", 0);
        setField(term31906, term31906.getClass(), "key1", null);
        setField(term31906, term31906.getClass(), "key2", null);
        setField(term31906, term31906.getClass(), "key3", null);
        setField(term31906, term31906.getClass(), "value1", null);
        setField(term31906, term31906.getClass(), "value2", null);
        setField(term31906, term31906.getClass(), "value3", null);
        setFloatField(term31907, term31907.getClass(), "loadFactor", 0.75F);
        setIntField(term31907, term31907.getClass(), "size", 2);
        setField(term31909, term31909.getClass(), "next", null);
        setIntField(term31910, term31910.getClass(), "size", 0);
        setIntField(term31910, term31910.getClass(), "hash1", 0);
        setIntField(term31910, term31910.getClass(), "hash2", 0);
        setIntField(term31910, term31910.getClass(), "hash3", 0);
        setField(term31910, term31910.getClass(), "key1", null);
        setField(term31910, term31910.getClass(), "key2", null);
        setField(term31910, term31910.getClass(), "key3", null);
        setField(term31910, term31910.getClass(), "value1", null);
        setField(term31910, term31910.getClass(), "value2", null);
        setField(term31910, term31910.getClass(), "value3", null);
        setField(term31910, term31910.getClass(), "delegateMap", null);
        setField(term31909, term31909.getClass(), "key", term31910);
        setIntField(term31911, term31911.getClass(), "size", 0);
        setIntField(term31911, term31911.getClass(), "hash1", 0);
        setIntField(term31911, term31911.getClass(), "hash2", 0);
        setIntField(term31911, term31911.getClass(), "hash3", 0);
        setField(term31911, term31911.getClass(), "key1", null);
        setField(term31911, term31911.getClass(), "key2", null);
        setField(term31911, term31911.getClass(), "key3", null);
        setField(term31911, term31911.getClass(), "value1", null);
        setField(term31911, term31911.getClass(), "value2", null);
        setField(term31911, term31911.getClass(), "value3", null);
        setField(term31911, term31911.getClass(), "delegateMap", null);
        setField(term31909, term31909.getClass(), "value", term31911);
        setElement(term31908, 0, term31909);
        setField(term31912, term31912.getClass(), "next", null);
        setField(term31912, term31912.getClass(), "key", term31913);
        setField(term31912, term31912.getClass(), "value", null);
        setElement(term31908, 5, term31912);
        setField(term31907, term31907.getClass(), "data", term31908);
        setIntField(term31907, term31907.getClass(), "threshold", 12);
        setIntField(term31907, term31907.getClass(), "modCount", 2);
        setField(term31907, term31907.getClass(), "entrySet", null);
        setField(term31907, term31907.getClass(), "keySet", null);
        setField(term31907, term31907.getClass(), "values", null);
        setField(term31907, term31907.getClass(), "keySet", null);
        setField(term31907, term31907.getClass(), "values", null);
        setField(term31906, term31906.getClass(), "delegateMap", term31907);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertToMap", argTypes, term31126, args);
        assertTrue(recursiveEquals(term31126, term31906));
    }

};


