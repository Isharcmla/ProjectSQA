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

public class FunctionType_getLeastSupertype_418850886437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term347137;
     Object term347843;

    public FunctionType_getLeastSupertype_418850886437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term349233 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term349232 = ((Class) term349233).getDeclaredField((String) "ORDINARY");
        ((Field) term349232).setAccessible(true);
        Object enum596 = ((Field) term349232).get((Object) null);
        Class<? extends Object> term349524 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term349523 = ((Class) term349524).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term349523).setAccessible(true);
        Object enum597 = ((Field) term349523).get((Object) null);
        term347137 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term347385 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term347967 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term348091 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term347137, term347137.getClass(), "kind", enum596);
        setField(term347385, term347385.getClass(), "kind", enum596);
        setField(term347967, term347967.getClass(), "kind", enum597);
        setField(term347967, term347967.getClass(), "typeOfThis", term348091);
        setField(term347385, term347385.getClass(), "typeOfThis", term347967);
        setField(term347137, term347137.getClass(), "typeOfThis", term347385);
        term347843 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term347843, term347843.getClass(), "kind", enum596);
        setField(term347843, term347843.getClass(), "typeOfThis", term347967);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term347843;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term347137, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


