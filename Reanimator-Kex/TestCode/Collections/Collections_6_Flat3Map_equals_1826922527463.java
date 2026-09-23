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

public class Flat3Map_equals_1826922527463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84462;
     Object term84554;

    public Flat3Map_equals_1826922527463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84462 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term84462, term84462.getClass(), "delegateMap", null);
        setIntField(term84462, term84462.getClass(), "size", 1);
        term84554 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term84664 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term84664, term84664.getClass(), "size", 1);
        setField(term84554, term84554.getClass(), "delegateMap", term84664);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term84554;
        try {
            callMethod(klass, "equals", argTypes, term84462, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


