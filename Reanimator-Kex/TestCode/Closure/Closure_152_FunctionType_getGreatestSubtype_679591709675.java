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

public class FunctionType_getGreatestSubtype_679591709675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term694112;
     Object term694764;

    public FunctionType_getGreatestSubtype_679591709675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term695633 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term695632 = ((Class) term695633).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term695632).setAccessible(true);
        Object enum1056 = ((Field) term695632).get((Object) null);
        term694112 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term694654 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term694112, term694112.getClass(), "kind", enum1056);
        setField(term694112, term694112.getClass(), "typeOfThis", term694654);
        term694764 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term694764, term694764.getClass(), "kind", enum1056);
        setField(term694764, term694764.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term694764;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term694112, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


