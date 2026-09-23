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

public class FunctionType_isSubtype_21010021581455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1892740;
     Object term1893392;

    public FunctionType_isSubtype_21010021581455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1894877 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1894876 = ((Class) term1894877).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1894876).setAccessible(true);
        Object enum3529 = ((Field) term1894876).get((Object) null);
        Class<? extends Object> term1895177 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1895176 = ((Class) term1895177).getDeclaredField((String) "INTERFACE");
        ((Field) term1895176).setAccessible(true);
        Object enum3530 = ((Field) term1895176).get((Object) null);
        term1892740 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1893284 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1892740, term1892740.getClass(), "kind", enum3529);
        setField(term1893284, term1893284.getClass(), "kind", enum3530);
        setField(term1892740, term1892740.getClass(), "typeOfThis", term1893284);
        term1893392 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1893722 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1893392, term1893392.getClass(), "kind", enum3529);
        setField(term1893722, term1893722.getClass(), "kind", enum3529);
        setField(term1893392, term1893392.getClass(), "typeOfThis", term1893722);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1893392;
        try {
            callMethod(klass, "isSubtype", argTypes, term1892740, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


