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

public class Flat3Map_remove_8406902791053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210082;
     Object term210174;
     Object term210396;
     Object term210397;

    public Flat3Map_remove_8406902791053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210082 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term210082, term210082.getClass(), "delegateMap", null);
        setIntField(term210082, term210082.getClass(), "size", 3);
        setIntField(term210082, term210082.getClass(), "hash3", 0);
        setField(term210082, term210082.getClass(), "key3", term210082);
        term210174 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term210284 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term210174, term210174.getClass(), "delegateMap", null);
        setIntField(term210174, term210174.getClass(), "size", 3);
        setIntField(term210174, term210174.getClass(), "hash3", 0);
        setIntField(term210284, term210284.getClass(), "size", 0);
        setField(term210174, term210174.getClass(), "value3", term210284);
        setIntField(term210174, term210174.getClass(), "hash2", 0);
        setField(term210174, term210174.getClass(), "value2", null);
        setIntField(term210174, term210174.getClass(), "hash1", 0);
        setField(term210174, term210174.getClass(), "value1", null);
        term210396 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term210396, term210396.getClass(), "size", 3);
        setIntField(term210396, term210396.getClass(), "hash1", 0);
        setIntField(term210396, term210396.getClass(), "hash2", 0);
        setIntField(term210396, term210396.getClass(), "hash3", 0);
        setField(term210396, term210396.getClass(), "key1", null);
        setField(term210396, term210396.getClass(), "key2", null);
        setField(term210396, term210396.getClass(), "key3", term210396);
        setField(term210396, term210396.getClass(), "value1", null);
        setField(term210396, term210396.getClass(), "value2", null);
        setField(term210396, term210396.getClass(), "value3", null);
        setField(term210396, term210396.getClass(), "delegateMap", null);
        term210397 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term210398 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term210397, term210397.getClass(), "size", 3);
        setIntField(term210397, term210397.getClass(), "hash1", 0);
        setIntField(term210397, term210397.getClass(), "hash2", 0);
        setIntField(term210397, term210397.getClass(), "hash3", 0);
        setField(term210397, term210397.getClass(), "key1", null);
        setField(term210397, term210397.getClass(), "key2", null);
        setField(term210397, term210397.getClass(), "key3", null);
        setField(term210397, term210397.getClass(), "value1", null);
        setField(term210397, term210397.getClass(), "value2", null);
        setFloatField(term210398, term210398.getClass(), "loadFactor", 0.0F);
        setIntField(term210398, term210398.getClass(), "size", 0);
        setField(term210398, term210398.getClass(), "data", null);
        setIntField(term210398, term210398.getClass(), "threshold", 0);
        setIntField(term210398, term210398.getClass(), "modCount", 0);
        setField(term210398, term210398.getClass(), "entrySet", null);
        setField(term210398, term210398.getClass(), "keySet", null);
        setField(term210398, term210398.getClass(), "values", null);
        setField(term210398, term210398.getClass(), "keySet", null);
        setField(term210398, term210398.getClass(), "values", null);
        setField(term210397, term210397.getClass(), "value3", term210398);
        setField(term210397, term210397.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term210174;
        Object retValue = callMethod(klass, "remove", argTypes, term210082, args);
        assertTrue(recursiveEquals(term210082, term210396));
        assertTrue(recursiveEquals(term210174, term210397));
        assertTrue(recursiveEquals(retValue, null));
    }

};
