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

public class FunctionType_isSubtype_21010021581211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1480366;
     Object term1481118;

    public FunctionType_isSubtype_21010021581211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1484381 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1484380 = ((Class) term1484381).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1484380).setAccessible(true);
        Object enum2769 = ((Field) term1484380).get((Object) null);
        Class<? extends Object> term1484681 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1484680 = ((Class) term1484681).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1484680).setAccessible(true);
        Object enum2770 = ((Field) term1484680).get((Object) null);
        term1480366 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1480910 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1481010 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1480366, term1480366.getClass(), "kind", enum2769);
        setField(term1480910, term1480910.getClass(), "kind", enum2770);
        setField(term1480910, term1480910.getClass(), "typeOfThis", term1481010);
        setField(term1480366, term1480366.getClass(), "typeOfThis", term1480910);
        term1481118 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1481448 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1481546 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term1481118, term1481118.getClass(), "kind", enum2769);
        setField(term1481448, term1481448.getClass(), "kind", enum2770);
        setField(term1481448, term1481448.getClass(), "typeOfThis", term1481546);
        setField(term1481118, term1481118.getClass(), "typeOfThis", term1481448);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1481118;
        try {
            callMethod(klass, "isSubtype", argTypes, term1480366, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


