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

public class Flat3Map_equals_1826922527363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61502;
     Object term61686;
     Object term62050;
     Object term62052;

    public Flat3Map_equals_1826922527363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61502 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term61594 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term61502, term61502.getClass(), "delegateMap", null);
        setIntField(term61502, term61502.getClass(), "size", 3);
        setField(term61502, term61502.getClass(), "key3", null);
        setField(term61502, term61502.getClass(), "value3", null);
        setField(term61502, term61502.getClass(), "key2", null);
        setField(term61502, term61502.getClass(), "value2", term61594);
        term61686 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term61686, term61686.getClass(), "delegateMap", null);
        setIntField(term61686, term61686.getClass(), "size", 3);
        setField(term61686, term61686.getClass(), "key3", null);
        setField(term61686, term61686.getClass(), "value3", null);
        term62050 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term62051 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term62050, term62050.getClass(), "size", 3);
        setIntField(term62050, term62050.getClass(), "hash1", 0);
        setIntField(term62050, term62050.getClass(), "hash2", 0);
        setIntField(term62050, term62050.getClass(), "hash3", 0);
        setField(term62050, term62050.getClass(), "key1", null);
        setField(term62050, term62050.getClass(), "key2", null);
        setField(term62050, term62050.getClass(), "key3", null);
        setField(term62050, term62050.getClass(), "value1", null);
        setIntField(term62051, term62051.getClass(), "size", 0);
        setIntField(term62051, term62051.getClass(), "hash1", 0);
        setIntField(term62051, term62051.getClass(), "hash2", 0);
        setIntField(term62051, term62051.getClass(), "hash3", 0);
        setField(term62051, term62051.getClass(), "key1", null);
        setField(term62051, term62051.getClass(), "key2", null);
        setField(term62051, term62051.getClass(), "key3", null);
        setField(term62051, term62051.getClass(), "value1", null);
        setField(term62051, term62051.getClass(), "value2", null);
        setField(term62051, term62051.getClass(), "value3", null);
        setField(term62051, term62051.getClass(), "delegateMap", null);
        setField(term62050, term62050.getClass(), "value2", term62051);
        setField(term62050, term62050.getClass(), "value3", null);
        setField(term62050, term62050.getClass(), "delegateMap", null);
        term62052 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term62052, term62052.getClass(), "size", 3);
        setIntField(term62052, term62052.getClass(), "hash1", 0);
        setIntField(term62052, term62052.getClass(), "hash2", 0);
        setIntField(term62052, term62052.getClass(), "hash3", 0);
        setField(term62052, term62052.getClass(), "key1", null);
        setField(term62052, term62052.getClass(), "key2", null);
        setField(term62052, term62052.getClass(), "key3", null);
        setField(term62052, term62052.getClass(), "value1", null);
        setField(term62052, term62052.getClass(), "value2", null);
        setField(term62052, term62052.getClass(), "value3", null);
        setField(term62052, term62052.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term61686;
        Object retValue = callMethod(klass, "equals", argTypes, term61502, args);
        assertTrue(recursiveEquals(term61502, term62050));
        assertTrue(recursiveEquals(term61686, term62052));
        assertTrue(recursiveEquals(retValue, false));
    }

};


