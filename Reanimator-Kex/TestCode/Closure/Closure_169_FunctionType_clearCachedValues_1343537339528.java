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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class FunctionType_clearCachedValues_1343537339528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term495052;

    public FunctionType_clearCachedValues_1343537339528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term495104 = new ArrayList();
        Class<? extends Object> term496461 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term496460 = ((Class) term496461).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term496460).setAccessible(true);
        Object enum809 = ((Field) term496460).get((Object) null);
        Class<? extends Object> term496761 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term496760 = ((Class) term496761).getDeclaredField((String) "INTERFACE");
        ((Field) term496760).setAccessible(true);
        Object enum810 = ((Field) term496760).get((Object) null);
        term495052 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term495356 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setBooleanField(term495052, term495052.getClass(), "unknown", false);
        setField(term495052, term495052.getClass(), "subTypes", term495104);
        setBooleanField(term495052, term495052.getClass(), "nativeType", false);
        setField(term495052, term495052.getClass(), "kind", enum809);
        setBooleanField(term495356, term495356.getClass(), "unknown", false);
        setField(term495356, term495356.getClass(), "subTypes", null);
        setBooleanField(term495356, term495356.getClass(), "nativeType", false);
        setField(term495356, term495356.getClass(), "kind", enum810);
        setField(term495052, term495052.getClass(), "typeOfThis", term495356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clearCachedValues", argTypes, term495052, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


