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

public class FunctionType_getGreatestSubtype_6795917091115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1469490;
     Object term1470154;

    public FunctionType_getGreatestSubtype_6795917091115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1471146 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1471145 = ((Class) term1471146).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1471145).setAccessible(true);
        Object enum2631 = ((Field) term1471145).get((Object) null);
        term1469490 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1470044 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1469490, term1469490.getClass(), "kind", enum2631);
        setField(term1469490, term1469490.getClass(), "typeOfThis", term1470044);
        term1470154 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1470486 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1470154, term1470154.getClass(), "kind", enum2631);
        setField(term1470154, term1470154.getClass(), "typeOfThis", term1470486);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1470154;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1469490, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


