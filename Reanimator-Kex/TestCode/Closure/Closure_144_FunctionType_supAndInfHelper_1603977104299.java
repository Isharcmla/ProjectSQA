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

public class FunctionType_supAndInfHelper_1603977104299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187919;
     Object term188177;

    public FunctionType_supAndInfHelper_1603977104299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term188781 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term188780 = ((Class) term188781).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term188780).setAccessible(true);
        Object enum360 = ((Field) term188780).get((Object) null);
        term187919 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term187919, term187919.getClass(), "kind", enum360);
        term188177 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term188177;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term187919, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


