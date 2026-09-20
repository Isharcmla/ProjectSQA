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

public class Flat3Map_put_1944740725880 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177290;
     Object term177382;
     Object term177896;
     Object term177899;

    public Flat3Map_put_1944740725880() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177290 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term177290, term177290.getClass(), "delegateMap", null);
        setIntField(term177290, term177290.getClass(), "size", 1);
        setIntField(term177290, term177290.getClass(), "hash1", 0);
        setField(term177290, term177290.getClass(), "key1", term177290);
        term177382 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term177492 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term177382, term177382.getClass(), "delegateMap", null);
        setIntField(term177382, term177382.getClass(), "size", 1);
        setIntField(term177382, term177382.getClass(), "hash1", 0);
        setIntField(term177492, term177492.getClass(), "size", 0);
        setField(term177382, term177382.getClass(), "value1", term177492);
        term177896 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term177897 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term177898 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term177896, term177896.getClass(), "size", 2);
        setIntField(term177896, term177896.getClass(), "hash1", 0);
        setIntField(term177896, term177896.getClass(), "hash2", 0);
        setIntField(term177896, term177896.getClass(), "hash3", 0);
        setField(term177896, term177896.getClass(), "key1", term177896);
        setIntField(term177897, term177897.getClass(), "size", 1);
        setIntField(term177897, term177897.getClass(), "hash1", 0);
        setIntField(term177897, term177897.getClass(), "hash2", 0);
        setIntField(term177897, term177897.getClass(), "hash3", 0);
        setField(term177897, term177897.getClass(), "key1", null);
        setField(term177897, term177897.getClass(), "key2", null);
        setField(term177897, term177897.getClass(), "key3", null);
        setFloatField(term177898, term177898.getClass(), "loadFactor", 0.0F);
        setIntField(term177898, term177898.getClass(), "size", 0);
        setField(term177898, term177898.getClass(), "data", null);
        setIntField(term177898, term177898.getClass(), "threshold", 0);
        setIntField(term177898, term177898.getClass(), "modCount", 0);
        setField(term177898, term177898.getClass(), "entrySet", null);
        setField(term177898, term177898.getClass(), "keySet", null);
        setField(term177898, term177898.getClass(), "values", null);
        setField(term177898, term177898.getClass(), "keySet", null);
        setField(term177898, term177898.getClass(), "values", null);
        setField(term177897, term177897.getClass(), "value1", term177898);
        setField(term177897, term177897.getClass(), "value2", null);
        setField(term177897, term177897.getClass(), "value3", null);
        setField(term177897, term177897.getClass(), "delegateMap", null);
        setField(term177896, term177896.getClass(), "key2", term177897);
        setField(term177896, term177896.getClass(), "key3", null);
        setField(term177896, term177896.getClass(), "value1", null);
        setField(term177896, term177896.getClass(), "value2", null);
        setField(term177896, term177896.getClass(), "value3", null);
        setField(term177896, term177896.getClass(), "delegateMap", null);
        term177899 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term177900 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term177899, term177899.getClass(), "size", 1);
        setIntField(term177899, term177899.getClass(), "hash1", 0);
        setIntField(term177899, term177899.getClass(), "hash2", 0);
        setIntField(term177899, term177899.getClass(), "hash3", 0);
        setField(term177899, term177899.getClass(), "key1", null);
        setField(term177899, term177899.getClass(), "key2", null);
        setField(term177899, term177899.getClass(), "key3", null);
        setFloatField(term177900, term177900.getClass(), "loadFactor", 0.0F);
        setIntField(term177900, term177900.getClass(), "size", 0);
        setField(term177900, term177900.getClass(), "data", null);
        setIntField(term177900, term177900.getClass(), "threshold", 0);
        setIntField(term177900, term177900.getClass(), "modCount", 0);
        setField(term177900, term177900.getClass(), "entrySet", null);
        setField(term177900, term177900.getClass(), "keySet", null);
        setField(term177900, term177900.getClass(), "values", null);
        setField(term177900, term177900.getClass(), "keySet", null);
        setField(term177900, term177900.getClass(), "values", null);
        setField(term177899, term177899.getClass(), "value1", term177900);
        setField(term177899, term177899.getClass(), "value2", null);
        setField(term177899, term177899.getClass(), "value3", null);
        setField(term177899, term177899.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term177382;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term177290, args);
        assertTrue(recursiveEquals(term177290, term177896));
        assertTrue(recursiveEquals(term177382, term177899));
        assertTrue(recursiveEquals(retValue, null));
    }

};
