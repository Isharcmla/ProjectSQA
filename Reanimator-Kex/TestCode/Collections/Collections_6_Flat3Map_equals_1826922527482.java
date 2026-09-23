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

public class Flat3Map_equals_1826922527482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89530;
     Object term89732;
     Object term90309;
     Object term90311;

    public Flat3Map_equals_1826922527482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89530 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term89640 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term89530, term89530.getClass(), "delegateMap", term89640);
        term89732 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term90309 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term90310 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term90309, term90309.getClass(), "size", 0);
        setIntField(term90309, term90309.getClass(), "hash1", 0);
        setIntField(term90309, term90309.getClass(), "hash2", 0);
        setIntField(term90309, term90309.getClass(), "hash3", 0);
        setField(term90309, term90309.getClass(), "key1", null);
        setField(term90309, term90309.getClass(), "key2", null);
        setField(term90309, term90309.getClass(), "key3", null);
        setField(term90309, term90309.getClass(), "value1", null);
        setField(term90309, term90309.getClass(), "value2", null);
        setField(term90309, term90309.getClass(), "value3", null);
        setFloatField(term90310, term90310.getClass(), "loadFactor", 0.0F);
        setIntField(term90310, term90310.getClass(), "size", 0);
        setField(term90310, term90310.getClass(), "data", null);
        setIntField(term90310, term90310.getClass(), "threshold", 0);
        setIntField(term90310, term90310.getClass(), "modCount", 0);
        setField(term90310, term90310.getClass(), "entrySet", null);
        setField(term90310, term90310.getClass(), "keySet", null);
        setField(term90310, term90310.getClass(), "values", null);
        setField(term90310, term90310.getClass(), "keySet", null);
        setField(term90310, term90310.getClass(), "values", null);
        setField(term90309, term90309.getClass(), "delegateMap", term90310);
        term90311 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term90311, term90311.getClass(), "size", 0);
        setIntField(term90311, term90311.getClass(), "hash1", 0);
        setIntField(term90311, term90311.getClass(), "hash2", 0);
        setIntField(term90311, term90311.getClass(), "hash3", 0);
        setField(term90311, term90311.getClass(), "key1", null);
        setField(term90311, term90311.getClass(), "key2", null);
        setField(term90311, term90311.getClass(), "key3", null);
        setField(term90311, term90311.getClass(), "value1", null);
        setField(term90311, term90311.getClass(), "value2", null);
        setField(term90311, term90311.getClass(), "value3", null);
        setField(term90311, term90311.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term89732;
        Object retValue = callMethod(klass, "equals", argTypes, term89530, args);
        assertTrue(recursiveEquals(term89530, term90309));
        assertTrue(recursiveEquals(term89732, term90311));
        assertTrue(recursiveEquals(retValue, true));
    }

};


