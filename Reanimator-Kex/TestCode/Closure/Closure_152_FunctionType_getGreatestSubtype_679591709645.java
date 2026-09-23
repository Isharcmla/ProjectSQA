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

public class FunctionType_getGreatestSubtype_679591709645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term649829;
     Object term650383;

    public FunctionType_getGreatestSubtype_679591709645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term651232 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term651231 = ((Class) term651232).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term651231).setAccessible(true);
        Object enum1000 = ((Field) term651231).get((Object) null);
        term649829 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term649829, term649829.getClass(), "kind", enum1000);
        term650383 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term650383, term650383.getClass(), "kind", enum1000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term650383;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term649829, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


