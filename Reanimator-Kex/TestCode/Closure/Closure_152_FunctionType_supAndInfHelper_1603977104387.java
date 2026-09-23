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

public class FunctionType_supAndInfHelper_1603977104387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287210;
     Object term287764;

    public FunctionType_supAndInfHelper_1603977104387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term288356 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term288355 = ((Class) term288356).getDeclaredField((String) "INTERFACE");
        ((Field) term288355).setAccessible(true);
        Object enum500 = ((Field) term288355).get((Object) null);
        term287210 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term287210, term287210.getClass(), "kind", enum500);
        term287764 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term287764;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term287210, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


