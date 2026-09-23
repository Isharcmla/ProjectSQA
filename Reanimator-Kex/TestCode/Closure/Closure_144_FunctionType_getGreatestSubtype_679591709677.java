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

public class FunctionType_getGreatestSubtype_679591709677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term698291;
     Object term699041;

    public FunctionType_getGreatestSubtype_679591709677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term700057 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term700056 = ((Class) term700057).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term700056).setAccessible(true);
        Object enum1256 = ((Field) term700056).get((Object) null);
        term698291 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term698827 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        Object term698931 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term698291, term698291.getClass(), "kind", enum1256);
        setField(term698291, term698291.getClass(), "typeOfThis", term698827);
        setField(term698291, term698291.getClass(), "registry", term698931);
        Class<? extends Object> term700357 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term700356 = ((Class) term700357).getDeclaredField((String) "INTERFACE");
        ((Field) term700356).setAccessible(true);
        Object enum1257 = ((Field) term700356).get((Object) null);
        term699041 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term699041, term699041.getClass(), "kind", enum1257);
        setField(term699041, term699041.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term699041;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term698291, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


