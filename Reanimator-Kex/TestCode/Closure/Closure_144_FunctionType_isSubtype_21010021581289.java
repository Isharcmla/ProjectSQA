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

public class FunctionType_isSubtype_21010021581289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1783979;
     Object term1784633;

    public FunctionType_isSubtype_21010021581289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1786238 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1786237 = ((Class) term1786238).getDeclaredField((String) "INTERFACE");
        ((Field) term1786237).setAccessible(true);
        Object enum3176 = ((Field) term1786237).get((Object) null);
        Class<? extends Object> term1786532 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1786531 = ((Class) term1786532).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1786531).setAccessible(true);
        Object enum3177 = ((Field) term1786531).get((Object) null);
        term1783979 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1784523 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1783979, term1783979.getClass(), "kind", enum3176);
        setField(term1784523, term1784523.getClass(), "kind", enum3177);
        setField(term1784523, term1784523.getClass(), "typeOfThis", null);
        setField(term1783979, term1783979.getClass(), "typeOfThis", term1784523);
        term1784633 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1784965 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1785071 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term1784633, term1784633.getClass(), "kind", enum3176);
        setField(term1784965, term1784965.getClass(), "kind", enum3176);
        setField(term1784965, term1784965.getClass(), "typeOfThis", term1785071);
        setField(term1784633, term1784633.getClass(), "typeOfThis", term1784965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1784633;
        try {
            callMethod(klass, "isSubtype", argTypes, term1783979, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


