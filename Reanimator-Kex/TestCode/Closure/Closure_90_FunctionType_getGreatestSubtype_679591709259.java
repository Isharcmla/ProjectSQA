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

public class FunctionType_getGreatestSubtype_679591709259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151272;
     Object term151826;

    public FunctionType_getGreatestSubtype_679591709259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term152416 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term152415 = ((Class) term152416).getDeclaredField((String) "INTERFACE");
        ((Field) term152415).setAccessible(true);
        Object enum287 = ((Field) term152415).get((Object) null);
        term151272 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term151272, term151272.getClass(), "kind", enum287);
        term151826 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term151826;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term151272, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


