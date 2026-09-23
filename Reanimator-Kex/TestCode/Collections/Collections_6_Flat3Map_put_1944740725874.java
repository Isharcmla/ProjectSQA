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
import java.lang.Object;

public class Flat3Map_put_1944740725874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228827;
     Object term228919;

    public Flat3Map_put_1944740725874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term228827 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term228827, term228827.getClass(), "delegateMap", null);
        setIntField(term228827, term228827.getClass(), "size", 3);
        setIntField(term228827, term228827.getClass(), "hash3", 0);
        setField(term228827, term228827.getClass(), "key3", null);
        setIntField(term228827, term228827.getClass(), "hash2", 0);
        setField(term228827, term228827.getClass(), "key2", term228827);
        term228919 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term229029 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractLinkedMap"));
        setField(term228919, term228919.getClass(), "delegateMap", null);
        setIntField(term228919, term228919.getClass(), "size", 3);
        setIntField(term228919, term228919.getClass(), "hash3", 0);
        setField(term228919, term228919.getClass(), "value3", null);
        setIntField(term228919, term228919.getClass(), "hash2", 0);
        setField(term228919, term228919.getClass(), "value2", null);
        setIntField(term228919, term228919.getClass(), "hash1", 0);
        setIntField(term229029, term229029.getClass(), "size", 0);
        setField(term228919, term228919.getClass(), "value1", term229029);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term228919;
        args[1] = null;
        callMethod(klass, "put", argTypes, term228827, args);
    }

};


