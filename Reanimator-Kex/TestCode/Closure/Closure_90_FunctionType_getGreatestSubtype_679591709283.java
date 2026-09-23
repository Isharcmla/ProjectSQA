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

public class FunctionType_getGreatestSubtype_679591709283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172708;
     Object term173070;

    public FunctionType_getGreatestSubtype_679591709283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term174148 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term174147 = ((Class) term174148).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term174147).setAccessible(true);
        Object enum317 = ((Field) term174147).get((Object) null);
        term172708 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term172960 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term172708, term172708.getClass(), "kind", enum317);
        setField(term172708, term172708.getClass(), "registry", term172960);
        Class<? extends Object> term174448 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term174447 = ((Class) term174448).getDeclaredField((String) "ORDINARY");
        ((Field) term174447).setAccessible(true);
        Object enum318 = ((Field) term174447).get((Object) null);
        term173070 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term173070, term173070.getClass(), "kind", enum318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term173070;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term172708, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


