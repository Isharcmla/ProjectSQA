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

public class Flat3Map_containsKey_76092510414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76275;
     Object term76573;
     Object term76574;

    public Flat3Map_containsKey_76092510414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76275 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term76275, term76275.getClass(), "delegateMap", null);
        setIntField(term76275, term76275.getClass(), "size", 2);
        term76573 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term76573, term76573.getClass(), "size", 2);
        setIntField(term76573, term76573.getClass(), "hash1", 0);
        setIntField(term76573, term76573.getClass(), "hash2", 0);
        setIntField(term76573, term76573.getClass(), "hash3", 0);
        setField(term76573, term76573.getClass(), "key1", null);
        setField(term76573, term76573.getClass(), "key2", null);
        setField(term76573, term76573.getClass(), "key3", null);
        setField(term76573, term76573.getClass(), "value1", null);
        setField(term76573, term76573.getClass(), "value2", null);
        setField(term76573, term76573.getClass(), "value3", null);
        setField(term76573, term76573.getClass(), "delegateMap", null);
        term76574 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term76574, term76574.getClass(), "size", 2);
        setIntField(term76574, term76574.getClass(), "hash1", 0);
        setIntField(term76574, term76574.getClass(), "hash2", 0);
        setIntField(term76574, term76574.getClass(), "hash3", 0);
        setField(term76574, term76574.getClass(), "key1", null);
        setField(term76574, term76574.getClass(), "key2", null);
        setField(term76574, term76574.getClass(), "key3", null);
        setField(term76574, term76574.getClass(), "value1", null);
        setField(term76574, term76574.getClass(), "value2", null);
        setField(term76574, term76574.getClass(), "value3", null);
        setField(term76574, term76574.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term76275;
        callMethod(klass, "containsKey", argTypes, term76275, args);
        assertTrue(recursiveEquals(term76275, term76573));
        assertTrue(recursiveEquals(term76275, term76574));
    }

};
