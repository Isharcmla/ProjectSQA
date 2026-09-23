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

public class Flat3Map_isEmpty_38682173862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15269;
     Object term15523;

    public Flat3Map_isEmpty_38682173862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15269 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term15379 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term15379, term15379.getClass(), "size", -1);
        setField(term15269, term15269.getClass(), "delegateMap", term15379);
        term15523 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term15524 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term15523, term15523.getClass(), "size", 0);
        setIntField(term15523, term15523.getClass(), "hash1", 0);
        setIntField(term15523, term15523.getClass(), "hash2", 0);
        setIntField(term15523, term15523.getClass(), "hash3", 0);
        setField(term15523, term15523.getClass(), "key1", null);
        setField(term15523, term15523.getClass(), "key2", null);
        setField(term15523, term15523.getClass(), "key3", null);
        setField(term15523, term15523.getClass(), "value1", null);
        setField(term15523, term15523.getClass(), "value2", null);
        setField(term15523, term15523.getClass(), "value3", null);
        setFloatField(term15524, term15524.getClass(), "loadFactor", 0.0F);
        setIntField(term15524, term15524.getClass(), "size", -1);
        setField(term15524, term15524.getClass(), "data", null);
        setIntField(term15524, term15524.getClass(), "threshold", 0);
        setIntField(term15524, term15524.getClass(), "modCount", 0);
        setField(term15524, term15524.getClass(), "entrySet", null);
        setField(term15524, term15524.getClass(), "keySet", null);
        setField(term15524, term15524.getClass(), "values", null);
        setField(term15524, term15524.getClass(), "keySet", null);
        setField(term15524, term15524.getClass(), "values", null);
        setField(term15523, term15523.getClass(), "delegateMap", term15524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isEmpty", argTypes, term15269, args);
        assertTrue(recursiveEquals(term15269, term15523));
        assertTrue(recursiveEquals(retValue, false));
    }

};


