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

public class FunctionType_isSubtype_21010021581409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1816557;
     Object term1817309;

    public FunctionType_isSubtype_21010021581409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1818730 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1818729 = ((Class) term1818730).getDeclaredField((String) "ORDINARY");
        ((Field) term1818729).setAccessible(true);
        Object enum3389 = ((Field) term1818729).get((Object) null);
        term1816557 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1817101 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1817201 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1816557, term1816557.getClass(), "kind", enum3389);
        setField(term1817101, term1817101.getClass(), "kind", enum3389);
        setField(term1817101, term1817101.getClass(), "typeOfThis", term1817201);
        setField(term1817101, term1817101.getClass(), "call", null);
        setField(term1816557, term1816557.getClass(), "typeOfThis", term1817101);
        Class<? extends Object> term1819021 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1819020 = ((Class) term1819021).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1819020).setAccessible(true);
        Object enum3390 = ((Field) term1819020).get((Object) null);
        term1817309 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1817639 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1817733 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1817309, term1817309.getClass(), "kind", enum3389);
        setField(term1817639, term1817639.getClass(), "kind", enum3390);
        setField(term1817639, term1817639.getClass(), "typeOfThis", null);
        setField(term1817639, term1817639.getClass(), "call", term1817733);
        setField(term1817309, term1817309.getClass(), "typeOfThis", term1817639);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1817309;
        try {
            callMethod(klass, "isSubtype", argTypes, term1816557, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


