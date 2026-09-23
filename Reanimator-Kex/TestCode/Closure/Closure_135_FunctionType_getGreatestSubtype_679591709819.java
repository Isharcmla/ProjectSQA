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

public class FunctionType_getGreatestSubtype_679591709819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term827558;
     Object term828110;

    public FunctionType_getGreatestSubtype_679591709819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term828710 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term828709 = ((Class) term828710).getDeclaredField((String) "INTERFACE");
        ((Field) term828709).setAccessible(true);
        Object enum1545 = ((Field) term828709).get((Object) null);
        term827558 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term827558, term827558.getClass(), "kind", enum1545);
        term828110 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term828110;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term827558, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


