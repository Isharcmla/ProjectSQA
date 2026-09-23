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
import java.util.HashMap;

public class Flat3Map_equals_1826922527581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119285;
     Object term119425;
     Object term120021;
     Object term120024;

    public Flat3Map_equals_1826922527581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term119449 = new HashMap();
        term119285 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term119285, term119285.getClass(), "delegateMap", null);
        setIntField(term119285, term119285.getClass(), "size", 3);
        setField(term119285, term119285.getClass(), "key3", term119449);
        term119425 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term119425, term119425.getClass(), "delegateMap", null);
        setIntField(term119425, term119425.getClass(), "size", 3);
        setIntField(term119425, term119425.getClass(), "hash3", 0);
        setField(term119425, term119425.getClass(), "key3", term119449);
        HashMap term120022 = new HashMap();
        term120021 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term120021, term120021.getClass(), "size", 3);
        setIntField(term120021, term120021.getClass(), "hash1", 0);
        setIntField(term120021, term120021.getClass(), "hash2", 0);
        setIntField(term120021, term120021.getClass(), "hash3", 0);
        setField(term120021, term120021.getClass(), "key1", null);
        setField(term120021, term120021.getClass(), "key2", null);
        setField(term120021, term120021.getClass(), "key3", term120022);
        setField(term120021, term120021.getClass(), "value1", null);
        setField(term120021, term120021.getClass(), "value2", null);
        setField(term120021, term120021.getClass(), "value3", null);
        setField(term120021, term120021.getClass(), "delegateMap", null);
        HashMap term120025 = new HashMap();
        term120024 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term120024, term120024.getClass(), "size", 3);
        setIntField(term120024, term120024.getClass(), "hash1", 0);
        setIntField(term120024, term120024.getClass(), "hash2", 0);
        setIntField(term120024, term120024.getClass(), "hash3", 0);
        setField(term120024, term120024.getClass(), "key1", null);
        setField(term120024, term120024.getClass(), "key2", null);
        setField(term120024, term120024.getClass(), "key3", term120025);
        setField(term120024, term120024.getClass(), "value1", null);
        setField(term120024, term120024.getClass(), "value2", null);
        setField(term120024, term120024.getClass(), "value3", null);
        setField(term120024, term120024.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term119425;
        Object retValue = callMethod(klass, "equals", argTypes, term119285, args);
        assertTrue(recursiveEquals(term119285, term120021));
        assertTrue(recursiveEquals(term119425, term120024));
        assertTrue(recursiveEquals(retValue, true));
    }

};


