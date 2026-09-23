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

public class FunctionType_getGreatestSubtype_679591709547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term493516;
     Object term494070;

    public FunctionType_getGreatestSubtype_679591709547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term495090 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term495089 = ((Class) term495090).getDeclaredField((String) "INTERFACE");
        ((Field) term495089).setAccessible(true);
        Object enum899 = ((Field) term495089).get((Object) null);
        term493516 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term493516, term493516.getClass(), "kind", enum899);
        Class<? extends Object> term495384 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term495383 = ((Class) term495384).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term495383).setAccessible(true);
        Object enum900 = ((Field) term495383).get((Object) null);
        term494070 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term494070, term494070.getClass(), "kind", enum900);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term494070;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term493516, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


