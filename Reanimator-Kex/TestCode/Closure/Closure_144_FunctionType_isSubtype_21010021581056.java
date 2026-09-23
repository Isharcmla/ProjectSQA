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

public class FunctionType_isSubtype_21010021581056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1364808;
     Object term1365556;

    public FunctionType_isSubtype_21010021581056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1369578 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1369577 = ((Class) term1369578).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1369577).setAccessible(true);
        Object enum2451 = ((Field) term1369577).get((Object) null);
        Class<? extends Object> term1369878 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1369877 = ((Class) term1369878).getDeclaredField((String) "INTERFACE");
        ((Field) term1369877).setAccessible(true);
        Object enum2452 = ((Field) term1369877).get((Object) null);
        term1364808 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1365360 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1365448 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1364808, term1364808.getClass(), "kind", enum2451);
        setField(term1365360, term1365360.getClass(), "kind", enum2452);
        setField(term1365360, term1365360.getClass(), "typeOfThis", term1365448);
        setField(term1364808, term1364808.getClass(), "typeOfThis", term1365360);
        Class<? extends Object> term1370172 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1370171 = ((Class) term1370172).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1370171).setAccessible(true);
        Object enum2453 = ((Field) term1370171).get((Object) null);
        term1365556 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1365886 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1365556, term1365556.getClass(), "kind", enum2451);
        setField(term1365886, term1365886.getClass(), "kind", enum2453);
        setField(term1365886, term1365886.getClass(), "typeOfThis", null);
        setField(term1365556, term1365556.getClass(), "typeOfThis", term1365886);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1365556;
        try {
            callMethod(klass, "isSubtype", argTypes, term1364808, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


