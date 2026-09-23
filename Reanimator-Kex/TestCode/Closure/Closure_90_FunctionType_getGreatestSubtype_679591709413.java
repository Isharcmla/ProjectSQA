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

public class FunctionType_getGreatestSubtype_679591709413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317021;
     Object term317673;

    public FunctionType_getGreatestSubtype_679591709413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term318520 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term318519 = ((Class) term318520).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term318519).setAccessible(true);
        Object enum548 = ((Field) term318519).get((Object) null);
        term317021 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term317563 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term317021, term317021.getClass(), "kind", enum548);
        setField(term317021, term317021.getClass(), "typeOfThis", term317563);
        term317673 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term317673, term317673.getClass(), "kind", enum548);
        setField(term317673, term317673.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term317673;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term317021, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


