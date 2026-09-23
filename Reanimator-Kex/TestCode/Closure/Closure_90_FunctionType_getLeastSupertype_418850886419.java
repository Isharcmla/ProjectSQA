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

public class FunctionType_getLeastSupertype_418850886419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323879;
     Object term324137;

    public FunctionType_getLeastSupertype_418850886419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term325433 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term325432 = ((Class) term325433).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term325432).setAccessible(true);
        Object enum560 = ((Field) term325432).get((Object) null);
        term323879 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term323879, term323879.getClass(), "kind", enum560);
        Class<? extends Object> term325733 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term325732 = ((Class) term325733).getDeclaredField((String) "ORDINARY");
        ((Field) term325732).setAccessible(true);
        Object enum561 = ((Field) term325732).get((Object) null);
        term324137 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term324137, term324137.getClass(), "kind", enum561);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term324137;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term323879, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


