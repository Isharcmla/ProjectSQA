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

public class FunctionType_isSubtype_21010021581419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2023189;
     Object term2023539;

    public FunctionType_isSubtype_21010021581419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2024390 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2024389 = ((Class) term2024390).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2024389).setAccessible(true);
        Object enum3596 = ((Field) term2024389).get((Object) null);
        term2023189 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2023431 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2023189, term2023189.getClass(), "kind", enum3596);
        setField(term2023189, term2023189.getClass(), "call", term2023431);
        term2023539 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2023707 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2023539, term2023539.getClass(), "kind", enum3596);
        setField(term2023539, term2023539.getClass(), "call", term2023707);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2023539;
        try {
            callMethod(klass, "isSubtype", argTypes, term2023189, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


