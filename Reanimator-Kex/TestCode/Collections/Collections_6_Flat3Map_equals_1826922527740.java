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

public class Flat3Map_equals_1826922527740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176552;
     Object term176768;
     Object term188221;

    public Flat3Map_equals_1826922527740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176552 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term176676 = newInstance(Class.forName("java.util.concurrent.ConcurrentSkipListMap$ValueSpliterator"));
        setField(term176552, term176552.getClass(), "delegateMap", null);
        setIntField(term176552, term176552.getClass(), "size", 3);
        setField(term176552, term176552.getClass(), "key3", term176676);
        term176768 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term176768, term176768.getClass(), "delegateMap", null);
        setIntField(term176768, term176768.getClass(), "size", 3);
        term188221 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term188221, term188221.getClass(), "size", 3);
        setIntField(term188221, term188221.getClass(), "hash1", 0);
        setIntField(term188221, term188221.getClass(), "hash2", 0);
        setIntField(term188221, term188221.getClass(), "hash3", 0);
        setField(term188221, term188221.getClass(), "key1", null);
        setField(term188221, term188221.getClass(), "key2", null);
        setField(term188221, term188221.getClass(), "key3", null);
        setField(term188221, term188221.getClass(), "value1", null);
        setField(term188221, term188221.getClass(), "value2", null);
        setField(term188221, term188221.getClass(), "value3", null);
        setField(term188221, term188221.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term176768;
        Object retValue = callMethod(klass, "equals", argTypes, term176552, args);
        assertTrue(recursiveEquals(term176768, term188221));
        assertTrue(recursiveEquals(retValue, false));
    }

};


