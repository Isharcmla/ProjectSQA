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

public class Flat3Map_equals_1826922527299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53318;
     Object term53506;
     Object term53594;
     Object term53596;

    public Flat3Map_equals_1826922527299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53318 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term53412 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term53318, term53318.getClass(), "delegateMap", term53412);
        term53506 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        term53594 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term53595 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setIntField(term53594, term53594.getClass(), "size", 0);
        setIntField(term53594, term53594.getClass(), "hash1", 0);
        setIntField(term53594, term53594.getClass(), "hash2", 0);
        setIntField(term53594, term53594.getClass(), "hash3", 0);
        setField(term53594, term53594.getClass(), "key1", null);
        setField(term53594, term53594.getClass(), "key2", null);
        setField(term53594, term53594.getClass(), "key3", null);
        setField(term53594, term53594.getClass(), "value1", null);
        setField(term53594, term53594.getClass(), "value2", null);
        setField(term53594, term53594.getClass(), "value3", null);
        setField(term53595, term53595.getClass(), "header", null);
        setFloatField(term53595, term53595.getClass(), "loadFactor", 0.0F);
        setIntField(term53595, term53595.getClass(), "size", 0);
        setField(term53595, term53595.getClass(), "data", null);
        setIntField(term53595, term53595.getClass(), "threshold", 0);
        setIntField(term53595, term53595.getClass(), "modCount", 0);
        setField(term53595, term53595.getClass(), "entrySet", null);
        setField(term53595, term53595.getClass(), "keySet", null);
        setField(term53595, term53595.getClass(), "values", null);
        setField(term53595, term53595.getClass(), "keySet", null);
        setField(term53595, term53595.getClass(), "values", null);
        setField(term53594, term53594.getClass(), "delegateMap", term53595);
        term53596 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term53596, term53596.getClass(), "header", null);
        setFloatField(term53596, term53596.getClass(), "loadFactor", 0.0F);
        setIntField(term53596, term53596.getClass(), "size", 0);
        setField(term53596, term53596.getClass(), "data", null);
        setIntField(term53596, term53596.getClass(), "threshold", 0);
        setIntField(term53596, term53596.getClass(), "modCount", 0);
        setField(term53596, term53596.getClass(), "entrySet", null);
        setField(term53596, term53596.getClass(), "keySet", null);
        setField(term53596, term53596.getClass(), "values", null);
        setField(term53596, term53596.getClass(), "keySet", null);
        setField(term53596, term53596.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term53506;
        Object retValue = callMethod(klass, "equals", argTypes, term53318, args);
        assertTrue(recursiveEquals(term53318, term53594));
        assertTrue(recursiveEquals(term53506, term53596));
        assertTrue(recursiveEquals(retValue, true));
    }

};
