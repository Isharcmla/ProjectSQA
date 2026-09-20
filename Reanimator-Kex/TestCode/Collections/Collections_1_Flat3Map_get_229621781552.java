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
import java.lang.NullPointerException;
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Flat3Map_get_229621781552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104936;

    public Flat3Map_get_229621781552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104936 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term104982 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term105037 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term104936, term104936.getClass(), "delegateMap", null);
        setIntField(term104936, term104936.getClass(), "size", 2);
        setIntField(term104936, term104936.getClass(), "hash2", 0);
        setField(term104936, term104936.getClass(), "value2", null);
        setIntField(term104936, term104936.getClass(), "hash1", 0);
        setField(term104936, term104936.getClass(), "value1", null);
        setField(term104936, term104936.getClass(), "key2", null);
        setIntField(term105037, term105037.getClass(), "size", 2);
        setField(term104982, term104982.getClass(), "delegateMap", term105037);
        setField(term104936, term104936.getClass(), "key1", term104982);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term104936;
        try {
            callMethod(klass, "get", argTypes, term104936, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
