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

public class Flat3Map_put_1944740725890 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234592;
     Object term234684;
     Object term235745;

    public Flat3Map_put_1944740725890() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term234592 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term234592, term234592.getClass(), "delegateMap", null);
        setIntField(term234592, term234592.getClass(), "size", 3);
        setIntField(term234592, term234592.getClass(), "hash3", 0);
        setField(term234592, term234592.getClass(), "key3", null);
        setIntField(term234592, term234592.getClass(), "hash2", 0);
        setField(term234592, term234592.getClass(), "key2", null);
        setIntField(term234592, term234592.getClass(), "hash1", 0);
        setField(term234592, term234592.getClass(), "key1", null);
        term234684 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term234778 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term234684, term234684.getClass(), "delegateMap", null);
        setIntField(term234684, term234684.getClass(), "size", 3);
        setIntField(term234684, term234684.getClass(), "hash3", 0);
        setField(term234684, term234684.getClass(), "value3", null);
        setIntField(term234684, term234684.getClass(), "hash2", 0);
        setField(term234684, term234684.getClass(), "value2", null);
        setIntField(term234684, term234684.getClass(), "hash1", 0);
        setIntField(term234778, term234778.getClass(), "size", 0);
        setField(term234684, term234684.getClass(), "value1", term234778);
        term235745 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setFloatField(term235745, term235745.getClass(), "loadFactor", 0.0F);
        setIntField(term235745, term235745.getClass(), "size", 1);
        setField(term235745, term235745.getClass(), "data", null);
        setIntField(term235745, term235745.getClass(), "threshold", 0);
        setIntField(term235745, term235745.getClass(), "modCount", 0);
        setField(term235745, term235745.getClass(), "entrySet", null);
        setField(term235745, term235745.getClass(), "keySet", null);
        setField(term235745, term235745.getClass(), "values", null);
        setField(term235745, term235745.getClass(), "keySet", null);
        setField(term235745, term235745.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term234684;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term234592, args);
        assertTrue(recursiveEquals(term234592, term235745));
        assertTrue(recursiveEquals(term234684, 0));
        assertTrue(recursiveEquals(retValue, null));
    }

};


