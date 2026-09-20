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

public class Flat3Map_equals_1826922527525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99659;
     Object term99853;
     Object term99898;
     Object term99900;

    public Flat3Map_equals_1826922527525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99659 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term99761 = newInstance(Class.forName("java.util.stream.ReduceOps$CountingSink$OfDouble"));
        setField(term99659, term99659.getClass(), "delegateMap", null);
        setIntField(term99659, term99659.getClass(), "size", 2);
        setField(term99659, term99659.getClass(), "key2", null);
        setField(term99659, term99659.getClass(), "value2", null);
        setField(term99659, term99659.getClass(), "key1", term99761);
        term99853 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term99853, term99853.getClass(), "delegateMap", null);
        setIntField(term99853, term99853.getClass(), "size", 2);
        setField(term99853, term99853.getClass(), "key2", null);
        setField(term99853, term99853.getClass(), "value2", null);
        setIntField(term99853, term99853.getClass(), "hash2", -1);
        setIntField(term99853, term99853.getClass(), "hash1", 0);
        term99898 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term99899 = newInstance(Class.forName("java.util.stream.ReduceOps$CountingSink$OfDouble"));
        setIntField(term99898, term99898.getClass(), "size", 2);
        setIntField(term99898, term99898.getClass(), "hash1", 0);
        setIntField(term99898, term99898.getClass(), "hash2", 0);
        setIntField(term99898, term99898.getClass(), "hash3", 0);
        setLongField(term99899, term99899.getClass(), "count", 0L);
        setField(term99899, term99899.getClass(), "state", null);
        setField(term99898, term99898.getClass(), "key1", term99899);
        setField(term99898, term99898.getClass(), "key2", null);
        setField(term99898, term99898.getClass(), "key3", null);
        setField(term99898, term99898.getClass(), "value1", null);
        setField(term99898, term99898.getClass(), "value2", null);
        setField(term99898, term99898.getClass(), "value3", null);
        setField(term99898, term99898.getClass(), "delegateMap", null);
        term99900 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term99900, term99900.getClass(), "size", 2);
        setIntField(term99900, term99900.getClass(), "hash1", 0);
        setIntField(term99900, term99900.getClass(), "hash2", -1);
        setIntField(term99900, term99900.getClass(), "hash3", 0);
        setField(term99900, term99900.getClass(), "key1", null);
        setField(term99900, term99900.getClass(), "key2", null);
        setField(term99900, term99900.getClass(), "key3", null);
        setField(term99900, term99900.getClass(), "value1", null);
        setField(term99900, term99900.getClass(), "value2", null);
        setField(term99900, term99900.getClass(), "value3", null);
        setField(term99900, term99900.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term99853;
        Object retValue = callMethod(klass, "equals", argTypes, term99659, args);
        assertTrue(recursiveEquals(term99659, term99898));
        assertTrue(recursiveEquals(term99853, term99900));
        assertTrue(recursiveEquals(retValue, false));
    }

};
