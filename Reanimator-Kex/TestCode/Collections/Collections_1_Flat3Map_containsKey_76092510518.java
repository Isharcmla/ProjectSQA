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

public class Flat3Map_containsKey_76092510518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98031;
     Object term98357;
     Object term98358;

    public Flat3Map_containsKey_76092510518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98031 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term98031, term98031.getClass(), "delegateMap", null);
        setIntField(term98031, term98031.getClass(), "size", 1);
        term98357 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term98357, term98357.getClass(), "size", 1);
        setIntField(term98357, term98357.getClass(), "hash1", 0);
        setIntField(term98357, term98357.getClass(), "hash2", 0);
        setIntField(term98357, term98357.getClass(), "hash3", 0);
        setField(term98357, term98357.getClass(), "key1", null);
        setField(term98357, term98357.getClass(), "key2", null);
        setField(term98357, term98357.getClass(), "key3", null);
        setField(term98357, term98357.getClass(), "value1", null);
        setField(term98357, term98357.getClass(), "value2", null);
        setField(term98357, term98357.getClass(), "value3", null);
        setField(term98357, term98357.getClass(), "delegateMap", null);
        term98358 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term98358, term98358.getClass(), "size", 1);
        setIntField(term98358, term98358.getClass(), "hash1", 0);
        setIntField(term98358, term98358.getClass(), "hash2", 0);
        setIntField(term98358, term98358.getClass(), "hash3", 0);
        setField(term98358, term98358.getClass(), "key1", null);
        setField(term98358, term98358.getClass(), "key2", null);
        setField(term98358, term98358.getClass(), "key3", null);
        setField(term98358, term98358.getClass(), "value1", null);
        setField(term98358, term98358.getClass(), "value2", null);
        setField(term98358, term98358.getClass(), "value3", null);
        setField(term98358, term98358.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term98031;
        callMethod(klass, "containsKey", argTypes, term98031, args);
        assertTrue(recursiveEquals(term98031, term98357));
        assertTrue(recursiveEquals(term98031, term98358));
    }

};
