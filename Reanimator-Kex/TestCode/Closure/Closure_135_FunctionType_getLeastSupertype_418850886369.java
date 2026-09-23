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

public class FunctionType_getLeastSupertype_418850886369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223941;
     Object term224307;

    public FunctionType_getLeastSupertype_418850886369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term225519 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term225518 = ((Class) term225519).getDeclaredField((String) "ORDINARY");
        ((Field) term225518).setAccessible(true);
        Object enum407 = ((Field) term225518).get((Object) null);
        term223941 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term224199 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term223941, term223941.getClass(), "kind", enum407);
        setField(term223941, term223941.getClass(), "typeOfThis", term224199);
        Class<? extends Object> term225810 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term225809 = ((Class) term225810).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term225809).setAccessible(true);
        Object enum408 = ((Field) term225809).get((Object) null);
        term224307 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term224555 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term224307, term224307.getClass(), "kind", enum408);
        setField(term224307, term224307.getClass(), "typeOfThis", term224555);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term224307;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term223941, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


