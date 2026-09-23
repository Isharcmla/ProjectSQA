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

public class Flat3Map_put_19447407251131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339951;
     Object term340135;
     Object term340970;
     Object term340978;

    public Flat3Map_put_19447407251131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term339951 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term340043 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term339951, term339951.getClass(), "delegateMap", null);
        setIntField(term339951, term339951.getClass(), "size", 3);
        setIntField(term339951, term339951.getClass(), "hash3", -1);
        setIntField(term339951, term339951.getClass(), "hash2", 0);
        setField(term339951, term339951.getClass(), "key2", null);
        setIntField(term339951, term339951.getClass(), "hash1", 0);
        setField(term340043, term340043.getClass(), "delegateMap", null);
        setIntField(term340043, term340043.getClass(), "size", 3);
        setField(term340043, term340043.getClass(), "key3", null);
        setField(term340043, term340043.getClass(), "value3", null);
        setIntField(term340043, term340043.getClass(), "hash3", -1);
        setIntField(term340043, term340043.getClass(), "hash2", 0);
        setField(term339951, term339951.getClass(), "key1", term340043);
        term340135 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term340245 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term340283 = newInstance(Class.forName("java.lang.Object"));
        setField(term340135, term340135.getClass(), "delegateMap", null);
        setIntField(term340135, term340135.getClass(), "size", 3);
        setIntField(term340135, term340135.getClass(), "hash3", 0);
        setField(term340135, term340135.getClass(), "value3", null);
        setIntField(term340135, term340135.getClass(), "hash2", 0);
        setField(term340135, term340135.getClass(), "value2", null);
        setIntField(term340135, term340135.getClass(), "hash1", 0);
        setIntField(term340245, term340245.getClass(), "size", 0);
        setField(term340135, term340135.getClass(), "value1", term340245);
        setField(term340135, term340135.getClass(), "key3", null);
        setField(term340135, term340135.getClass(), "key2", null);
        setField(term340135, term340135.getClass(), "key1", term340283);
        term340970 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term340971 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term340972 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term340973 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term340974 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term340975 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term340976 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term340977 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term340970, term340970.getClass(), "size", 0);
        setIntField(term340970, term340970.getClass(), "hash1", 0);
        setIntField(term340970, term340970.getClass(), "hash2", 0);
        setIntField(term340970, term340970.getClass(), "hash3", 0);
        setField(term340970, term340970.getClass(), "key1", null);
        setField(term340970, term340970.getClass(), "key2", null);
        setField(term340970, term340970.getClass(), "key3", null);
        setField(term340970, term340970.getClass(), "value1", null);
        setField(term340970, term340970.getClass(), "value2", null);
        setField(term340970, term340970.getClass(), "value3", null);
        setFloatField(term340971, term340971.getClass(), "loadFactor", 0.75F);
        setIntField(term340971, term340971.getClass(), "size", 3);
        setField(term340973, term340973.getClass(), "next", null);
        setIntField(term340974, term340974.getClass(), "size", 3);
        setIntField(term340974, term340974.getClass(), "hash1", 0);
        setIntField(term340974, term340974.getClass(), "hash2", 0);
        setIntField(term340974, term340974.getClass(), "hash3", 0);
        setField(term340974, term340974.getClass(), "key1", null);
        setField(term340974, term340974.getClass(), "key2", null);
        setField(term340974, term340974.getClass(), "key3", null);
        setField(term340974, term340974.getClass(), "value1", null);
        setField(term340974, term340974.getClass(), "value2", null);
        setField(term340974, term340974.getClass(), "value3", null);
        setField(term340974, term340974.getClass(), "delegateMap", null);
        setField(term340973, term340973.getClass(), "key", term340974);
        setField(term340973, term340973.getClass(), "value", null);
        setElement(term340972, 0, term340973);
        setField(term340976, term340976.getClass(), "next", null);
        setField(term340976, term340976.getClass(), "key", null);
        setField(term340976, term340976.getClass(), "value", null);
        setField(term340975, term340975.getClass(), "next", term340976);
        setIntField(term340977, term340977.getClass(), "size", 3);
        setIntField(term340977, term340977.getClass(), "hash1", 0);
        setIntField(term340977, term340977.getClass(), "hash2", 0);
        setIntField(term340977, term340977.getClass(), "hash3", -1);
        setField(term340977, term340977.getClass(), "key1", null);
        setField(term340977, term340977.getClass(), "key2", null);
        setField(term340977, term340977.getClass(), "key3", null);
        setField(term340977, term340977.getClass(), "value1", null);
        setField(term340977, term340977.getClass(), "value2", null);
        setField(term340977, term340977.getClass(), "value3", null);
        setField(term340977, term340977.getClass(), "delegateMap", null);
        setField(term340975, term340975.getClass(), "key", term340977);
        setField(term340975, term340975.getClass(), "value", null);
        setElement(term340972, 6, term340975);
        setField(term340971, term340971.getClass(), "data", term340972);
        setIntField(term340971, term340971.getClass(), "threshold", 12);
        setIntField(term340971, term340971.getClass(), "modCount", 3);
        setField(term340971, term340971.getClass(), "entrySet", null);
        setField(term340971, term340971.getClass(), "keySet", null);
        setField(term340971, term340971.getClass(), "values", null);
        setField(term340971, term340971.getClass(), "keySet", null);
        setField(term340971, term340971.getClass(), "values", null);
        setField(term340970, term340970.getClass(), "delegateMap", term340971);
        term340978 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term340978, term340978.getClass(), "size", 3);
        setIntField(term340978, term340978.getClass(), "hash1", 0);
        setIntField(term340978, term340978.getClass(), "hash2", 0);
        setIntField(term340978, term340978.getClass(), "hash3", 0);
        setField(term340978, term340978.getClass(), "key1", null);
        setField(term340978, term340978.getClass(), "key2", null);
        setField(term340978, term340978.getClass(), "key3", null);
        setField(term340978, term340978.getClass(), "value1", null);
        setField(term340978, term340978.getClass(), "value2", null);
        setField(term340978, term340978.getClass(), "value3", null);
        setField(term340978, term340978.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term340135;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term339951, args);
        assertTrue(recursiveEquals(term339951, term340970));
        assertTrue(recursiveEquals(term340135, term340978));
        assertTrue(recursiveEquals(retValue, null));
    }

};


