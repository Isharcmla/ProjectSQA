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

public class FunctionType_getGreatestSubtype_679591709407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315579;
     Object term315947;

    public FunctionType_getGreatestSubtype_679591709407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term317046 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term317045 = ((Class) term317046).getDeclaredField((String) "ORDINARY");
        ((Field) term317045).setAccessible(true);
        Object enum545 = ((Field) term317045).get((Object) null);
        term315579 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term315837 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term315579, term315579.getClass(), "kind", enum545);
        setField(term315579, term315579.getClass(), "typeOfThis", term315837);
        Class<? extends Object> term317337 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term317336 = ((Class) term317337).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term317336).setAccessible(true);
        Object enum546 = ((Field) term317336).get((Object) null);
        term315947 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term315947, term315947.getClass(), "kind", enum546);
        setField(term315947, term315947.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term315947;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term315579, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


