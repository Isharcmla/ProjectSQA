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

public class FunctionType_isSubtype_21010021581354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1901448;
     Object term1902226;

    public FunctionType_isSubtype_21010021581354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1906723 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1906722 = ((Class) term1906723).getDeclaredField((String) "ORDINARY");
        ((Field) term1906722).setAccessible(true);
        Object enum3376 = ((Field) term1906722).get((Object) null);
        term1901448 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1901992 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1902116 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term1901448, term1901448.getClass(), "kind", enum3376);
        setField(term1901992, term1901992.getClass(), "kind", enum3376);
        setField(term1901992, term1901992.getClass(), "typeOfThis", term1902116);
        setField(term1901448, term1901448.getClass(), "typeOfThis", term1901992);
        Class<? extends Object> term1907014 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1907013 = ((Class) term1907014).getDeclaredField((String) "INTERFACE");
        ((Field) term1907013).setAccessible(true);
        Object enum3377 = ((Field) term1907013).get((Object) null);
        term1902226 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1902558 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1902226, term1902226.getClass(), "kind", enum3376);
        setField(term1902558, term1902558.getClass(), "kind", enum3377);
        setField(term1902558, term1902558.getClass(), "typeOfThis", null);
        setField(term1902226, term1902226.getClass(), "typeOfThis", term1902558);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1902226;
        try {
            callMethod(klass, "isSubtype", argTypes, term1901448, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


