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

public class Flat3Map_get_229621781308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51620;
     Object term51807;
     Object term51808;

    public Flat3Map_get_229621781308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51620 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term51620, term51620.getClass(), "delegateMap", null);
        setIntField(term51620, term51620.getClass(), "size", 1);
        term51807 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term51807, term51807.getClass(), "size", 1);
        setIntField(term51807, term51807.getClass(), "hash1", 0);
        setIntField(term51807, term51807.getClass(), "hash2", 0);
        setIntField(term51807, term51807.getClass(), "hash3", 0);
        setField(term51807, term51807.getClass(), "key1", null);
        setField(term51807, term51807.getClass(), "key2", null);
        setField(term51807, term51807.getClass(), "key3", null);
        setField(term51807, term51807.getClass(), "value1", null);
        setField(term51807, term51807.getClass(), "value2", null);
        setField(term51807, term51807.getClass(), "value3", null);
        setField(term51807, term51807.getClass(), "delegateMap", null);
        term51808 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term51808, term51808.getClass(), "size", 1);
        setIntField(term51808, term51808.getClass(), "hash1", 0);
        setIntField(term51808, term51808.getClass(), "hash2", 0);
        setIntField(term51808, term51808.getClass(), "hash3", 0);
        setField(term51808, term51808.getClass(), "key1", null);
        setField(term51808, term51808.getClass(), "key2", null);
        setField(term51808, term51808.getClass(), "key3", null);
        setField(term51808, term51808.getClass(), "value1", null);
        setField(term51808, term51808.getClass(), "value2", null);
        setField(term51808, term51808.getClass(), "value3", null);
        setField(term51808, term51808.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term51620;
        Object retValue = callMethod(klass, "get", argTypes, term51620, args);
        assertTrue(recursiveEquals(term51620, term51807));
        assertTrue(recursiveEquals(term51620, term51808));
        assertTrue(recursiveEquals(retValue, null));
    }

};


