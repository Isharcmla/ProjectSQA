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

public class Flat3Map_put_19447407251194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377265;
     Object term377109;

    public Flat3Map_put_19447407251194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term377265 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term377265, term377265.getClass(), "delegateMap", null);
        setIntField(term377265, term377265.getClass(), "size", 0);
        term377109 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term377219 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term377357 = newInstance(Class.forName("java.lang.ProcessEnvironment$StringValues$1"));
        setField(term377109, term377109.getClass(), "delegateMap", null);
        setIntField(term377109, term377109.getClass(), "size", 3);
        setIntField(term377109, term377109.getClass(), "hash3", 0);
        setIntField(term377219, term377219.getClass(), "size", 0);
        setField(term377109, term377109.getClass(), "value3", term377219);
        setIntField(term377109, term377109.getClass(), "hash2", 0);
        setField(term377109, term377109.getClass(), "value2", term377265);
        setIntField(term377109, term377109.getClass(), "hash1", 0);
        setField(term377109, term377109.getClass(), "value1", term377357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term377109;
        args[1] = null;
        callMethod(klass, "put", argTypes, term377265, args);
    }

};


