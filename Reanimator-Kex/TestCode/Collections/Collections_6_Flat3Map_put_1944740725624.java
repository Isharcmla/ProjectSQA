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

public class Flat3Map_put_1944740725624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133794;
     Object term134384;
     Object term135895;
     Object term135901;

    public Flat3Map_put_1944740725624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133794 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term133886 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term134016 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term134108 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term134200 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term134292 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term133794, term133794.getClass(), "delegateMap", null);
        setIntField(term133794, term133794.getClass(), "size", 3);
        setIntField(term133794, term133794.getClass(), "hash3", 0);
        setField(term133886, term133886.getClass(), "delegateMap", null);
        setIntField(term133886, term133886.getClass(), "size", 0);
        setField(term133794, term133794.getClass(), "key3", term133886);
        setIntField(term133794, term133794.getClass(), "hash2", 0);
        setField(term133794, term133794.getClass(), "key2", term134016);
        setIntField(term133794, term133794.getClass(), "hash1", 0);
        setField(term134108, term134108.getClass(), "delegateMap", null);
        setIntField(term134108, term134108.getClass(), "size", 0);
        setField(term133794, term133794.getClass(), "key1", term134108);
        setField(term133794, term133794.getClass(), "value3", term134200);
        setField(term133794, term133794.getClass(), "value2", term134292);
        setField(term133794, term133794.getClass(), "value1", null);
        term134384 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term134384, term134384.getClass(), "delegateMap", null);
        setIntField(term134384, term134384.getClass(), "size", 3);
        setIntField(term134384, term134384.getClass(), "hash3", 0);
        setField(term134384, term134384.getClass(), "value3", null);
        setIntField(term134384, term134384.getClass(), "hash2", 0);
        setField(term134384, term134384.getClass(), "value2", null);
        setIntField(term134384, term134384.getClass(), "hash1", 0);
        setField(term134384, term134384.getClass(), "value1", null);
        term135895 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term135896 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term135897 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term135898 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term135899 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term135900 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term135895, term135895.getClass(), "size", 0);
        setIntField(term135895, term135895.getClass(), "hash1", 0);
        setIntField(term135895, term135895.getClass(), "hash2", 0);
        setIntField(term135895, term135895.getClass(), "hash3", 0);
        setField(term135895, term135895.getClass(), "key1", null);
        setField(term135895, term135895.getClass(), "key2", null);
        setField(term135895, term135895.getClass(), "key3", null);
        setField(term135895, term135895.getClass(), "value1", null);
        setField(term135895, term135895.getClass(), "value2", null);
        setField(term135895, term135895.getClass(), "value3", null);
        setFloatField(term135896, term135896.getClass(), "loadFactor", 0.75F);
        setIntField(term135896, term135896.getClass(), "size", 3);
        setField(term135899, term135899.getClass(), "next", null);
        setField(term135899, term135899.getClass(), "key", null);
        setField(term135899, term135899.getClass(), "value", null);
        setField(term135898, term135898.getClass(), "next", term135899);
        setIntField(term135900, term135900.getClass(), "size", 3);
        setIntField(term135900, term135900.getClass(), "hash1", 0);
        setIntField(term135900, term135900.getClass(), "hash2", 0);
        setIntField(term135900, term135900.getClass(), "hash3", 0);
        setField(term135900, term135900.getClass(), "key1", null);
        setField(term135900, term135900.getClass(), "key2", null);
        setField(term135900, term135900.getClass(), "key3", null);
        setField(term135900, term135900.getClass(), "value1", null);
        setField(term135900, term135900.getClass(), "value2", null);
        setField(term135900, term135900.getClass(), "value3", null);
        setField(term135900, term135900.getClass(), "delegateMap", null);
        setField(term135898, term135898.getClass(), "key", term135900);
        setField(term135898, term135898.getClass(), "value", null);
        setElement(term135897, 0, term135898);
        setField(term135896, term135896.getClass(), "data", term135897);
        setIntField(term135896, term135896.getClass(), "threshold", 12);
        setIntField(term135896, term135896.getClass(), "modCount", 3);
        setField(term135896, term135896.getClass(), "entrySet", null);
        setField(term135896, term135896.getClass(), "keySet", null);
        setField(term135896, term135896.getClass(), "values", null);
        setField(term135896, term135896.getClass(), "keySet", null);
        setField(term135896, term135896.getClass(), "values", null);
        setField(term135895, term135895.getClass(), "delegateMap", term135896);
        term135901 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term135901, term135901.getClass(), "size", 3);
        setIntField(term135901, term135901.getClass(), "hash1", 0);
        setIntField(term135901, term135901.getClass(), "hash2", 0);
        setIntField(term135901, term135901.getClass(), "hash3", 0);
        setField(term135901, term135901.getClass(), "key1", null);
        setField(term135901, term135901.getClass(), "key2", null);
        setField(term135901, term135901.getClass(), "key3", null);
        setField(term135901, term135901.getClass(), "value1", null);
        setField(term135901, term135901.getClass(), "value2", null);
        setField(term135901, term135901.getClass(), "value3", null);
        setField(term135901, term135901.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term134384;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term133794, args);
        assertTrue(recursiveEquals(term133794, term135895));
        assertTrue(recursiveEquals(term134384, term135901));
        assertTrue(recursiveEquals(retValue, null));
    }

};


