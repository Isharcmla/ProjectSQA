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

public class FunctionType_getLeastSupertype_418850886277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166247;
     Object term166505;

    public FunctionType_getLeastSupertype_418850886277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term167204 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term167203 = ((Class) term167204).getDeclaredField((String) "INTERFACE");
        ((Field) term167203).setAccessible(true);
        Object enum306 = ((Field) term167203).get((Object) null);
        term166247 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term166247, term166247.getClass(), "kind", enum306);
        term166505 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term166505, term166505.getClass(), "kind", enum306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term166505;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term166247, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


