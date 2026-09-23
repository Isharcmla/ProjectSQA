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

public class Flat3Map_equals_1826922527525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100556;
     Object term100696;
     Object term101178;
     Object term101181;

    public Flat3Map_equals_1826922527525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term100604 = new HashMap();
        term100556 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term100556, term100556.getClass(), "delegateMap", null);
        setIntField(term100556, term100556.getClass(), "size", 3);
        setField(term100556, term100556.getClass(), "key3", null);
        setField(term100556, term100556.getClass(), "value3", null);
        setField(term100556, term100556.getClass(), "key2", term100604);
        HashMap term100744 = new HashMap();
        term100696 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term100696, term100696.getClass(), "delegateMap", null);
        setIntField(term100696, term100696.getClass(), "size", 3);
        setField(term100696, term100696.getClass(), "key3", term100744);
        setField(term100696, term100696.getClass(), "key2", null);
        setField(term100696, term100696.getClass(), "value2", null);
        HashMap term101179 = new HashMap();
        term101178 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term101178, term101178.getClass(), "size", 3);
        setIntField(term101178, term101178.getClass(), "hash1", 0);
        setIntField(term101178, term101178.getClass(), "hash2", 0);
        setIntField(term101178, term101178.getClass(), "hash3", 0);
        setField(term101178, term101178.getClass(), "key1", null);
        setField(term101178, term101178.getClass(), "key2", term101179);
        setField(term101178, term101178.getClass(), "key3", null);
        setField(term101178, term101178.getClass(), "value1", null);
        setField(term101178, term101178.getClass(), "value2", null);
        setField(term101178, term101178.getClass(), "value3", null);
        setField(term101178, term101178.getClass(), "delegateMap", null);
        HashMap term101182 = new HashMap();
        term101181 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term101181, term101181.getClass(), "size", 3);
        setIntField(term101181, term101181.getClass(), "hash1", 0);
        setIntField(term101181, term101181.getClass(), "hash2", 0);
        setIntField(term101181, term101181.getClass(), "hash3", 0);
        setField(term101181, term101181.getClass(), "key1", null);
        setField(term101181, term101181.getClass(), "key2", null);
        setField(term101181, term101181.getClass(), "key3", term101182);
        setField(term101181, term101181.getClass(), "value1", null);
        setField(term101181, term101181.getClass(), "value2", null);
        setField(term101181, term101181.getClass(), "value3", null);
        setField(term101181, term101181.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term100696;
        Object retValue = callMethod(klass, "equals", argTypes, term100556, args);
        assertTrue(recursiveEquals(term100556, term101178));
        assertTrue(recursiveEquals(term100696, term101181));
        assertTrue(recursiveEquals(retValue, true));
    }

};


