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

public class Flat3Map_put_1944740725835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217081;

    public Flat3Map_put_1944740725835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term217081 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term217136 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term217081, term217081.getClass(), "delegateMap", null);
        setIntField(term217081, term217081.getClass(), "size", 1);
        setIntField(term217081, term217081.getClass(), "hash1", 0);
        setIntField(term217136, term217136.getClass(), "size", 0);
        setField(term217081, term217081.getClass(), "value1", term217136);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term217081;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term217081, args);
        assertTrue(recursiveEquals(term217081, 0));
        assertTrue(recursiveEquals(retValue, null));
    }

};


