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

public class FunctionType_isSubtype_21010021581545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2259373;
     Object term2260027;

    public FunctionType_isSubtype_21010021581545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2261583 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2261582 = ((Class) term2261583).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2261582).setAccessible(true);
        Object enum4036 = ((Field) term2261582).get((Object) null);
        Class<? extends Object> term2261883 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2261882 = ((Class) term2261883).getDeclaredField((String) "INTERFACE");
        ((Field) term2261882).setAccessible(true);
        Object enum4037 = ((Field) term2261882).get((Object) null);
        term2259373 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2259917 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2259373, term2259373.getClass(), "kind", enum4036);
        setField(term2259917, term2259917.getClass(), "kind", enum4037);
        setField(term2259373, term2259373.getClass(), "typeOfThis", term2259917);
        Class<? extends Object> term2262177 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2262176 = ((Class) term2262177).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2262176).setAccessible(true);
        Object enum4038 = ((Field) term2262176).get((Object) null);
        term2260027 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2260359 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2260027, term2260027.getClass(), "kind", enum4036);
        setField(term2260359, term2260359.getClass(), "kind", enum4038);
        setField(term2260027, term2260027.getClass(), "typeOfThis", term2260359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2260027;
        try {
            callMethod(klass, "isSubtype", argTypes, term2259373, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


