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

public class FunctionType_getGreatestSubtype_679591709405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312873;
     Object term313525;

    public FunctionType_getGreatestSubtype_679591709405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term314379 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term314378 = ((Class) term314379).getDeclaredField((String) "ORDINARY");
        ((Field) term314378).setAccessible(true);
        Object enum540 = ((Field) term314378).get((Object) null);
        term312873 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term313415 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term312873, term312873.getClass(), "kind", enum540);
        setField(term312873, term312873.getClass(), "typeOfThis", term313415);
        term313525 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term313525, term313525.getClass(), "kind", enum540);
        setField(term313525, term313525.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term313525;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term312873, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


