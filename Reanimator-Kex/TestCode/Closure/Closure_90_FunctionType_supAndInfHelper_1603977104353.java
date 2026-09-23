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

public class FunctionType_supAndInfHelper_1603977104353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244588;
     Object term244950;

    public FunctionType_supAndInfHelper_1603977104353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term246025 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term246024 = ((Class) term246025).getDeclaredField((String) "ORDINARY");
        ((Field) term246024).setAccessible(true);
        Object enum428 = ((Field) term246024).get((Object) null);
        term244588 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term244840 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term244588, term244588.getClass(), "kind", enum428);
        setField(term244588, term244588.getClass(), "registry", term244840);
        Class<? extends Object> term246316 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term246315 = ((Class) term246316).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term246315).setAccessible(true);
        Object enum429 = ((Field) term246315).get((Object) null);
        term244950 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term244950, term244950.getClass(), "kind", enum429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term244950;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term244588, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


