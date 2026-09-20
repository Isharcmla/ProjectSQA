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

public class Flat3Map_equals_1826922527505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95278;
     Object term95468;
     Object term95571;
     Object term95573;

    public Flat3Map_equals_1826922527505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95278 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term95376 = newInstance(Class.forName("java.util.concurrent.Executors$RunnableAdapter"));
        setField(term95278, term95278.getClass(), "delegateMap", null);
        setIntField(term95278, term95278.getClass(), "size", 1);
        setField(term95278, term95278.getClass(), "key1", term95376);
        term95468 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term95468, term95468.getClass(), "delegateMap", null);
        setIntField(term95468, term95468.getClass(), "size", 1);
        setIntField(term95468, term95468.getClass(), "hash1", 0);
        term95571 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term95572 = newInstance(Class.forName("java.util.concurrent.Executors$RunnableAdapter"));
        setIntField(term95571, term95571.getClass(), "size", 1);
        setIntField(term95571, term95571.getClass(), "hash1", 0);
        setIntField(term95571, term95571.getClass(), "hash2", 0);
        setIntField(term95571, term95571.getClass(), "hash3", 0);
        setField(term95572, term95572.getClass(), "task", null);
        setField(term95572, term95572.getClass(), "result", null);
        setField(term95571, term95571.getClass(), "key1", term95572);
        setField(term95571, term95571.getClass(), "key2", null);
        setField(term95571, term95571.getClass(), "key3", null);
        setField(term95571, term95571.getClass(), "value1", null);
        setField(term95571, term95571.getClass(), "value2", null);
        setField(term95571, term95571.getClass(), "value3", null);
        setField(term95571, term95571.getClass(), "delegateMap", null);
        term95573 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term95573, term95573.getClass(), "size", 1);
        setIntField(term95573, term95573.getClass(), "hash1", 0);
        setIntField(term95573, term95573.getClass(), "hash2", 0);
        setIntField(term95573, term95573.getClass(), "hash3", 0);
        setField(term95573, term95573.getClass(), "key1", null);
        setField(term95573, term95573.getClass(), "key2", null);
        setField(term95573, term95573.getClass(), "key3", null);
        setField(term95573, term95573.getClass(), "value1", null);
        setField(term95573, term95573.getClass(), "value2", null);
        setField(term95573, term95573.getClass(), "value3", null);
        setField(term95573, term95573.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term95468;
        Object retValue = callMethod(klass, "equals", argTypes, term95278, args);
        assertTrue(recursiveEquals(term95278, term95571));
        assertTrue(recursiveEquals(term95468, term95573));
        assertTrue(recursiveEquals(retValue, false));
    }

};
