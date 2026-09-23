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

public class FunctionType_getGreatestSubtype_679591709389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288883;
     Object term289547;

    public FunctionType_getGreatestSubtype_679591709389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term290315 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term290314 = ((Class) term290315).getDeclaredField((String) "INTERFACE");
        ((Field) term290314).setAccessible(true);
        Object enum533 = ((Field) term290314).get((Object) null);
        term288883 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term289437 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term288883, term288883.getClass(), "kind", enum533);
        setField(term288883, term288883.getClass(), "typeOfThis", term289437);
        term289547 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term289547, term289547.getClass(), "kind", enum533);
        setField(term289547, term289547.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term289547;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term288883, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


