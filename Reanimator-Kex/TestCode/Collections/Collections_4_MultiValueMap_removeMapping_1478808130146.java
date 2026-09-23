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

public class MultiValueMap_removeMapping_1478808130146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32167;

    public MultiValueMap_removeMapping_1478808130146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32167 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term32269 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term32371 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term32473 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term32371, term32371.getClass(), "map", term32473);
        setField(term32269, term32269.getClass(), "map", term32371);
        setField(term32167, term32167.getClass(), "map", term32269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "removeMapping", argTypes, term32167, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


