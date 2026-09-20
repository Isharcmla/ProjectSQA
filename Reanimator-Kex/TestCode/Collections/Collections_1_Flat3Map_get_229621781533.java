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

public class Flat3Map_get_229621781533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101366;
     Object term101530;
     Object term101533;

    public Flat3Map_get_229621781533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101366 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term101412 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term101459 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setField(term101366, term101366.getClass(), "delegateMap", null);
        setIntField(term101366, term101366.getClass(), "size", 3);
        setIntField(term101366, term101366.getClass(), "hash3", 0);
        setField(term101366, term101366.getClass(), "value3", null);
        setIntField(term101366, term101366.getClass(), "hash2", 0);
        setField(term101366, term101366.getClass(), "value2", null);
        setIntField(term101366, term101366.getClass(), "hash1", 0);
        setField(term101366, term101366.getClass(), "value1", null);
        setField(term101412, term101412.getClass(), "delegateMap", term101459);
        setField(term101366, term101366.getClass(), "key3", term101412);
        term101530 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term101531 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term101532 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setIntField(term101530, term101530.getClass(), "size", 3);
        setIntField(term101530, term101530.getClass(), "hash1", 0);
        setIntField(term101530, term101530.getClass(), "hash2", 0);
        setIntField(term101530, term101530.getClass(), "hash3", 0);
        setField(term101530, term101530.getClass(), "key1", null);
        setField(term101530, term101530.getClass(), "key2", null);
        setIntField(term101531, term101531.getClass(), "size", 0);
        setIntField(term101531, term101531.getClass(), "hash1", 0);
        setIntField(term101531, term101531.getClass(), "hash2", 0);
        setIntField(term101531, term101531.getClass(), "hash3", 0);
        setField(term101531, term101531.getClass(), "key1", null);
        setField(term101531, term101531.getClass(), "key2", null);
        setField(term101531, term101531.getClass(), "key3", null);
        setField(term101531, term101531.getClass(), "value1", null);
        setField(term101531, term101531.getClass(), "value2", null);
        setField(term101531, term101531.getClass(), "value3", null);
        setFloatField(term101532, term101532.getClass(), "loadFactor", 0.0F);
        setIntField(term101532, term101532.getClass(), "size", 0);
        setField(term101532, term101532.getClass(), "data", null);
        setIntField(term101532, term101532.getClass(), "threshold", 0);
        setIntField(term101532, term101532.getClass(), "modCount", 0);
        setField(term101532, term101532.getClass(), "entrySet", null);
        setField(term101532, term101532.getClass(), "keySet", null);
        setField(term101532, term101532.getClass(), "values", null);
        setField(term101532, term101532.getClass(), "keySet", null);
        setField(term101532, term101532.getClass(), "values", null);
        setField(term101531, term101531.getClass(), "delegateMap", term101532);
        setField(term101530, term101530.getClass(), "key3", term101531);
        setField(term101530, term101530.getClass(), "value1", null);
        setField(term101530, term101530.getClass(), "value2", null);
        setField(term101530, term101530.getClass(), "value3", null);
        setField(term101530, term101530.getClass(), "delegateMap", null);
        term101533 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term101534 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term101535 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setIntField(term101533, term101533.getClass(), "size", 3);
        setIntField(term101533, term101533.getClass(), "hash1", 0);
        setIntField(term101533, term101533.getClass(), "hash2", 0);
        setIntField(term101533, term101533.getClass(), "hash3", 0);
        setField(term101533, term101533.getClass(), "key1", null);
        setField(term101533, term101533.getClass(), "key2", null);
        setIntField(term101534, term101534.getClass(), "size", 0);
        setIntField(term101534, term101534.getClass(), "hash1", 0);
        setIntField(term101534, term101534.getClass(), "hash2", 0);
        setIntField(term101534, term101534.getClass(), "hash3", 0);
        setField(term101534, term101534.getClass(), "key1", null);
        setField(term101534, term101534.getClass(), "key2", null);
        setField(term101534, term101534.getClass(), "key3", null);
        setField(term101534, term101534.getClass(), "value1", null);
        setField(term101534, term101534.getClass(), "value2", null);
        setField(term101534, term101534.getClass(), "value3", null);
        setFloatField(term101535, term101535.getClass(), "loadFactor", 0.0F);
        setIntField(term101535, term101535.getClass(), "size", 0);
        setField(term101535, term101535.getClass(), "data", null);
        setIntField(term101535, term101535.getClass(), "threshold", 0);
        setIntField(term101535, term101535.getClass(), "modCount", 0);
        setField(term101535, term101535.getClass(), "entrySet", null);
        setField(term101535, term101535.getClass(), "keySet", null);
        setField(term101535, term101535.getClass(), "values", null);
        setField(term101535, term101535.getClass(), "keySet", null);
        setField(term101535, term101535.getClass(), "values", null);
        setField(term101534, term101534.getClass(), "delegateMap", term101535);
        setField(term101533, term101533.getClass(), "key3", term101534);
        setField(term101533, term101533.getClass(), "value1", null);
        setField(term101533, term101533.getClass(), "value2", null);
        setField(term101533, term101533.getClass(), "value3", null);
        setField(term101533, term101533.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term101366;
        Object retValue = callMethod(klass, "get", argTypes, term101366, args);
        assertTrue(recursiveEquals(term101366, term101530));
        assertTrue(recursiveEquals(term101366, term101533));
        assertTrue(recursiveEquals(retValue, null));
    }

};
