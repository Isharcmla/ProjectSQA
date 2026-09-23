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

public class FunctionType_getLeastSupertype_418850886527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term465718;
     Object term465976;

    public FunctionType_getLeastSupertype_418850886527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term467058 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term467057 = ((Class) term467058).getDeclaredField((String) "INTERFACE");
        ((Field) term467057).setAccessible(true);
        Object enum850 = ((Field) term467057).get((Object) null);
        term465718 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term465718, term465718.getClass(), "kind", enum850);
        Class<? extends Object> term467352 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term467351 = ((Class) term467352).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term467351).setAccessible(true);
        Object enum851 = ((Field) term467351).get((Object) null);
        term465976 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term465976, term465976.getClass(), "kind", enum851);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term465976;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term465718, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


