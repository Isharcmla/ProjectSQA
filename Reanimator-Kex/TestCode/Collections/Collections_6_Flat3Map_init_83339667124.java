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
import java.util.LinkedHashMap;

public class Flat3Map_init_83339667124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term6103;
     Object term6104;

    public Flat3Map_init_83339667124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new LinkedHashMap();
        term6103 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term6103, term6103.getClass(), "size", 0);
        setIntField(term6103, term6103.getClass(), "hash1", 0);
        setIntField(term6103, term6103.getClass(), "hash2", 0);
        setIntField(term6103, term6103.getClass(), "hash3", 0);
        setField(term6103, term6103.getClass(), "key1", null);
        setField(term6103, term6103.getClass(), "key2", null);
        setField(term6103, term6103.getClass(), "key3", null);
        setField(term6103, term6103.getClass(), "value1", null);
        setField(term6103, term6103.getClass(), "value2", null);
        setField(term6103, term6103.getClass(), "value3", null);
        setField(term6103, term6103.getClass(), "delegateMap", null);
        term6104 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term6103));
        assertTrue(recursiveEquals(term1, term6104));
    }

};


