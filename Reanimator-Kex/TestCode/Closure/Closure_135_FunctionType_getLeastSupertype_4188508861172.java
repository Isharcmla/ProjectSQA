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

public class FunctionType_getLeastSupertype_4188508861172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1408992;
     Object term1409248;

    public FunctionType_getLeastSupertype_4188508861172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1412237 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1412236 = ((Class) term1412237).getDeclaredField((String) "INTERFACE");
        ((Field) term1412236).setAccessible(true);
        Object enum2635 = ((Field) term1412236).get((Object) null);
        term1408992 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1408992, term1408992.getClass(), "kind", enum2635);
        Class<? extends Object> term1412531 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1412530 = ((Class) term1412531).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1412530).setAccessible(true);
        Object enum2636 = ((Field) term1412530).get((Object) null);
        term1409248 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1409248, term1409248.getClass(), "kind", enum2636);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1409248;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term1408992, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


