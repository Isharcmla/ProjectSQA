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

public class FunctionType_getLeastSupertype_418850886879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1056275;
     Object term1056643;

    public FunctionType_getLeastSupertype_418850886879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1057740 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1057739 = ((Class) term1057740).getDeclaredField((String) "ORDINARY");
        ((Field) term1057739).setAccessible(true);
        Object enum1909 = ((Field) term1057739).get((Object) null);
        term1056275 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1056533 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1056275, term1056275.getClass(), "kind", enum1909);
        setField(term1056275, term1056275.getClass(), "typeOfThis", term1056533);
        Class<? extends Object> term1058031 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1058030 = ((Class) term1058031).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1058030).setAccessible(true);
        Object enum1910 = ((Field) term1058030).get((Object) null);
        term1056643 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1056643, term1056643.getClass(), "kind", enum1910);
        setField(term1056643, term1056643.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1056643;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term1056275, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


