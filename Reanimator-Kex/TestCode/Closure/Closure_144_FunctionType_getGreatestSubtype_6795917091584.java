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

public class FunctionType_getGreatestSubtype_6795917091584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2321670;
     Object term2322442;

    public FunctionType_getGreatestSubtype_6795917091584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2325592 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2325591 = ((Class) term2325592).getDeclaredField((String) "INTERFACE");
        ((Field) term2325591).setAccessible(true);
        Object enum4147 = ((Field) term2325591).get((Object) null);
        Class<? extends Object> term2325886 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2325885 = ((Class) term2325886).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2325885).setAccessible(true);
        Object enum4148 = ((Field) term2325885).get((Object) null);
        term2321670 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2322224 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2322818 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2321670, term2321670.getClass(), "kind", enum4147);
        setField(term2322224, term2322224.getClass(), "kind", enum4147);
        setField(term2322818, term2322818.getClass(), "kind", enum4148);
        setField(term2322818, term2322818.getClass(), "typeOfThis", null);
        setField(term2322224, term2322224.getClass(), "typeOfThis", term2322818);
        setField(term2321670, term2321670.getClass(), "typeOfThis", term2322224);
        term2322442 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2322764 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2322442, term2322442.getClass(), "kind", enum4147);
        setField(term2322764, term2322764.getClass(), "kind", enum4147);
        setField(term2322764, term2322764.getClass(), "typeOfThis", term2322818);
        setField(term2322442, term2322442.getClass(), "typeOfThis", term2322764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2322442;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term2321670, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


