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

public class Flat3Map_containsKey_76092510341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56605;
     Object term56745;
     Object term56801;
     Object term56802;

    public Flat3Map_containsKey_76092510341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56605 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term56605, term56605.getClass(), "delegateMap", null);
        setIntField(term56605, term56605.getClass(), "size", 3);
        term56745 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$ValuesIterator"));
        term56801 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term56801, term56801.getClass(), "size", 3);
        setIntField(term56801, term56801.getClass(), "hash1", 0);
        setIntField(term56801, term56801.getClass(), "hash2", 0);
        setIntField(term56801, term56801.getClass(), "hash3", 0);
        setField(term56801, term56801.getClass(), "key1", null);
        setField(term56801, term56801.getClass(), "key2", null);
        setField(term56801, term56801.getClass(), "key3", null);
        setField(term56801, term56801.getClass(), "value1", null);
        setField(term56801, term56801.getClass(), "value2", null);
        setField(term56801, term56801.getClass(), "value3", null);
        setField(term56801, term56801.getClass(), "delegateMap", null);
        term56802 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$ValuesIterator"));
        setField(term56802, term56802.getClass(), "parent", null);
        setIntField(term56802, term56802.getClass(), "hashIndex", 0);
        setField(term56802, term56802.getClass(), "last", null);
        setField(term56802, term56802.getClass(), "next", null);
        setIntField(term56802, term56802.getClass(), "expectedModCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term56745;
        callMethod(klass, "containsKey", argTypes, term56605, args);
        assertTrue(recursiveEquals(term56605, term56801));
        assertTrue(recursiveEquals(term56745, term56802));
    }

};


