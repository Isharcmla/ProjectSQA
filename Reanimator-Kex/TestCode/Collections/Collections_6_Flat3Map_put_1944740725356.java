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

public class Flat3Map_put_1944740725356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59940;
     Object term60154;
     Object term60594;
     Object term60598;

    public Flat3Map_put_1944740725356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59940 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term59978 = newInstance(Class.forName("java.lang.Object"));
        Object term60016 = newInstance(Class.forName("java.lang.Object"));
        term60154 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term59940, term59940.getClass(), "delegateMap", null);
        setIntField(term59940, term59940.getClass(), "size", 3);
        setIntField(term59940, term59940.getClass(), "hash3", 0);
        setField(term59940, term59940.getClass(), "key3", term59978);
        setIntField(term59940, term59940.getClass(), "hash2", 0);
        setField(term59940, term59940.getClass(), "key2", term60016);
        setIntField(term59940, term59940.getClass(), "hash1", 0);
        setField(term60154, term60154.getClass(), "delegateMap", null);
        setIntField(term60154, term60154.getClass(), "size", 3);
        setIntField(term60154, term60154.getClass(), "hash3", 0);
        setField(term60154, term60154.getClass(), "value3", null);
        setIntField(term60154, term60154.getClass(), "hash2", 0);
        setField(term60154, term60154.getClass(), "value2", null);
        setIntField(term60154, term60154.getClass(), "hash1", 0);
        setField(term60154, term60154.getClass(), "value1", null);
        setField(term59940, term59940.getClass(), "key1", term60154);
        term60594 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term60595 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term60596 = newInstance(Class.forName("java.lang.Object"));
        Object term60597 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term60594, term60594.getClass(), "size", 3);
        setIntField(term60594, term60594.getClass(), "hash1", 0);
        setIntField(term60594, term60594.getClass(), "hash2", 0);
        setIntField(term60594, term60594.getClass(), "hash3", 0);
        setIntField(term60595, term60595.getClass(), "size", 3);
        setIntField(term60595, term60595.getClass(), "hash1", 0);
        setIntField(term60595, term60595.getClass(), "hash2", 0);
        setIntField(term60595, term60595.getClass(), "hash3", 0);
        setField(term60595, term60595.getClass(), "key1", null);
        setField(term60595, term60595.getClass(), "key2", null);
        setField(term60595, term60595.getClass(), "key3", null);
        setField(term60595, term60595.getClass(), "value1", null);
        setField(term60595, term60595.getClass(), "value2", null);
        setField(term60595, term60595.getClass(), "value3", null);
        setField(term60595, term60595.getClass(), "delegateMap", null);
        setField(term60594, term60594.getClass(), "key1", term60595);
        setField(term60594, term60594.getClass(), "key2", term60596);
        setField(term60594, term60594.getClass(), "key3", term60597);
        setField(term60594, term60594.getClass(), "value1", null);
        setField(term60594, term60594.getClass(), "value2", null);
        setField(term60594, term60594.getClass(), "value3", null);
        setField(term60594, term60594.getClass(), "delegateMap", null);
        term60598 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term60598, term60598.getClass(), "size", 3);
        setIntField(term60598, term60598.getClass(), "hash1", 0);
        setIntField(term60598, term60598.getClass(), "hash2", 0);
        setIntField(term60598, term60598.getClass(), "hash3", 0);
        setField(term60598, term60598.getClass(), "key1", null);
        setField(term60598, term60598.getClass(), "key2", null);
        setField(term60598, term60598.getClass(), "key3", null);
        setField(term60598, term60598.getClass(), "value1", null);
        setField(term60598, term60598.getClass(), "value2", null);
        setField(term60598, term60598.getClass(), "value3", null);
        setField(term60598, term60598.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term60154;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term59940, args);
        assertTrue(recursiveEquals(term59940, term60594));
        assertTrue(recursiveEquals(term60154, term60598));
        assertTrue(recursiveEquals(retValue, null));
    }

};


