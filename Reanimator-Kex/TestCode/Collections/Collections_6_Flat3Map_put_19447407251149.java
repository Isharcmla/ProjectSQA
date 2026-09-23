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

public class Flat3Map_put_19447407251149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349839;

    public Flat3Map_put_19447407251149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term349839 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term349885 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term349940 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term349839, term349839.getClass(), "delegateMap", null);
        setIntField(term349839, term349839.getClass(), "size", 1);
        setIntField(term349839, term349839.getClass(), "hash1", 0);
        setField(term349839, term349839.getClass(), "value1", null);
        setIntField(term349940, term349940.getClass(), "size", 1);
        setField(term349885, term349885.getClass(), "delegateMap", term349940);
        setField(term349839, term349839.getClass(), "key1", term349885);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term349839;
        args[1] = null;
        try {
            callMethod(klass, "put", argTypes, term349839, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


