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

public class FunctionType_getGreatestSubtype_679591709317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178581;
     Object term179133;

    public FunctionType_getGreatestSubtype_679591709317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term180128 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term180127 = ((Class) term180128).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term180127).setAccessible(true);
        Object enum329 = ((Field) term180127).get((Object) null);
        term178581 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term178581, term178581.getClass(), "kind", enum329);
        Class<? extends Object> term180428 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term180427 = ((Class) term180428).getDeclaredField((String) "INTERFACE");
        ((Field) term180427).setAccessible(true);
        Object enum330 = ((Field) term180427).get((Object) null);
        term179133 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term179133, term179133.getClass(), "kind", enum330);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term179133;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term178581, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


