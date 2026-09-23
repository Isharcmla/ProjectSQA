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

public class FunctionType_isSubtype_21010021581128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1490388;
     Object term1491164;

    public FunctionType_isSubtype_21010021581128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1496432 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1496431 = ((Class) term1496432).getDeclaredField((String) "ORDINARY");
        ((Field) term1496431).setAccessible(true);
        Object enum2670 = ((Field) term1496431).get((Object) null);
        Class<? extends Object> term1496723 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1496722 = ((Class) term1496723).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1496722).setAccessible(true);
        Object enum2671 = ((Field) term1496722).get((Object) null);
        term1490388 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1490932 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1491056 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term1490388, term1490388.getClass(), "kind", enum2670);
        setField(term1490932, term1490932.getClass(), "kind", enum2671);
        setField(term1490932, term1490932.getClass(), "typeOfThis", term1491056);
        setField(term1490388, term1490388.getClass(), "typeOfThis", term1490932);
        term1491164 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1491496 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1491164, term1491164.getClass(), "kind", enum2670);
        setField(term1491496, term1491496.getClass(), "kind", enum2671);
        setField(term1491496, term1491496.getClass(), "typeOfThis", null);
        setField(term1491164, term1491164.getClass(), "typeOfThis", term1491496);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1491164;
        try {
            callMethod(klass, "isSubtype", argTypes, term1490388, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


