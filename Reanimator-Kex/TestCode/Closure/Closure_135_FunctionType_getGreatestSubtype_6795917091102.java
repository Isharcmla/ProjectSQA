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

public class FunctionType_getGreatestSubtype_6795917091102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1288214;
     Object term1288470;

    public FunctionType_getGreatestSubtype_6795917091102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1290696 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1290695 = ((Class) term1290696).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1290695).setAccessible(true);
        Object enum2404 = ((Field) term1290695).get((Object) null);
        term1288214 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1288214, term1288214.getClass(), "kind", enum2404);
        Class<? extends Object> term1290996 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1290995 = ((Class) term1290996).getDeclaredField((String) "ORDINARY");
        ((Field) term1290995).setAccessible(true);
        Object enum2405 = ((Field) term1290995).get((Object) null);
        term1288470 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1288470, term1288470.getClass(), "kind", enum2405);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1288470;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1288214, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


