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

public class Flat3Map_equals_1826922527541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106616;
     Object term106756;
     Object term106831;
     Object term106833;

    public Flat3Map_equals_1826922527541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term106664 = new HashMap();
        term106616 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term106616, term106616.getClass(), "delegateMap", null);
        setIntField(term106616, term106616.getClass(), "size", 3);
        setField(term106616, term106616.getClass(), "key3", null);
        setField(term106616, term106616.getClass(), "value3", null);
        setField(term106616, term106616.getClass(), "key2", null);
        setField(term106616, term106616.getClass(), "value2", null);
        setField(term106616, term106616.getClass(), "key1", null);
        setField(term106616, term106616.getClass(), "value1", term106664);
        term106756 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term106756, term106756.getClass(), "delegateMap", null);
        setIntField(term106756, term106756.getClass(), "size", 3);
        setField(term106756, term106756.getClass(), "key3", null);
        setField(term106756, term106756.getClass(), "value3", null);
        HashMap term106832 = new HashMap();
        term106831 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term106831, term106831.getClass(), "size", 3);
        setIntField(term106831, term106831.getClass(), "hash1", 0);
        setIntField(term106831, term106831.getClass(), "hash2", 0);
        setIntField(term106831, term106831.getClass(), "hash3", 0);
        setField(term106831, term106831.getClass(), "key1", null);
        setField(term106831, term106831.getClass(), "key2", null);
        setField(term106831, term106831.getClass(), "key3", null);
        setField(term106831, term106831.getClass(), "value1", term106832);
        setField(term106831, term106831.getClass(), "value2", null);
        setField(term106831, term106831.getClass(), "value3", null);
        setField(term106831, term106831.getClass(), "delegateMap", null);
        term106833 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term106833, term106833.getClass(), "size", 3);
        setIntField(term106833, term106833.getClass(), "hash1", 0);
        setIntField(term106833, term106833.getClass(), "hash2", 0);
        setIntField(term106833, term106833.getClass(), "hash3", 0);
        setField(term106833, term106833.getClass(), "key1", null);
        setField(term106833, term106833.getClass(), "key2", null);
        setField(term106833, term106833.getClass(), "key3", null);
        setField(term106833, term106833.getClass(), "value1", null);
        setField(term106833, term106833.getClass(), "value2", null);
        setField(term106833, term106833.getClass(), "value3", null);
        setField(term106833, term106833.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term106756;
        Object retValue = callMethod(klass, "equals", argTypes, term106616, args);
        assertTrue(recursiveEquals(term106616, term106831));
        assertTrue(recursiveEquals(term106756, term106833));
        assertTrue(recursiveEquals(retValue, false));
    }

};


