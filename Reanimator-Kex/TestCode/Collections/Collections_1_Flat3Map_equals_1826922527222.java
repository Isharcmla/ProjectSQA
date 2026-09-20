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

public class Flat3Map_equals_1826922527222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38597;
     Object term38737;
     Object term39109;
     Object term39112;

    public Flat3Map_equals_1826922527222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term38645 = new HashMap();
        term38597 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term38597, term38597.getClass(), "delegateMap", null);
        setIntField(term38597, term38597.getClass(), "size", 1);
        setField(term38597, term38597.getClass(), "key1", term38645);
        term38737 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term38737, term38737.getClass(), "delegateMap", null);
        setIntField(term38737, term38737.getClass(), "size", 1);
        HashMap term39110 = new HashMap();
        term39109 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term39109, term39109.getClass(), "size", 1);
        setIntField(term39109, term39109.getClass(), "hash1", 0);
        setIntField(term39109, term39109.getClass(), "hash2", 0);
        setIntField(term39109, term39109.getClass(), "hash3", 0);
        setField(term39109, term39109.getClass(), "key1", term39110);
        setField(term39109, term39109.getClass(), "key2", null);
        setField(term39109, term39109.getClass(), "key3", null);
        setField(term39109, term39109.getClass(), "value1", null);
        setField(term39109, term39109.getClass(), "value2", null);
        setField(term39109, term39109.getClass(), "value3", null);
        setField(term39109, term39109.getClass(), "delegateMap", null);
        term39112 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term39112, term39112.getClass(), "size", 1);
        setIntField(term39112, term39112.getClass(), "hash1", 0);
        setIntField(term39112, term39112.getClass(), "hash2", 0);
        setIntField(term39112, term39112.getClass(), "hash3", 0);
        setField(term39112, term39112.getClass(), "key1", null);
        setField(term39112, term39112.getClass(), "key2", null);
        setField(term39112, term39112.getClass(), "key3", null);
        setField(term39112, term39112.getClass(), "value1", null);
        setField(term39112, term39112.getClass(), "value2", null);
        setField(term39112, term39112.getClass(), "value3", null);
        setField(term39112, term39112.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term38737;
        Object retValue = callMethod(klass, "equals", argTypes, term38597, args);
        assertTrue(recursiveEquals(term38597, term39109));
        assertTrue(recursiveEquals(term38737, term39112));
        assertTrue(recursiveEquals(retValue, false));
    }

};
