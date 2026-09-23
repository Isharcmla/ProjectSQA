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

public class Flat3Map_equals_1826922527505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95071;
     Object term95153;
     Object term95211;
     Object term95213;

    public Flat3Map_equals_1826922527505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95071 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term95115 = newInstance(Class.forName("java.io.PrintWriter"));
        setField(term95071, term95071.getClass(), "delegateMap", null);
        setIntField(term95071, term95071.getClass(), "size", 3);
        setField(term95071, term95071.getClass(), "key3", null);
        setField(term95071, term95071.getClass(), "value3", null);
        setField(term95071, term95071.getClass(), "key2", null);
        setField(term95071, term95071.getClass(), "value2", null);
        setField(term95071, term95071.getClass(), "key1", term95115);
        term95153 = newInstance(Class.forName("java.lang.Object"));
        term95211 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term95212 = newInstance(Class.forName("java.io.PrintWriter"));
        setIntField(term95211, term95211.getClass(), "size", 3);
        setIntField(term95211, term95211.getClass(), "hash1", 0);
        setIntField(term95211, term95211.getClass(), "hash2", 0);
        setIntField(term95211, term95211.getClass(), "hash3", 0);
        setField(term95212, term95212.getClass(), "out", null);
        setBooleanField(term95212, term95212.getClass(), "autoFlush", false);
        setBooleanField(term95212, term95212.getClass(), "trouble", false);
        setField(term95212, term95212.getClass(), "formatter", null);
        setField(term95212, term95212.getClass(), "psOut", null);
        setField(term95212, term95212.getClass(), "writeBuffer", null);
        setField(term95212, term95212.getClass(), "lock", null);
        setField(term95211, term95211.getClass(), "key1", term95212);
        setField(term95211, term95211.getClass(), "key2", null);
        setField(term95211, term95211.getClass(), "key3", null);
        setField(term95211, term95211.getClass(), "value1", null);
        setField(term95211, term95211.getClass(), "value2", null);
        setField(term95211, term95211.getClass(), "value3", null);
        setField(term95211, term95211.getClass(), "delegateMap", null);
        term95213 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term95153;
        Object retValue = callMethod(klass, "equals", argTypes, term95071, args);
        assertTrue(recursiveEquals(term95071, term95211));
        assertTrue(recursiveEquals(term95153, term95213));
        assertTrue(recursiveEquals(retValue, false));
    }

};


