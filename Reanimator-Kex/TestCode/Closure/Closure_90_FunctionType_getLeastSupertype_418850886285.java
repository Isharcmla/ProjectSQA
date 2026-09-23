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

public class FunctionType_getLeastSupertype_418850886285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175534;
     Object term176088;

    public FunctionType_getLeastSupertype_418850886285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term177102 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term177101 = ((Class) term177102).getDeclaredField((String) "INTERFACE");
        ((Field) term177101).setAccessible(true);
        Object enum323 = ((Field) term177101).get((Object) null);
        term175534 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term175534, term175534.getClass(), "kind", enum323);
        setField(term175534, term175534.getClass(), "typeOfThis", term175534);
        Class<? extends Object> term177396 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term177395 = ((Class) term177396).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term177395).setAccessible(true);
        Object enum324 = ((Field) term177395).get((Object) null);
        term176088 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term176088, term176088.getClass(), "kind", enum324);
        setField(term176088, term176088.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term176088;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term175534, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


