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

public class FunctionType_supAndInfHelper_1603977104389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290683;
     Object term291045;

    public FunctionType_supAndInfHelper_1603977104389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term292120 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term292119 = ((Class) term292120).getDeclaredField((String) "INTERFACE");
        ((Field) term292119).setAccessible(true);
        Object enum504 = ((Field) term292119).get((Object) null);
        term290683 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term290935 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term290683, term290683.getClass(), "kind", enum504);
        setField(term290683, term290683.getClass(), "registry", term290935);
        Class<? extends Object> term292414 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term292413 = ((Class) term292414).getDeclaredField((String) "ORDINARY");
        ((Field) term292413).setAccessible(true);
        Object enum505 = ((Field) term292413).get((Object) null);
        term291045 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term291045, term291045.getClass(), "kind", enum505);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term291045;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term290683, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


