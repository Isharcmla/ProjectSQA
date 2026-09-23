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

public class FunctionType_getGreatestSubtype_6795917091126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1488565;
     Object term1489274;

    public FunctionType_getGreatestSubtype_6795917091126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1492557 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1492556 = ((Class) term1492557).getDeclaredField((String) "INTERFACE");
        ((Field) term1492556).setAccessible(true);
        Object enum2662 = ((Field) term1492556).get((Object) null);
        Class<? extends Object> term1492851 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1492850 = ((Class) term1492851).getDeclaredField((String) "INTERFACE");
        ((Field) term1492850).setAccessible(true);
        Object enum2663 = ((Field) term1492850).get((Object) null);
        term1488565 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        term1489274 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1489546 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1488565, term1488565.getClass(), "kind", enum2662);
        setField(term1489274, term1489274.getClass(), "kind", enum2662);
        setField(term1489546, term1489546.getClass(), "kind", enum2663);
        setField(term1489274, term1489274.getClass(), "typeOfThis", term1489546);
        setField(term1488565, term1488565.getClass(), "typeOfThis", term1489274);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1489274;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1488565, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


