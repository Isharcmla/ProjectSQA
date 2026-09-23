package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionType_init_958554442213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108974;

    public FunctionType_init_958554442213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term108870 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term108974 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        argTypes[4] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[5] = Class.forName("com.google.common.collect.ImmutableList");
        argTypes[6] = boolean.class;
        argTypes[7] = boolean.class;
        Object[] args = new Object[8];
        args[0] = term108974;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = false;
        args[7] = false;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


