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

public class FunctionType_getGreatestSubtype_679591709957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1185917;
     Object term1186581;

    public FunctionType_getGreatestSubtype_679591709957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1189037 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1189036 = ((Class) term1189037).getDeclaredField((String) "INTERFACE");
        ((Field) term1189036).setAccessible(true);
        Object enum2136 = ((Field) term1189036).get((Object) null);
        term1185917 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1186471 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term1185917, term1185917.getClass(), "kind", enum2136);
        setField(term1185917, term1185917.getClass(), "typeOfThis", term1186471);
        term1186581 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1186581, term1186581.getClass(), "kind", enum2136);
        setField(term1186581, term1186581.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1186581;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1185917, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


