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

public class Flat3Map_put_19447407251145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term347544;
     Object term347858;
     Object term348496;
     Object term348506;

    public Flat3Map_put_19447407251145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term347544 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term347636 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term347728 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term347766 = newInstance(Class.forName("java.lang.Object"));
        setField(term347544, term347544.getClass(), "delegateMap", null);
        setIntField(term347544, term347544.getClass(), "size", 3);
        setIntField(term347544, term347544.getClass(), "hash3", 0);
        setField(term347636, term347636.getClass(), "delegateMap", null);
        setIntField(term347636, term347636.getClass(), "size", 3);
        setField(term347728, term347728.getClass(), "delegateMap", null);
        setIntField(term347728, term347728.getClass(), "size", 0);
        setField(term347636, term347636.getClass(), "key3", term347728);
        setField(term347636, term347636.getClass(), "key2", null);
        setField(term347636, term347636.getClass(), "value2", null);
        setIntField(term347636, term347636.getClass(), "hash3", 0);
        setField(term347636, term347636.getClass(), "value3", null);
        setIntField(term347636, term347636.getClass(), "hash2", 0);
        setIntField(term347636, term347636.getClass(), "hash1", -1);
        setField(term347544, term347544.getClass(), "key3", term347636);
        setIntField(term347544, term347544.getClass(), "hash2", 0);
        setField(term347544, term347544.getClass(), "key2", term347766);
        setIntField(term347544, term347544.getClass(), "hash1", -1);
        term347858 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term347950 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term348042 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term347858, term347858.getClass(), "delegateMap", null);
        setIntField(term347858, term347858.getClass(), "size", 3);
        setIntField(term347858, term347858.getClass(), "hash3", 0);
        setField(term347858, term347858.getClass(), "value3", null);
        setIntField(term347858, term347858.getClass(), "hash2", 0);
        setField(term347858, term347858.getClass(), "value2", null);
        setIntField(term347858, term347858.getClass(), "hash1", 0);
        setField(term347858, term347858.getClass(), "value1", null);
        setField(term347858, term347858.getClass(), "key3", null);
        setField(term347950, term347950.getClass(), "delegateMap", null);
        setIntField(term347950, term347950.getClass(), "size", 0);
        setField(term347858, term347858.getClass(), "key2", term347950);
        setField(term348042, term348042.getClass(), "delegateMap", null);
        setIntField(term348042, term348042.getClass(), "size", 1);
        setIntField(term348042, term348042.getClass(), "hash1", 0);
        setField(term348042, term348042.getClass(), "value1", null);
        setField(term347858, term347858.getClass(), "key1", term348042);
        term348496 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term348497 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term348498 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term348499 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term348500 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term348501 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term348502 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term348503 = newInstance(Class.forName("java.lang.Object"));
        Object term348504 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term348505 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term348496, term348496.getClass(), "size", 0);
        setIntField(term348496, term348496.getClass(), "hash1", 0);
        setIntField(term348496, term348496.getClass(), "hash2", 0);
        setIntField(term348496, term348496.getClass(), "hash3", 0);
        setField(term348496, term348496.getClass(), "key1", null);
        setField(term348496, term348496.getClass(), "key2", null);
        setField(term348496, term348496.getClass(), "key3", null);
        setField(term348496, term348496.getClass(), "value1", null);
        setField(term348496, term348496.getClass(), "value2", null);
        setField(term348496, term348496.getClass(), "value3", null);
        setFloatField(term348497, term348497.getClass(), "loadFactor", 0.75F);
        setIntField(term348497, term348497.getClass(), "size", 4);
        setField(term348499, term348499.getClass(), "next", null);
        setIntField(term348500, term348500.getClass(), "size", 3);
        setIntField(term348500, term348500.getClass(), "hash1", 0);
        setIntField(term348500, term348500.getClass(), "hash2", 0);
        setIntField(term348500, term348500.getClass(), "hash3", 0);
        setField(term348500, term348500.getClass(), "key1", null);
        setField(term348500, term348500.getClass(), "key2", null);
        setField(term348500, term348500.getClass(), "key3", null);
        setField(term348500, term348500.getClass(), "value1", null);
        setField(term348500, term348500.getClass(), "value2", null);
        setField(term348500, term348500.getClass(), "value3", null);
        setField(term348500, term348500.getClass(), "delegateMap", null);
        setField(term348499, term348499.getClass(), "key", term348500);
        setField(term348499, term348499.getClass(), "value", null);
        setElement(term348498, 0, term348499);
        setField(term348502, term348502.getClass(), "next", null);
        setField(term348502, term348502.getClass(), "key", null);
        setField(term348502, term348502.getClass(), "value", null);
        setField(term348501, term348501.getClass(), "next", term348502);
        setField(term348501, term348501.getClass(), "key", term348503);
        setField(term348501, term348501.getClass(), "value", null);
        setElement(term348498, 6, term348501);
        setField(term348504, term348504.getClass(), "next", null);
        setField(term348504, term348504.getClass(), "key", term348505);
        setField(term348504, term348504.getClass(), "value", null);
        setElement(term348498, 9, term348504);
        setField(term348497, term348497.getClass(), "data", term348498);
        setIntField(term348497, term348497.getClass(), "threshold", 12);
        setIntField(term348497, term348497.getClass(), "modCount", 4);
        setField(term348497, term348497.getClass(), "entrySet", null);
        setField(term348497, term348497.getClass(), "keySet", null);
        setField(term348497, term348497.getClass(), "values", null);
        setField(term348497, term348497.getClass(), "keySet", null);
        setField(term348497, term348497.getClass(), "values", null);
        setField(term348496, term348496.getClass(), "delegateMap", term348497);
        term348506 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term348506, term348506.getClass(), "size", 3);
        setIntField(term348506, term348506.getClass(), "hash1", 0);
        setIntField(term348506, term348506.getClass(), "hash2", 0);
        setIntField(term348506, term348506.getClass(), "hash3", 0);
        setField(term348506, term348506.getClass(), "key1", null);
        setField(term348506, term348506.getClass(), "key2", null);
        setField(term348506, term348506.getClass(), "key3", null);
        setField(term348506, term348506.getClass(), "value1", null);
        setField(term348506, term348506.getClass(), "value2", null);
        setField(term348506, term348506.getClass(), "value3", null);
        setField(term348506, term348506.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term347858;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term347544, args);
        assertTrue(recursiveEquals(term347544, term348496));
        assertTrue(recursiveEquals(term347858, term348506));
        assertTrue(recursiveEquals(retValue, null));
    }

};


