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

public class FunctionType_isSubtype_21010021581362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1916235;
     Object term1916899;

    public FunctionType_isSubtype_21010021581362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1919987 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1919986 = ((Class) term1919987).getDeclaredField((String) "ORDINARY");
        ((Field) term1919986).setAccessible(true);
        Object enum3399 = ((Field) term1919986).get((Object) null);
        Class<? extends Object> term1920278 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1920277 = ((Class) term1920278).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1920277).setAccessible(true);
        Object enum3400 = ((Field) term1920277).get((Object) null);
        term1916235 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1917176 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1916235, term1916235.getClass(), "kind", enum3399);
        setField(term1917176, term1917176.getClass(), "kind", enum3400);
        setField(term1916235, term1916235.getClass(), "typeOfThis", term1917176);
        term1916899 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1916899, term1916899.getClass(), "kind", enum3399);
        setField(term1916899, term1916899.getClass(), "typeOfThis", term1917176);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1916899;
        try {
            callMethod(klass, "isSubtype", argTypes, term1916235, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


