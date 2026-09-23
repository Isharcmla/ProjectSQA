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

public class FunctionType_supAndInfHelper_1603977104253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145384;
     Object term145938;

    public FunctionType_supAndInfHelper_1603977104253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term146941 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term146940 = ((Class) term146941).getDeclaredField((String) "ORDINARY");
        ((Field) term146940).setAccessible(true);
        Object enum276 = ((Field) term146940).get((Object) null);
        term145384 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term145384, term145384.getClass(), "kind", enum276);
        Class<? extends Object> term147232 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term147231 = ((Class) term147232).getDeclaredField((String) "INTERFACE");
        ((Field) term147231).setAccessible(true);
        Object enum277 = ((Field) term147231).get((Object) null);
        term145938 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term145938, term145938.getClass(), "kind", enum277);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term145938;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term145384, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


