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

public class FunctionType_isSubtype_21010021581387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1784623;
     Object term1785275;

    public FunctionType_isSubtype_21010021581387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1786521 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1786520 = ((Class) term1786521).getDeclaredField((String) "INTERFACE");
        ((Field) term1786520).setAccessible(true);
        Object enum3330 = ((Field) term1786520).get((Object) null);
        term1784623 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1785167 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1784623, term1784623.getClass(), "kind", enum3330);
        setField(term1785167, term1785167.getClass(), "kind", enum3330);
        setField(term1785167, term1785167.getClass(), "typeOfThis", term1785167);
        setField(term1785167, term1785167.getClass(), "call", null);
        setField(term1784623, term1784623.getClass(), "typeOfThis", term1785167);
        term1785275 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1785605 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1785699 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1785275, term1785275.getClass(), "kind", enum3330);
        setField(term1785605, term1785605.getClass(), "kind", enum3330);
        setField(term1785605, term1785605.getClass(), "typeOfThis", null);
        setField(term1785605, term1785605.getClass(), "call", term1785699);
        setField(term1785275, term1785275.getClass(), "typeOfThis", term1785605);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1785275;
        try {
            callMethod(klass, "isSubtype", argTypes, term1784623, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


