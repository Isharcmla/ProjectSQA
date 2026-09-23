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

public class FunctionType_getLeastSupertype_418850886287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167939;
     Object term168311;

    public FunctionType_getLeastSupertype_418850886287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term169415 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term169414 = ((Class) term169415).getDeclaredField((String) "ORDINARY");
        ((Field) term169414).setAccessible(true);
        Object enum304 = ((Field) term169414).get((Object) null);
        term167939 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term168201 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term167939, term167939.getClass(), "kind", enum304);
        setField(term167939, term167939.getClass(), "typeOfThis", term168201);
        Class<? extends Object> term169706 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term169705 = ((Class) term169706).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term169705).setAccessible(true);
        Object enum305 = ((Field) term169705).get((Object) null);
        term168311 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term168311, term168311.getClass(), "kind", enum305);
        setField(term168311, term168311.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term168311;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term167939, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


