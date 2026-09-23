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

public class FunctionType_isSubtype_21010021581018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1294004;
     Object term1294744;

    public FunctionType_isSubtype_21010021581018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1298141 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1298140 = ((Class) term1298141).getDeclaredField((String) "INTERFACE");
        ((Field) term1298140).setAccessible(true);
        Object enum2327 = ((Field) term1298140).get((Object) null);
        Class<? extends Object> term1298435 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1298434 = ((Class) term1298435).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1298434).setAccessible(true);
        Object enum2328 = ((Field) term1298434).get((Object) null);
        term1294004 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1294548 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1294636 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1294004, term1294004.getClass(), "kind", enum2327);
        setField(term1294548, term1294548.getClass(), "kind", enum2328);
        setField(term1294548, term1294548.getClass(), "typeOfThis", term1294636);
        setField(term1294004, term1294004.getClass(), "typeOfThis", term1294548);
        term1294744 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1295074 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1294744, term1294744.getClass(), "kind", enum2327);
        setField(term1295074, term1295074.getClass(), "kind", enum2328);
        setField(term1295074, term1295074.getClass(), "typeOfThis", null);
        setField(term1294744, term1294744.getClass(), "typeOfThis", term1295074);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1294744;
        try {
            callMethod(klass, "isSubtype", argTypes, term1294004, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


