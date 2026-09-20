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

public class Flat3Map_equals_1826922527689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135883;
     Object term135975;

    public Flat3Map_equals_1826922527689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135883 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term135883, term135883.getClass(), "delegateMap", null);
        setIntField(term135883, term135883.getClass(), "size", 3);
        term135975 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term136073 = newInstance(Class.forName("org.apache.commons.collections.map.IdentityMap"));
        setIntField(term136073, term136073.getClass(), "size", 3);
        setField(term135975, term135975.getClass(), "delegateMap", term136073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term135975;
        try {
            callMethod(klass, "equals", argTypes, term135883, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
