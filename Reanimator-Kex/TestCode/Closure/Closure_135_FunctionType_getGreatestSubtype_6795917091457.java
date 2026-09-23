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

public class FunctionType_getGreatestSubtype_6795917091457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1896590;
     Object term1897342;

    public FunctionType_getGreatestSubtype_6795917091457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1898359 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1898358 = ((Class) term1898359).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1898358).setAccessible(true);
        Object enum3535 = ((Field) term1898358).get((Object) null);
        term1896590 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1897142 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1897234 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term1896590, term1896590.getClass(), "kind", enum3535);
        setField(term1897142, term1897142.getClass(), "kind", enum3535);
        setField(term1897142, term1897142.getClass(), "typeOfThis", term1897234);
        setField(term1896590, term1896590.getClass(), "typeOfThis", term1897142);
        term1897342 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1897664 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1897342, term1897342.getClass(), "kind", enum3535);
        setField(term1897664, term1897664.getClass(), "kind", enum3535);
        setField(term1897664, term1897664.getClass(), "typeOfThis", null);
        setField(term1897342, term1897342.getClass(), "typeOfThis", term1897664);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1897342;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1896590, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


