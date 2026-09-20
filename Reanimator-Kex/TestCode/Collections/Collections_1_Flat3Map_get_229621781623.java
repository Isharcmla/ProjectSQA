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
import java.lang.NullPointerException;
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Flat3Map_get_229621781623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120924;
     Object term121204;

    public Flat3Map_get_229621781623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120924 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term121018 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object term121112 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setIntField(term121018, term121018.getClass(), "size", -4);
        setField(term120924, term120924.getClass(), "delegateMap", term121018);
        setIntField(term120924, term120924.getClass(), "size", 3);
        setIntField(term120924, term120924.getClass(), "hash3", 0);
        setField(term120924, term120924.getClass(), "key3", term120924);
        setIntField(term120924, term120924.getClass(), "hash2", 0);
        setField(term120924, term120924.getClass(), "key2", null);
        setIntField(term120924, term120924.getClass(), "hash1", 0);
        setField(term120924, term120924.getClass(), "key1", term121112);
        term121204 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term121204, term121204.getClass(), "delegateMap", null);
        setIntField(term121204, term121204.getClass(), "size", 3);
        setIntField(term121204, term121204.getClass(), "hash3", 0);
        setField(term121204, term121204.getClass(), "value3", null);
        setIntField(term121204, term121204.getClass(), "hash2", 0);
        setField(term121204, term121204.getClass(), "value2", null);
        setIntField(term121204, term121204.getClass(), "hash1", 0);
        setField(term121204, term121204.getClass(), "value1", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term121204;
        try {
            callMethod(klass, "get", argTypes, term120924, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
