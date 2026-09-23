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

public class FunctionType_isSubtype_21010021581095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1277672;
     Object term1278314;

    public FunctionType_isSubtype_21010021581095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1280678 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1280677 = ((Class) term1280678).getDeclaredField((String) "INTERFACE");
        ((Field) term1280677).setAccessible(true);
        Object enum2386 = ((Field) term1280677).get((Object) null);
        term1277672 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1278204 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1277672, term1277672.getClass(), "kind", enum2386);
        setField(term1277672, term1277672.getClass(), "typeOfThis", term1278204);
        Class<? extends Object> term1280972 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1280971 = ((Class) term1280972).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1280971).setAccessible(true);
        Object enum2387 = ((Field) term1280971).get((Object) null);
        term1278314 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1278314, term1278314.getClass(), "kind", enum2387);
        setField(term1278314, term1278314.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1278314;
        try {
            callMethod(klass, "isSubtype", argTypes, term1277672, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


