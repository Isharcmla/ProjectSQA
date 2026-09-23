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

public class FunctionType_isSubtype_21010021581343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1885081;
     Object term1885547;

    public FunctionType_isSubtype_21010021581343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1887164 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1887163 = ((Class) term1887164).getDeclaredField((String) "ORDINARY");
        ((Field) term1887163).setAccessible(true);
        Object enum3348 = ((Field) term1887163).get((Object) null);
        term1885081 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1885329 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1885439 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1885081, term1885081.getClass(), "kind", enum3348);
        setField(term1885329, term1885329.getClass(), "kind", enum3348);
        setField(term1885329, term1885329.getClass(), "typeOfThis", term1885439);
        setField(term1885081, term1885081.getClass(), "typeOfThis", term1885329);
        Class<? extends Object> term1887455 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1887454 = ((Class) term1887455).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1887454).setAccessible(true);
        Object enum3349 = ((Field) term1887454).get((Object) null);
        term1885547 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1885805 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1885967 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1885547, term1885547.getClass(), "kind", enum3349);
        setField(term1885805, term1885805.getClass(), "kind", enum3348);
        setField(term1885805, term1885805.getClass(), "typeOfThis", term1885967);
        setField(term1885547, term1885547.getClass(), "typeOfThis", term1885805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1885547;
        try {
            callMethod(klass, "isSubtype", argTypes, term1885081, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


