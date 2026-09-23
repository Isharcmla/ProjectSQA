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

public class Flat3Map_put_1944740725461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84079;
     Object term84171;
     Object term84338;
     Object term84341;

    public Flat3Map_put_1944740725461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84079 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term84079, term84079.getClass(), "delegateMap", null);
        setIntField(term84079, term84079.getClass(), "size", 1);
        setIntField(term84079, term84079.getClass(), "hash1", 0);
        setField(term84079, term84079.getClass(), "key1", null);
        term84171 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term84281 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term84171, term84171.getClass(), "delegateMap", null);
        setIntField(term84171, term84171.getClass(), "size", 1);
        setIntField(term84171, term84171.getClass(), "hash1", 0);
        setIntField(term84281, term84281.getClass(), "size", 0);
        setField(term84171, term84171.getClass(), "value1", term84281);
        setField(term84171, term84171.getClass(), "key1", null);
        term84338 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term84339 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term84340 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term84338, term84338.getClass(), "size", 2);
        setIntField(term84338, term84338.getClass(), "hash1", 0);
        setIntField(term84338, term84338.getClass(), "hash2", 0);
        setIntField(term84338, term84338.getClass(), "hash3", 0);
        setField(term84338, term84338.getClass(), "key1", null);
        setIntField(term84339, term84339.getClass(), "size", 1);
        setIntField(term84339, term84339.getClass(), "hash1", 0);
        setIntField(term84339, term84339.getClass(), "hash2", 0);
        setIntField(term84339, term84339.getClass(), "hash3", 0);
        setField(term84339, term84339.getClass(), "key1", null);
        setField(term84339, term84339.getClass(), "key2", null);
        setField(term84339, term84339.getClass(), "key3", null);
        setFloatField(term84340, term84340.getClass(), "loadFactor", 0.0F);
        setIntField(term84340, term84340.getClass(), "size", 0);
        setField(term84340, term84340.getClass(), "data", null);
        setIntField(term84340, term84340.getClass(), "threshold", 0);
        setIntField(term84340, term84340.getClass(), "modCount", 0);
        setField(term84340, term84340.getClass(), "entrySet", null);
        setField(term84340, term84340.getClass(), "keySet", null);
        setField(term84340, term84340.getClass(), "values", null);
        setField(term84340, term84340.getClass(), "keySet", null);
        setField(term84340, term84340.getClass(), "values", null);
        setField(term84339, term84339.getClass(), "value1", term84340);
        setField(term84339, term84339.getClass(), "value2", null);
        setField(term84339, term84339.getClass(), "value3", null);
        setField(term84339, term84339.getClass(), "delegateMap", null);
        setField(term84338, term84338.getClass(), "key2", term84339);
        setField(term84338, term84338.getClass(), "key3", null);
        setField(term84338, term84338.getClass(), "value1", null);
        setField(term84338, term84338.getClass(), "value2", null);
        setField(term84338, term84338.getClass(), "value3", null);
        setField(term84338, term84338.getClass(), "delegateMap", null);
        term84341 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term84342 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term84341, term84341.getClass(), "size", 1);
        setIntField(term84341, term84341.getClass(), "hash1", 0);
        setIntField(term84341, term84341.getClass(), "hash2", 0);
        setIntField(term84341, term84341.getClass(), "hash3", 0);
        setField(term84341, term84341.getClass(), "key1", null);
        setField(term84341, term84341.getClass(), "key2", null);
        setField(term84341, term84341.getClass(), "key3", null);
        setFloatField(term84342, term84342.getClass(), "loadFactor", 0.0F);
        setIntField(term84342, term84342.getClass(), "size", 0);
        setField(term84342, term84342.getClass(), "data", null);
        setIntField(term84342, term84342.getClass(), "threshold", 0);
        setIntField(term84342, term84342.getClass(), "modCount", 0);
        setField(term84342, term84342.getClass(), "entrySet", null);
        setField(term84342, term84342.getClass(), "keySet", null);
        setField(term84342, term84342.getClass(), "values", null);
        setField(term84342, term84342.getClass(), "keySet", null);
        setField(term84342, term84342.getClass(), "values", null);
        setField(term84341, term84341.getClass(), "value1", term84342);
        setField(term84341, term84341.getClass(), "value2", null);
        setField(term84341, term84341.getClass(), "value3", null);
        setField(term84341, term84341.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term84171;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term84079, args);
        assertTrue(recursiveEquals(term84079, term84338));
        assertTrue(recursiveEquals(term84171, term84341));
        assertTrue(recursiveEquals(retValue, null));
    }

};


