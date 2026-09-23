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

public class Flat3Map_equals_1826922527115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21542;
     Object term21634;
     Object term21658;
     Object term21659;

    public Flat3Map_equals_1826922527115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21542 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term21542, term21542.getClass(), "delegateMap", null);
        term21634 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term21658 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term21658, term21658.getClass(), "size", 0);
        setIntField(term21658, term21658.getClass(), "hash1", 0);
        setIntField(term21658, term21658.getClass(), "hash2", 0);
        setIntField(term21658, term21658.getClass(), "hash3", 0);
        setField(term21658, term21658.getClass(), "key1", null);
        setField(term21658, term21658.getClass(), "key2", null);
        setField(term21658, term21658.getClass(), "key3", null);
        setField(term21658, term21658.getClass(), "value1", null);
        setField(term21658, term21658.getClass(), "value2", null);
        setField(term21658, term21658.getClass(), "value3", null);
        setField(term21658, term21658.getClass(), "delegateMap", null);
        term21659 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term21659, term21659.getClass(), "size", 0);
        setIntField(term21659, term21659.getClass(), "hash1", 0);
        setIntField(term21659, term21659.getClass(), "hash2", 0);
        setIntField(term21659, term21659.getClass(), "hash3", 0);
        setField(term21659, term21659.getClass(), "key1", null);
        setField(term21659, term21659.getClass(), "key2", null);
        setField(term21659, term21659.getClass(), "key3", null);
        setField(term21659, term21659.getClass(), "value1", null);
        setField(term21659, term21659.getClass(), "value2", null);
        setField(term21659, term21659.getClass(), "value3", null);
        setField(term21659, term21659.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term21634;
        Object retValue = callMethod(klass, "equals", argTypes, term21542, args);
        assertTrue(recursiveEquals(term21542, term21658));
        assertTrue(recursiveEquals(term21634, term21659));
        assertTrue(recursiveEquals(retValue, true));
    }

};


