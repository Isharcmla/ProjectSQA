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

public class Flat3Map_put_1944740725914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184094;
     Object term184232;
     Object term184499;
     Object term184504;

    public Flat3Map_put_1944740725914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184094 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term184232 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term184094, term184094.getClass(), "delegateMap", null);
        setIntField(term184094, term184094.getClass(), "size", -3);
        setIntField(term184094, term184094.getClass(), "hash2", 0);
        setField(term184094, term184094.getClass(), "key2", term184094);
        setIntField(term184094, term184094.getClass(), "hash1", 0);
        setField(term184232, term184232.getClass(), "delegateMap", null);
        setIntField(term184232, term184232.getClass(), "size", 2);
        setIntField(term184232, term184232.getClass(), "hash2", 0);
        setField(term184232, term184232.getClass(), "value2", null);
        setIntField(term184232, term184232.getClass(), "hash1", 0);
        setField(term184232, term184232.getClass(), "value1", null);
        setField(term184094, term184094.getClass(), "key1", term184232);
        term184499 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term184500 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term184501 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term184502 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term184503 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term184499, term184499.getClass(), "size", 0);
        setIntField(term184499, term184499.getClass(), "hash1", 0);
        setIntField(term184499, term184499.getClass(), "hash2", 0);
        setIntField(term184499, term184499.getClass(), "hash3", 0);
        setField(term184499, term184499.getClass(), "key1", null);
        setField(term184499, term184499.getClass(), "key2", null);
        setField(term184499, term184499.getClass(), "key3", null);
        setField(term184499, term184499.getClass(), "value1", null);
        setField(term184499, term184499.getClass(), "value2", null);
        setField(term184499, term184499.getClass(), "value3", null);
        setFloatField(term184500, term184500.getClass(), "loadFactor", 0.75F);
        setIntField(term184500, term184500.getClass(), "size", 1);
        setField(term184502, term184502.getClass(), "next", null);
        setIntField(term184503, term184503.getClass(), "size", 2);
        setIntField(term184503, term184503.getClass(), "hash1", 0);
        setIntField(term184503, term184503.getClass(), "hash2", 0);
        setIntField(term184503, term184503.getClass(), "hash3", 0);
        setField(term184503, term184503.getClass(), "key1", null);
        setField(term184503, term184503.getClass(), "key2", null);
        setField(term184503, term184503.getClass(), "key3", null);
        setField(term184503, term184503.getClass(), "value1", null);
        setField(term184503, term184503.getClass(), "value2", null);
        setField(term184503, term184503.getClass(), "value3", null);
        setField(term184503, term184503.getClass(), "delegateMap", null);
        setField(term184502, term184502.getClass(), "key", term184503);
        setField(term184502, term184502.getClass(), "value", null);
        setElement(term184501, 0, term184502);
        setField(term184500, term184500.getClass(), "data", term184501);
        setIntField(term184500, term184500.getClass(), "threshold", 12);
        setIntField(term184500, term184500.getClass(), "modCount", 1);
        setField(term184500, term184500.getClass(), "entrySet", null);
        setField(term184500, term184500.getClass(), "keySet", null);
        setField(term184500, term184500.getClass(), "values", null);
        setField(term184500, term184500.getClass(), "keySet", null);
        setField(term184500, term184500.getClass(), "values", null);
        setField(term184499, term184499.getClass(), "delegateMap", term184500);
        term184504 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term184504, term184504.getClass(), "size", 2);
        setIntField(term184504, term184504.getClass(), "hash1", 0);
        setIntField(term184504, term184504.getClass(), "hash2", 0);
        setIntField(term184504, term184504.getClass(), "hash3", 0);
        setField(term184504, term184504.getClass(), "key1", null);
        setField(term184504, term184504.getClass(), "key2", null);
        setField(term184504, term184504.getClass(), "key3", null);
        setField(term184504, term184504.getClass(), "value1", null);
        setField(term184504, term184504.getClass(), "value2", null);
        setField(term184504, term184504.getClass(), "value3", null);
        setField(term184504, term184504.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term184232;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term184094, args);
        assertTrue(recursiveEquals(term184094, term184499));
        assertTrue(recursiveEquals(term184232, term184504));
        assertTrue(recursiveEquals(retValue, null));
    }

};
