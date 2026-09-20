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

public class Flat3Map_get_229621781730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146279;
     Object term146371;
     Object term146967;
     Object term146968;

    public Flat3Map_get_229621781730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146279 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term146279, term146279.getClass(), "delegateMap", null);
        setIntField(term146279, term146279.getClass(), "size", 2);
        setIntField(term146279, term146279.getClass(), "hash2", 0);
        setField(term146279, term146279.getClass(), "key2", null);
        setIntField(term146279, term146279.getClass(), "hash1", 0);
        setField(term146279, term146279.getClass(), "key1", term146279);
        term146371 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term146371, term146371.getClass(), "delegateMap", null);
        setIntField(term146371, term146371.getClass(), "size", 2);
        setIntField(term146371, term146371.getClass(), "hash2", 0);
        setField(term146371, term146371.getClass(), "value2", null);
        setIntField(term146371, term146371.getClass(), "hash1", 0);
        setField(term146371, term146371.getClass(), "value1", null);
        setField(term146371, term146371.getClass(), "key2", null);
        term146967 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term146967, term146967.getClass(), "size", 2);
        setIntField(term146967, term146967.getClass(), "hash1", 0);
        setIntField(term146967, term146967.getClass(), "hash2", 0);
        setIntField(term146967, term146967.getClass(), "hash3", 0);
        setField(term146967, term146967.getClass(), "key1", term146967);
        setField(term146967, term146967.getClass(), "key2", null);
        setField(term146967, term146967.getClass(), "key3", null);
        setField(term146967, term146967.getClass(), "value1", null);
        setField(term146967, term146967.getClass(), "value2", null);
        setField(term146967, term146967.getClass(), "value3", null);
        setField(term146967, term146967.getClass(), "delegateMap", null);
        term146968 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term146968, term146968.getClass(), "size", 2);
        setIntField(term146968, term146968.getClass(), "hash1", 0);
        setIntField(term146968, term146968.getClass(), "hash2", 0);
        setIntField(term146968, term146968.getClass(), "hash3", 0);
        setField(term146968, term146968.getClass(), "key1", null);
        setField(term146968, term146968.getClass(), "key2", null);
        setField(term146968, term146968.getClass(), "key3", null);
        setField(term146968, term146968.getClass(), "value1", null);
        setField(term146968, term146968.getClass(), "value2", null);
        setField(term146968, term146968.getClass(), "value3", null);
        setField(term146968, term146968.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term146371;
        Object retValue = callMethod(klass, "get", argTypes, term146279, args);
        assertTrue(recursiveEquals(term146279, term146967));
        assertTrue(recursiveEquals(term146371, term146968));
        assertTrue(recursiveEquals(retValue, null));
    }

};
