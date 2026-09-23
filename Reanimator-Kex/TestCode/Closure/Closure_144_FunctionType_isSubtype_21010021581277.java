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

public class FunctionType_isSubtype_21010021581277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1764039;
     Object term1764693;

    public FunctionType_isSubtype_21010021581277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1766072 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1766071 = ((Class) term1766072).getDeclaredField((String) "ORDINARY");
        ((Field) term1766071).setAccessible(true);
        Object enum3141 = ((Field) term1766071).get((Object) null);
        Class<? extends Object> term1766363 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1766362 = ((Class) term1766363).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1766362).setAccessible(true);
        Object enum3142 = ((Field) term1766362).get((Object) null);
        term1764039 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1764583 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1764039, term1764039.getClass(), "kind", enum3141);
        setField(term1764583, term1764583.getClass(), "kind", enum3142);
        setField(term1764583, term1764583.getClass(), "typeOfThis", null);
        setField(term1764039, term1764039.getClass(), "typeOfThis", term1764583);
        term1764693 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1765025 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1765133 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1764693, term1764693.getClass(), "kind", enum3141);
        setField(term1765025, term1765025.getClass(), "kind", enum3141);
        setField(term1765025, term1765025.getClass(), "typeOfThis", term1765133);
        setField(term1764693, term1764693.getClass(), "typeOfThis", term1765025);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1764693;
        try {
            callMethod(klass, "isSubtype", argTypes, term1764039, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


