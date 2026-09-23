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

public class FunctionType_isSubtype_21010021581377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1946692;
     Object term1947332;

    public FunctionType_isSubtype_21010021581377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1948379 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1948378 = ((Class) term1948379).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1948378).setAccessible(true);
        Object enum3454 = ((Field) term1948378).get((Object) null);
        term1946692 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1947224 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1946692, term1946692.getClass(), "kind", enum3454);
        setField(term1946692, term1946692.getClass(), "typeOfThis", term1947224);
        Class<? extends Object> term1948679 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1948678 = ((Class) term1948679).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1948678).setAccessible(true);
        Object enum3455 = ((Field) term1948678).get((Object) null);
        term1947332 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1947332, term1947332.getClass(), "kind", enum3455);
        setField(term1947332, term1947332.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1947332;
        try {
            callMethod(klass, "isSubtype", argTypes, term1946692, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


