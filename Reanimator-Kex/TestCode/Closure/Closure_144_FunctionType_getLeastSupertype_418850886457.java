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

public class FunctionType_getLeastSupertype_418850886457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379082;
     Object term379850;

    public FunctionType_getLeastSupertype_418850886457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term380856 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term380855 = ((Class) term380856).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term380855).setAccessible(true);
        Object enum687 = ((Field) term380855).get((Object) null);
        term379082 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term379636 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term379740 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term379082, term379082.getClass(), "kind", enum687);
        setField(term379082, term379082.getClass(), "typeOfThis", term379636);
        setField(term379082, term379082.getClass(), "registry", term379740);
        Class<? extends Object> term381156 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term381155 = ((Class) term381156).getDeclaredField((String) "INTERFACE");
        ((Field) term381155).setAccessible(true);
        Object enum688 = ((Field) term381155).get((Object) null);
        term379850 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term379850, term379850.getClass(), "kind", enum688);
        setField(term379850, term379850.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term379850;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term379082, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


