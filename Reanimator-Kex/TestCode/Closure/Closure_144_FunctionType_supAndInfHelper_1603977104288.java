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

public class FunctionType_supAndInfHelper_1603977104288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177064;
     Object term177724;

    public FunctionType_supAndInfHelper_1603977104288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term179468 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term179467 = ((Class) term179468).getDeclaredField((String) "INTERFACE");
        ((Field) term179467).setAccessible(true);
        Object enum347 = ((Field) term179467).get((Object) null);
        term177064 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term177614 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term177064, term177064.getClass(), "kind", enum347);
        setField(term177064, term177064.getClass(), "typeOfThis", term177614);
        Class<? extends Object> term179762 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term179761 = ((Class) term179762).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term179761).setAccessible(true);
        Object enum348 = ((Field) term179761).get((Object) null);
        term177724 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term177724, term177724.getClass(), "kind", enum348);
        setField(term177724, term177724.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term177724;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term177064, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


