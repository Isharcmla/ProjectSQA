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

public class FunctionType_getGreatestSubtype_6795917091111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1303227;
     Object term1303699;

    public FunctionType_getGreatestSubtype_6795917091111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1305048 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1305047 = ((Class) term1305048).getDeclaredField((String) "ORDINARY");
        ((Field) term1305047).setAccessible(true);
        Object enum2434 = ((Field) term1305047).get((Object) null);
        term1303227 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1303483 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1303591 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1303227, term1303227.getClass(), "kind", enum2434);
        setField(term1303483, term1303483.getClass(), "kind", enum2434);
        setField(term1303483, term1303483.getClass(), "typeOfThis", term1303591);
        setField(term1303227, term1303227.getClass(), "typeOfThis", term1303483);
        Class<? extends Object> term1305339 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1305338 = ((Class) term1305339).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1305338).setAccessible(true);
        Object enum2435 = ((Field) term1305338).get((Object) null);
        term1303699 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1303947 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1303699, term1303699.getClass(), "kind", enum2435);
        setField(term1303947, term1303947.getClass(), "kind", enum2434);
        setField(term1303947, term1303947.getClass(), "typeOfThis", null);
        setField(term1303699, term1303699.getClass(), "typeOfThis", term1303947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1303699;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1303227, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


