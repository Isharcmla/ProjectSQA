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

public class Flat3Map_put_1944740725760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187739;
     Object term190799;
     Object term190800;

    public Flat3Map_put_1944740725760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term187739 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term187794 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term187739, term187739.getClass(), "delegateMap", null);
        setIntField(term187739, term187739.getClass(), "size", 2);
        setIntField(term187739, term187739.getClass(), "hash2", 0);
        setIntField(term187794, term187794.getClass(), "size", 0);
        setField(term187739, term187739.getClass(), "value2", term187794);
        setIntField(term187739, term187739.getClass(), "hash1", 0);
        setField(term187739, term187739.getClass(), "value1", null);
        setField(term187739, term187739.getClass(), "key2", term187739);
        term190799 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term190799, term190799.getClass(), "size", 2);
        setIntField(term190799, term190799.getClass(), "hash1", 0);
        setIntField(term190799, term190799.getClass(), "hash2", 0);
        setIntField(term190799, term190799.getClass(), "hash3", 0);
        setField(term190799, term190799.getClass(), "key1", null);
        setField(term190799, term190799.getClass(), "key2", term190799);
        setField(term190799, term190799.getClass(), "key3", null);
        setField(term190799, term190799.getClass(), "value1", null);
        setField(term190799, term190799.getClass(), "value2", null);
        setField(term190799, term190799.getClass(), "value3", null);
        setField(term190799, term190799.getClass(), "delegateMap", null);
        term190800 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term190800, term190800.getClass(), "size", 2);
        setIntField(term190800, term190800.getClass(), "hash1", 0);
        setIntField(term190800, term190800.getClass(), "hash2", 0);
        setIntField(term190800, term190800.getClass(), "hash3", 0);
        setField(term190800, term190800.getClass(), "key1", null);
        setField(term190800, term190800.getClass(), "key2", term190800);
        setField(term190800, term190800.getClass(), "key3", null);
        setField(term190800, term190800.getClass(), "value1", null);
        setField(term190800, term190800.getClass(), "value2", null);
        setField(term190800, term190800.getClass(), "value3", null);
        setField(term190800, term190800.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term187739;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term187739, args);
        assertTrue(recursiveEquals(term187739, term190799));
        assertTrue(recursiveEquals(term187739, term190800));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


