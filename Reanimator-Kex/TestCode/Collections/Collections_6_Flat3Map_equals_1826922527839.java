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

public class Flat3Map_equals_1826922527839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217993;
     Object term218149;
     Object term218235;
     Object term218238;

    public Flat3Map_equals_1826922527839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term217993 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term218057 = newInstance(Class.forName("java.lang.Package$VersionInfo"));
        setField(term217993, term217993.getClass(), "delegateMap", null);
        setIntField(term217993, term217993.getClass(), "size", 3);
        setField(term217993, term217993.getClass(), "key3", null);
        setField(term217993, term217993.getClass(), "value3", null);
        setField(term217993, term217993.getClass(), "key2", null);
        setField(term217993, term217993.getClass(), "value2", null);
        setField(term217993, term217993.getClass(), "key1", term218057);
        term218149 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term218213 = newInstance(Class.forName("java.lang.Package$VersionInfo"));
        setField(term218149, term218149.getClass(), "delegateMap", null);
        setIntField(term218149, term218149.getClass(), "size", 3);
        setField(term218149, term218149.getClass(), "key3", term218213);
        setField(term218149, term218149.getClass(), "key2", null);
        setField(term218149, term218149.getClass(), "value2", null);
        term218235 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term218236 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term218237 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term218235, term218235.getClass(), "next", null);
        setIntField(term218236, term218236.getClass(), "size", 0);
        setIntField(term218236, term218236.getClass(), "hash1", 0);
        setIntField(term218236, term218236.getClass(), "hash2", 0);
        setIntField(term218236, term218236.getClass(), "hash3", 0);
        setField(term218236, term218236.getClass(), "key1", null);
        setField(term218236, term218236.getClass(), "key2", null);
        setField(term218236, term218236.getClass(), "key3", null);
        setField(term218236, term218236.getClass(), "value1", null);
        setField(term218236, term218236.getClass(), "value2", null);
        setField(term218236, term218236.getClass(), "value3", null);
        setFloatField(term218237, term218237.getClass(), "loadFactor", 0.0F);
        setIntField(term218237, term218237.getClass(), "size", 0);
        setField(term218237, term218237.getClass(), "data", null);
        setIntField(term218237, term218237.getClass(), "threshold", 0);
        setIntField(term218237, term218237.getClass(), "modCount", 0);
        setField(term218237, term218237.getClass(), "entrySet", null);
        setField(term218237, term218237.getClass(), "keySet", null);
        setField(term218237, term218237.getClass(), "values", null);
        setField(term218237, term218237.getClass(), "keySet", null);
        setField(term218237, term218237.getClass(), "values", null);
        setField(term218236, term218236.getClass(), "delegateMap", term218237);
        setField(term218235, term218235.getClass(), "key", term218236);
        setField(term218235, term218235.getClass(), "value", null);
        term218238 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setFloatField(term218238, term218238.getClass(), "loadFactor", 0.0F);
        setIntField(term218238, term218238.getClass(), "size", 0);
        setField(term218238, term218238.getClass(), "data", null);
        setIntField(term218238, term218238.getClass(), "threshold", 0);
        setIntField(term218238, term218238.getClass(), "modCount", 0);
        setField(term218238, term218238.getClass(), "entrySet", null);
        setField(term218238, term218238.getClass(), "keySet", null);
        setField(term218238, term218238.getClass(), "values", null);
        setField(term218238, term218238.getClass(), "keySet", null);
        setField(term218238, term218238.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term218149;
        callMethod(klass, "equals", argTypes, term217993, args);
        assertTrue(recursiveEquals(term217993, term218235));
        assertTrue(recursiveEquals(term218149, term218238));
    }

};


