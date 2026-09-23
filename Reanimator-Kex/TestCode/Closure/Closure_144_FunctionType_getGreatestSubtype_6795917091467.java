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

public class FunctionType_getGreatestSubtype_6795917091467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2116577;
     Object term2117255;

    public FunctionType_getGreatestSubtype_6795917091467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2118553 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2118552 = ((Class) term2118553).getDeclaredField((String) "INTERFACE");
        ((Field) term2118552).setAccessible(true);
        Object enum3773 = ((Field) term2118552).get((Object) null);
        term2116577 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2117145 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term2116577, term2116577.getClass(), "kind", enum3773);
        setField(term2116577, term2116577.getClass(), "typeOfThis", term2117145);
        Class<? extends Object> term2118847 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2118846 = ((Class) term2118847).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2118846).setAccessible(true);
        Object enum3774 = ((Field) term2118846).get((Object) null);
        term2117255 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2117439 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2117255, term2117255.getClass(), "kind", enum3774);
        setField(term2117439, term2117439.getClass(), "kind", enum3773);
        setField(term2117439, term2117439.getClass(), "typeOfThis", null);
        setField(term2117255, term2117255.getClass(), "typeOfThis", term2117439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2117255;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term2116577, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


