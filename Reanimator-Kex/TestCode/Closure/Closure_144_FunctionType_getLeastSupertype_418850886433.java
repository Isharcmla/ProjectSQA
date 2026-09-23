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

public class FunctionType_getLeastSupertype_418850886433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344267;
     Object term344635;

    public FunctionType_getLeastSupertype_418850886433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term347374 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term347373 = ((Class) term347374).getDeclaredField((String) "ORDINARY");
        ((Field) term347373).setAccessible(true);
        Object enum630 = ((Field) term347373).get((Object) null);
        term344267 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term344525 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term344267, term344267.getClass(), "kind", enum630);
        setField(term344267, term344267.getClass(), "typeOfThis", term344525);
        Class<? extends Object> term347665 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term347664 = ((Class) term347665).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term347664).setAccessible(true);
        Object enum631 = ((Field) term347664).get((Object) null);
        term344635 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term344883 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term344635, term344635.getClass(), "kind", enum631);
        setField(term344635, term344635.getClass(), "typeOfThis", term344883);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term344635;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term344267, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


