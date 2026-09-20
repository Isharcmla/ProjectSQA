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

public class Flat3Map_put_1944740725952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190299;
     Object term190898;
     Object term190900;

    public Flat3Map_put_1944740725952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term190299 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term190354 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term190299, term190299.getClass(), "delegateMap", null);
        setIntField(term190299, term190299.getClass(), "size", 2);
        setIntField(term190299, term190299.getClass(), "hash2", 0);
        setField(term190299, term190299.getClass(), "value2", null);
        setIntField(term190299, term190299.getClass(), "hash1", 0);
        setIntField(term190354, term190354.getClass(), "size", 0);
        setField(term190299, term190299.getClass(), "value1", term190354);
        term190898 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term190899 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term190898, term190898.getClass(), "size", 3);
        setIntField(term190898, term190898.getClass(), "hash1", 0);
        setIntField(term190898, term190898.getClass(), "hash2", 0);
        setIntField(term190898, term190898.getClass(), "hash3", 0);
        setField(term190898, term190898.getClass(), "key1", null);
        setField(term190898, term190898.getClass(), "key2", null);
        setField(term190898, term190898.getClass(), "key3", term190898);
        setFloatField(term190899, term190899.getClass(), "loadFactor", 0.0F);
        setIntField(term190899, term190899.getClass(), "size", 0);
        setField(term190899, term190899.getClass(), "data", null);
        setIntField(term190899, term190899.getClass(), "threshold", 0);
        setIntField(term190899, term190899.getClass(), "modCount", 0);
        setField(term190899, term190899.getClass(), "entrySet", null);
        setField(term190899, term190899.getClass(), "keySet", null);
        setField(term190899, term190899.getClass(), "values", null);
        setField(term190899, term190899.getClass(), "keySet", null);
        setField(term190899, term190899.getClass(), "values", null);
        setField(term190898, term190898.getClass(), "value1", term190899);
        setField(term190898, term190898.getClass(), "value2", null);
        setField(term190898, term190898.getClass(), "value3", null);
        setField(term190898, term190898.getClass(), "delegateMap", null);
        term190900 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term190901 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term190900, term190900.getClass(), "size", 3);
        setIntField(term190900, term190900.getClass(), "hash1", 0);
        setIntField(term190900, term190900.getClass(), "hash2", 0);
        setIntField(term190900, term190900.getClass(), "hash3", 0);
        setField(term190900, term190900.getClass(), "key1", null);
        setField(term190900, term190900.getClass(), "key2", null);
        setField(term190900, term190900.getClass(), "key3", term190900);
        setFloatField(term190901, term190901.getClass(), "loadFactor", 0.0F);
        setIntField(term190901, term190901.getClass(), "size", 0);
        setField(term190901, term190901.getClass(), "data", null);
        setIntField(term190901, term190901.getClass(), "threshold", 0);
        setIntField(term190901, term190901.getClass(), "modCount", 0);
        setField(term190901, term190901.getClass(), "entrySet", null);
        setField(term190901, term190901.getClass(), "keySet", null);
        setField(term190901, term190901.getClass(), "values", null);
        setField(term190901, term190901.getClass(), "keySet", null);
        setField(term190901, term190901.getClass(), "values", null);
        setField(term190900, term190900.getClass(), "value1", term190901);
        setField(term190900, term190900.getClass(), "value2", null);
        setField(term190900, term190900.getClass(), "value3", null);
        setField(term190900, term190900.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term190299;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term190299, args);
        assertTrue(recursiveEquals(term190299, term190898));
        assertTrue(recursiveEquals(term190299, term190900));
        assertTrue(recursiveEquals(retValue, null));
    }

};
