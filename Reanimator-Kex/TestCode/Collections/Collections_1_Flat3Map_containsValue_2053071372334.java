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

public class Flat3Map_containsValue_2053071372334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60049;
     Object term60229;
     Object term60787;
     Object term60789;

    public Flat3Map_containsValue_2053071372334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60049 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term60137 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        setField(term60049, term60049.getClass(), "delegateMap", null);
        setIntField(term60049, term60049.getClass(), "size", 3);
        setField(term60049, term60049.getClass(), "value3", term60137);
        term60229 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term60317 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        setField(term60229, term60229.getClass(), "delegateMap", term60317);
        term60787 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term60788 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        setIntField(term60787, term60787.getClass(), "size", 3);
        setIntField(term60787, term60787.getClass(), "hash1", 0);
        setIntField(term60787, term60787.getClass(), "hash2", 0);
        setIntField(term60787, term60787.getClass(), "hash3", 0);
        setField(term60787, term60787.getClass(), "key1", null);
        setField(term60787, term60787.getClass(), "key2", null);
        setField(term60787, term60787.getClass(), "key3", null);
        setField(term60787, term60787.getClass(), "value1", null);
        setField(term60787, term60787.getClass(), "value2", null);
        setIntField(term60788, term60788.getClass(), "maxSize", 0);
        setBooleanField(term60788, term60788.getClass(), "scanUntilRemovable", false);
        setField(term60788, term60788.getClass(), "header", null);
        setFloatField(term60788, term60788.getClass(), "loadFactor", 0.0F);
        setIntField(term60788, term60788.getClass(), "size", 0);
        setField(term60788, term60788.getClass(), "data", null);
        setIntField(term60788, term60788.getClass(), "threshold", 0);
        setIntField(term60788, term60788.getClass(), "modCount", 0);
        setField(term60788, term60788.getClass(), "entrySet", null);
        setField(term60788, term60788.getClass(), "keySet", null);
        setField(term60788, term60788.getClass(), "values", null);
        setField(term60788, term60788.getClass(), "keySet", null);
        setField(term60788, term60788.getClass(), "values", null);
        setField(term60787, term60787.getClass(), "value3", term60788);
        setField(term60787, term60787.getClass(), "delegateMap", null);
        term60789 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term60790 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        setIntField(term60789, term60789.getClass(), "size", 0);
        setIntField(term60789, term60789.getClass(), "hash1", 0);
        setIntField(term60789, term60789.getClass(), "hash2", 0);
        setIntField(term60789, term60789.getClass(), "hash3", 0);
        setField(term60789, term60789.getClass(), "key1", null);
        setField(term60789, term60789.getClass(), "key2", null);
        setField(term60789, term60789.getClass(), "key3", null);
        setField(term60789, term60789.getClass(), "value1", null);
        setField(term60789, term60789.getClass(), "value2", null);
        setField(term60789, term60789.getClass(), "value3", null);
        setIntField(term60790, term60790.getClass(), "maxSize", 0);
        setBooleanField(term60790, term60790.getClass(), "scanUntilRemovable", false);
        setField(term60790, term60790.getClass(), "header", null);
        setFloatField(term60790, term60790.getClass(), "loadFactor", 0.0F);
        setIntField(term60790, term60790.getClass(), "size", 0);
        setField(term60790, term60790.getClass(), "data", null);
        setIntField(term60790, term60790.getClass(), "threshold", 0);
        setIntField(term60790, term60790.getClass(), "modCount", 0);
        setField(term60790, term60790.getClass(), "entrySet", null);
        setField(term60790, term60790.getClass(), "keySet", null);
        setField(term60790, term60790.getClass(), "values", null);
        setField(term60790, term60790.getClass(), "keySet", null);
        setField(term60790, term60790.getClass(), "values", null);
        setField(term60789, term60789.getClass(), "delegateMap", term60790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term60229;
        callMethod(klass, "containsValue", argTypes, term60049, args);
        assertTrue(recursiveEquals(term60049, term60787));
        assertTrue(recursiveEquals(term60229, term60789));
    }

};
