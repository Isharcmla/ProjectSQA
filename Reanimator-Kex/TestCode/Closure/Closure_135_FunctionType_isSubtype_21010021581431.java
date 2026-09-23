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

public class FunctionType_isSubtype_21010021581431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1852861;
     Object term1853601;

    public FunctionType_isSubtype_21010021581431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1855112 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1855111 = ((Class) term1855112).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1855111).setAccessible(true);
        Object enum3452 = ((Field) term1855111).get((Object) null);
        Class<? extends Object> term1855412 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1855411 = ((Class) term1855412).getDeclaredField((String) "INTERFACE");
        ((Field) term1855411).setAccessible(true);
        Object enum3453 = ((Field) term1855411).get((Object) null);
        term1852861 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1853405 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1853493 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1852861, term1852861.getClass(), "kind", enum3452);
        setField(term1853405, term1853405.getClass(), "kind", enum3453);
        setField(term1853405, term1853405.getClass(), "typeOfThis", term1853493);
        setField(term1852861, term1852861.getClass(), "typeOfThis", term1853405);
        term1853601 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1853931 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1853601, term1853601.getClass(), "kind", enum3452);
        setField(term1853931, term1853931.getClass(), "kind", enum3452);
        setField(term1853931, term1853931.getClass(), "typeOfThis", null);
        setField(term1853601, term1853601.getClass(), "typeOfThis", term1853931);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1853601;
        try {
            callMethod(klass, "isSubtype", argTypes, term1852861, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


