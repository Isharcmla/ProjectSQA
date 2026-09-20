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

public class Flat3Map_put_19447407251161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255909;
     Object term256501;
     Object term257095;
     Object term257104;

    public Flat3Map_put_19447407251161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255909 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term256019 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object[] term254948 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 256);
        Object term256149 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term256279 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term256409 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setElement(term254948, 103, term256149);
        setField(term256279, term256279.getClass(), "next", null);
        setIntField(term256279, term256279.getClass(), "hashCode", 510);
        setElement(term254948, 210, term256279);
        setField(term256409, term256409.getClass(), "next", null);
        setIntField(term256409, term256409.getClass(), "hashCode", 510);
        setElement(term254948, 215, term256409);
        setField(term256019, term256019.getClass(), "data", term254948);
        setIntField(term256019, term256019.getClass(), "modCount", 0);
        setIntField(term256019, term256019.getClass(), "size", 0);
        setIntField(term256019, term256019.getClass(), "threshold", 1);
        setField(term255909, term255909.getClass(), "delegateMap", term256019);
        term256501 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term257095 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term257096 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object[] term257097 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 512);
        Object term257098 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term257099 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term257100 = newInstance(Class.forName("java.lang.Object"));
        Object term257101 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term257102 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term257103 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term257095, term257095.getClass(), "size", 0);
        setIntField(term257095, term257095.getClass(), "hash1", 0);
        setIntField(term257095, term257095.getClass(), "hash2", 0);
        setIntField(term257095, term257095.getClass(), "hash3", 0);
        setField(term257095, term257095.getClass(), "key1", null);
        setField(term257095, term257095.getClass(), "key2", null);
        setField(term257095, term257095.getClass(), "key3", null);
        setField(term257095, term257095.getClass(), "value1", null);
        setField(term257095, term257095.getClass(), "value2", null);
        setField(term257095, term257095.getClass(), "value3", null);
        setFloatField(term257096, term257096.getClass(), "loadFactor", 0.0F);
        setIntField(term257096, term257096.getClass(), "size", 1);
        setField(term257098, term257098.getClass(), "next", null);
        setField(term257098, term257098.getClass(), "key", null);
        setField(term257098, term257098.getClass(), "value", null);
        setElement(term257097, 0, term257098);
        setField(term257099, term257099.getClass(), "next", null);
        setField(term257099, term257099.getClass(), "key", term257100);
        setIntField(term257101, term257101.getClass(), "size", 0);
        setIntField(term257101, term257101.getClass(), "hash1", 0);
        setIntField(term257101, term257101.getClass(), "hash2", 0);
        setIntField(term257101, term257101.getClass(), "hash3", 0);
        setField(term257101, term257101.getClass(), "key1", null);
        setField(term257101, term257101.getClass(), "key2", null);
        setField(term257101, term257101.getClass(), "key3", null);
        setField(term257101, term257101.getClass(), "value1", null);
        setField(term257101, term257101.getClass(), "value2", null);
        setField(term257101, term257101.getClass(), "value3", null);
        setField(term257101, term257101.getClass(), "delegateMap", null);
        setField(term257099, term257099.getClass(), "value", term257101);
        setElement(term257097, 464, term257099);
        setField(term257103, term257103.getClass(), "next", null);
        setField(term257103, term257103.getClass(), "key", null);
        setField(term257103, term257103.getClass(), "value", null);
        setField(term257102, term257102.getClass(), "next", term257103);
        setField(term257102, term257102.getClass(), "key", null);
        setField(term257102, term257102.getClass(), "value", null);
        setElement(term257097, 510, term257102);
        setField(term257096, term257096.getClass(), "data", term257097);
        setIntField(term257096, term257096.getClass(), "threshold", 0);
        setIntField(term257096, term257096.getClass(), "modCount", 2);
        setField(term257096, term257096.getClass(), "entrySet", null);
        setField(term257096, term257096.getClass(), "keySet", null);
        setField(term257096, term257096.getClass(), "values", null);
        setField(term257096, term257096.getClass(), "keySet", null);
        setField(term257096, term257096.getClass(), "values", null);
        setField(term257095, term257095.getClass(), "delegateMap", term257096);
        term257104 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term257104, term257104.getClass(), "size", 0);
        setIntField(term257104, term257104.getClass(), "hash1", 0);
        setIntField(term257104, term257104.getClass(), "hash2", 0);
        setIntField(term257104, term257104.getClass(), "hash3", 0);
        setField(term257104, term257104.getClass(), "key1", null);
        setField(term257104, term257104.getClass(), "key2", null);
        setField(term257104, term257104.getClass(), "key3", null);
        setField(term257104, term257104.getClass(), "value1", null);
        setField(term257104, term257104.getClass(), "value2", null);
        setField(term257104, term257104.getClass(), "value3", null);
        setField(term257104, term257104.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term256501;
        Object retValue = callMethod(klass, "put", argTypes, term255909, args);
        assertTrue(recursiveEquals(term255909, term257095));
        assertTrue(recursiveEquals(term256501, term257104));
        assertTrue(recursiveEquals(retValue, null));
    }

};
