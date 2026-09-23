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

public class FunctionType_supAndInfHelper_1603977104473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term396529;
     Object term397183;

    public FunctionType_supAndInfHelper_1603977104473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term399346 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term399345 = ((Class) term399346).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term399345).setAccessible(true);
        Object enum722 = ((Field) term399345).get((Object) null);
        term396529 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term397073 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term396529, term396529.getClass(), "kind", enum722);
        setField(term396529, term396529.getClass(), "typeOfThis", term397073);
        term397183 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term397183, term397183.getClass(), "kind", enum722);
        setField(term397183, term397183.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term397183;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term396529, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


