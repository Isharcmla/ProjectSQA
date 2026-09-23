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

public class FunctionType_isSubtype_21010021581416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1827491;
     Object term1828251;

    public FunctionType_isSubtype_21010021581416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1831627 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1831626 = ((Class) term1831627).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1831626).setAccessible(true);
        Object enum3409 = ((Field) term1831626).get((Object) null);
        term1827491 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1828043 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1828143 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1827491, term1827491.getClass(), "kind", enum3409);
        setField(term1828043, term1828043.getClass(), "kind", enum3409);
        setField(term1828043, term1828043.getClass(), "typeOfThis", term1828143);
        setField(term1828043, term1828043.getClass(), "call", null);
        setField(term1827491, term1827491.getClass(), "typeOfThis", term1828043);
        term1828251 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1828581 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1828681 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term1828775 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1828251, term1828251.getClass(), "kind", enum3409);
        setField(term1828581, term1828581.getClass(), "kind", enum3409);
        setField(term1828581, term1828581.getClass(), "typeOfThis", term1828681);
        setField(term1828581, term1828581.getClass(), "call", term1828775);
        setField(term1828251, term1828251.getClass(), "typeOfThis", term1828581);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1828251;
        try {
            callMethod(klass, "isSubtype", argTypes, term1827491, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


