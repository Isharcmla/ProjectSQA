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

public class Flat3Map_equals_1826922527346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62197;
     Object term62289;
     Object term62725;
     Object term62726;

    public Flat3Map_equals_1826922527346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62197 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term62197, term62197.getClass(), "delegateMap", null);
        setIntField(term62197, term62197.getClass(), "size", 0);
        term62289 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term62377 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        setField(term62289, term62289.getClass(), "delegateMap", term62377);
        term62725 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term62725, term62725.getClass(), "size", 0);
        setIntField(term62725, term62725.getClass(), "hash1", 0);
        setIntField(term62725, term62725.getClass(), "hash2", 0);
        setIntField(term62725, term62725.getClass(), "hash3", 0);
        setField(term62725, term62725.getClass(), "key1", null);
        setField(term62725, term62725.getClass(), "key2", null);
        setField(term62725, term62725.getClass(), "key3", null);
        setField(term62725, term62725.getClass(), "value1", null);
        setField(term62725, term62725.getClass(), "value2", null);
        setField(term62725, term62725.getClass(), "value3", null);
        setField(term62725, term62725.getClass(), "delegateMap", null);
        term62726 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term62727 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        setIntField(term62726, term62726.getClass(), "size", 0);
        setIntField(term62726, term62726.getClass(), "hash1", 0);
        setIntField(term62726, term62726.getClass(), "hash2", 0);
        setIntField(term62726, term62726.getClass(), "hash3", 0);
        setField(term62726, term62726.getClass(), "key1", null);
        setField(term62726, term62726.getClass(), "key2", null);
        setField(term62726, term62726.getClass(), "key3", null);
        setField(term62726, term62726.getClass(), "value1", null);
        setField(term62726, term62726.getClass(), "value2", null);
        setField(term62726, term62726.getClass(), "value3", null);
        setIntField(term62727, term62727.getClass(), "maxSize", 0);
        setBooleanField(term62727, term62727.getClass(), "scanUntilRemovable", false);
        setField(term62727, term62727.getClass(), "header", null);
        setFloatField(term62727, term62727.getClass(), "loadFactor", 0.0F);
        setIntField(term62727, term62727.getClass(), "size", 0);
        setField(term62727, term62727.getClass(), "data", null);
        setIntField(term62727, term62727.getClass(), "threshold", 0);
        setIntField(term62727, term62727.getClass(), "modCount", 0);
        setField(term62727, term62727.getClass(), "entrySet", null);
        setField(term62727, term62727.getClass(), "keySet", null);
        setField(term62727, term62727.getClass(), "values", null);
        setField(term62727, term62727.getClass(), "keySet", null);
        setField(term62727, term62727.getClass(), "values", null);
        setField(term62726, term62726.getClass(), "delegateMap", term62727);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term62289;
        Object retValue = callMethod(klass, "equals", argTypes, term62197, args);
        assertTrue(recursiveEquals(term62197, term62725));
        assertTrue(recursiveEquals(term62289, term62726));
        assertTrue(recursiveEquals(retValue, true));
    }

};
