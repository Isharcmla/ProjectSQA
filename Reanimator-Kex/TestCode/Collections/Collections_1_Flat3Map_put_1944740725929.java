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

public class Flat3Map_put_1944740725929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186265;
     Object term187212;
     Object term187214;

    public Flat3Map_put_1944740725929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186265 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term186320 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term186265, term186265.getClass(), "delegateMap", null);
        setIntField(term186265, term186265.getClass(), "size", 2);
        setIntField(term186265, term186265.getClass(), "hash2", 0);
        setIntField(term186320, term186320.getClass(), "size", 0);
        setField(term186265, term186265.getClass(), "value2", term186320);
        setIntField(term186265, term186265.getClass(), "hash1", 0);
        setField(term186265, term186265.getClass(), "value1", null);
        term187212 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term187213 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term187212, term187212.getClass(), "size", 3);
        setIntField(term187212, term187212.getClass(), "hash1", 0);
        setIntField(term187212, term187212.getClass(), "hash2", 0);
        setIntField(term187212, term187212.getClass(), "hash3", 0);
        setField(term187212, term187212.getClass(), "key1", null);
        setField(term187212, term187212.getClass(), "key2", null);
        setField(term187212, term187212.getClass(), "key3", term187212);
        setField(term187212, term187212.getClass(), "value1", null);
        setFloatField(term187213, term187213.getClass(), "loadFactor", 0.0F);
        setIntField(term187213, term187213.getClass(), "size", 0);
        setField(term187213, term187213.getClass(), "data", null);
        setIntField(term187213, term187213.getClass(), "threshold", 0);
        setIntField(term187213, term187213.getClass(), "modCount", 0);
        setField(term187213, term187213.getClass(), "entrySet", null);
        setField(term187213, term187213.getClass(), "keySet", null);
        setField(term187213, term187213.getClass(), "values", null);
        setField(term187213, term187213.getClass(), "keySet", null);
        setField(term187213, term187213.getClass(), "values", null);
        setField(term187212, term187212.getClass(), "value2", term187213);
        setField(term187212, term187212.getClass(), "value3", null);
        setField(term187212, term187212.getClass(), "delegateMap", null);
        term187214 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term187215 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term187214, term187214.getClass(), "size", 3);
        setIntField(term187214, term187214.getClass(), "hash1", 0);
        setIntField(term187214, term187214.getClass(), "hash2", 0);
        setIntField(term187214, term187214.getClass(), "hash3", 0);
        setField(term187214, term187214.getClass(), "key1", null);
        setField(term187214, term187214.getClass(), "key2", null);
        setField(term187214, term187214.getClass(), "key3", term187214);
        setField(term187214, term187214.getClass(), "value1", null);
        setFloatField(term187215, term187215.getClass(), "loadFactor", 0.0F);
        setIntField(term187215, term187215.getClass(), "size", 0);
        setField(term187215, term187215.getClass(), "data", null);
        setIntField(term187215, term187215.getClass(), "threshold", 0);
        setIntField(term187215, term187215.getClass(), "modCount", 0);
        setField(term187215, term187215.getClass(), "entrySet", null);
        setField(term187215, term187215.getClass(), "keySet", null);
        setField(term187215, term187215.getClass(), "values", null);
        setField(term187215, term187215.getClass(), "keySet", null);
        setField(term187215, term187215.getClass(), "values", null);
        setField(term187214, term187214.getClass(), "value2", term187215);
        setField(term187214, term187214.getClass(), "value3", null);
        setField(term187214, term187214.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term186265;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term186265, args);
        assertTrue(recursiveEquals(term186265, term187212));
        assertTrue(recursiveEquals(term186265, term187214));
        assertTrue(recursiveEquals(retValue, null));
    }

};
