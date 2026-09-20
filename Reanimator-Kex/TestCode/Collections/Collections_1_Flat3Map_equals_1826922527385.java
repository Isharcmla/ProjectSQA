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

public class Flat3Map_equals_1826922527385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70916;
     Object term71118;
     Object term71304;
     Object term71306;

    public Flat3Map_equals_1826922527385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70916 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term71026 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term70916, term70916.getClass(), "delegateMap", null);
        setIntField(term70916, term70916.getClass(), "size", 1);
        setField(term70916, term70916.getClass(), "key1", null);
        setField(term70916, term70916.getClass(), "value1", term71026);
        term71118 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term71228 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term71118, term71118.getClass(), "delegateMap", null);
        setIntField(term71118, term71118.getClass(), "size", 1);
        setField(term71118, term71118.getClass(), "key1", null);
        setField(term71118, term71118.getClass(), "value1", term71228);
        term71304 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term71305 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term71304, term71304.getClass(), "size", 1);
        setIntField(term71304, term71304.getClass(), "hash1", 0);
        setIntField(term71304, term71304.getClass(), "hash2", 0);
        setIntField(term71304, term71304.getClass(), "hash3", 0);
        setField(term71304, term71304.getClass(), "key1", null);
        setField(term71304, term71304.getClass(), "key2", null);
        setField(term71304, term71304.getClass(), "key3", null);
        setFloatField(term71305, term71305.getClass(), "loadFactor", 0.0F);
        setIntField(term71305, term71305.getClass(), "size", 0);
        setField(term71305, term71305.getClass(), "data", null);
        setIntField(term71305, term71305.getClass(), "threshold", 0);
        setIntField(term71305, term71305.getClass(), "modCount", 0);
        setField(term71305, term71305.getClass(), "entrySet", null);
        setField(term71305, term71305.getClass(), "keySet", null);
        setField(term71305, term71305.getClass(), "values", null);
        setField(term71305, term71305.getClass(), "keySet", null);
        setField(term71305, term71305.getClass(), "values", null);
        setField(term71304, term71304.getClass(), "value1", term71305);
        setField(term71304, term71304.getClass(), "value2", null);
        setField(term71304, term71304.getClass(), "value3", null);
        setField(term71304, term71304.getClass(), "delegateMap", null);
        term71306 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term71307 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term71306, term71306.getClass(), "size", 1);
        setIntField(term71306, term71306.getClass(), "hash1", 0);
        setIntField(term71306, term71306.getClass(), "hash2", 0);
        setIntField(term71306, term71306.getClass(), "hash3", 0);
        setField(term71306, term71306.getClass(), "key1", null);
        setField(term71306, term71306.getClass(), "key2", null);
        setField(term71306, term71306.getClass(), "key3", null);
        setFloatField(term71307, term71307.getClass(), "loadFactor", 0.0F);
        setIntField(term71307, term71307.getClass(), "size", 0);
        setField(term71307, term71307.getClass(), "data", null);
        setIntField(term71307, term71307.getClass(), "threshold", 0);
        setIntField(term71307, term71307.getClass(), "modCount", 0);
        setField(term71307, term71307.getClass(), "entrySet", null);
        setField(term71307, term71307.getClass(), "keySet", null);
        setField(term71307, term71307.getClass(), "values", null);
        setField(term71307, term71307.getClass(), "keySet", null);
        setField(term71307, term71307.getClass(), "values", null);
        setField(term71306, term71306.getClass(), "value1", term71307);
        setField(term71306, term71306.getClass(), "value2", null);
        setField(term71306, term71306.getClass(), "value3", null);
        setField(term71306, term71306.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term71118;
        Object retValue = callMethod(klass, "equals", argTypes, term70916, args);
        assertTrue(recursiveEquals(term70916, term71304));
        assertTrue(recursiveEquals(term71118, term71306));
        assertTrue(recursiveEquals(retValue, true));
    }

};
