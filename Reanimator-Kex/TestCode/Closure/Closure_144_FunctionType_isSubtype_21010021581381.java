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

public class FunctionType_isSubtype_21010021581381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1952105;
     Object term1952847;

    public FunctionType_isSubtype_21010021581381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1956213 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1956212 = ((Class) term1956213).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1956212).setAccessible(true);
        Object enum3468 = ((Field) term1956212).get((Object) null);
        term1952105 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1952649 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1952737 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1952105, term1952105.getClass(), "kind", enum3468);
        setField(term1952649, term1952649.getClass(), "kind", enum3468);
        setField(term1952649, term1952649.getClass(), "typeOfThis", term1952737);
        setField(term1952105, term1952105.getClass(), "typeOfThis", term1952649);
        term1952847 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1953179 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1953303 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term1952847, term1952847.getClass(), "kind", enum3468);
        setField(term1953179, term1953179.getClass(), "kind", enum3468);
        setField(term1953179, term1953179.getClass(), "typeOfThis", term1953303);
        setField(term1952847, term1952847.getClass(), "typeOfThis", term1953179);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1952847;
        try {
            callMethod(klass, "isSubtype", argTypes, term1952105, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


