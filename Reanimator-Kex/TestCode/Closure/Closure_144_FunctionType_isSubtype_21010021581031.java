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

public class FunctionType_isSubtype_21010021581031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1319871;
     Object term1320625;

    public FunctionType_isSubtype_21010021581031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1323779 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1323778 = ((Class) term1323779).getDeclaredField((String) "ORDINARY");
        ((Field) term1323778).setAccessible(true);
        Object enum2372 = ((Field) term1323778).get((Object) null);
        term1319871 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1320415 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1320515 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1319871, term1319871.getClass(), "kind", enum2372);
        setField(term1320415, term1320415.getClass(), "kind", enum2372);
        setField(term1320415, term1320415.getClass(), "typeOfThis", term1320515);
        setField(term1319871, term1319871.getClass(), "typeOfThis", term1320415);
        term1320625 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1320957 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1320625, term1320625.getClass(), "kind", enum2372);
        setField(term1320957, term1320957.getClass(), "kind", enum2372);
        setField(term1320957, term1320957.getClass(), "typeOfThis", null);
        setField(term1320625, term1320625.getClass(), "typeOfThis", term1320957);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1320625;
        try {
            callMethod(klass, "isSubtype", argTypes, term1319871, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


