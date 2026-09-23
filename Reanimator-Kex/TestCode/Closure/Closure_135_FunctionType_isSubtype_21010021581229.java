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

public class FunctionType_isSubtype_21010021581229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1515367;
     Object term1516029;

    public FunctionType_isSubtype_21010021581229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1517201 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1517200 = ((Class) term1517201).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1517200).setAccessible(true);
        Object enum2832 = ((Field) term1517200).get((Object) null);
        Class<? extends Object> term1517501 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1517500 = ((Class) term1517501).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1517500).setAccessible(true);
        Object enum2833 = ((Field) term1517500).get((Object) null);
        term1515367 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1515919 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1515367, term1515367.getClass(), "kind", enum2832);
        setField(term1515919, term1515919.getClass(), "kind", enum2833);
        setField(term1515367, term1515367.getClass(), "typeOfThis", term1515919);
        term1516029 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1516211 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1516029, term1516029.getClass(), "kind", enum2833);
        setField(term1516029, term1516029.getClass(), "typeOfThis", term1516211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1516029;
        try {
            callMethod(klass, "isSubtype", argTypes, term1515367, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


