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

public class FunctionType_getLeastSupertype_418850886665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term591111;
     Object term591773;

    public FunctionType_getLeastSupertype_418850886665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term594782 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term594781 = ((Class) term594782).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term594781).setAccessible(true);
        Object enum1099 = ((Field) term594781).get((Object) null);
        Class<? extends Object> term595082 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term595081 = ((Class) term595082).getDeclaredField((String) "INTERFACE");
        ((Field) term595081).setAccessible(true);
        Object enum1100 = ((Field) term595081).get((Object) null);
        term591111 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term591665 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term591111, term591111.getClass(), "kind", enum1099);
        setField(term591665, term591665.getClass(), "kind", enum1100);
        setField(term591111, term591111.getClass(), "typeOfThis", term591665);
        Class<? extends Object> term595376 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term595375 = ((Class) term595376).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term595375).setAccessible(true);
        Object enum1101 = ((Field) term595375).get((Object) null);
        term591773 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term591955 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term591773, term591773.getClass(), "kind", enum1101);
        setField(term591773, term591773.getClass(), "typeOfThis", term591955);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term591773;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term591111, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


