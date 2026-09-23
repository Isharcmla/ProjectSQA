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

public class FunctionType_clearCachedValues_1343537339365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332319;

    public FunctionType_clearCachedValues_1343537339365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term332371 = new ArrayList();
        Class<? extends Object> term333117 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term333116 = ((Class) term333117).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term333116).setAccessible(true);
        Object enum574 = ((Field) term333116).get((Object) null);
        term332319 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term332319, term332319.getClass(), "unknown", false);
        setField(term332319, term332319.getClass(), "subTypes", term332371);
        setBooleanField(term332319, term332319.getClass(), "nativeType", false);
        setField(term332319, term332319.getClass(), "kind", enum574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clearCachedValues", argTypes, term332319, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


