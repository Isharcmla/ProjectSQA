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

public class FunctionType_isSubtype_21010021581617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2168851;
     Object term2169621;

    public FunctionType_isSubtype_21010021581617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2172250 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2172249 = ((Class) term2172250).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2172249).setAccessible(true);
        Object enum4048 = ((Field) term2172249).get((Object) null);
        term2168851 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2169403 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2169513 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2168851, term2168851.getClass(), "kind", enum4048);
        setField(term2169403, term2169403.getClass(), "kind", enum4048);
        setField(term2169403, term2169403.getClass(), "typeOfThis", term2169513);
        setField(term2168851, term2168851.getClass(), "typeOfThis", term2169403);
        Class<? extends Object> term2172550 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2172549 = ((Class) term2172550).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2172549).setAccessible(true);
        Object enum4049 = ((Field) term2172549).get((Object) null);
        term2169621 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2169951 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2169621, term2169621.getClass(), "kind", enum4048);
        setField(term2169951, term2169951.getClass(), "kind", enum4049);
        setField(term2169951, term2169951.getClass(), "typeOfThis", null);
        setField(term2169621, term2169621.getClass(), "typeOfThis", term2169951);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2169621;
        try {
            callMethod(klass, "isSubtype", argTypes, term2168851, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


