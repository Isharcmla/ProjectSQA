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

public class Flat3Map_remove_8406902791087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215611;
     Object term215703;
     Object term215923;
     Object term215924;

    public Flat3Map_remove_8406902791087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term215611 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term215611, term215611.getClass(), "delegateMap", null);
        setIntField(term215611, term215611.getClass(), "size", 1);
        setIntField(term215611, term215611.getClass(), "hash1", 0);
        setField(term215611, term215611.getClass(), "key1", term215611);
        term215703 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term215813 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term215703, term215703.getClass(), "delegateMap", null);
        setIntField(term215703, term215703.getClass(), "size", 1);
        setIntField(term215703, term215703.getClass(), "hash1", 0);
        setIntField(term215813, term215813.getClass(), "size", 0);
        setField(term215703, term215703.getClass(), "value1", term215813);
        term215923 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term215923, term215923.getClass(), "size", 1);
        setIntField(term215923, term215923.getClass(), "hash1", 0);
        setIntField(term215923, term215923.getClass(), "hash2", 0);
        setIntField(term215923, term215923.getClass(), "hash3", 0);
        setField(term215923, term215923.getClass(), "key1", term215923);
        setField(term215923, term215923.getClass(), "key2", null);
        setField(term215923, term215923.getClass(), "key3", null);
        setField(term215923, term215923.getClass(), "value1", null);
        setField(term215923, term215923.getClass(), "value2", null);
        setField(term215923, term215923.getClass(), "value3", null);
        setField(term215923, term215923.getClass(), "delegateMap", null);
        term215924 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term215925 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term215924, term215924.getClass(), "size", 1);
        setIntField(term215924, term215924.getClass(), "hash1", 0);
        setIntField(term215924, term215924.getClass(), "hash2", 0);
        setIntField(term215924, term215924.getClass(), "hash3", 0);
        setField(term215924, term215924.getClass(), "key1", null);
        setField(term215924, term215924.getClass(), "key2", null);
        setField(term215924, term215924.getClass(), "key3", null);
        setFloatField(term215925, term215925.getClass(), "loadFactor", 0.0F);
        setIntField(term215925, term215925.getClass(), "size", 0);
        setField(term215925, term215925.getClass(), "data", null);
        setIntField(term215925, term215925.getClass(), "threshold", 0);
        setIntField(term215925, term215925.getClass(), "modCount", 0);
        setField(term215925, term215925.getClass(), "entrySet", null);
        setField(term215925, term215925.getClass(), "keySet", null);
        setField(term215925, term215925.getClass(), "values", null);
        setField(term215925, term215925.getClass(), "keySet", null);
        setField(term215925, term215925.getClass(), "values", null);
        setField(term215924, term215924.getClass(), "value1", term215925);
        setField(term215924, term215924.getClass(), "value2", null);
        setField(term215924, term215924.getClass(), "value3", null);
        setField(term215924, term215924.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term215703;
        Object retValue = callMethod(klass, "remove", argTypes, term215611, args);
        assertTrue(recursiveEquals(term215611, term215923));
        assertTrue(recursiveEquals(term215703, term215924));
        assertTrue(recursiveEquals(retValue, null));
    }

};
