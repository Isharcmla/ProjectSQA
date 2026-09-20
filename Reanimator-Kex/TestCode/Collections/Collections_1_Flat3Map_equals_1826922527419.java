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

public class Flat3Map_equals_1826922527419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76971;
     Object term77119;
     Object term77218;
     Object term77220;

    public Flat3Map_equals_1826922527419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76971 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term77081 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractLinkedMap"));
        setField(term76971, term76971.getClass(), "delegateMap", term77081);
        term77119 = newInstance(Class.forName("java.lang.Object"));
        term77218 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term77219 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractLinkedMap"));
        setIntField(term77218, term77218.getClass(), "size", 0);
        setIntField(term77218, term77218.getClass(), "hash1", 0);
        setIntField(term77218, term77218.getClass(), "hash2", 0);
        setIntField(term77218, term77218.getClass(), "hash3", 0);
        setField(term77218, term77218.getClass(), "key1", null);
        setField(term77218, term77218.getClass(), "key2", null);
        setField(term77218, term77218.getClass(), "key3", null);
        setField(term77218, term77218.getClass(), "value1", null);
        setField(term77218, term77218.getClass(), "value2", null);
        setField(term77218, term77218.getClass(), "value3", null);
        setField(term77219, term77219.getClass(), "header", null);
        setFloatField(term77219, term77219.getClass(), "loadFactor", 0.0F);
        setIntField(term77219, term77219.getClass(), "size", 0);
        setField(term77219, term77219.getClass(), "data", null);
        setIntField(term77219, term77219.getClass(), "threshold", 0);
        setIntField(term77219, term77219.getClass(), "modCount", 0);
        setField(term77219, term77219.getClass(), "entrySet", null);
        setField(term77219, term77219.getClass(), "keySet", null);
        setField(term77219, term77219.getClass(), "values", null);
        setField(term77219, term77219.getClass(), "keySet", null);
        setField(term77219, term77219.getClass(), "values", null);
        setField(term77218, term77218.getClass(), "delegateMap", term77219);
        term77220 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term77119;
        Object retValue = callMethod(klass, "equals", argTypes, term76971, args);
        assertTrue(recursiveEquals(term76971, term77218));
        assertTrue(recursiveEquals(term77119, term77220));
        assertTrue(recursiveEquals(retValue, false));
    }

};
