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

public class FunctionType_supAndInfHelper_1603977104242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134503;
     Object term134761;

    public FunctionType_supAndInfHelper_1603977104242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term136750 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term136749 = ((Class) term136750).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term136749).setAccessible(true);
        Object enum259 = ((Field) term136749).get((Object) null);
        term134503 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term134503, term134503.getClass(), "kind", enum259);
        term134761 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term134761;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term134503, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


