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

public class Flat3Map_put_1944740725630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137525;
     Object term137617;
     Object term138760;
     Object term138768;

    public Flat3Map_put_1944740725630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137525 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term137525, term137525.getClass(), "delegateMap", null);
        setIntField(term137525, term137525.getClass(), "size", 3);
        setIntField(term137525, term137525.getClass(), "hash3", 0);
        setField(term137525, term137525.getClass(), "key3", null);
        setIntField(term137525, term137525.getClass(), "hash2", 0);
        setField(term137525, term137525.getClass(), "key2", term137525);
        term137617 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term137711 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term137617, term137617.getClass(), "delegateMap", null);
        setIntField(term137617, term137617.getClass(), "size", 3);
        setIntField(term137617, term137617.getClass(), "hash3", 0);
        setField(term137617, term137617.getClass(), "value3", null);
        setIntField(term137617, term137617.getClass(), "hash2", 0);
        setField(term137617, term137617.getClass(), "value2", null);
        setIntField(term137617, term137617.getClass(), "hash1", 0);
        setIntField(term137711, term137711.getClass(), "size", 0);
        setField(term137617, term137617.getClass(), "value1", term137711);
        term138760 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term138761 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term138762 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term138763 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term138764 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term138765 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term138766 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term138767 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term138760, term138760.getClass(), "size", 0);
        setIntField(term138760, term138760.getClass(), "hash1", 0);
        setIntField(term138760, term138760.getClass(), "hash2", 0);
        setIntField(term138760, term138760.getClass(), "hash3", 0);
        setField(term138760, term138760.getClass(), "key1", null);
        setField(term138760, term138760.getClass(), "key2", null);
        setField(term138760, term138760.getClass(), "key3", null);
        setField(term138760, term138760.getClass(), "value1", null);
        setField(term138760, term138760.getClass(), "value2", null);
        setField(term138760, term138760.getClass(), "value3", null);
        setFloatField(term138761, term138761.getClass(), "loadFactor", 0.75F);
        setIntField(term138761, term138761.getClass(), "size", 3);
        setField(term138764, term138764.getClass(), "next", null);
        setField(term138764, term138764.getClass(), "key", term138760);
        setField(term138764, term138764.getClass(), "value", null);
        setField(term138763, term138763.getClass(), "next", term138764);
        setIntField(term138765, term138765.getClass(), "size", 3);
        setIntField(term138765, term138765.getClass(), "hash1", 0);
        setIntField(term138765, term138765.getClass(), "hash2", 0);
        setIntField(term138765, term138765.getClass(), "hash3", 0);
        setField(term138765, term138765.getClass(), "key1", null);
        setField(term138765, term138765.getClass(), "key2", null);
        setField(term138765, term138765.getClass(), "key3", null);
        setField(term138765, term138765.getClass(), "value1", null);
        setField(term138765, term138765.getClass(), "value2", null);
        setField(term138765, term138765.getClass(), "value3", null);
        setField(term138765, term138765.getClass(), "delegateMap", null);
        setField(term138763, term138763.getClass(), "key", term138765);
        setField(term138763, term138763.getClass(), "value", null);
        setElement(term138762, 0, term138763);
        setField(term138766, term138766.getClass(), "next", null);
        setField(term138766, term138766.getClass(), "key", term138767);
        setField(term138766, term138766.getClass(), "value", null);
        setElement(term138762, 5, term138766);
        setField(term138761, term138761.getClass(), "data", term138762);
        setIntField(term138761, term138761.getClass(), "threshold", 12);
        setIntField(term138761, term138761.getClass(), "modCount", 3);
        setField(term138761, term138761.getClass(), "entrySet", null);
        setField(term138761, term138761.getClass(), "keySet", null);
        setField(term138761, term138761.getClass(), "values", null);
        setField(term138761, term138761.getClass(), "keySet", null);
        setField(term138761, term138761.getClass(), "values", null);
        setField(term138760, term138760.getClass(), "delegateMap", term138761);
        term138768 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term138768, term138768.getClass(), "size", 3);
        setIntField(term138768, term138768.getClass(), "hash1", 0);
        setIntField(term138768, term138768.getClass(), "hash2", 0);
        setIntField(term138768, term138768.getClass(), "hash3", 0);
        setField(term138768, term138768.getClass(), "key1", null);
        setField(term138768, term138768.getClass(), "key2", null);
        setField(term138768, term138768.getClass(), "key3", null);
        setField(term138768, term138768.getClass(), "value1", null);
        setField(term138768, term138768.getClass(), "value2", null);
        setField(term138768, term138768.getClass(), "value3", null);
        setField(term138768, term138768.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term137617;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term137525, args);
        assertTrue(recursiveEquals(term137525, term138760));
        assertTrue(recursiveEquals(term137617, term138768));
        assertTrue(recursiveEquals(retValue, null));
    }

};


