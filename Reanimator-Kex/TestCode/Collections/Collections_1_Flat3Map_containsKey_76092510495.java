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

public class Flat3Map_containsKey_76092510495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93005;
     Object term93670;
     Object term93671;

    public Flat3Map_containsKey_76092510495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93005 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term93005, term93005.getClass(), "delegateMap", null);
        setIntField(term93005, term93005.getClass(), "size", 2);
        setIntField(term93005, term93005.getClass(), "hash2", 0);
        setField(term93005, term93005.getClass(), "value2", null);
        setIntField(term93005, term93005.getClass(), "hash1", 0);
        setField(term93005, term93005.getClass(), "value1", null);
        setField(term93005, term93005.getClass(), "key2", term93005);
        term93670 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term93670, term93670.getClass(), "size", 2);
        setIntField(term93670, term93670.getClass(), "hash1", 0);
        setIntField(term93670, term93670.getClass(), "hash2", 0);
        setIntField(term93670, term93670.getClass(), "hash3", 0);
        setField(term93670, term93670.getClass(), "key1", null);
        setField(term93670, term93670.getClass(), "key2", term93670);
        setField(term93670, term93670.getClass(), "key3", null);
        setField(term93670, term93670.getClass(), "value1", null);
        setField(term93670, term93670.getClass(), "value2", null);
        setField(term93670, term93670.getClass(), "value3", null);
        setField(term93670, term93670.getClass(), "delegateMap", null);
        term93671 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term93671, term93671.getClass(), "size", 2);
        setIntField(term93671, term93671.getClass(), "hash1", 0);
        setIntField(term93671, term93671.getClass(), "hash2", 0);
        setIntField(term93671, term93671.getClass(), "hash3", 0);
        setField(term93671, term93671.getClass(), "key1", null);
        setField(term93671, term93671.getClass(), "key2", term93671);
        setField(term93671, term93671.getClass(), "key3", null);
        setField(term93671, term93671.getClass(), "value1", null);
        setField(term93671, term93671.getClass(), "value2", null);
        setField(term93671, term93671.getClass(), "value3", null);
        setField(term93671, term93671.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term93005;
        callMethod(klass, "containsKey", argTypes, term93005, args);
        assertTrue(recursiveEquals(term93005, term93670));
        assertTrue(recursiveEquals(term93005, term93671));
    }

};
