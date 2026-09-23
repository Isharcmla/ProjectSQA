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

public class Flat3Map_put_1944740725654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145373;
     Object term145557;
     Object term146917;
     Object term146925;

    public Flat3Map_put_1944740725654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145373 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term145465 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term145373, term145373.getClass(), "delegateMap", null);
        setIntField(term145373, term145373.getClass(), "size", 3);
        setIntField(term145373, term145373.getClass(), "hash3", 0);
        setField(term145373, term145373.getClass(), "key3", null);
        setIntField(term145373, term145373.getClass(), "hash2", 0);
        setField(term145465, term145465.getClass(), "delegateMap", null);
        setIntField(term145465, term145465.getClass(), "size", 3);
        setField(term145465, term145465.getClass(), "key3", null);
        setField(term145465, term145465.getClass(), "value3", null);
        setField(term145373, term145373.getClass(), "key2", term145465);
        setIntField(term145373, term145373.getClass(), "hash1", 0);
        setField(term145373, term145373.getClass(), "key1", term145465);
        term145557 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term145651 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term145557, term145557.getClass(), "delegateMap", null);
        setIntField(term145557, term145557.getClass(), "size", 3);
        setIntField(term145557, term145557.getClass(), "hash3", 0);
        setField(term145557, term145557.getClass(), "value3", null);
        setIntField(term145557, term145557.getClass(), "hash2", 0);
        setField(term145557, term145557.getClass(), "value2", null);
        setIntField(term145557, term145557.getClass(), "hash1", 0);
        setIntField(term145651, term145651.getClass(), "size", 0);
        setField(term145557, term145557.getClass(), "value1", term145651);
        setField(term145557, term145557.getClass(), "key3", null);
        setField(term145557, term145557.getClass(), "key2", null);
        setField(term145557, term145557.getClass(), "key1", null);
        term146917 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term146918 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term146919 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term146920 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term146921 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term146922 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term146923 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term146924 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term146917, term146917.getClass(), "size", 0);
        setIntField(term146917, term146917.getClass(), "hash1", 0);
        setIntField(term146917, term146917.getClass(), "hash2", 0);
        setIntField(term146917, term146917.getClass(), "hash3", 0);
        setField(term146917, term146917.getClass(), "key1", null);
        setField(term146917, term146917.getClass(), "key2", null);
        setField(term146917, term146917.getClass(), "key3", null);
        setField(term146917, term146917.getClass(), "value1", null);
        setField(term146917, term146917.getClass(), "value2", null);
        setField(term146917, term146917.getClass(), "value3", null);
        setFloatField(term146918, term146918.getClass(), "loadFactor", 0.75F);
        setIntField(term146918, term146918.getClass(), "size", 3);
        setField(term146921, term146921.getClass(), "next", null);
        setField(term146921, term146921.getClass(), "key", null);
        setField(term146921, term146921.getClass(), "value", null);
        setField(term146920, term146920.getClass(), "next", term146921);
        setIntField(term146922, term146922.getClass(), "size", 3);
        setIntField(term146922, term146922.getClass(), "hash1", 0);
        setIntField(term146922, term146922.getClass(), "hash2", 0);
        setIntField(term146922, term146922.getClass(), "hash3", 0);
        setField(term146922, term146922.getClass(), "key1", null);
        setField(term146922, term146922.getClass(), "key2", null);
        setField(term146922, term146922.getClass(), "key3", null);
        setField(term146922, term146922.getClass(), "value1", null);
        setField(term146922, term146922.getClass(), "value2", null);
        setField(term146922, term146922.getClass(), "value3", null);
        setField(term146922, term146922.getClass(), "delegateMap", null);
        setField(term146920, term146920.getClass(), "key", term146922);
        setField(term146920, term146920.getClass(), "value", null);
        setElement(term146919, 0, term146920);
        setField(term146923, term146923.getClass(), "next", null);
        setField(term146923, term146923.getClass(), "key", term146924);
        setField(term146923, term146923.getClass(), "value", null);
        setElement(term146919, 5, term146923);
        setField(term146918, term146918.getClass(), "data", term146919);
        setIntField(term146918, term146918.getClass(), "threshold", 12);
        setIntField(term146918, term146918.getClass(), "modCount", 3);
        setField(term146918, term146918.getClass(), "entrySet", null);
        setField(term146918, term146918.getClass(), "keySet", null);
        setField(term146918, term146918.getClass(), "values", null);
        setField(term146918, term146918.getClass(), "keySet", null);
        setField(term146918, term146918.getClass(), "values", null);
        setField(term146917, term146917.getClass(), "delegateMap", term146918);
        term146925 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term146925, term146925.getClass(), "size", 3);
        setIntField(term146925, term146925.getClass(), "hash1", 0);
        setIntField(term146925, term146925.getClass(), "hash2", 0);
        setIntField(term146925, term146925.getClass(), "hash3", 0);
        setField(term146925, term146925.getClass(), "key1", null);
        setField(term146925, term146925.getClass(), "key2", null);
        setField(term146925, term146925.getClass(), "key3", null);
        setField(term146925, term146925.getClass(), "value1", null);
        setField(term146925, term146925.getClass(), "value2", null);
        setField(term146925, term146925.getClass(), "value3", null);
        setField(term146925, term146925.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term145557;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term145373, args);
        assertTrue(recursiveEquals(term145373, term146917));
        assertTrue(recursiveEquals(term145557, term146925));
        assertTrue(recursiveEquals(retValue, null));
    }

};


