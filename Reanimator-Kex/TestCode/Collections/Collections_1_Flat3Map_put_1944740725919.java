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

public class Flat3Map_put_1944740725919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184986;
     Object term185100;
     Object term185101;
     Object term185095;

    public Flat3Map_put_1944740725919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184986 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term185041 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term184986, term184986.getClass(), "delegateMap", null);
        setIntField(term184986, term184986.getClass(), "size", 2);
        setIntField(term184986, term184986.getClass(), "hash2", 0);
        setIntField(term185041, term185041.getClass(), "size", 0);
        setField(term184986, term184986.getClass(), "value2", term185041);
        setIntField(term184986, term184986.getClass(), "hash1", 0);
        setField(term184986, term184986.getClass(), "value1", null);
        setField(term184986, term184986.getClass(), "key2", term184986);
        term185100 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term185100, term185100.getClass(), "size", 2);
        setIntField(term185100, term185100.getClass(), "hash1", 0);
        setIntField(term185100, term185100.getClass(), "hash2", 0);
        setIntField(term185100, term185100.getClass(), "hash3", 0);
        setField(term185100, term185100.getClass(), "key1", null);
        setField(term185100, term185100.getClass(), "key2", term185100);
        setField(term185100, term185100.getClass(), "key3", null);
        setField(term185100, term185100.getClass(), "value1", null);
        setField(term185100, term185100.getClass(), "value2", null);
        setField(term185100, term185100.getClass(), "value3", null);
        setField(term185100, term185100.getClass(), "delegateMap", null);
        term185101 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term185101, term185101.getClass(), "size", 2);
        setIntField(term185101, term185101.getClass(), "hash1", 0);
        setIntField(term185101, term185101.getClass(), "hash2", 0);
        setIntField(term185101, term185101.getClass(), "hash3", 0);
        setField(term185101, term185101.getClass(), "key1", null);
        setField(term185101, term185101.getClass(), "key2", term185101);
        setField(term185101, term185101.getClass(), "key3", null);
        setField(term185101, term185101.getClass(), "value1", null);
        setField(term185101, term185101.getClass(), "value2", null);
        setField(term185101, term185101.getClass(), "value3", null);
        setField(term185101, term185101.getClass(), "delegateMap", null);
        term185095 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setFloatField(term185095, term185095.getClass(), "loadFactor", 0.0F);
        setIntField(term185095, term185095.getClass(), "size", 0);
        setField(term185095, term185095.getClass(), "data", null);
        setIntField(term185095, term185095.getClass(), "threshold", 0);
        setIntField(term185095, term185095.getClass(), "modCount", 0);
        setField(term185095, term185095.getClass(), "entrySet", null);
        setField(term185095, term185095.getClass(), "keySet", null);
        setField(term185095, term185095.getClass(), "values", null);
        setField(term185095, term185095.getClass(), "keySet", null);
        setField(term185095, term185095.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term184986;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term184986, args);
        assertTrue(recursiveEquals(term184986, term185100));
        assertTrue(recursiveEquals(term184986, term185101));
        assertTrue(recursiveEquals(retValue, term185095));
    }

};
