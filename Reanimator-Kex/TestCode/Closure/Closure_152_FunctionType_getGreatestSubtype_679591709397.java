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

public class FunctionType_getGreatestSubtype_679591709397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303084;
     Object term303638;

    public FunctionType_getGreatestSubtype_679591709397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term304633 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term304632 = ((Class) term304633).getDeclaredField((String) "INTERFACE");
        ((Field) term304632).setAccessible(true);
        Object enum524 = ((Field) term304632).get((Object) null);
        term303084 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term303084, term303084.getClass(), "kind", enum524);
        Class<? extends Object> term304927 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term304926 = ((Class) term304927).getDeclaredField((String) "INTERFACE");
        ((Field) term304926).setAccessible(true);
        Object enum525 = ((Field) term304926).get((Object) null);
        term303638 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term303638, term303638.getClass(), "kind", enum525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term303638;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term303084, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


