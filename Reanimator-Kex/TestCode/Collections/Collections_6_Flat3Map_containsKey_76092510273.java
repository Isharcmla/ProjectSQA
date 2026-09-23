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

public class Flat3Map_containsKey_76092510273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44670;
     Object term44810;
     Object term44882;
     Object term44883;

    public Flat3Map_containsKey_76092510273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44670 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term44670, term44670.getClass(), "delegateMap", null);
        setIntField(term44670, term44670.getClass(), "size", 1);
        term44810 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$ValuesIterator"));
        term44882 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term44882, term44882.getClass(), "size", 1);
        setIntField(term44882, term44882.getClass(), "hash1", 0);
        setIntField(term44882, term44882.getClass(), "hash2", 0);
        setIntField(term44882, term44882.getClass(), "hash3", 0);
        setField(term44882, term44882.getClass(), "key1", null);
        setField(term44882, term44882.getClass(), "key2", null);
        setField(term44882, term44882.getClass(), "key3", null);
        setField(term44882, term44882.getClass(), "value1", null);
        setField(term44882, term44882.getClass(), "value2", null);
        setField(term44882, term44882.getClass(), "value3", null);
        setField(term44882, term44882.getClass(), "delegateMap", null);
        term44883 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$ValuesIterator"));
        setField(term44883, term44883.getClass(), "parent", null);
        setIntField(term44883, term44883.getClass(), "hashIndex", 0);
        setField(term44883, term44883.getClass(), "last", null);
        setField(term44883, term44883.getClass(), "next", null);
        setIntField(term44883, term44883.getClass(), "expectedModCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term44810;
        callMethod(klass, "containsKey", argTypes, term44670, args);
        assertTrue(recursiveEquals(term44670, term44882));
        assertTrue(recursiveEquals(term44810, term44883));
    }

};


