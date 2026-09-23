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

public class FunctionType_supAndInfHelper_1603977104469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term392351;
     Object term392993;

    public FunctionType_supAndInfHelper_1603977104469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term394010 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term394009 = ((Class) term394010).getDeclaredField((String) "ORDINARY");
        ((Field) term394009).setAccessible(true);
        Object enum667 = ((Field) term394009).get((Object) null);
        term392351 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term392883 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term392351, term392351.getClass(), "kind", enum667);
        setField(term392351, term392351.getClass(), "typeOfThis", term392883);
        Class<? extends Object> term394301 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term394300 = ((Class) term394301).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term394300).setAccessible(true);
        Object enum668 = ((Field) term394300).get((Object) null);
        term392993 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term392993, term392993.getClass(), "kind", enum668);
        setField(term392993, term392993.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term392993;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term392351, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


