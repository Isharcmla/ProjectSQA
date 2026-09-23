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

public class FunctionType_isSubtype_21010021581475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1926479;
     Object term1926937;

    public FunctionType_isSubtype_21010021581475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1928515 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1928514 = ((Class) term1928515).getDeclaredField((String) "ORDINARY");
        ((Field) term1928514).setAccessible(true);
        Object enum3588 = ((Field) term1928514).get((Object) null);
        term1926479 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1926727 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1926827 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1926479, term1926479.getClass(), "kind", enum3588);
        setField(term1926727, term1926727.getClass(), "kind", enum3588);
        setField(term1926727, term1926727.getClass(), "typeOfThis", term1926827);
        setField(term1926479, term1926479.getClass(), "typeOfThis", term1926727);
        Class<? extends Object> term1928806 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1928805 = ((Class) term1928806).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1928805).setAccessible(true);
        Object enum3589 = ((Field) term1928805).get((Object) null);
        term1926937 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1927119 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1926937, term1926937.getClass(), "kind", enum3588);
        setField(term1927119, term1927119.getClass(), "kind", enum3589);
        setField(term1927119, term1927119.getClass(), "typeOfThis", null);
        setField(term1926937, term1926937.getClass(), "typeOfThis", term1927119);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1926937;
        try {
            callMethod(klass, "isSubtype", argTypes, term1926479, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


