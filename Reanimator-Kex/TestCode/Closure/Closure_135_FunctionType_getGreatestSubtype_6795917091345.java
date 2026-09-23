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

public class FunctionType_getGreatestSubtype_6795917091345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1709923;
     Object term1710179;

    public FunctionType_getGreatestSubtype_6795917091345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1710989 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1710988 = ((Class) term1710989).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1710988).setAccessible(true);
        Object enum3192 = ((Field) term1710988).get((Object) null);
        term1709923 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1709923, term1709923.getClass(), "kind", enum3192);
        setField(term1709923, term1709923.getClass(), "typeOfThis", term1709923);
        term1710179 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1710353 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1710179, term1710179.getClass(), "kind", enum3192);
        setField(term1710179, term1710179.getClass(), "typeOfThis", term1710353);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1710179;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1709923, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


