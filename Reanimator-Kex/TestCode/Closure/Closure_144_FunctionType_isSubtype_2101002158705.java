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

public class FunctionType_isSubtype_2101002158705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term746634;
     Object term747100;

    public FunctionType_isSubtype_2101002158705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term748417 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term748416 = ((Class) term748417).getDeclaredField((String) "ORDINARY");
        ((Field) term748416).setAccessible(true);
        Object enum1344 = ((Field) term748416).get((Object) null);
        term746634 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term746882 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term746992 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term746634, term746634.getClass(), "kind", enum1344);
        setField(term746882, term746882.getClass(), "kind", enum1344);
        setField(term746882, term746882.getClass(), "typeOfThis", term746992);
        setField(term746634, term746634.getClass(), "typeOfThis", term746882);
        Class<? extends Object> term748708 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term748707 = ((Class) term748708).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term748707).setAccessible(true);
        Object enum1345 = ((Field) term748707).get((Object) null);
        term747100 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term747284 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term747100, term747100.getClass(), "kind", enum1344);
        setField(term747284, term747284.getClass(), "kind", enum1345);
        setField(term747284, term747284.getClass(), "typeOfThis", null);
        setField(term747100, term747100.getClass(), "typeOfThis", term747284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term747100;
        try {
            callMethod(klass, "isSubtype", argTypes, term746634, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


