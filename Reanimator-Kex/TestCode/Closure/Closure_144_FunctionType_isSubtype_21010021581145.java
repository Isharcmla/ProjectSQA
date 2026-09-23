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

public class FunctionType_isSubtype_21010021581145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1523302;
     Object term1523890;

    public FunctionType_isSubtype_21010021581145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1525501 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1525500 = ((Class) term1525501).getDeclaredField((String) "ORDINARY");
        ((Field) term1525500).setAccessible(true);
        Object enum2721 = ((Field) term1525500).get((Object) null);
        term1523302 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1523550 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1523658 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1523782 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term1523302, term1523302.getClass(), "kind", enum2721);
        setField(term1523550, term1523550.getClass(), "kind", enum2721);
        setField(term1523658, term1523658.getClass(), "kind", enum2721);
        setField(term1523658, term1523658.getClass(), "typeOfThis", term1523782);
        setField(term1523550, term1523550.getClass(), "typeOfThis", term1523658);
        setField(term1523302, term1523302.getClass(), "typeOfThis", term1523550);
        Class<? extends Object> term1525792 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1525791 = ((Class) term1525792).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1525791).setAccessible(true);
        Object enum2722 = ((Field) term1525791).get((Object) null);
        term1523890 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1524148 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1524258 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1523890, term1523890.getClass(), "kind", enum2722);
        setField(term1524148, term1524148.getClass(), "kind", enum2722);
        setField(term1524258, term1524258.getClass(), "kind", enum2722);
        setField(term1524258, term1524258.getClass(), "typeOfThis", null);
        setField(term1524148, term1524148.getClass(), "typeOfThis", term1524258);
        setField(term1523890, term1523890.getClass(), "typeOfThis", term1524148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1523890;
        try {
            callMethod(klass, "isSubtype", argTypes, term1523302, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


