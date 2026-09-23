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

public class FunctionType_isSubtype_21010021581061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1218802;
     Object term1219454;

    public FunctionType_isSubtype_21010021581061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1223231 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1223230 = ((Class) term1223231).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1223230).setAccessible(true);
        Object enum2278 = ((Field) term1223230).get((Object) null);
        Class<? extends Object> term1223531 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1223530 = ((Class) term1223531).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1223530).setAccessible(true);
        Object enum2279 = ((Field) term1223530).get((Object) null);
        term1218802 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1219346 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1218802, term1218802.getClass(), "kind", enum2278);
        setField(term1219346, term1219346.getClass(), "kind", enum2279);
        setField(term1218802, term1218802.getClass(), "typeOfThis", term1219346);
        term1219454 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1219784 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1219454, term1219454.getClass(), "kind", enum2278);
        setField(term1219784, term1219784.getClass(), "kind", enum2279);
        setField(term1219454, term1219454.getClass(), "typeOfThis", term1219784);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1219454;
        try {
            callMethod(klass, "isSubtype", argTypes, term1218802, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


