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

public class Flat3Map_equals_1826922527163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27369;
     Object term27461;
     Object term27798;
     Object term27799;

    public Flat3Map_equals_1826922527163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27369 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term27369, term27369.getClass(), "delegateMap", null);
        setIntField(term27369, term27369.getClass(), "size", 1);
        term27461 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term27461, term27461.getClass(), "delegateMap", null);
        setIntField(term27461, term27461.getClass(), "size", 1);
        term27798 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term27798, term27798.getClass(), "size", 1);
        setIntField(term27798, term27798.getClass(), "hash1", 0);
        setIntField(term27798, term27798.getClass(), "hash2", 0);
        setIntField(term27798, term27798.getClass(), "hash3", 0);
        setField(term27798, term27798.getClass(), "key1", null);
        setField(term27798, term27798.getClass(), "key2", null);
        setField(term27798, term27798.getClass(), "key3", null);
        setField(term27798, term27798.getClass(), "value1", null);
        setField(term27798, term27798.getClass(), "value2", null);
        setField(term27798, term27798.getClass(), "value3", null);
        setField(term27798, term27798.getClass(), "delegateMap", null);
        term27799 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term27799, term27799.getClass(), "size", 1);
        setIntField(term27799, term27799.getClass(), "hash1", 0);
        setIntField(term27799, term27799.getClass(), "hash2", 0);
        setIntField(term27799, term27799.getClass(), "hash3", 0);
        setField(term27799, term27799.getClass(), "key1", null);
        setField(term27799, term27799.getClass(), "key2", null);
        setField(term27799, term27799.getClass(), "key3", null);
        setField(term27799, term27799.getClass(), "value1", null);
        setField(term27799, term27799.getClass(), "value2", null);
        setField(term27799, term27799.getClass(), "value3", null);
        setField(term27799, term27799.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term27461;
        Object retValue = callMethod(klass, "equals", argTypes, term27369, args);
        assertTrue(recursiveEquals(term27369, term27798));
        assertTrue(recursiveEquals(term27461, term27799));
        assertTrue(recursiveEquals(retValue, true));
    }

};


