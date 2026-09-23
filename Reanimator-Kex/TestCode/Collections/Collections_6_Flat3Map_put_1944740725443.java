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

public class Flat3Map_put_1944740725443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80312;
     Object term80491;
     Object term80493;

    public Flat3Map_put_1944740725443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80312 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term80367 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term80312, term80312.getClass(), "delegateMap", null);
        setIntField(term80312, term80312.getClass(), "size", 2);
        setIntField(term80312, term80312.getClass(), "hash2", 0);
        setField(term80312, term80312.getClass(), "value2", null);
        setIntField(term80312, term80312.getClass(), "hash1", 0);
        setField(term80312, term80312.getClass(), "value1", term80367);
        term80491 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term80492 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term80491, term80491.getClass(), "size", 3);
        setIntField(term80491, term80491.getClass(), "hash1", 0);
        setIntField(term80491, term80491.getClass(), "hash2", 0);
        setIntField(term80491, term80491.getClass(), "hash3", 0);
        setField(term80491, term80491.getClass(), "key1", null);
        setField(term80491, term80491.getClass(), "key2", null);
        setField(term80491, term80491.getClass(), "key3", term80491);
        setFloatField(term80492, term80492.getClass(), "loadFactor", 0.0F);
        setIntField(term80492, term80492.getClass(), "size", 0);
        setField(term80492, term80492.getClass(), "data", null);
        setIntField(term80492, term80492.getClass(), "threshold", 0);
        setIntField(term80492, term80492.getClass(), "modCount", 0);
        setField(term80492, term80492.getClass(), "entrySet", null);
        setField(term80492, term80492.getClass(), "keySet", null);
        setField(term80492, term80492.getClass(), "values", null);
        setField(term80492, term80492.getClass(), "keySet", null);
        setField(term80492, term80492.getClass(), "values", null);
        setField(term80491, term80491.getClass(), "value1", term80492);
        setField(term80491, term80491.getClass(), "value2", null);
        setField(term80491, term80491.getClass(), "value3", null);
        setField(term80491, term80491.getClass(), "delegateMap", null);
        term80493 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term80494 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term80493, term80493.getClass(), "size", 3);
        setIntField(term80493, term80493.getClass(), "hash1", 0);
        setIntField(term80493, term80493.getClass(), "hash2", 0);
        setIntField(term80493, term80493.getClass(), "hash3", 0);
        setField(term80493, term80493.getClass(), "key1", null);
        setField(term80493, term80493.getClass(), "key2", null);
        setField(term80493, term80493.getClass(), "key3", term80493);
        setFloatField(term80494, term80494.getClass(), "loadFactor", 0.0F);
        setIntField(term80494, term80494.getClass(), "size", 0);
        setField(term80494, term80494.getClass(), "data", null);
        setIntField(term80494, term80494.getClass(), "threshold", 0);
        setIntField(term80494, term80494.getClass(), "modCount", 0);
        setField(term80494, term80494.getClass(), "entrySet", null);
        setField(term80494, term80494.getClass(), "keySet", null);
        setField(term80494, term80494.getClass(), "values", null);
        setField(term80494, term80494.getClass(), "keySet", null);
        setField(term80494, term80494.getClass(), "values", null);
        setField(term80493, term80493.getClass(), "value1", term80494);
        setField(term80493, term80493.getClass(), "value2", null);
        setField(term80493, term80493.getClass(), "value3", null);
        setField(term80493, term80493.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term80312;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term80312, args);
        assertTrue(recursiveEquals(term80312, term80491));
        assertTrue(recursiveEquals(term80312, term80493));
        assertTrue(recursiveEquals(retValue, null));
    }

};


