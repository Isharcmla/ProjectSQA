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

public class FunctionType_getLeastSupertype_418850886231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123373;
     Object term123927;

    public FunctionType_getLeastSupertype_418850886231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term125828 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term125827 = ((Class) term125828).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term125827).setAccessible(true);
        Object enum253 = ((Field) term125827).get((Object) null);
        term123373 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term123373, term123373.getClass(), "kind", enum253);
        Class<? extends Object> term126128 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term126127 = ((Class) term126128).getDeclaredField((String) "INTERFACE");
        ((Field) term126127).setAccessible(true);
        Object enum254 = ((Field) term126127).get((Object) null);
        term123927 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term123927, term123927.getClass(), "kind", enum254);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term123927;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term123373, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


