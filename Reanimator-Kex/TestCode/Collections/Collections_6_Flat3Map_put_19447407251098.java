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

public class Flat3Map_put_19447407251098 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term324370;
     Object term324870;
     Object term326538;
     Object term326547;

    public Flat3Map_put_19447407251098() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term324370 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term324462 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term324556 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term323864 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term324686 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term324778 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term324370, term324370.getClass(), "delegateMap", null);
        setIntField(term324370, term324370.getClass(), "size", 3);
        setIntField(term324370, term324370.getClass(), "hash3", 426066308);
        setField(term324370, term324370.getClass(), "key3", null);
        setIntField(term324370, term324370.getClass(), "hash2", 426066308);
        setField(term324370, term324370.getClass(), "key2", null);
        setIntField(term324370, term324370.getClass(), "hash1", 426066308);
        setIntField(term324556, term324556.getClass(), "size", 4194304);
        setField(term324686, term324686.getClass(), "next", null);
        setField(term324778, term324778.getClass(), "delegateMap", null);
        setField(term324686, term324686.getClass(), "key", term324778);
        setField(term324686, term324686.getClass(), "value", null);
        setElement(term323864, 6, term324686);
        setField(term324556, term324556.getClass(), "data", term323864);
        setIntField(term324556, term324556.getClass(), "modCount", 0);
        setField(term324462, term324462.getClass(), "delegateMap", term324556);
        setIntField(term324462, term324462.getClass(), "size", 3);
        setField(term324462, term324462.getClass(), "key3", null);
        setField(term324462, term324462.getClass(), "value3", null);
        setIntField(term324462, term324462.getClass(), "hash3", -1);
        setIntField(term324462, term324462.getClass(), "hash2", -1);
        setIntField(term324462, term324462.getClass(), "hash1", -1);
        setField(term324370, term324370.getClass(), "key1", term324462);
        setField(term324370, term324370.getClass(), "value3", null);
        setField(term324370, term324370.getClass(), "value2", null);
        setField(term324370, term324370.getClass(), "value1", null);
        term324870 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term324964 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        Object term325092 = newInstance(Class.forName("org.apache.commons.collections.iterators.EmptyOrderedIterator"));
        setField(term324870, term324870.getClass(), "delegateMap", null);
        setIntField(term324870, term324870.getClass(), "size", 3);
        setIntField(term324870, term324870.getClass(), "hash3", 245760);
        setField(term324870, term324870.getClass(), "value3", null);
        setIntField(term324870, term324870.getClass(), "hash2", 33024);
        setField(term324870, term324870.getClass(), "value2", null);
        setIntField(term324870, term324870.getClass(), "hash1", 425787524);
        setIntField(term324964, term324964.getClass(), "size", 0);
        setField(term324870, term324870.getClass(), "value1", term324964);
        setField(term324870, term324870.getClass(), "key3", null);
        setField(term324870, term324870.getClass(), "key2", null);
        setField(term324870, term324870.getClass(), "key1", term325092);
        term326538 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term326539 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term326540 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term326541 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term326542 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term326543 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term326544 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term326545 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term326546 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term326538, term326538.getClass(), "size", 0);
        setIntField(term326538, term326538.getClass(), "hash1", 0);
        setIntField(term326538, term326538.getClass(), "hash2", 0);
        setIntField(term326538, term326538.getClass(), "hash3", 0);
        setField(term326538, term326538.getClass(), "key1", null);
        setField(term326538, term326538.getClass(), "key2", null);
        setField(term326538, term326538.getClass(), "key3", null);
        setField(term326538, term326538.getClass(), "value1", null);
        setField(term326538, term326538.getClass(), "value2", null);
        setField(term326538, term326538.getClass(), "value3", null);
        setFloatField(term326539, term326539.getClass(), "loadFactor", 0.75F);
        setIntField(term326539, term326539.getClass(), "size", 3);
        setField(term326541, term326541.getClass(), "next", null);
        setIntField(term326542, term326542.getClass(), "size", 3);
        setIntField(term326542, term326542.getClass(), "hash1", -1);
        setIntField(term326542, term326542.getClass(), "hash2", -1);
        setIntField(term326542, term326542.getClass(), "hash3", -1);
        setField(term326542, term326542.getClass(), "key1", null);
        setField(term326542, term326542.getClass(), "key2", null);
        setField(term326542, term326542.getClass(), "key3", null);
        setField(term326542, term326542.getClass(), "value1", null);
        setField(term326542, term326542.getClass(), "value2", null);
        setField(term326542, term326542.getClass(), "value3", null);
        setField(term326542, term326542.getClass(), "delegateMap", null);
        setField(term326541, term326541.getClass(), "key", term326542);
        setField(term326541, term326541.getClass(), "value", null);
        setElement(term326540, 0, term326541);
        setField(term326543, term326543.getClass(), "next", null);
        setIntField(term326544, term326544.getClass(), "size", 3);
        setIntField(term326544, term326544.getClass(), "hash1", 425787524);
        setIntField(term326544, term326544.getClass(), "hash2", 33024);
        setIntField(term326544, term326544.getClass(), "hash3", 245760);
        setField(term326544, term326544.getClass(), "key1", null);
        setField(term326544, term326544.getClass(), "key2", null);
        setField(term326544, term326544.getClass(), "key3", null);
        setField(term326544, term326544.getClass(), "value1", null);
        setField(term326544, term326544.getClass(), "value2", null);
        setField(term326544, term326544.getClass(), "value3", null);
        setField(term326544, term326544.getClass(), "delegateMap", null);
        setField(term326543, term326543.getClass(), "key", term326544);
        setField(term326543, term326543.getClass(), "value", null);
        setElement(term326540, 3, term326543);
        setField(term326545, term326545.getClass(), "next", null);
        setField(term326545, term326545.getClass(), "key", term326546);
        setField(term326545, term326545.getClass(), "value", null);
        setElement(term326540, 6, term326545);
        setField(term326539, term326539.getClass(), "data", term326540);
        setIntField(term326539, term326539.getClass(), "threshold", 12);
        setIntField(term326539, term326539.getClass(), "modCount", 3);
        setField(term326539, term326539.getClass(), "entrySet", null);
        setField(term326539, term326539.getClass(), "keySet", null);
        setField(term326539, term326539.getClass(), "values", null);
        setField(term326539, term326539.getClass(), "keySet", null);
        setField(term326539, term326539.getClass(), "values", null);
        setField(term326538, term326538.getClass(), "delegateMap", term326539);
        term326547 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term326547, term326547.getClass(), "size", 3);
        setIntField(term326547, term326547.getClass(), "hash1", 425787524);
        setIntField(term326547, term326547.getClass(), "hash2", 33024);
        setIntField(term326547, term326547.getClass(), "hash3", 245760);
        setField(term326547, term326547.getClass(), "key1", null);
        setField(term326547, term326547.getClass(), "key2", null);
        setField(term326547, term326547.getClass(), "key3", null);
        setField(term326547, term326547.getClass(), "value1", null);
        setField(term326547, term326547.getClass(), "value2", null);
        setField(term326547, term326547.getClass(), "value3", null);
        setField(term326547, term326547.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term324870;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term324370, args);
        assertTrue(recursiveEquals(term324370, term326538));
        assertTrue(recursiveEquals(term324870, term326547));
        assertTrue(recursiveEquals(retValue, null));
    }

};


