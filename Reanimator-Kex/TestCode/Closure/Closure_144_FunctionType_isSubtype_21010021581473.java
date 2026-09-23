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

public class FunctionType_isSubtype_21010021581473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2125205;
     Object term2125957;

    public FunctionType_isSubtype_21010021581473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2128829 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2128828 = ((Class) term2128829).getDeclaredField((String) "INTERFACE");
        ((Field) term2128828).setAccessible(true);
        Object enum3791 = ((Field) term2128828).get((Object) null);
        term2125205 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2125749 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2125849 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term2125205, term2125205.getClass(), "kind", enum3791);
        setField(term2125749, term2125749.getClass(), "kind", enum3791);
        setField(term2125749, term2125749.getClass(), "typeOfThis", term2125849);
        setField(term2125205, term2125205.getClass(), "typeOfThis", term2125749);
        Class<? extends Object> term2129123 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2129122 = ((Class) term2129123).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2129122).setAccessible(true);
        Object enum3792 = ((Field) term2129122).get((Object) null);
        term2125957 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2126289 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2125957, term2125957.getClass(), "kind", enum3791);
        setField(term2126289, term2126289.getClass(), "kind", enum3792);
        setField(term2126289, term2126289.getClass(), "typeOfThis", null);
        setField(term2125957, term2125957.getClass(), "typeOfThis", term2126289);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2125957;
        try {
            callMethod(klass, "isSubtype", argTypes, term2125205, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


