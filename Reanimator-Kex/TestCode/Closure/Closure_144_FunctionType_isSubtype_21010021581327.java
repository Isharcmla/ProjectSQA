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

public class FunctionType_isSubtype_21010021581327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1853868;
     Object term1854644;

    public FunctionType_isSubtype_21010021581327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1858626 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1858625 = ((Class) term1858626).getDeclaredField((String) "ORDINARY");
        ((Field) term1858625).setAccessible(true);
        Object enum3298 = ((Field) term1858625).get((Object) null);
        term1853868 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1854412 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1854536 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term1853868, term1853868.getClass(), "kind", enum3298);
        setField(term1854412, term1854412.getClass(), "kind", enum3298);
        setField(term1854412, term1854412.getClass(), "typeOfThis", term1854536);
        setField(term1854412, term1854412.getClass(), "call", null);
        setField(term1853868, term1853868.getClass(), "typeOfThis", term1854412);
        Class<? extends Object> term1858917 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1858916 = ((Class) term1858917).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1858916).setAccessible(true);
        Object enum3299 = ((Field) term1858916).get((Object) null);
        term1854644 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1854976 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1855070 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1854644, term1854644.getClass(), "kind", enum3298);
        setField(term1854976, term1854976.getClass(), "kind", enum3299);
        setField(term1854976, term1854976.getClass(), "typeOfThis", null);
        setField(term1854976, term1854976.getClass(), "call", term1855070);
        setField(term1854644, term1854644.getClass(), "typeOfThis", term1854976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1854644;
        try {
            callMethod(klass, "isSubtype", argTypes, term1853868, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


