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

public class Flat3Map_equals_1826922527248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40420;
     Object term40512;
     Object term41440;
     Object term41441;

    public Flat3Map_equals_1826922527248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40420 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term40420, term40420.getClass(), "delegateMap", null);
        setIntField(term40420, term40420.getClass(), "size", 1);
        setField(term40420, term40420.getClass(), "key1", null);
        HashMap term40560 = new HashMap();
        term40512 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term40512, term40512.getClass(), "delegateMap", null);
        setIntField(term40512, term40512.getClass(), "size", 1);
        setField(term40512, term40512.getClass(), "key1", term40560);
        term41440 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term41440, term41440.getClass(), "size", 1);
        setIntField(term41440, term41440.getClass(), "hash1", 0);
        setIntField(term41440, term41440.getClass(), "hash2", 0);
        setIntField(term41440, term41440.getClass(), "hash3", 0);
        setField(term41440, term41440.getClass(), "key1", null);
        setField(term41440, term41440.getClass(), "key2", null);
        setField(term41440, term41440.getClass(), "key3", null);
        setField(term41440, term41440.getClass(), "value1", null);
        setField(term41440, term41440.getClass(), "value2", null);
        setField(term41440, term41440.getClass(), "value3", null);
        setField(term41440, term41440.getClass(), "delegateMap", null);
        HashMap term41442 = new HashMap();
        term41441 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term41441, term41441.getClass(), "size", 1);
        setIntField(term41441, term41441.getClass(), "hash1", 0);
        setIntField(term41441, term41441.getClass(), "hash2", 0);
        setIntField(term41441, term41441.getClass(), "hash3", 0);
        setField(term41441, term41441.getClass(), "key1", term41442);
        setField(term41441, term41441.getClass(), "key2", null);
        setField(term41441, term41441.getClass(), "key3", null);
        setField(term41441, term41441.getClass(), "value1", null);
        setField(term41441, term41441.getClass(), "value2", null);
        setField(term41441, term41441.getClass(), "value3", null);
        setField(term41441, term41441.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term40512;
        Object retValue = callMethod(klass, "equals", argTypes, term40420, args);
        assertTrue(recursiveEquals(term40420, term41440));
        assertTrue(recursiveEquals(term40512, term41441));
        assertTrue(recursiveEquals(retValue, false));
    }

};


