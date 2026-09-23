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

public class FunctionType_isSubtype_2101002158715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term763484;
     Object term764136;

    public FunctionType_isSubtype_2101002158715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term765565 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term765564 = ((Class) term765565).getDeclaredField((String) "INTERFACE");
        ((Field) term765564).setAccessible(true);
        Object enum1374 = ((Field) term765564).get((Object) null);
        Class<? extends Object> term765859 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term765858 = ((Class) term765859).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term765858).setAccessible(true);
        Object enum1375 = ((Field) term765858).get((Object) null);
        term763484 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term764028 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term763484, term763484.getClass(), "kind", enum1374);
        setField(term764028, term764028.getClass(), "kind", enum1375);
        setField(term763484, term763484.getClass(), "typeOfThis", term764028);
        term764136 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term764466 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term764136, term764136.getClass(), "kind", enum1374);
        setField(term764136, term764136.getClass(), "typeOfThis", term764466);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term764136;
        try {
            callMethod(klass, "isSubtype", argTypes, term763484, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


