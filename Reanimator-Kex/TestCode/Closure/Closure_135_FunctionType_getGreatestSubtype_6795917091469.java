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

public class FunctionType_getGreatestSubtype_6795917091469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1916716;
     Object term1917170;

    public FunctionType_getGreatestSubtype_6795917091469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1918520 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1918519 = ((Class) term1918520).getDeclaredField((String) "ORDINARY");
        ((Field) term1918519).setAccessible(true);
        Object enum3570 = ((Field) term1918519).get((Object) null);
        term1916716 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1916964 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1917062 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term1916716, term1916716.getClass(), "kind", enum3570);
        setField(term1916964, term1916964.getClass(), "kind", enum3570);
        setField(term1916964, term1916964.getClass(), "typeOfThis", term1917062);
        setField(term1916716, term1916716.getClass(), "typeOfThis", term1916964);
        Class<? extends Object> term1918811 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1918810 = ((Class) term1918811).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1918810).setAccessible(true);
        Object enum3571 = ((Field) term1918810).get((Object) null);
        term1917170 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1917418 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1917170, term1917170.getClass(), "kind", enum3571);
        setField(term1917418, term1917418.getClass(), "kind", enum3570);
        setField(term1917418, term1917418.getClass(), "typeOfThis", null);
        setField(term1917170, term1917170.getClass(), "typeOfThis", term1917418);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1917170;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1916716, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


