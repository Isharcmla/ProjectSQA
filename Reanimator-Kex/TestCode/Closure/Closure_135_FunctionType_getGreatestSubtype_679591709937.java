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

public class FunctionType_getGreatestSubtype_679591709937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1023480;
     Object term1024132;

    public FunctionType_getGreatestSubtype_679591709937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1025140 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1025139 = ((Class) term1025140).getDeclaredField((String) "INTERFACE");
        ((Field) term1025139).setAccessible(true);
        Object enum1910 = ((Field) term1025139).get((Object) null);
        term1023480 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1024024 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1023480, term1023480.getClass(), "kind", enum1910);
        setField(term1023480, term1023480.getClass(), "typeOfThis", term1024024);
        Class<? extends Object> term1025434 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1025433 = ((Class) term1025434).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1025433).setAccessible(true);
        Object enum1911 = ((Field) term1025433).get((Object) null);
        term1024132 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1024132, term1024132.getClass(), "kind", enum1911);
        setField(term1024132, term1024132.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1024132;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1023480, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


