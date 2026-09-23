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

public class Flat3Map_put_1944740725872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227979;

    public Flat3Map_put_1944740725872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227979 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term227979, term227979.getClass(), "delegateMap", null);
        setIntField(term227979, term227979.getClass(), "size", 3);
        setIntField(term227979, term227979.getClass(), "hash3", 0);
        setField(term227979, term227979.getClass(), "value3", null);
        setIntField(term227979, term227979.getClass(), "hash2", 0);
        setField(term227979, term227979.getClass(), "value2", null);
        setIntField(term227979, term227979.getClass(), "hash1", 0);
        setField(term227979, term227979.getClass(), "value1", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term227979;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term227979, args);
        assertTrue(recursiveEquals(term227979, 3));
        assertTrue(recursiveEquals(retValue, null));
    }

};


