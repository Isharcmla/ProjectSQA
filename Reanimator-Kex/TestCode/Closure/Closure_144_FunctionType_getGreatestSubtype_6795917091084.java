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

public class FunctionType_getGreatestSubtype_6795917091084 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1414901;
     Object term1415543;

    public FunctionType_getGreatestSubtype_6795917091084() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1418621 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1418620 = ((Class) term1418621).getDeclaredField((String) "INTERFACE");
        ((Field) term1418620).setAccessible(true);
        Object enum2541 = ((Field) term1418620).get((Object) null);
        Class<? extends Object> term1418915 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1418914 = ((Class) term1418915).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1418914).setAccessible(true);
        Object enum2542 = ((Field) term1418914).get((Object) null);
        term1414901 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1415433 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1414901, term1414901.getClass(), "kind", enum2541);
        setField(term1415433, term1415433.getClass(), "kind", enum2542);
        setField(term1414901, term1414901.getClass(), "typeOfThis", term1415433);
        term1415543 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1415717 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1415543, term1415543.getClass(), "kind", enum2542);
        setField(term1415543, term1415543.getClass(), "typeOfThis", term1415717);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1415543;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1414901, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


