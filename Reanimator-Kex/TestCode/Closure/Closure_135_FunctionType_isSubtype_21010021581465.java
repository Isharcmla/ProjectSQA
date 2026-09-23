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

public class FunctionType_isSubtype_21010021581465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1909469;
     Object term1910231;

    public FunctionType_isSubtype_21010021581465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1911652 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1911651 = ((Class) term1911652).getDeclaredField((String) "ORDINARY");
        ((Field) term1911651).setAccessible(true);
        Object enum3557 = ((Field) term1911651).get((Object) null);
        term1909469 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1910013 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1910123 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1909469, term1909469.getClass(), "kind", enum3557);
        setField(term1910013, term1910013.getClass(), "kind", enum3557);
        setField(term1910013, term1910013.getClass(), "typeOfThis", term1910123);
        setField(term1910013, term1910013.getClass(), "call", null);
        setField(term1909469, term1909469.getClass(), "typeOfThis", term1910013);
        Class<? extends Object> term1911943 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1911942 = ((Class) term1911943).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1911942).setAccessible(true);
        Object enum3558 = ((Field) term1911942).get((Object) null);
        term1910231 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1910561 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1910655 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1910231, term1910231.getClass(), "kind", enum3557);
        setField(term1910561, term1910561.getClass(), "kind", enum3558);
        setField(term1910561, term1910561.getClass(), "typeOfThis", null);
        setField(term1910561, term1910561.getClass(), "call", term1910655);
        setField(term1910231, term1910231.getClass(), "typeOfThis", term1910561);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1910231;
        try {
            callMethod(klass, "isSubtype", argTypes, term1909469, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


