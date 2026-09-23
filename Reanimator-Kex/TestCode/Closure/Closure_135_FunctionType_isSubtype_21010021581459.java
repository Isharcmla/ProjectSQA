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

public class FunctionType_isSubtype_21010021581459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1899452;
     Object term1900106;

    public FunctionType_isSubtype_21010021581459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1901274 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1901273 = ((Class) term1901274).getDeclaredField((String) "ORDINARY");
        ((Field) term1901273).setAccessible(true);
        Object enum3540 = ((Field) term1901273).get((Object) null);
        term1899452 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1899996 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1899452, term1899452.getClass(), "kind", enum3540);
        setField(term1899452, term1899452.getClass(), "typeOfThis", term1899996);
        Class<? extends Object> term1901565 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1901564 = ((Class) term1901565).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1901564).setAccessible(true);
        Object enum3541 = ((Field) term1901564).get((Object) null);
        term1900106 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1900290 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1900106, term1900106.getClass(), "kind", enum3541);
        setField(term1900106, term1900106.getClass(), "typeOfThis", term1900290);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1900106;
        try {
            callMethod(klass, "isSubtype", argTypes, term1899452, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


