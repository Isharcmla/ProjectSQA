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

public class FunctionType_getLeastSupertype_418850886476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term400441;
     Object term401083;

    public FunctionType_getLeastSupertype_418850886476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term403488 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term403487 = ((Class) term403488).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term403487).setAccessible(true);
        Object enum728 = ((Field) term403487).get((Object) null);
        term400441 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term400973 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term400441, term400441.getClass(), "kind", enum728);
        setField(term400441, term400441.getClass(), "typeOfThis", term400973);
        Class<? extends Object> term403788 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term403787 = ((Class) term403788).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term403787).setAccessible(true);
        Object enum729 = ((Field) term403787).get((Object) null);
        term401083 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term401083, term401083.getClass(), "kind", enum729);
        setField(term401083, term401083.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term401083;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term400441, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


