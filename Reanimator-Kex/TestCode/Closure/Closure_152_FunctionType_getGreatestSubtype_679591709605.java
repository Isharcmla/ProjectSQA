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

public class FunctionType_getGreatestSubtype_679591709605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term594502;
     Object term595166;

    public FunctionType_getGreatestSubtype_679591709605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term596763 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term596762 = ((Class) term596763).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term596762).setAccessible(true);
        Object enum919 = ((Field) term596762).get((Object) null);
        term594502 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term595056 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term594502, term594502.getClass(), "kind", enum919);
        setField(term594502, term594502.getClass(), "typeOfThis", term595056);
        term595166 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term595166, term595166.getClass(), "kind", enum919);
        setField(term595166, term595166.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term595166;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term594502, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


