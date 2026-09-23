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

public class FunctionType_supAndInfHelper_1603977104321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208663;
     Object term208921;

    public FunctionType_supAndInfHelper_1603977104321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term209520 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term209519 = ((Class) term209520).getDeclaredField((String) "INTERFACE");
        ((Field) term209519).setAccessible(true);
        Object enum397 = ((Field) term209519).get((Object) null);
        term208663 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term208663, term208663.getClass(), "kind", enum397);
        term208921 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term208921;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term208663, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


