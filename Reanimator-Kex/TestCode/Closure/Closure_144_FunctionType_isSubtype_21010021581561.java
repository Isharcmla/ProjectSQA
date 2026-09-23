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

public class FunctionType_isSubtype_21010021581561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2285041;
     Object term2285487;

    public FunctionType_isSubtype_21010021581561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2286505 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2286504 = ((Class) term2286505).getDeclaredField((String) "ORDINARY");
        ((Field) term2286504).setAccessible(true);
        Object enum4079 = ((Field) term2286504).get((Object) null);
        term2285041 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2285289 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2285377 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term2285041, term2285041.getClass(), "kind", enum4079);
        setField(term2285289, term2285289.getClass(), "kind", enum4079);
        setField(term2285289, term2285289.getClass(), "typeOfThis", term2285377);
        setField(term2285041, term2285041.getClass(), "typeOfThis", term2285289);
        term2285487 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2285669 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2285487, term2285487.getClass(), "kind", enum4079);
        setField(term2285669, term2285669.getClass(), "kind", enum4079);
        setField(term2285669, term2285669.getClass(), "typeOfThis", null);
        setField(term2285487, term2285487.getClass(), "typeOfThis", term2285669);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2285487;
        try {
            callMethod(klass, "isSubtype", argTypes, term2285041, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


