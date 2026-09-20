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

public class Flat3Map_containsValue_2053071372211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36528;
     Object term36579;
     Object term36580;

    public Flat3Map_containsValue_2053071372211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36528 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term36528, term36528.getClass(), "delegateMap", null);
        setIntField(term36528, term36528.getClass(), "size", 3);
        setField(term36528, term36528.getClass(), "value3", term36528);
        term36579 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term36579, term36579.getClass(), "size", 3);
        setIntField(term36579, term36579.getClass(), "hash1", 0);
        setIntField(term36579, term36579.getClass(), "hash2", 0);
        setIntField(term36579, term36579.getClass(), "hash3", 0);
        setField(term36579, term36579.getClass(), "key1", null);
        setField(term36579, term36579.getClass(), "key2", null);
        setField(term36579, term36579.getClass(), "key3", null);
        setField(term36579, term36579.getClass(), "value1", null);
        setField(term36579, term36579.getClass(), "value2", null);
        setField(term36579, term36579.getClass(), "value3", term36579);
        setField(term36579, term36579.getClass(), "delegateMap", null);
        term36580 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term36580, term36580.getClass(), "size", 3);
        setIntField(term36580, term36580.getClass(), "hash1", 0);
        setIntField(term36580, term36580.getClass(), "hash2", 0);
        setIntField(term36580, term36580.getClass(), "hash3", 0);
        setField(term36580, term36580.getClass(), "key1", null);
        setField(term36580, term36580.getClass(), "key2", null);
        setField(term36580, term36580.getClass(), "key3", null);
        setField(term36580, term36580.getClass(), "value1", null);
        setField(term36580, term36580.getClass(), "value2", null);
        setField(term36580, term36580.getClass(), "value3", term36580);
        setField(term36580, term36580.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term36528;
        callMethod(klass, "containsValue", argTypes, term36528, args);
        assertTrue(recursiveEquals(term36528, term36579));
        assertTrue(recursiveEquals(term36528, term36580));
    }

};
