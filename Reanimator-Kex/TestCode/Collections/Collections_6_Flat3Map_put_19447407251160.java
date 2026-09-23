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

public class Flat3Map_put_19447407251160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355806;
     Object term355898;
     Object term357092;
     Object term357100;

    public Flat3Map_put_19447407251160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term355806 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term355806, term355806.getClass(), "delegateMap", null);
        setIntField(term355806, term355806.getClass(), "size", 3);
        setIntField(term355806, term355806.getClass(), "hash3", -1);
        setIntField(term355806, term355806.getClass(), "hash2", 0);
        setField(term355806, term355806.getClass(), "key2", null);
        setIntField(term355806, term355806.getClass(), "hash1", 0);
        setField(term355806, term355806.getClass(), "key1", term355806);
        setField(term355806, term355806.getClass(), "key3", null);
        setField(term355806, term355806.getClass(), "value3", null);
        term355898 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term356008 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term355898, term355898.getClass(), "delegateMap", null);
        setIntField(term355898, term355898.getClass(), "size", 3);
        setIntField(term355898, term355898.getClass(), "hash3", 0);
        setField(term355898, term355898.getClass(), "value3", null);
        setIntField(term355898, term355898.getClass(), "hash2", 0);
        setField(term355898, term355898.getClass(), "value2", null);
        setIntField(term355898, term355898.getClass(), "hash1", 0);
        setIntField(term356008, term356008.getClass(), "size", 0);
        setField(term355898, term355898.getClass(), "value1", term356008);
        setField(term355898, term355898.getClass(), "key3", null);
        setField(term355898, term355898.getClass(), "key2", null);
        setField(term355898, term355898.getClass(), "key1", null);
        term357092 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term357093 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term357094 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term357095 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term357096 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term357097 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term357098 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term357099 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term357092, term357092.getClass(), "size", 0);
        setIntField(term357092, term357092.getClass(), "hash1", 0);
        setIntField(term357092, term357092.getClass(), "hash2", 0);
        setIntField(term357092, term357092.getClass(), "hash3", 0);
        setField(term357092, term357092.getClass(), "key1", null);
        setField(term357092, term357092.getClass(), "key2", null);
        setField(term357092, term357092.getClass(), "key3", null);
        setField(term357092, term357092.getClass(), "value1", null);
        setField(term357092, term357092.getClass(), "value2", null);
        setField(term357092, term357092.getClass(), "value3", null);
        setFloatField(term357093, term357093.getClass(), "loadFactor", 0.75F);
        setIntField(term357093, term357093.getClass(), "size", 3);
        setField(term357096, term357096.getClass(), "next", null);
        setField(term357096, term357096.getClass(), "key", term357092);
        setField(term357096, term357096.getClass(), "value", null);
        setField(term357095, term357095.getClass(), "next", term357096);
        setIntField(term357097, term357097.getClass(), "size", 3);
        setIntField(term357097, term357097.getClass(), "hash1", 0);
        setIntField(term357097, term357097.getClass(), "hash2", 0);
        setIntField(term357097, term357097.getClass(), "hash3", 0);
        setField(term357097, term357097.getClass(), "key1", null);
        setField(term357097, term357097.getClass(), "key2", null);
        setField(term357097, term357097.getClass(), "key3", null);
        setField(term357097, term357097.getClass(), "value1", null);
        setField(term357097, term357097.getClass(), "value2", null);
        setField(term357097, term357097.getClass(), "value3", null);
        setField(term357097, term357097.getClass(), "delegateMap", null);
        setField(term357095, term357095.getClass(), "key", term357097);
        setField(term357095, term357095.getClass(), "value", null);
        setElement(term357094, 0, term357095);
        setField(term357098, term357098.getClass(), "next", null);
        setField(term357098, term357098.getClass(), "key", term357099);
        setField(term357098, term357098.getClass(), "value", null);
        setElement(term357094, 6, term357098);
        setField(term357093, term357093.getClass(), "data", term357094);
        setIntField(term357093, term357093.getClass(), "threshold", 12);
        setIntField(term357093, term357093.getClass(), "modCount", 3);
        setField(term357093, term357093.getClass(), "entrySet", null);
        setField(term357093, term357093.getClass(), "keySet", null);
        setField(term357093, term357093.getClass(), "values", null);
        setField(term357093, term357093.getClass(), "keySet", null);
        setField(term357093, term357093.getClass(), "values", null);
        setField(term357092, term357092.getClass(), "delegateMap", term357093);
        term357100 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term357100, term357100.getClass(), "size", 3);
        setIntField(term357100, term357100.getClass(), "hash1", 0);
        setIntField(term357100, term357100.getClass(), "hash2", 0);
        setIntField(term357100, term357100.getClass(), "hash3", 0);
        setField(term357100, term357100.getClass(), "key1", null);
        setField(term357100, term357100.getClass(), "key2", null);
        setField(term357100, term357100.getClass(), "key3", null);
        setField(term357100, term357100.getClass(), "value1", null);
        setField(term357100, term357100.getClass(), "value2", null);
        setField(term357100, term357100.getClass(), "value3", null);
        setField(term357100, term357100.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term355898;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term355806, args);
        assertTrue(recursiveEquals(term355806, term357092));
        assertTrue(recursiveEquals(term355898, term357100));
        assertTrue(recursiveEquals(retValue, null));
    }

};


