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

public class FunctionType_isSubtype_21010021581039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1335755;
     Object term1336415;

    public FunctionType_isSubtype_21010021581039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1337417 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1337416 = ((Class) term1337417).getDeclaredField((String) "ORDINARY");
        ((Field) term1337416).setAccessible(true);
        Object enum2394 = ((Field) term1337416).get((Object) null);
        term1335755 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1336307 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1335755, term1335755.getClass(), "kind", enum2394);
        setField(term1335755, term1335755.getClass(), "typeOfThis", term1336307);
        term1336415 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1336725 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1336415, term1336415.getClass(), "kind", enum2394);
        setField(term1336415, term1336415.getClass(), "typeOfThis", term1336725);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1336415;
        try {
            callMethod(klass, "isSubtype", argTypes, term1335755, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


