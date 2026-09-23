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

public class FunctionType_getGreatestSubtype_6795917091108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1455396;
     Object term1456060;

    public FunctionType_getGreatestSubtype_6795917091108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1459346 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1459345 = ((Class) term1459346).getDeclaredField((String) "INTERFACE");
        ((Field) term1459345).setAccessible(true);
        Object enum2609 = ((Field) term1459345).get((Object) null);
        Class<? extends Object> term1459640 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1459639 = ((Class) term1459640).getDeclaredField((String) "INTERFACE");
        ((Field) term1459639).setAccessible(true);
        Object enum2610 = ((Field) term1459639).get((Object) null);
        term1455396 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1455950 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1455396, term1455396.getClass(), "kind", enum2609);
        setField(term1455950, term1455950.getClass(), "kind", enum2610);
        setField(term1455396, term1455396.getClass(), "typeOfThis", term1455950);
        Class<? extends Object> term1459934 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1459933 = ((Class) term1459934).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1459933).setAccessible(true);
        Object enum2611 = ((Field) term1459933).get((Object) null);
        term1456060 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1456242 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1456060, term1456060.getClass(), "kind", enum2611);
        setField(term1456060, term1456060.getClass(), "typeOfThis", term1456242);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1456060;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1455396, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


