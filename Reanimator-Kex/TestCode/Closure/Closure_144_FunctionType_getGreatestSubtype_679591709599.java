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

public class FunctionType_getGreatestSubtype_679591709599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term576069;
     Object term576715;

    public FunctionType_getGreatestSubtype_679591709599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term577582 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term577581 = ((Class) term577582).getDeclaredField((String) "INTERFACE");
        ((Field) term577581).setAccessible(true);
        Object enum1049 = ((Field) term577581).get((Object) null);
        term576069 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term576605 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term576069, term576069.getClass(), "kind", enum1049);
        setField(term576069, term576069.getClass(), "typeOfThis", term576605);
        term576715 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term576715, term576715.getClass(), "kind", enum1049);
        setField(term576715, term576715.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term576715;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term576069, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


