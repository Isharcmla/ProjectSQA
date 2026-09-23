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

public class FunctionType_isSubtype_21010021581231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1682925;
     Object term1683579;

    public FunctionType_isSubtype_21010021581231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1685022 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1685021 = ((Class) term1685022).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1685021).setAccessible(true);
        Object enum3009 = ((Field) term1685021).get((Object) null);
        Class<? extends Object> term1685322 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1685321 = ((Class) term1685322).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1685321).setAccessible(true);
        Object enum3010 = ((Field) term1685321).get((Object) null);
        term1682925 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1683469 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1682925, term1682925.getClass(), "kind", enum3009);
        setField(term1683469, term1683469.getClass(), "kind", enum3010);
        setField(term1683469, term1683469.getClass(), "typeOfThis", null);
        setField(term1682925, term1682925.getClass(), "typeOfThis", term1683469);
        term1683579 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1683911 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1684011 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1683579, term1683579.getClass(), "kind", enum3009);
        setField(term1683911, term1683911.getClass(), "kind", enum3009);
        setField(term1683911, term1683911.getClass(), "typeOfThis", term1684011);
        setField(term1683579, term1683579.getClass(), "typeOfThis", term1683911);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1683579;
        try {
            callMethod(klass, "isSubtype", argTypes, term1682925, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


