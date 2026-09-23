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

public class FunctionType_supAndInfHelper_1603977104423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332898;
     Object term333558;

    public FunctionType_supAndInfHelper_1603977104423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term334412 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term334411 = ((Class) term334412).getDeclaredField((String) "INTERFACE");
        ((Field) term334411).setAccessible(true);
        Object enum606 = ((Field) term334411).get((Object) null);
        term332898 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term333448 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term332898, term332898.getClass(), "kind", enum606);
        setField(term332898, term332898.getClass(), "typeOfThis", term333448);
        term333558 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term333558, term333558.getClass(), "kind", enum606);
        setField(term333558, term333558.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term333558;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term332898, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


