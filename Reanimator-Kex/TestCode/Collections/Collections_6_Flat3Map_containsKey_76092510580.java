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

public class Flat3Map_containsKey_76092510580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119012;
     Object term119152;
     Object term119934;
     Object term119935;

    public Flat3Map_containsKey_76092510580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119012 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term119012, term119012.getClass(), "delegateMap", null);
        setIntField(term119012, term119012.getClass(), "size", 3);
        setIntField(term119012, term119012.getClass(), "hash3", 0);
        term119152 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$ValuesIterator"));
        term119934 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term119934, term119934.getClass(), "size", 3);
        setIntField(term119934, term119934.getClass(), "hash1", 0);
        setIntField(term119934, term119934.getClass(), "hash2", 0);
        setIntField(term119934, term119934.getClass(), "hash3", 0);
        setField(term119934, term119934.getClass(), "key1", null);
        setField(term119934, term119934.getClass(), "key2", null);
        setField(term119934, term119934.getClass(), "key3", null);
        setField(term119934, term119934.getClass(), "value1", null);
        setField(term119934, term119934.getClass(), "value2", null);
        setField(term119934, term119934.getClass(), "value3", null);
        setField(term119934, term119934.getClass(), "delegateMap", null);
        term119935 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$ValuesIterator"));
        setField(term119935, term119935.getClass(), "parent", null);
        setIntField(term119935, term119935.getClass(), "hashIndex", 0);
        setField(term119935, term119935.getClass(), "last", null);
        setField(term119935, term119935.getClass(), "next", null);
        setIntField(term119935, term119935.getClass(), "expectedModCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term119152;
        callMethod(klass, "containsKey", argTypes, term119012, args);
        assertTrue(recursiveEquals(term119012, term119934));
        assertTrue(recursiveEquals(term119152, term119935));
    }

};


