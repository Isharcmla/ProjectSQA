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

public class Flat3Map_put_1944740725318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53054;
     Object term53604;
     Object term53605;

    public Flat3Map_put_1944740725318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53054 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term53054, term53054.getClass(), "delegateMap", null);
        setIntField(term53054, term53054.getClass(), "size", 0);
        term53604 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term53604, term53604.getClass(), "size", 1);
        setIntField(term53604, term53604.getClass(), "hash1", 0);
        setIntField(term53604, term53604.getClass(), "hash2", 0);
        setIntField(term53604, term53604.getClass(), "hash3", 0);
        setField(term53604, term53604.getClass(), "key1", term53604);
        setField(term53604, term53604.getClass(), "key2", null);
        setField(term53604, term53604.getClass(), "key3", null);
        setField(term53604, term53604.getClass(), "value1", null);
        setField(term53604, term53604.getClass(), "value2", null);
        setField(term53604, term53604.getClass(), "value3", null);
        setField(term53604, term53604.getClass(), "delegateMap", null);
        term53605 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term53605, term53605.getClass(), "size", 1);
        setIntField(term53605, term53605.getClass(), "hash1", 0);
        setIntField(term53605, term53605.getClass(), "hash2", 0);
        setIntField(term53605, term53605.getClass(), "hash3", 0);
        setField(term53605, term53605.getClass(), "key1", term53605);
        setField(term53605, term53605.getClass(), "key2", null);
        setField(term53605, term53605.getClass(), "key3", null);
        setField(term53605, term53605.getClass(), "value1", null);
        setField(term53605, term53605.getClass(), "value2", null);
        setField(term53605, term53605.getClass(), "value3", null);
        setField(term53605, term53605.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term53054;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term53054, args);
        assertTrue(recursiveEquals(term53054, term53604));
        assertTrue(recursiveEquals(term53054, term53605));
        assertTrue(recursiveEquals(retValue, null));
    }

};


