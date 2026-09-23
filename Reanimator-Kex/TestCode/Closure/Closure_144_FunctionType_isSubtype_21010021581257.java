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

public class FunctionType_isSubtype_21010021581257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1729522;
     Object term1730264;

    public FunctionType_isSubtype_21010021581257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1731348 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1731347 = ((Class) term1731348).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1731347).setAccessible(true);
        Object enum3087 = ((Field) term1731347).get((Object) null);
        term1729522 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1730066 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1730154 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1729522, term1729522.getClass(), "kind", enum3087);
        setField(term1730066, term1730066.getClass(), "kind", enum3087);
        setField(term1730066, term1730066.getClass(), "typeOfThis", term1730154);
        setField(term1729522, term1729522.getClass(), "typeOfThis", term1730066);
        term1730264 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1730596 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1730720 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term1730264, term1730264.getClass(), "kind", enum3087);
        setField(term1730596, term1730596.getClass(), "kind", enum3087);
        setField(term1730596, term1730596.getClass(), "typeOfThis", term1730720);
        setField(term1730264, term1730264.getClass(), "typeOfThis", term1730596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1730264;
        try {
            callMethod(klass, "isSubtype", argTypes, term1729522, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


