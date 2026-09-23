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

public class FunctionType_supAndInfHelper_1603977104311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200077;
     Object term200631;

    public FunctionType_supAndInfHelper_1603977104311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term201632 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term201631 = ((Class) term201632).getDeclaredField((String) "INTERFACE");
        ((Field) term201631).setAccessible(true);
        Object enum381 = ((Field) term201631).get((Object) null);
        term200077 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term200077, term200077.getClass(), "kind", enum381);
        Class<? extends Object> term201926 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term201925 = ((Class) term201926).getDeclaredField((String) "INTERFACE");
        ((Field) term201925).setAccessible(true);
        Object enum382 = ((Field) term201925).get((Object) null);
        term200631 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term200631, term200631.getClass(), "kind", enum382);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term200631;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term200077, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


