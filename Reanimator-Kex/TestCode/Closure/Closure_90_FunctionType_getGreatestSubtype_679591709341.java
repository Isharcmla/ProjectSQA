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

public class FunctionType_getGreatestSubtype_679591709341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230601;
     Object term230971;

    public FunctionType_getGreatestSubtype_679591709341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term232058 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term232057 = ((Class) term232058).getDeclaredField((String) "ORDINARY");
        ((Field) term232057).setAccessible(true);
        Object enum405 = ((Field) term232057).get((Object) null);
        term230601 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term230861 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term230601, term230601.getClass(), "kind", enum405);
        setField(term230601, term230601.getClass(), "typeOfThis", term230861);
        Class<? extends Object> term232349 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term232348 = ((Class) term232349).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term232348).setAccessible(true);
        Object enum406 = ((Field) term232348).get((Object) null);
        term230971 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term230971, term230971.getClass(), "kind", enum406);
        setField(term230971, term230971.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term230971;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term230601, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


