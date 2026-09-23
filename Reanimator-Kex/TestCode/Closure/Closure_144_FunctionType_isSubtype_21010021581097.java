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

public class FunctionType_isSubtype_21010021581097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1437933;
     Object term1438681;

    public FunctionType_isSubtype_21010021581097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1440545 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1440544 = ((Class) term1440545).getDeclaredField((String) "INTERFACE");
        ((Field) term1440544).setAccessible(true);
        Object enum2579 = ((Field) term1440544).get((Object) null);
        Class<? extends Object> term1440839 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1440838 = ((Class) term1440839).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1440838).setAccessible(true);
        Object enum2580 = ((Field) term1440838).get((Object) null);
        term1437933 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1438477 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1438571 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term1437933, term1437933.getClass(), "kind", enum2579);
        setField(term1438477, term1438477.getClass(), "kind", enum2580);
        setField(term1438477, term1438477.getClass(), "typeOfThis", term1438571);
        setField(term1438477, term1438477.getClass(), "call", null);
        setField(term1437933, term1437933.getClass(), "typeOfThis", term1438477);
        term1438681 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1439011 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1439105 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1438681, term1438681.getClass(), "kind", enum2579);
        setField(term1439011, term1439011.getClass(), "kind", enum2579);
        setField(term1439011, term1439011.getClass(), "typeOfThis", term1439011);
        setField(term1439011, term1439011.getClass(), "call", term1439105);
        setField(term1438681, term1438681.getClass(), "typeOfThis", term1439011);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1438681;
        try {
            callMethod(klass, "isSubtype", argTypes, term1437933, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


