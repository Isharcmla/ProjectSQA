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

public class FunctionType_isSubtype_21010021581227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1675389;
     Object term1676139;

    public FunctionType_isSubtype_21010021581227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1677575 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1677574 = ((Class) term1677575).getDeclaredField((String) "INTERFACE");
        ((Field) term1677574).setAccessible(true);
        Object enum2996 = ((Field) term1677574).get((Object) null);
        term1675389 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1675933 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1676029 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1675389, term1675389.getClass(), "kind", enum2996);
        setField(term1675933, term1675933.getClass(), "kind", enum2996);
        setField(term1675933, term1675933.getClass(), "typeOfThis", term1676029);
        setField(term1675933, term1675933.getClass(), "call", null);
        setField(term1675389, term1675389.getClass(), "typeOfThis", term1675933);
        Class<? extends Object> term1677869 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1677868 = ((Class) term1677869).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1677868).setAccessible(true);
        Object enum2997 = ((Field) term1677868).get((Object) null);
        term1676139 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1676471 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1676565 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1676139, term1676139.getClass(), "kind", enum2996);
        setField(term1676471, term1676471.getClass(), "kind", enum2997);
        setField(term1676471, term1676471.getClass(), "typeOfThis", null);
        setField(term1676471, term1676471.getClass(), "call", term1676565);
        setField(term1676139, term1676139.getClass(), "typeOfThis", term1676471);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1676139;
        try {
            callMethod(klass, "isSubtype", argTypes, term1675389, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


