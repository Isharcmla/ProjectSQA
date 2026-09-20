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

public class Flat3Map_containsValue_2053071372442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81022;

    public Flat3Map_containsValue_2053071372442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81022 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term81077 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term81022, term81022.getClass(), "delegateMap", term81077);
        setIntField(term81022, term81022.getClass(), "size", 2);
        setField(term81022, term81022.getClass(), "value2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term81022;
        try {
            callMethod(klass, "containsValue", argTypes, term81022, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
