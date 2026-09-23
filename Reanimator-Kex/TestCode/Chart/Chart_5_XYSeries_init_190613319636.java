package org.jfree.data.xy;

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
import java.lang.IllegalArgumentException;
import static org.jfree.data.xy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class XYSeries_init_190613319636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term5;

    public XYSeries_init_190613319636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = new Boolean(false);
        term5 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term3;
        args[2] = term5;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


