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
import java.lang.String;
import java.lang.Object;

public class FunctionType_supAndInfHelper_1603977104519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453409;
     Object term453667;

    public FunctionType_supAndInfHelper_1603977104519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term454749 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term454748 = ((Class) term454749).getDeclaredField((String) "INTERFACE");
        ((Field) term454748).setAccessible(true);
        Object enum826 = ((Field) term454748).get((Object) null);
        term453409 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term453409, term453409.getClass(), "kind", enum826);
        Class<? extends Object> term455043 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term455042 = ((Class) term455043).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term455042).setAccessible(true);
        Object enum827 = ((Field) term455042).get((Object) null);
        term453667 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term453667, term453667.getClass(), "kind", enum827);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term453667;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term453409, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


