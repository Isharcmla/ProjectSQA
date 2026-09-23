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

public class FunctionType_isSubtype_21010021581071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1396225;
     Object term1396965;

    public FunctionType_isSubtype_21010021581071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1397917 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1397916 = ((Class) term1397917).getDeclaredField((String) "ORDINARY");
        ((Field) term1397916).setAccessible(true);
        Object enum2505 = ((Field) term1397916).get((Object) null);
        term1396225 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1396769 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1396857 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1396225, term1396225.getClass(), "kind", enum2505);
        setField(term1396769, term1396769.getClass(), "kind", enum2505);
        setField(term1396769, term1396769.getClass(), "typeOfThis", term1396857);
        setField(term1396225, term1396225.getClass(), "typeOfThis", term1396769);
        term1396965 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1397295 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1396965, term1396965.getClass(), "kind", enum2505);
        setField(term1397295, term1397295.getClass(), "kind", enum2505);
        setField(term1397295, term1397295.getClass(), "typeOfThis", null);
        setField(term1396965, term1396965.getClass(), "typeOfThis", term1397295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1396965;
        try {
            callMethod(klass, "isSubtype", argTypes, term1396225, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


