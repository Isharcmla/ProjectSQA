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

public class FunctionType_getGreatestSubtype_6795917091015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1287410;
     Object term1288182;

    public FunctionType_getGreatestSubtype_6795917091015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1291936 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1291935 = ((Class) term1291936).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1291935).setAccessible(true);
        Object enum2317 = ((Field) term1291935).get((Object) null);
        Class<? extends Object> term1292236 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1292235 = ((Class) term1292236).getDeclaredField((String) "INTERFACE");
        ((Field) term1292235).setAccessible(true);
        Object enum2318 = ((Field) term1292235).get((Object) null);
        term1287410 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1287964 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1288072 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1287410, term1287410.getClass(), "kind", enum2317);
        setField(term1287964, term1287964.getClass(), "kind", enum2317);
        setField(term1288072, term1288072.getClass(), "kind", enum2318);
        setField(term1287964, term1287964.getClass(), "typeOfThis", term1288072);
        setField(term1287410, term1287410.getClass(), "typeOfThis", term1287964);
        Class<? extends Object> term1292530 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1292529 = ((Class) term1292530).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1292529).setAccessible(true);
        Object enum2319 = ((Field) term1292529).get((Object) null);
        term1288182 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1288356 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1288604 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1288182, term1288182.getClass(), "kind", enum2319);
        setField(term1288356, term1288356.getClass(), "kind", enum2317);
        setField(term1288356, term1288356.getClass(), "typeOfThis", term1288604);
        setField(term1288182, term1288182.getClass(), "typeOfThis", term1288356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1288182;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1287410, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


