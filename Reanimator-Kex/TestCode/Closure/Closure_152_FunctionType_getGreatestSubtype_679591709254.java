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

public class FunctionType_getGreatestSubtype_679591709254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134836;
     Object term135390;

    public FunctionType_getGreatestSubtype_679591709254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term137005 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term137004 = ((Class) term137005).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term137004).setAccessible(true);
        Object enum250 = ((Field) term137004).get((Object) null);
        term134836 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term134836, term134836.getClass(), "kind", enum250);
        Class<? extends Object> term137305 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term137304 = ((Class) term137305).getDeclaredField((String) "INTERFACE");
        ((Field) term137304).setAccessible(true);
        Object enum251 = ((Field) term137304).get((Object) null);
        term135390 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term135390, term135390.getClass(), "kind", enum251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term135390;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term134836, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


