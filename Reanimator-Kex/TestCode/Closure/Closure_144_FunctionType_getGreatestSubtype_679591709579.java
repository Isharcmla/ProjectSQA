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

public class FunctionType_getGreatestSubtype_679591709579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term544430;
     Object term545094;

    public FunctionType_getGreatestSubtype_679591709579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term546109 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term546108 = ((Class) term546109).getDeclaredField((String) "INTERFACE");
        ((Field) term546108).setAccessible(true);
        Object enum993 = ((Field) term546108).get((Object) null);
        term544430 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term544984 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term544430, term544430.getClass(), "kind", enum993);
        setField(term544430, term544430.getClass(), "typeOfThis", term544984);
        Class<? extends Object> term546403 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term546402 = ((Class) term546403).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term546402).setAccessible(true);
        Object enum994 = ((Field) term546402).get((Object) null);
        term545094 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term545094, term545094.getClass(), "kind", enum994);
        setField(term545094, term545094.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term545094;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term544430, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


