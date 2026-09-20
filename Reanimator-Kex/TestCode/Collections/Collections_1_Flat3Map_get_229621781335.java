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

public class Flat3Map_get_229621781335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60594;
     Object term60840;
     Object term60842;

    public Flat3Map_get_229621781335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60594 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term60640 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term60594, term60594.getClass(), "delegateMap", null);
        setIntField(term60594, term60594.getClass(), "size", 3);
        setIntField(term60594, term60594.getClass(), "hash3", 0);
        setField(term60594, term60594.getClass(), "value3", null);
        setIntField(term60594, term60594.getClass(), "hash2", 0);
        setField(term60594, term60594.getClass(), "value2", null);
        setIntField(term60594, term60594.getClass(), "hash1", 0);
        setField(term60594, term60594.getClass(), "value1", null);
        setField(term60594, term60594.getClass(), "key3", term60640);
        term60840 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term60841 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term60840, term60840.getClass(), "size", 3);
        setIntField(term60840, term60840.getClass(), "hash1", 0);
        setIntField(term60840, term60840.getClass(), "hash2", 0);
        setIntField(term60840, term60840.getClass(), "hash3", 0);
        setField(term60840, term60840.getClass(), "key1", null);
        setField(term60840, term60840.getClass(), "key2", null);
        setIntField(term60841, term60841.getClass(), "size", 0);
        setIntField(term60841, term60841.getClass(), "hash1", 0);
        setIntField(term60841, term60841.getClass(), "hash2", 0);
        setIntField(term60841, term60841.getClass(), "hash3", 0);
        setField(term60841, term60841.getClass(), "key1", null);
        setField(term60841, term60841.getClass(), "key2", null);
        setField(term60841, term60841.getClass(), "key3", null);
        setField(term60841, term60841.getClass(), "value1", null);
        setField(term60841, term60841.getClass(), "value2", null);
        setField(term60841, term60841.getClass(), "value3", null);
        setField(term60841, term60841.getClass(), "delegateMap", null);
        setField(term60840, term60840.getClass(), "key3", term60841);
        setField(term60840, term60840.getClass(), "value1", null);
        setField(term60840, term60840.getClass(), "value2", null);
        setField(term60840, term60840.getClass(), "value3", null);
        setField(term60840, term60840.getClass(), "delegateMap", null);
        term60842 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term60843 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term60842, term60842.getClass(), "size", 3);
        setIntField(term60842, term60842.getClass(), "hash1", 0);
        setIntField(term60842, term60842.getClass(), "hash2", 0);
        setIntField(term60842, term60842.getClass(), "hash3", 0);
        setField(term60842, term60842.getClass(), "key1", null);
        setField(term60842, term60842.getClass(), "key2", null);
        setIntField(term60843, term60843.getClass(), "size", 0);
        setIntField(term60843, term60843.getClass(), "hash1", 0);
        setIntField(term60843, term60843.getClass(), "hash2", 0);
        setIntField(term60843, term60843.getClass(), "hash3", 0);
        setField(term60843, term60843.getClass(), "key1", null);
        setField(term60843, term60843.getClass(), "key2", null);
        setField(term60843, term60843.getClass(), "key3", null);
        setField(term60843, term60843.getClass(), "value1", null);
        setField(term60843, term60843.getClass(), "value2", null);
        setField(term60843, term60843.getClass(), "value3", null);
        setField(term60843, term60843.getClass(), "delegateMap", null);
        setField(term60842, term60842.getClass(), "key3", term60843);
        setField(term60842, term60842.getClass(), "value1", null);
        setField(term60842, term60842.getClass(), "value2", null);
        setField(term60842, term60842.getClass(), "value3", null);
        setField(term60842, term60842.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term60594;
        Object retValue = callMethod(klass, "get", argTypes, term60594, args);
        assertTrue(recursiveEquals(term60594, term60840));
        assertTrue(recursiveEquals(term60594, term60842));
        assertTrue(recursiveEquals(retValue, null));
    }

};
