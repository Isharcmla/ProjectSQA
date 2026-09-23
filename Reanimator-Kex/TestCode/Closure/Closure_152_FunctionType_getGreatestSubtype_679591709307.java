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

public class FunctionType_getGreatestSubtype_679591709307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188338;
     Object term188892;

    public FunctionType_getGreatestSubtype_679591709307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term189900 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term189899 = ((Class) term189900).getDeclaredField((String) "INTERFACE");
        ((Field) term189899).setAccessible(true);
        Object enum344 = ((Field) term189899).get((Object) null);
        term188338 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term188338, term188338.getClass(), "kind", enum344);
        Class<? extends Object> term190194 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term190193 = ((Class) term190194).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term190193).setAccessible(true);
        Object enum345 = ((Field) term190193).get((Object) null);
        term188892 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term188892, term188892.getClass(), "kind", enum345);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term188892;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term188338, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


