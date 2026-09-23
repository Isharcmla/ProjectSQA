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

public class Flat3Map_equals_1826922527177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29101;
     Object term29193;
     Object term29216;
     Object term29217;

    public Flat3Map_equals_1826922527177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29101 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term29101, term29101.getClass(), "delegateMap", null);
        setIntField(term29101, term29101.getClass(), "size", -1);
        term29193 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term29193, term29193.getClass(), "delegateMap", null);
        setIntField(term29193, term29193.getClass(), "size", 0);
        term29216 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term29216, term29216.getClass(), "size", -1);
        setIntField(term29216, term29216.getClass(), "hash1", 0);
        setIntField(term29216, term29216.getClass(), "hash2", 0);
        setIntField(term29216, term29216.getClass(), "hash3", 0);
        setField(term29216, term29216.getClass(), "key1", null);
        setField(term29216, term29216.getClass(), "key2", null);
        setField(term29216, term29216.getClass(), "key3", null);
        setField(term29216, term29216.getClass(), "value1", null);
        setField(term29216, term29216.getClass(), "value2", null);
        setField(term29216, term29216.getClass(), "value3", null);
        setField(term29216, term29216.getClass(), "delegateMap", null);
        term29217 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term29217, term29217.getClass(), "size", 0);
        setIntField(term29217, term29217.getClass(), "hash1", 0);
        setIntField(term29217, term29217.getClass(), "hash2", 0);
        setIntField(term29217, term29217.getClass(), "hash3", 0);
        setField(term29217, term29217.getClass(), "key1", null);
        setField(term29217, term29217.getClass(), "key2", null);
        setField(term29217, term29217.getClass(), "key3", null);
        setField(term29217, term29217.getClass(), "value1", null);
        setField(term29217, term29217.getClass(), "value2", null);
        setField(term29217, term29217.getClass(), "value3", null);
        setField(term29217, term29217.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term29193;
        Object retValue = callMethod(klass, "equals", argTypes, term29101, args);
        assertTrue(recursiveEquals(term29101, term29216));
        assertTrue(recursiveEquals(term29193, term29217));
        assertTrue(recursiveEquals(retValue, false));
    }

};


