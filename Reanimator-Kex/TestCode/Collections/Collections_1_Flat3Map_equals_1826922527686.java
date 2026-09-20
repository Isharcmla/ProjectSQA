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

public class Flat3Map_equals_1826922527686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134983;
     Object term135185;
     Object term135758;
     Object term135760;

    public Flat3Map_equals_1826922527686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134983 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term135093 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term135093, term135093.getClass(), "size", 0);
        setField(term134983, term134983.getClass(), "delegateMap", term135093);
        term135185 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term135185, term135185.getClass(), "delegateMap", null);
        setIntField(term135185, term135185.getClass(), "size", -1);
        term135758 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term135759 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term135758, term135758.getClass(), "size", 0);
        setIntField(term135758, term135758.getClass(), "hash1", 0);
        setIntField(term135758, term135758.getClass(), "hash2", 0);
        setIntField(term135758, term135758.getClass(), "hash3", 0);
        setField(term135758, term135758.getClass(), "key1", null);
        setField(term135758, term135758.getClass(), "key2", null);
        setField(term135758, term135758.getClass(), "key3", null);
        setField(term135758, term135758.getClass(), "value1", null);
        setField(term135758, term135758.getClass(), "value2", null);
        setField(term135758, term135758.getClass(), "value3", null);
        setFloatField(term135759, term135759.getClass(), "loadFactor", 0.0F);
        setIntField(term135759, term135759.getClass(), "size", 0);
        setField(term135759, term135759.getClass(), "data", null);
        setIntField(term135759, term135759.getClass(), "threshold", 0);
        setIntField(term135759, term135759.getClass(), "modCount", 0);
        setField(term135759, term135759.getClass(), "entrySet", null);
        setField(term135759, term135759.getClass(), "keySet", null);
        setField(term135759, term135759.getClass(), "values", null);
        setField(term135759, term135759.getClass(), "keySet", null);
        setField(term135759, term135759.getClass(), "values", null);
        setField(term135758, term135758.getClass(), "delegateMap", term135759);
        term135760 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term135760, term135760.getClass(), "size", -1);
        setIntField(term135760, term135760.getClass(), "hash1", 0);
        setIntField(term135760, term135760.getClass(), "hash2", 0);
        setIntField(term135760, term135760.getClass(), "hash3", 0);
        setField(term135760, term135760.getClass(), "key1", null);
        setField(term135760, term135760.getClass(), "key2", null);
        setField(term135760, term135760.getClass(), "key3", null);
        setField(term135760, term135760.getClass(), "value1", null);
        setField(term135760, term135760.getClass(), "value2", null);
        setField(term135760, term135760.getClass(), "value3", null);
        setField(term135760, term135760.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term135185;
        Object retValue = callMethod(klass, "equals", argTypes, term134983, args);
        assertTrue(recursiveEquals(term134983, term135758));
        assertTrue(recursiveEquals(term135185, term135760));
        assertTrue(recursiveEquals(retValue, false));
    }

};
