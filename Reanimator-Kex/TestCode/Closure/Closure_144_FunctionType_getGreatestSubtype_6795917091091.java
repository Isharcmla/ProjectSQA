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

public class FunctionType_getGreatestSubtype_6795917091091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1426965;
     Object term1427223;

    public FunctionType_getGreatestSubtype_6795917091091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1429842 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1429841 = ((Class) term1429842).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1429841).setAccessible(true);
        Object enum2563 = ((Field) term1429841).get((Object) null);
        term1426965 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1426965, term1426965.getClass(), "kind", enum2563);
        term1427223 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1427223, term1427223.getClass(), "kind", enum2563);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1427223;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1426965, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


