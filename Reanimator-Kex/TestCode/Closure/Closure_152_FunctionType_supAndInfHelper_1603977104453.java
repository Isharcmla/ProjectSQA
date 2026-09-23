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

public class FunctionType_supAndInfHelper_1603977104453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term378349;
     Object term378711;

    public FunctionType_supAndInfHelper_1603977104453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term379433 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term379432 = ((Class) term379433).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term379432).setAccessible(true);
        Object enum639 = ((Field) term379432).get((Object) null);
        term378349 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term378601 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term378349, term378349.getClass(), "kind", enum639);
        setField(term378349, term378349.getClass(), "registry", term378601);
        term378711 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term378711, term378711.getClass(), "kind", enum639);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term378711;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term378349, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


