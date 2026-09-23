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

public class Flat3Map_containsKey_76092510456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82825;
     Object term82965;
     Object term83452;
     Object term83453;

    public Flat3Map_containsKey_76092510456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82825 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term82825, term82825.getClass(), "delegateMap", null);
        setIntField(term82825, term82825.getClass(), "size", 3);
        setIntField(term82825, term82825.getClass(), "hash3", -1);
        setIntField(term82825, term82825.getClass(), "hash2", -1);
        setIntField(term82825, term82825.getClass(), "hash1", 0);
        term82965 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$ValuesIterator"));
        term83452 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term83452, term83452.getClass(), "size", 3);
        setIntField(term83452, term83452.getClass(), "hash1", 0);
        setIntField(term83452, term83452.getClass(), "hash2", -1);
        setIntField(term83452, term83452.getClass(), "hash3", -1);
        setField(term83452, term83452.getClass(), "key1", null);
        setField(term83452, term83452.getClass(), "key2", null);
        setField(term83452, term83452.getClass(), "key3", null);
        setField(term83452, term83452.getClass(), "value1", null);
        setField(term83452, term83452.getClass(), "value2", null);
        setField(term83452, term83452.getClass(), "value3", null);
        setField(term83452, term83452.getClass(), "delegateMap", null);
        term83453 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$ValuesIterator"));
        setField(term83453, term83453.getClass(), "parent", null);
        setIntField(term83453, term83453.getClass(), "hashIndex", 0);
        setField(term83453, term83453.getClass(), "last", null);
        setField(term83453, term83453.getClass(), "next", null);
        setIntField(term83453, term83453.getClass(), "expectedModCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term82965;
        callMethod(klass, "containsKey", argTypes, term82825, args);
        assertTrue(recursiveEquals(term82825, term83452));
        assertTrue(recursiveEquals(term82965, term83453));
    }

};


