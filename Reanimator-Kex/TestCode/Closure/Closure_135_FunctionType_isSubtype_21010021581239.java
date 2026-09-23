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

public class FunctionType_isSubtype_21010021581239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1532140;
     Object term1532800;

    public FunctionType_isSubtype_21010021581239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1533910 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1533909 = ((Class) term1533910).getDeclaredField((String) "ORDINARY");
        ((Field) term1533909).setAccessible(true);
        Object enum2862 = ((Field) term1533909).get((Object) null);
        term1532140 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1532692 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1532140, term1532140.getClass(), "kind", enum2862);
        setField(term1532140, term1532140.getClass(), "typeOfThis", term1532692);
        Class<? extends Object> term1534201 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1534200 = ((Class) term1534201).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1534200).setAccessible(true);
        Object enum2863 = ((Field) term1534200).get((Object) null);
        term1532800 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1532982 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1532800, term1532800.getClass(), "kind", enum2863);
        setField(term1532800, term1532800.getClass(), "typeOfThis", term1532982);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1532800;
        try {
            callMethod(klass, "isSubtype", argTypes, term1532140, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


