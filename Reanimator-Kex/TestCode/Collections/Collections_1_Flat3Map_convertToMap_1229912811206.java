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

public class Flat3Map_convertToMap_1229912811206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34630;
     Object term35757;

    public Flat3Map_convertToMap_1229912811206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34630 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term34740 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term34832 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term34924 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term34630, term34630.getClass(), "delegateMap", term34740);
        setIntField(term34630, term34630.getClass(), "size", 2);
        setField(term34630, term34630.getClass(), "key2", term34832);
        setField(term34630, term34630.getClass(), "value2", term34924);
        term35757 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term35758 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term35759 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term35760 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term35761 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term35762 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term35757, term35757.getClass(), "size", 0);
        setIntField(term35757, term35757.getClass(), "hash1", 0);
        setIntField(term35757, term35757.getClass(), "hash2", 0);
        setIntField(term35757, term35757.getClass(), "hash3", 0);
        setField(term35757, term35757.getClass(), "key1", null);
        setField(term35757, term35757.getClass(), "key2", null);
        setField(term35757, term35757.getClass(), "key3", null);
        setField(term35757, term35757.getClass(), "value1", null);
        setField(term35757, term35757.getClass(), "value2", null);
        setField(term35757, term35757.getClass(), "value3", null);
        setFloatField(term35758, term35758.getClass(), "loadFactor", 0.75F);
        setIntField(term35758, term35758.getClass(), "size", 2);
        setField(term35761, term35761.getClass(), "next", null);
        setField(term35761, term35761.getClass(), "key", null);
        setField(term35761, term35761.getClass(), "value", null);
        setField(term35760, term35760.getClass(), "next", term35761);
        setField(term35760, term35760.getClass(), "key", term35762);
        setField(term35760, term35760.getClass(), "value", null);
        setElement(term35759, 0, term35760);
        setField(term35758, term35758.getClass(), "data", term35759);
        setIntField(term35758, term35758.getClass(), "threshold", 12);
        setIntField(term35758, term35758.getClass(), "modCount", 2);
        setField(term35758, term35758.getClass(), "entrySet", null);
        setField(term35758, term35758.getClass(), "keySet", null);
        setField(term35758, term35758.getClass(), "values", null);
        setField(term35758, term35758.getClass(), "keySet", null);
        setField(term35758, term35758.getClass(), "values", null);
        setField(term35757, term35757.getClass(), "delegateMap", term35758);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertToMap", argTypes, term34630, args);
        assertTrue(recursiveEquals(term34630, term35757));
    }

};
