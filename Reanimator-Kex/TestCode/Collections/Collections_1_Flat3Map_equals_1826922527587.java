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

public class Flat3Map_equals_1826922527587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112319;
     Object term112529;
     Object term112562;
     Object term112564;

    public Flat3Map_equals_1826922527587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112319 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term112437 = newInstance(Class.forName("org.apache.commons.collections.functors.ExceptionFactory"));
        setField(term112319, term112319.getClass(), "delegateMap", null);
        setIntField(term112319, term112319.getClass(), "size", 2);
        setField(term112319, term112319.getClass(), "key2", term112437);
        term112529 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term112529, term112529.getClass(), "delegateMap", null);
        setIntField(term112529, term112529.getClass(), "size", 2);
        setIntField(term112529, term112529.getClass(), "hash2", -1);
        setIntField(term112529, term112529.getClass(), "hash1", 0);
        term112562 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term112563 = newInstance(Class.forName("org.apache.commons.collections.functors.ExceptionFactory"));
        setIntField(term112562, term112562.getClass(), "size", 2);
        setIntField(term112562, term112562.getClass(), "hash1", 0);
        setIntField(term112562, term112562.getClass(), "hash2", 0);
        setIntField(term112562, term112562.getClass(), "hash3", 0);
        setField(term112562, term112562.getClass(), "key1", null);
        setField(term112562, term112562.getClass(), "key2", term112563);
        setField(term112562, term112562.getClass(), "key3", null);
        setField(term112562, term112562.getClass(), "value1", null);
        setField(term112562, term112562.getClass(), "value2", null);
        setField(term112562, term112562.getClass(), "value3", null);
        setField(term112562, term112562.getClass(), "delegateMap", null);
        term112564 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term112564, term112564.getClass(), "size", 2);
        setIntField(term112564, term112564.getClass(), "hash1", 0);
        setIntField(term112564, term112564.getClass(), "hash2", -1);
        setIntField(term112564, term112564.getClass(), "hash3", 0);
        setField(term112564, term112564.getClass(), "key1", null);
        setField(term112564, term112564.getClass(), "key2", null);
        setField(term112564, term112564.getClass(), "key3", null);
        setField(term112564, term112564.getClass(), "value1", null);
        setField(term112564, term112564.getClass(), "value2", null);
        setField(term112564, term112564.getClass(), "value3", null);
        setField(term112564, term112564.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term112529;
        Object retValue = callMethod(klass, "equals", argTypes, term112319, args);
        assertTrue(recursiveEquals(term112319, term112562));
        assertTrue(recursiveEquals(term112529, term112564));
        assertTrue(recursiveEquals(retValue, false));
    }

};
