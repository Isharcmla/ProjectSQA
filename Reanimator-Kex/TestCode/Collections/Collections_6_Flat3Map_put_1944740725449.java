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

public class Flat3Map_put_1944740725449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81609;
     Object term81701;
     Object term81924;
     Object term81929;

    public Flat3Map_put_1944740725449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81609 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term81609, term81609.getClass(), "delegateMap", null);
        setIntField(term81609, term81609.getClass(), "size", -2);
        setIntField(term81609, term81609.getClass(), "hash1", 0);
        setField(term81609, term81609.getClass(), "key1", term81609);
        term81701 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term81811 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term81701, term81701.getClass(), "delegateMap", null);
        setIntField(term81701, term81701.getClass(), "size", 1);
        setIntField(term81701, term81701.getClass(), "hash1", 0);
        setIntField(term81811, term81811.getClass(), "size", 0);
        setField(term81701, term81701.getClass(), "value1", term81811);
        term81924 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term81925 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term81926 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term81927 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term81928 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term81924, term81924.getClass(), "size", 0);
        setIntField(term81924, term81924.getClass(), "hash1", 0);
        setIntField(term81924, term81924.getClass(), "hash2", 0);
        setIntField(term81924, term81924.getClass(), "hash3", 0);
        setField(term81924, term81924.getClass(), "key1", null);
        setField(term81924, term81924.getClass(), "key2", null);
        setField(term81924, term81924.getClass(), "key3", null);
        setField(term81924, term81924.getClass(), "value1", null);
        setField(term81924, term81924.getClass(), "value2", null);
        setField(term81924, term81924.getClass(), "value3", null);
        setFloatField(term81925, term81925.getClass(), "loadFactor", 0.75F);
        setIntField(term81925, term81925.getClass(), "size", 1);
        setField(term81927, term81927.getClass(), "next", null);
        setIntField(term81928, term81928.getClass(), "size", 1);
        setIntField(term81928, term81928.getClass(), "hash1", 0);
        setIntField(term81928, term81928.getClass(), "hash2", 0);
        setIntField(term81928, term81928.getClass(), "hash3", 0);
        setField(term81928, term81928.getClass(), "key1", null);
        setField(term81928, term81928.getClass(), "key2", null);
        setField(term81928, term81928.getClass(), "key3", null);
        setField(term81928, term81928.getClass(), "value1", null);
        setField(term81928, term81928.getClass(), "value2", null);
        setField(term81928, term81928.getClass(), "value3", null);
        setField(term81928, term81928.getClass(), "delegateMap", null);
        setField(term81927, term81927.getClass(), "key", term81928);
        setField(term81927, term81927.getClass(), "value", null);
        setElement(term81926, 0, term81927);
        setField(term81925, term81925.getClass(), "data", term81926);
        setIntField(term81925, term81925.getClass(), "threshold", 12);
        setIntField(term81925, term81925.getClass(), "modCount", 1);
        setField(term81925, term81925.getClass(), "entrySet", null);
        setField(term81925, term81925.getClass(), "keySet", null);
        setField(term81925, term81925.getClass(), "values", null);
        setField(term81925, term81925.getClass(), "keySet", null);
        setField(term81925, term81925.getClass(), "values", null);
        setField(term81924, term81924.getClass(), "delegateMap", term81925);
        term81929 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term81929, term81929.getClass(), "size", 1);
        setIntField(term81929, term81929.getClass(), "hash1", 0);
        setIntField(term81929, term81929.getClass(), "hash2", 0);
        setIntField(term81929, term81929.getClass(), "hash3", 0);
        setField(term81929, term81929.getClass(), "key1", null);
        setField(term81929, term81929.getClass(), "key2", null);
        setField(term81929, term81929.getClass(), "key3", null);
        setField(term81929, term81929.getClass(), "value1", null);
        setField(term81929, term81929.getClass(), "value2", null);
        setField(term81929, term81929.getClass(), "value3", null);
        setField(term81929, term81929.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term81701;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term81609, args);
        assertTrue(recursiveEquals(term81609, term81924));
        assertTrue(recursiveEquals(term81701, term81929));
        assertTrue(recursiveEquals(retValue, null));
    }

};


