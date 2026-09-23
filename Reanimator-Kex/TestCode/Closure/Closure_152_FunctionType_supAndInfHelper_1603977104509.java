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

public class FunctionType_supAndInfHelper_1603977104509 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term459818;
     Object term460427;

    public FunctionType_supAndInfHelper_1603977104509() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term461306 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term461305 = ((Class) term461306).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term461305).setAccessible(true);
        Object enum753 = ((Field) term461305).get((Object) null);
        term459818 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        term460427 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term459818, term459818.getClass(), "kind", enum753);
        setField(term460427, term460427.getClass(), "kind", enum753);
        setField(term460427, term460427.getClass(), "typeOfThis", null);
        setField(term459818, term459818.getClass(), "typeOfThis", term460427);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term460427;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term459818, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


