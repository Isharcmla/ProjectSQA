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

public class Flat3Map_put_1944740725549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108843;
     Object term109067;
     Object term109069;

    public Flat3Map_put_1944740725549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108843 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term108898 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term108843, term108843.getClass(), "delegateMap", null);
        setIntField(term108843, term108843.getClass(), "size", 2);
        setIntField(term108843, term108843.getClass(), "hash2", 0);
        setField(term108843, term108843.getClass(), "value2", null);
        setIntField(term108843, term108843.getClass(), "hash1", -1);
        setIntField(term108898, term108898.getClass(), "size", 0);
        setField(term108843, term108843.getClass(), "value1", term108898);
        setField(term108843, term108843.getClass(), "key2", null);
        term109067 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term109068 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term109067, term109067.getClass(), "size", 3);
        setIntField(term109067, term109067.getClass(), "hash1", -1);
        setIntField(term109067, term109067.getClass(), "hash2", 0);
        setIntField(term109067, term109067.getClass(), "hash3", -1);
        setField(term109067, term109067.getClass(), "key1", null);
        setField(term109067, term109067.getClass(), "key2", null);
        setField(term109067, term109067.getClass(), "key3", term109067);
        setFloatField(term109068, term109068.getClass(), "loadFactor", 0.0F);
        setIntField(term109068, term109068.getClass(), "size", 0);
        setField(term109068, term109068.getClass(), "data", null);
        setIntField(term109068, term109068.getClass(), "threshold", 0);
        setIntField(term109068, term109068.getClass(), "modCount", 0);
        setField(term109068, term109068.getClass(), "entrySet", null);
        setField(term109068, term109068.getClass(), "keySet", null);
        setField(term109068, term109068.getClass(), "values", null);
        setField(term109068, term109068.getClass(), "keySet", null);
        setField(term109068, term109068.getClass(), "values", null);
        setField(term109067, term109067.getClass(), "value1", term109068);
        setField(term109067, term109067.getClass(), "value2", null);
        setField(term109067, term109067.getClass(), "value3", null);
        setField(term109067, term109067.getClass(), "delegateMap", null);
        term109069 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term109070 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term109069, term109069.getClass(), "size", 3);
        setIntField(term109069, term109069.getClass(), "hash1", -1);
        setIntField(term109069, term109069.getClass(), "hash2", 0);
        setIntField(term109069, term109069.getClass(), "hash3", -1);
        setField(term109069, term109069.getClass(), "key1", null);
        setField(term109069, term109069.getClass(), "key2", null);
        setField(term109069, term109069.getClass(), "key3", term109069);
        setFloatField(term109070, term109070.getClass(), "loadFactor", 0.0F);
        setIntField(term109070, term109070.getClass(), "size", 0);
        setField(term109070, term109070.getClass(), "data", null);
        setIntField(term109070, term109070.getClass(), "threshold", 0);
        setIntField(term109070, term109070.getClass(), "modCount", 0);
        setField(term109070, term109070.getClass(), "entrySet", null);
        setField(term109070, term109070.getClass(), "keySet", null);
        setField(term109070, term109070.getClass(), "values", null);
        setField(term109070, term109070.getClass(), "keySet", null);
        setField(term109070, term109070.getClass(), "values", null);
        setField(term109069, term109069.getClass(), "value1", term109070);
        setField(term109069, term109069.getClass(), "value2", null);
        setField(term109069, term109069.getClass(), "value3", null);
        setField(term109069, term109069.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term108843;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term108843, args);
        assertTrue(recursiveEquals(term108843, term109067));
        assertTrue(recursiveEquals(term108843, term109069));
        assertTrue(recursiveEquals(retValue, null));
    }

};


