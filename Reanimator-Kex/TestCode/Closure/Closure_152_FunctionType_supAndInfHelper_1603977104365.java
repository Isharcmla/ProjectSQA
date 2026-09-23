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

public class FunctionType_supAndInfHelper_1603977104365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259065;
     Object term259729;

    public FunctionType_supAndInfHelper_1603977104365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term260752 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term260751 = ((Class) term260752).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term260751).setAccessible(true);
        Object enum455 = ((Field) term260751).get((Object) null);
        term259065 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term259619 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term259065, term259065.getClass(), "kind", enum455);
        setField(term259065, term259065.getClass(), "typeOfThis", term259619);
        Class<? extends Object> term261052 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term261051 = ((Class) term261052).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term261051).setAccessible(true);
        Object enum456 = ((Field) term261051).get((Object) null);
        term259729 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term259729, term259729.getClass(), "kind", enum456);
        setField(term259729, term259729.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term259729;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term259065, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


