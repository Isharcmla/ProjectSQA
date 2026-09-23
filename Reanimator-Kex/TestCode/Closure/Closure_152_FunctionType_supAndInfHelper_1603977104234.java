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

public class FunctionType_supAndInfHelper_1603977104234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119659;
     Object term120213;

    public FunctionType_supAndInfHelper_1603977104234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term121525 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term121524 = ((Class) term121525).getDeclaredField((String) "ORDINARY");
        ((Field) term121524).setAccessible(true);
        Object enum223 = ((Field) term121524).get((Object) null);
        term119659 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term119659, term119659.getClass(), "kind", enum223);
        Class<? extends Object> term121816 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term121815 = ((Class) term121816).getDeclaredField((String) "INTERFACE");
        ((Field) term121815).setAccessible(true);
        Object enum224 = ((Field) term121815).get((Object) null);
        term120213 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term120213, term120213.getClass(), "kind", enum224);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term120213;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term119659, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


