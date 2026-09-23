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

public class FunctionType_getGreatestSubtype_679591709970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1203859;
     Object term1204523;

    public FunctionType_getGreatestSubtype_679591709970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1207502 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1207501 = ((Class) term1207502).getDeclaredField((String) "INTERFACE");
        ((Field) term1207501).setAccessible(true);
        Object enum2164 = ((Field) term1207501).get((Object) null);
        Class<? extends Object> term1207796 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1207795 = ((Class) term1207796).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1207795).setAccessible(true);
        Object enum2165 = ((Field) term1207795).get((Object) null);
        term1203859 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1204413 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1203859, term1203859.getClass(), "kind", enum2164);
        setField(term1204413, term1204413.getClass(), "kind", enum2165);
        setField(term1203859, term1203859.getClass(), "typeOfThis", term1204413);
        term1204523 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1204853 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1204523, term1204523.getClass(), "kind", enum2164);
        setField(term1204523, term1204523.getClass(), "typeOfThis", term1204853);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1204523;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1203859, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


