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

public class Flat3Map_equals_1826922527328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58870;
     Object term59010;
     Object term59512;
     Object term59515;

    public Flat3Map_equals_1826922527328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term58918 = new HashMap();
        term58870 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term58870, term58870.getClass(), "delegateMap", null);
        setIntField(term58870, term58870.getClass(), "size", 2);
        setField(term58870, term58870.getClass(), "key2", null);
        setField(term58870, term58870.getClass(), "value2", null);
        setField(term58870, term58870.getClass(), "key1", term58918);
        term59010 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term59010, term59010.getClass(), "delegateMap", null);
        setIntField(term59010, term59010.getClass(), "size", 2);
        setField(term59010, term59010.getClass(), "key2", null);
        setField(term59010, term59010.getClass(), "value2", null);
        HashMap term59513 = new HashMap();
        term59512 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term59512, term59512.getClass(), "size", 2);
        setIntField(term59512, term59512.getClass(), "hash1", 0);
        setIntField(term59512, term59512.getClass(), "hash2", 0);
        setIntField(term59512, term59512.getClass(), "hash3", 0);
        setField(term59512, term59512.getClass(), "key1", term59513);
        setField(term59512, term59512.getClass(), "key2", null);
        setField(term59512, term59512.getClass(), "key3", null);
        setField(term59512, term59512.getClass(), "value1", null);
        setField(term59512, term59512.getClass(), "value2", null);
        setField(term59512, term59512.getClass(), "value3", null);
        setField(term59512, term59512.getClass(), "delegateMap", null);
        term59515 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term59515, term59515.getClass(), "size", 2);
        setIntField(term59515, term59515.getClass(), "hash1", 0);
        setIntField(term59515, term59515.getClass(), "hash2", 0);
        setIntField(term59515, term59515.getClass(), "hash3", 0);
        setField(term59515, term59515.getClass(), "key1", null);
        setField(term59515, term59515.getClass(), "key2", null);
        setField(term59515, term59515.getClass(), "key3", null);
        setField(term59515, term59515.getClass(), "value1", null);
        setField(term59515, term59515.getClass(), "value2", null);
        setField(term59515, term59515.getClass(), "value3", null);
        setField(term59515, term59515.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term59010;
        Object retValue = callMethod(klass, "equals", argTypes, term58870, args);
        assertTrue(recursiveEquals(term58870, term59512));
        assertTrue(recursiveEquals(term59010, term59515));
        assertTrue(recursiveEquals(retValue, false));
    }

};
