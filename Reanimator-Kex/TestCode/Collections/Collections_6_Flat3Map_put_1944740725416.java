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

public class Flat3Map_put_1944740725416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72904;
     Object term72996;
     Object term73885;
     Object term73892;

    public Flat3Map_put_1944740725416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72904 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term72904, term72904.getClass(), "delegateMap", null);
        setIntField(term72904, term72904.getClass(), "size", 3);
        setIntField(term72904, term72904.getClass(), "hash3", 0);
        setField(term72904, term72904.getClass(), "key3", null);
        setIntField(term72904, term72904.getClass(), "hash2", 0);
        setField(term72904, term72904.getClass(), "key2", null);
        setIntField(term72904, term72904.getClass(), "hash1", -1);
        term72996 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term73106 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term72996, term72996.getClass(), "delegateMap", null);
        setIntField(term72996, term72996.getClass(), "size", 3);
        setIntField(term72996, term72996.getClass(), "hash3", 0);
        setField(term72996, term72996.getClass(), "value3", null);
        setIntField(term72996, term72996.getClass(), "hash2", 0);
        setField(term72996, term72996.getClass(), "value2", null);
        setIntField(term72996, term72996.getClass(), "hash1", 0);
        setIntField(term73106, term73106.getClass(), "size", 0);
        setField(term72996, term72996.getClass(), "value1", term73106);
        term73885 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term73886 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term73887 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term73888 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term73889 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term73890 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term73891 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term73885, term73885.getClass(), "size", 0);
        setIntField(term73885, term73885.getClass(), "hash1", 0);
        setIntField(term73885, term73885.getClass(), "hash2", 0);
        setIntField(term73885, term73885.getClass(), "hash3", 0);
        setField(term73885, term73885.getClass(), "key1", null);
        setField(term73885, term73885.getClass(), "key2", null);
        setField(term73885, term73885.getClass(), "key3", null);
        setField(term73885, term73885.getClass(), "value1", null);
        setField(term73885, term73885.getClass(), "value2", null);
        setField(term73885, term73885.getClass(), "value3", null);
        setFloatField(term73886, term73886.getClass(), "loadFactor", 0.75F);
        setIntField(term73886, term73886.getClass(), "size", 2);
        setField(term73888, term73888.getClass(), "next", null);
        setIntField(term73889, term73889.getClass(), "size", 3);
        setIntField(term73889, term73889.getClass(), "hash1", 0);
        setIntField(term73889, term73889.getClass(), "hash2", 0);
        setIntField(term73889, term73889.getClass(), "hash3", 0);
        setField(term73889, term73889.getClass(), "key1", null);
        setField(term73889, term73889.getClass(), "key2", null);
        setField(term73889, term73889.getClass(), "key3", null);
        setField(term73889, term73889.getClass(), "value1", null);
        setField(term73889, term73889.getClass(), "value2", null);
        setField(term73889, term73889.getClass(), "value3", null);
        setField(term73889, term73889.getClass(), "delegateMap", null);
        setField(term73888, term73888.getClass(), "key", term73889);
        setField(term73888, term73888.getClass(), "value", null);
        setElement(term73887, 0, term73888);
        setField(term73890, term73890.getClass(), "next", null);
        setField(term73890, term73890.getClass(), "key", term73891);
        setField(term73890, term73890.getClass(), "value", null);
        setElement(term73887, 5, term73890);
        setField(term73886, term73886.getClass(), "data", term73887);
        setIntField(term73886, term73886.getClass(), "threshold", 12);
        setIntField(term73886, term73886.getClass(), "modCount", 2);
        setField(term73886, term73886.getClass(), "entrySet", null);
        setField(term73886, term73886.getClass(), "keySet", null);
        setField(term73886, term73886.getClass(), "values", null);
        setField(term73886, term73886.getClass(), "keySet", null);
        setField(term73886, term73886.getClass(), "values", null);
        setField(term73885, term73885.getClass(), "delegateMap", term73886);
        term73892 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term73892, term73892.getClass(), "size", 3);
        setIntField(term73892, term73892.getClass(), "hash1", 0);
        setIntField(term73892, term73892.getClass(), "hash2", 0);
        setIntField(term73892, term73892.getClass(), "hash3", 0);
        setField(term73892, term73892.getClass(), "key1", null);
        setField(term73892, term73892.getClass(), "key2", null);
        setField(term73892, term73892.getClass(), "key3", null);
        setField(term73892, term73892.getClass(), "value1", null);
        setField(term73892, term73892.getClass(), "value2", null);
        setField(term73892, term73892.getClass(), "value3", null);
        setField(term73892, term73892.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term72996;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term72904, args);
        assertTrue(recursiveEquals(term72904, term73885));
        assertTrue(recursiveEquals(term72996, term73892));
        assertTrue(recursiveEquals(retValue, null));
    }

};


