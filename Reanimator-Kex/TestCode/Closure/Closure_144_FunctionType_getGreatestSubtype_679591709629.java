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

public class FunctionType_getGreatestSubtype_679591709629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term623967;
     Object term624329;

    public FunctionType_getGreatestSubtype_679591709629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term625049 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term625048 = ((Class) term625049).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term625048).setAccessible(true);
        Object enum1127 = ((Field) term625048).get((Object) null);
        term623967 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term624219 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term623967, term623967.getClass(), "kind", enum1127);
        setField(term623967, term623967.getClass(), "registry", term624219);
        term624329 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term624329, term624329.getClass(), "kind", enum1127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term624329;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term623967, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


