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
import java.util.HashMap;

public class Flat3Map_equals_1826922527651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144940;
     Object term145080;
     Object term145147;
     Object term145150;

    public Flat3Map_equals_1826922527651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term144988 = new HashMap();
        term144940 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term144940, term144940.getClass(), "delegateMap", null);
        setIntField(term144940, term144940.getClass(), "size", 3);
        setField(term144940, term144940.getClass(), "key3", null);
        setField(term144940, term144940.getClass(), "value3", null);
        setField(term144940, term144940.getClass(), "key2", null);
        setField(term144940, term144940.getClass(), "value2", null);
        setField(term144940, term144940.getClass(), "key1", term144988);
        term145080 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term145080, term145080.getClass(), "delegateMap", null);
        setIntField(term145080, term145080.getClass(), "size", 3);
        setField(term145080, term145080.getClass(), "key3", null);
        setField(term145080, term145080.getClass(), "value3", null);
        setIntField(term145080, term145080.getClass(), "hash3", 0);
        HashMap term145148 = new HashMap();
        term145147 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term145147, term145147.getClass(), "size", 3);
        setIntField(term145147, term145147.getClass(), "hash1", 0);
        setIntField(term145147, term145147.getClass(), "hash2", 0);
        setIntField(term145147, term145147.getClass(), "hash3", 0);
        setField(term145147, term145147.getClass(), "key1", term145148);
        setField(term145147, term145147.getClass(), "key2", null);
        setField(term145147, term145147.getClass(), "key3", null);
        setField(term145147, term145147.getClass(), "value1", null);
        setField(term145147, term145147.getClass(), "value2", null);
        setField(term145147, term145147.getClass(), "value3", null);
        setField(term145147, term145147.getClass(), "delegateMap", null);
        term145150 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term145150, term145150.getClass(), "size", 3);
        setIntField(term145150, term145150.getClass(), "hash1", 0);
        setIntField(term145150, term145150.getClass(), "hash2", 0);
        setIntField(term145150, term145150.getClass(), "hash3", 0);
        setField(term145150, term145150.getClass(), "key1", null);
        setField(term145150, term145150.getClass(), "key2", null);
        setField(term145150, term145150.getClass(), "key3", null);
        setField(term145150, term145150.getClass(), "value1", null);
        setField(term145150, term145150.getClass(), "value2", null);
        setField(term145150, term145150.getClass(), "value3", null);
        setField(term145150, term145150.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term145080;
        Object retValue = callMethod(klass, "equals", argTypes, term144940, args);
        assertTrue(recursiveEquals(term144940, term145147));
        assertTrue(recursiveEquals(term145080, term145150));
        assertTrue(recursiveEquals(retValue, false));
    }

};


