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

public class Flat3Map_containsValue_2053071372601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115582;

    public Flat3Map_containsValue_2053071372601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115582 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term115637 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term115582, term115582.getClass(), "delegateMap", term115637);
        setIntField(term115582, term115582.getClass(), "size", 3);
        setField(term115582, term115582.getClass(), "value3", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term115582;
        try {
            callMethod(klass, "containsValue", argTypes, term115582, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
