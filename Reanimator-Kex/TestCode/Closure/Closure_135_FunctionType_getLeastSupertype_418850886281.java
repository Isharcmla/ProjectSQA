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

public class FunctionType_getLeastSupertype_418850886281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145362;
     Object term145722;

    public FunctionType_getLeastSupertype_418850886281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term146791 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term146790 = ((Class) term146791).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term146790).setAccessible(true);
        Object enum269 = ((Field) term146790).get((Object) null);
        term145362 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term145614 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term145362, term145362.getClass(), "kind", enum269);
        setField(term145362, term145362.getClass(), "registry", term145614);
        Class<? extends Object> term147091 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term147090 = ((Class) term147091).getDeclaredField((String) "ORDINARY");
        ((Field) term147090).setAccessible(true);
        Object enum270 = ((Field) term147090).get((Object) null);
        term145722 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term145722, term145722.getClass(), "kind", enum270);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term145722;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term145362, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


